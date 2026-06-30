package x6;

/* loaded from: classes13.dex */
public class u implements x6.p {

    /* renamed from: d, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f452173d;

    /* renamed from: e, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f452174e;

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f452175f;

    /* renamed from: g, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f452176g;

    /* renamed from: h, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f452177h;

    /* renamed from: a, reason: collision with root package name */
    public final x6.t f452178a = new x6.t();

    /* renamed from: b, reason: collision with root package name */
    public final x6.h f452179b = new x6.h();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f452180c = new java.util.HashMap();

    static {
        android.graphics.Bitmap.Config[] configArr = {android.graphics.Bitmap.Config.ARGB_8888, null};
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            configArr = (android.graphics.Bitmap.Config[]) java.util.Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = android.graphics.Bitmap.Config.RGBA_F16;
        }
        f452173d = configArr;
        f452174e = configArr;
        f452175f = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.RGB_565};
        f452176g = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_4444};
        f452177h = new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ALPHA_8};
    }

    public static java.lang.String c(int i17, android.graphics.Bitmap.Config config) {
        return "[" + i17 + "](" + config + ")";
    }

    public final void a(java.lang.Integer num, android.graphics.Bitmap bitmap) {
        java.util.NavigableMap d17 = d(bitmap.getConfig());
        java.lang.Integer num2 = (java.lang.Integer) d17.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d17.remove(num);
                return;
            } else {
                d17.put(num, java.lang.Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public android.graphics.Bitmap b(int i17, int i18, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap.Config[] configArr;
        int b17 = q7.p.b(i17, i18, config);
        x6.t tVar = this.f452178a;
        x6.s sVar = (x6.s) tVar.b();
        sVar.f452171b = b17;
        sVar.f452172c = config;
        int i19 = 0;
        if (android.os.Build.VERSION.SDK_INT < 26 || !android.graphics.Bitmap.Config.RGBA_F16.equals(config)) {
            int i27 = x6.r.f452169a[config.ordinal()];
            configArr = i27 != 1 ? i27 != 2 ? i27 != 3 ? i27 != 4 ? new android.graphics.Bitmap.Config[]{config} : f452177h : f452176g : f452175f : f452173d;
        } else {
            configArr = f452174e;
        }
        int length = configArr.length;
        while (true) {
            if (i19 >= length) {
                break;
            }
            android.graphics.Bitmap.Config config2 = configArr[i19];
            java.lang.Integer num = (java.lang.Integer) d(config2).ceilingKey(java.lang.Integer.valueOf(b17));
            if (num == null || num.intValue() > b17 * 8) {
                i19++;
            } else if (num.intValue() != b17 || (config2 != null ? !config2.equals(config) : config != null)) {
                tVar.c(sVar);
                int intValue = num.intValue();
                sVar = (x6.s) tVar.b();
                sVar.f452171b = intValue;
                sVar.f452172c = config2;
            }
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f452179b.a(sVar);
        if (bitmap != null) {
            a(java.lang.Integer.valueOf(sVar.f452171b), bitmap);
            bitmap.reconfigure(i17, i18, config);
        }
        return bitmap;
    }

    public final java.util.NavigableMap d(android.graphics.Bitmap.Config config) {
        java.util.Map map = this.f452180c;
        java.util.NavigableMap navigableMap = (java.util.NavigableMap) ((java.util.HashMap) map).get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap();
        ((java.util.HashMap) map).put(config, treeMap);
        return treeMap;
    }

    public java.lang.String e(android.graphics.Bitmap bitmap) {
        return c(q7.p.c(bitmap), bitmap.getConfig());
    }

    public void f(android.graphics.Bitmap bitmap) {
        int c17 = q7.p.c(bitmap);
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        x6.s sVar = (x6.s) this.f452178a.b();
        sVar.f452171b = c17;
        sVar.f452172c = config;
        this.f452179b.b(sVar, bitmap);
        java.util.NavigableMap d17 = d(bitmap.getConfig());
        java.lang.Integer num = (java.lang.Integer) d17.get(java.lang.Integer.valueOf(sVar.f452171b));
        d17.put(java.lang.Integer.valueOf(sVar.f452171b), java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("SizeConfigStrategy{groupedMap=");
        sb6.append(this.f452179b);
        sb6.append(", sortedSizes=(");
        java.util.Map map = this.f452180c;
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            sb6.append(entry.getKey());
            sb6.append('[');
            sb6.append(entry.getValue());
            sb6.append("], ");
        }
        if (!((java.util.HashMap) map).isEmpty()) {
            sb6.replace(sb6.length() - 2, sb6.length(), "");
        }
        sb6.append(")}");
        return sb6.toString();
    }
}
