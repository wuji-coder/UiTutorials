一、Android ListView的用法

1.创建activity_simpleadapter_tutorial.xml，在该文件中设置listview控件

2.再创建activity_listview.xml，在里面设置ListView的Item

3.创建类SimpleAdapterTutorial并指定其view，设置动物名称数组animalName和动物图片数组animalImage，并将他们对应放在一个ArrayList<HashMap<String,String>>的对象中。新增一个数组from，from的值是Map集合里面的key值。新增一个数组to，里面是item布局相应的控件id。创建SimpleAdapter对象，并设置给ListView

![image](https://github.com/wuji-coder/UiTutorials/blob/master/image/ListView.png)

二、创建自定义布局的 AlertDialog

1.创建customdialog.xml，实现Dialog的布局

2.创建类CustomDialogTutorial，通过createDialog()方法和按钮来显示Dialog，先创建 AlertDialog.Builder对象，再获得LayoutInflater对象，用AlertDialog.Builder的setView()方法和LayoutInflater的inflate()方法指定view和显示。

![image](https://github.com/wuji-coder/UiTutorials/blob/master/image/自定义对话框.png)

三、使用 XML定义菜单

1.先创建需要显示菜单的界面activity_xml_option_menu，在里面设置一个测试文本

2.创建选项菜单menu_settings.xml

3.创建MenuTest来生成选项菜单，通过onCreateOptionsMenu(Menu menu)方法来显示菜单，通过onOptionsItemSelected(MenuItem item)来处理选择事件

![image](https://github.com/wuji-coder/UiTutorials/blob/master/image/MenuTest.png)

四、创建上下文操作模式 (ActionMode) 的上下文菜单

1.创建listView

2.创建上下文菜单

3.创建ActionBarTutorial，通过ListView.setMultiChoiceModeListener()方法添加了一个匿名内部类AbsListView.MultiChoiceModeListener，在该匿名内部类中设置了控制上下文菜单显示和选项显示的方法步骤。

![image](https://github.com/wuji-coder/UiTutorials/blob/master/image/ActionMode.png)
