package oj0;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final oj0.c f345726a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f345727b;

    /* renamed from: c, reason: collision with root package name */
    public static oj0.h f345728c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f345729d;

    static {
        oj0.c cVar = new oj0.c();
        f345726a = cVar;
        java.lang.String str = lp0.b.h() + "photoedit";
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hif);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        oj0.a aVar = new oj0.a(0, string, "");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hi8);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        oj0.a aVar2 = new oj0.a(1, string2, str + "/filter_source_0.png");
        java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hi9);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        oj0.a aVar3 = new oj0.a(2, string3, str + "/filter_source_1.png");
        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hi_);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        oj0.a aVar4 = new oj0.a(3, string4, str + "/filter_source_2.png");
        java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hia);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        oj0.a aVar5 = new oj0.a(4, string5, str + "/filter_source_3.png");
        java.lang.String string6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hib);
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        oj0.a aVar6 = new oj0.a(5, string6, str + "/filter_source_4.png");
        java.lang.String string7 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hic);
        kotlin.jvm.internal.o.f(string7, "getString(...)");
        oj0.a aVar7 = new oj0.a(6, string7, str + "/filter_source_5.png");
        java.lang.String string8 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hid);
        kotlin.jvm.internal.o.f(string8, "getString(...)");
        oj0.a aVar8 = new oj0.a(7, string8, str + "/filter_source_6.png");
        java.lang.String string9 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hie);
        kotlin.jvm.internal.o.f(string9, "getString(...)");
        f345727b = kz5.c0.i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new oj0.a(8, string9, str + "/filter_source_7.png"));
        android.content.res.AssetManager assets = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        cVar.a(assets, "photofilters", str);
    }

    public final void a(android.content.res.AssetManager assets, java.lang.String assetsPath, java.lang.String localPath) {
        kotlin.jvm.internal.o.g(assets, "assets");
        kotlin.jvm.internal.o.g(assetsPath, "assetsPath");
        kotlin.jvm.internal.o.g(localPath, "localPath");
        try {
            java.lang.String[] list = assets.list(assetsPath);
            if (list == null) {
                return;
            }
            if (!(list.length == 0)) {
                com.tencent.mm.vfs.w6.u(localPath);
                for (java.lang.String str : list) {
                    f345726a.a(assets, assetsPath + '/' + str, localPath + '/' + str);
                }
                return;
            }
            java.io.InputStream open = assets.open(assetsPath);
            try {
                java.io.OutputStream K = com.tencent.mm.vfs.w6.K(localPath, false);
                try {
                    kotlin.jvm.internal.o.d(open);
                    kotlin.jvm.internal.o.d(K);
                    vz5.a.b(open, K, 0, 2, null);
                    vz5.b.a(K, null);
                    vz5.b.a(open, null);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BitmapFilter", e17, "copyAssets", new java.lang.Object[0]);
        }
    }

    public final android.graphics.Bitmap b(android.graphics.Bitmap preBitmap, int i17, int i18, int i19, float f17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(preBitmap, "preBitmap");
        if (!f345729d) {
            d(preBitmap);
        }
        if (f345728c == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BitmapFilter", "filter render is null");
            android.graphics.Bitmap.Config config = preBitmap.getConfig();
            kotlin.jvm.internal.o.d(config);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/glrender/BitmapFilter", "filterBitmap", "(Landroid/graphics/Bitmap;IIIF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/glrender/BitmapFilter", "filterBitmap", "(Landroid/graphics/Bitmap;IIIF)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            return createBitmap;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = f345727b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((oj0.a) obj).f345721a == i17) {
                break;
            }
        }
        oj0.a aVar = (oj0.a) obj;
        java.lang.String str = aVar != null ? aVar.f345723c : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BitmapFilter", "lut file not exist:" + str);
            }
            oj0.h hVar = f345728c;
            kotlin.jvm.internal.o.d(hVar);
            return c(hVar.a(), i18, i19, i17);
        }
        java.lang.Object obj3 = new java.lang.Object();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        oj0.h hVar2 = f345728c;
        kotlin.jvm.internal.o.d(hVar2);
        kotlin.jvm.internal.o.d(str);
        hVar2.f345736a.post(new oj0.d(hVar2, new oj0.b(obj3, h0Var), str, f17));
        synchronized (obj3) {
            if (h0Var.f310123d == null) {
                obj3.wait();
            }
        }
        java.lang.Object obj4 = h0Var.f310123d;
        kotlin.jvm.internal.o.d(obj4);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj4;
        if (i18 == bitmap.getWidth() && i19 == bitmap.getHeight()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filterBitmap cost ");
            sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
            sb6.append("ms, bitmap width:");
            oj0.h hVar3 = f345728c;
            kotlin.jvm.internal.o.d(hVar3);
            sb6.append(java.lang.Integer.valueOf(hVar3.a().getWidth()));
            sb6.append(", height:");
            oj0.h hVar4 = f345728c;
            kotlin.jvm.internal.o.d(hVar4);
            sb6.append(java.lang.Integer.valueOf(hVar4.a().getHeight()));
            com.tencent.mars.xlog.Log.i("MicroMsg.BitmapFilter", sb6.toString());
            java.lang.Object obj5 = h0Var.f310123d;
            kotlin.jvm.internal.o.d(obj5);
            return (android.graphics.Bitmap) obj5;
        }
        android.graphics.Bitmap c17 = f345726a.c(bitmap, i18, i19, 0);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("filterBitmap cost ");
        sb7.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb7.append("ms, bitmap width:");
        oj0.h hVar5 = f345728c;
        kotlin.jvm.internal.o.d(hVar5);
        sb7.append(java.lang.Integer.valueOf(hVar5.a().getWidth()));
        sb7.append(", height:");
        oj0.h hVar6 = f345728c;
        kotlin.jvm.internal.o.d(hVar6);
        sb7.append(java.lang.Integer.valueOf(hVar6.a().getHeight()));
        sb7.append(", targetWidth:");
        sb7.append(i18);
        sb7.append(", targetHeight:");
        sb7.append(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.BitmapFilter", sb7.toString());
        return c17;
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap, int i17, int i18, int i19) {
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        kotlin.jvm.internal.o.d(config);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/glrender/BitmapFilter", "filterToTargetSizeByMatrix", "(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/glrender/BitmapFilter", "filterToTargetSizeByMatrix", "(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrix.set(i19 != 0 ? i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? i19 != 5 ? new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 100.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 100.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new android.graphics.Rect(0, 0, i17, i18), paint);
        return createBitmap;
    }

    public final void d(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        if (!f345729d) {
            oj0.h hVar = new oj0.h();
            kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "getContext(...)");
            hVar.f345742g = bitmap;
            hVar.f345746k = bitmap.getWidth();
            hVar.f345747l = bitmap.getHeight();
            hVar.f345736a.post(new oj0.f(hVar));
            f345728c = hVar;
        }
        f345729d = true;
    }
}
