package s5;

/* loaded from: classes14.dex */
public final class f implements s5.a {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Set f403007j;

    /* renamed from: a, reason: collision with root package name */
    public final int f403008a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f403009b;

    /* renamed from: c, reason: collision with root package name */
    public final s5.b f403010c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f403011d;

    /* renamed from: e, reason: collision with root package name */
    public int f403012e;

    /* renamed from: f, reason: collision with root package name */
    public int f403013f;

    /* renamed from: g, reason: collision with root package name */
    public int f403014g;

    /* renamed from: h, reason: collision with root package name */
    public int f403015h;

    /* renamed from: i, reason: collision with root package name */
    public int f403016i;

    static {
        lz5.q qVar = new lz5.q();
        qVar.add(android.graphics.Bitmap.Config.ALPHA_8);
        qVar.add(android.graphics.Bitmap.Config.RGB_565);
        qVar.add(android.graphics.Bitmap.Config.ARGB_4444);
        qVar.add(android.graphics.Bitmap.Config.ARGB_8888);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            qVar.add(android.graphics.Bitmap.Config.RGBA_F16);
        }
        f403007j = kz5.o1.a(qVar);
    }

    public f(int i17, java.util.Set allowedConfigs, s5.b strategy, h6.k kVar, int i18, kotlin.jvm.internal.i iVar) {
        allowedConfigs = (i18 & 2) != 0 ? f403007j : allowedConfigs;
        if ((i18 & 4) != 0) {
            int i19 = s5.b.f403005a;
            strategy = new s5.i();
        }
        kotlin.jvm.internal.o.g(allowedConfigs, "allowedConfigs");
        kotlin.jvm.internal.o.g(strategy, "strategy");
        this.f403008a = i17;
        this.f403009b = allowedConfigs;
        this.f403010c = strategy;
        this.f403011d = new java.util.HashSet();
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("maxSize must be >= 0.".toString());
        }
    }

    @Override // s5.a
    public synchronized void a(int i17) {
        if (i17 >= 40) {
            f(-1);
        } else {
            boolean z17 = false;
            if (10 <= i17 && i17 < 20) {
                z17 = true;
            }
            if (z17) {
                f(this.f403012e / 2);
            }
        }
    }

    @Override // s5.a
    public synchronized void b(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            return;
        }
        int a17 = h6.a.a(bitmap);
        if (bitmap.isMutable() && a17 <= this.f403008a && this.f403009b.contains(bitmap.getConfig())) {
            if (this.f403011d.contains(bitmap)) {
                return;
            }
            ((s5.i) this.f403010c).c(bitmap);
            this.f403011d.add(bitmap);
            this.f403012e += a17;
            this.f403015h++;
            f(this.f403008a);
            return;
        }
        bitmap.recycle();
    }

    @Override // s5.a
    public android.graphics.Bitmap c(int i17, int i18, android.graphics.Bitmap.Config config) {
        kotlin.jvm.internal.o.g(config, "config");
        android.graphics.Bitmap e17 = e(i17, i18, config);
        if (e17 != null) {
            return e17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "coil/bitmap/RealBitmapPool", "getDirty", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "coil/bitmap/RealBitmapPool", "getDirty", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    @Override // s5.a
    public android.graphics.Bitmap d(int i17, int i18, android.graphics.Bitmap.Config config) {
        kotlin.jvm.internal.o.g(config, "config");
        android.graphics.Bitmap e17 = e(i17, i18, config);
        if (e17 == null) {
            e17 = null;
        } else {
            e17.eraseColor(0);
        }
        if (e17 != null) {
            return e17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "coil/bitmap/RealBitmapPool", "get", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "coil/bitmap/RealBitmapPool", "get", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public synchronized android.graphics.Bitmap e(int i17, int i18, android.graphics.Bitmap.Config config) {
        android.graphics.Bitmap b17;
        kotlin.jvm.internal.o.g(config, "config");
        if (!(!h6.a.b(config))) {
            throw new java.lang.IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
        b17 = ((s5.i) this.f403010c).b(i17, i18, config);
        if (b17 == null) {
            this.f403014g++;
        } else {
            this.f403011d.remove(b17);
            this.f403012e -= h6.a.a(b17);
            this.f403013f++;
            b17.setDensity(0);
            b17.setHasAlpha(true);
            b17.setPremultiplied(true);
        }
        return b17;
    }

    public final synchronized void f(int i17) {
        java.lang.Object obj;
        while (this.f403012e > i17) {
            s5.i iVar = (s5.i) this.f403010c;
            t5.b bVar = iVar.f403027b;
            t5.a aVar = bVar.f415683a;
            t5.a aVar2 = aVar.f415681c;
            while (true) {
                obj = null;
                if (kotlin.jvm.internal.o.b(aVar2, aVar)) {
                    break;
                }
                java.util.List list = aVar2.f415680b;
                if (list != null) {
                    obj = kz5.h0.E(list);
                }
                if (obj != null) {
                    break;
                }
                t5.a aVar3 = aVar2.f415681c;
                t5.a aVar4 = aVar2.f415682d;
                aVar3.getClass();
                kotlin.jvm.internal.o.g(aVar4, "<set-?>");
                aVar3.f415682d = aVar4;
                t5.a aVar5 = aVar2.f415682d;
                t5.a aVar6 = aVar2.f415681c;
                aVar5.getClass();
                kotlin.jvm.internal.o.g(aVar6, "<set-?>");
                aVar5.f415681c = aVar6;
                java.util.HashMap hashMap = bVar.f415684b;
                if (hashMap == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
                kotlin.jvm.internal.m0.c(hashMap).remove(aVar2.f415679a);
                aVar2 = aVar2.f415681c;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap != null) {
                iVar.a(bitmap.getAllocationByteCount());
            }
            if (bitmap == null) {
                this.f403012e = 0;
                return;
            }
            this.f403011d.remove(bitmap);
            this.f403012e -= h6.a.a(bitmap);
            this.f403016i++;
            bitmap.recycle();
        }
    }
}
