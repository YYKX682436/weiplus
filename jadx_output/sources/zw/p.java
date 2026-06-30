package zw;

/* loaded from: classes7.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f476538a;

    static {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.reflect.Field field : androidx.exifinterface.media.ExifInterface.class.getDeclaredFields()) {
            try {
                if (java.lang.reflect.Modifier.isFinal(field.getModifiers()) && java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getName().startsWith("TAG_")) {
                    linkedList.add((java.lang.String) field.get(null));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        f476538a = (java.lang.String[]) linkedList.toArray(new java.lang.String[linkedList.size()]);
    }
}
