package q7;

/* loaded from: classes13.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f360310a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f360311b = new char[64];

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i17, int i18, android.graphics.Bitmap.Config config) {
        int i19 = i17 * i18;
        if (config == null) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        int i27 = q7.o.f360309a[config.ordinal()];
        int i28 = 1;
        if (i27 != 1) {
            i28 = 2;
            if (i27 != 2 && i27 != 3) {
                i28 = 4;
                if (i27 == 4) {
                    i28 = 8;
                }
            }
        }
        return i19 * i28;
    }

    public static int c(android.graphics.Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (java.lang.NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new java.lang.IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static java.util.List d(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        for (java.lang.Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int e(java.lang.Object obj, int i17) {
        return (i17 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static boolean f(int i17, int i18) {
        if (i17 > 0 || i17 == Integer.MIN_VALUE) {
            return i18 > 0 || i18 == Integer.MIN_VALUE;
        }
        return false;
    }
}
