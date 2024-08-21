import mindustry.type.Item;

public static Item 悖论金属;
public static void load() {
    悖论金属 = new Item("悖论金属") {{
        flammability=2.5f;
        explosiveness=1.5f;
        radioactivity=1.8f;
        hardness=2;
        cost=4;
    }};
};