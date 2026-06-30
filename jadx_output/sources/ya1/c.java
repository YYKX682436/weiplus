package ya1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f460418a;

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
        f460418a = (java.lang.String[]) linkedList.toArray(new java.lang.String[linkedList.size()]);
    }

    public static void a(androidx.exifinterface.media.ExifInterface exifInterface, androidx.exifinterface.media.ExifInterface exifInterface2) {
        if (exifInterface == null || exifInterface2 == null) {
            return;
        }
        for (java.lang.String str : f460418a) {
            java.lang.String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }
}
