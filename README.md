一、Android ListView的用法

1.创建activity_simpleadapter_tutorial.xml，在该文件中设置listview控件

2.再创建activity_listview.xml，在里面设置ListView的Item

3.创建类SimpleAdapterTutorial并指定其view，设置动物名称数组animalName和动物图片数组animalImage，并将他们对应放在一个ArrayList<HashMap<String,String>>的对象中。新增一个数组from，from的值是Map集合里面的key值。新增一个数组to，里面是item布局相应的控件id。创建SimpleAdapter对象，并设置给ListView

![image](https://github.com/wuji-coder/UiTutorials/blob/master/image/ListView.png)

