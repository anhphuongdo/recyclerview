package com.example.myapplication;

import java.util.LinkedList;

public class Fruit {
    private int id;
    private String name;
    private String description;

    private String short_description;
    private String coverUrl;

    public Fruit(int id, String name, String description, String coverUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.short_description = getShort_description(description);
        this.coverUrl = coverUrl;
    }

    /*public Fruit(int id, String name, String description, String coverUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.coverUrl = coverUrl;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public static String getShort_description(String description) {
        if(description == null || description.isEmpty()){
            return "";
        }
        String[] words = description.split(" ");

        if(words.length <= 10){
            return  description;
        }else{
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                sb.append(words[i]);
                sb.append(" ");
            }
            sb.append("...");
            return sb.toString();
        }
    }

    public void setShort_description(String description) {
        this.description = description;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public static Fruit getFruitFromId(int id){
        LinkedList<Fruit> phs = generateFruit();
        for(int i=0;i<phs.size();i++){
            if(phs.get(i).getId() == id){
                return phs.get(i);
            }
        }
        return null;
    }
    public static LinkedList<Fruit> generateFruit(){
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(0, new Fruit(0, "Strawberry", "The first garden strawberry was grown in Brittany, France, during the late 18th century. Prior to this, wild strawberries and cultivated selections from wild strawberry species were the common source of the fruit.","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Garden_strawberry_%28Fragaria_%C3%97_ananassa%29_single2.jpg/220px-Garden_strawberry_%28Fragaria_%C3%97_ananassa%29_single2.jpg"));
        fruits.add(1, new Fruit(1, "Watermelon","The watermelon is an annual that has a prostrate or climbing habit. Stems are up to 3 metres (10 feet) long and new growth has yellow or brown hairs. ", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Taiwan_2009_Tainan_City_Organic_Farm_Watermelon_FRD_7962.jpg/398px-Taiwan_2009_Tainan_City_Organic_Farm_Watermelon_FRD_7962.jpg.jpg"));
        fruits.add(2, new Fruit(2, "Banana","The banana plant is the largest herbaceous flowering plant. All the above-ground parts of a banana plant grow from a structure usually called a 'corm'", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Bananas_white_background_DS.jpg/800px-Bananas_white_background_DS.jpg"));
        fruits.add(3, new Fruit(3, "Grape fruit","The evergreen grapefruit trees usually grow to around 5–6 m (16–20 ft) tall, although they may reach 13–15 m (43–49 ft). The leaves are long (up to 15 cm (5.9 in)), thin, glossy, and dark green.", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Citrus_paradisi_%28Grapefruit%2C_pink%29_white_bg.jpg/800px-Citrus_paradisi_%28Grapefruit%2C_pink%29_white_bg.jpg"));
        fruits.add(4, new Fruit(4, "Grape","A grape is a fruit, botanically a berry, of the deciduous woody vines of the flowering plant genus Vitis. Grapes are a non-climacteric type of fruit, generally occurring in clusters.", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Grapes%2C_Rostov-on-Don%2C_Russia.jpg/800px-Grapes%2C_Rostov-on-Don%2C_Russia.jpg"));
        fruits.add(5, new Fruit(5, "Apple","The apple is a deciduous tree, generally standing 2 to 4.5 m (6 to 15 ft) tall in cultivation and up to 9 m (30 ft) in the wild. When cultivated, the size, shape and branch density are determined by rootstock selection and trimming method. The leaves are alternately arranged dark green-colored simple ovals with serrated margins and slightly downy undersides.", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Fuji_apple.jpg/1024px-Fuji_apple.jpg"));
        fruits.add(6, new Fruit(6, "Mango","A mango is an edible stone fruit produced by the tropical tree Mangifera indica. It is believed to have originated between northwestern Myanmar, Bangladesh, and northeastern India", "https://upload.wikimedia.org/wikipedia/commons/9/90/Hapus_Mango.jpg"));
        fruits.add(7, new Fruit(7, "Durian","Named in some regions as the \"king of fruits\", the durian is distinctive for its large size, strong odour, and thorn-covered rind.", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Durian_in_black.jpg/220px-Durian_in_black.jpg"));
        fruits.add(8, new Fruit(8, "Plum","Plums are a diverse group of species. The commercially important plum trees are medium-sized, usually pruned to 5–6 metres (16–20 ft) height. The tree is of medium hardiness.", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Plums_African_Rose_-_whole%2C_halved_and_slice.jpg/800px-Plums_African_Rose_-_whole%2C_halved_and_slice.jpg"));
        fruits.add(9, new Fruit(9, "Cucumber","The cucumber is a creeping vine that roots in the ground and grows up trellises or other supporting frames, wrapping around supports with thin, spiraling tendrils. The plant may also root in a soilless medium, whereby it will sprawl along the ground in lieu of a supporting structure. The vine has large leaves that form a canopy over the fruits", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a3/Cucumber_BNC.jpg/220px-Cucumber_BNC.jpg"));
        return fruits;
    }
}
