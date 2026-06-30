package nf;

/* loaded from: classes7.dex */
public abstract class c {
    public static boolean a(java.util.Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static java.util.List b(java.util.List list, java.util.List list2) {
        if (list2 != null) {
            list.addAll(list2);
        }
        return list;
    }
}
