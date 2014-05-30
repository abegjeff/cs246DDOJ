//My start button Event Handler
start.setOnAction(new EventHandler<ActionEvent>(){
                   @Override
                   public void handle(ActionEvent event){ 
                   
                       String name = ("" + list1.getFocusModel().getFocusedItem());
                       try {
                           Class runnable = Class.forName("boldness." + name);
                           boolean isReallyRunnable = Runnable.class.isAssignableFrom(runnable);
                           
                           if (isReallyRunnable && list1.getFocusModel().getFocusedItem() != null) {
                               Object o = Class.forName("boldness." + name).newInstance();
                               Runnable r = (Runnable)o;
                               t = new Thread(r);
                               boldness.finished = true;
                               t.start();
                               list2.getItems().add(name + t.getName());

                           }
                       }
                       
                       catch(Exception e) {
                           e.printStackTrace();
                       }
                   }
                });