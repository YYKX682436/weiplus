package ya2;

/* loaded from: classes10.dex */
public final class l implements zy2.v8 {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.l f460502a = new ya2.l();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.LruCache f460503b = new android.util.LruCache(2);

    public mn2.h3 e(java.lang.String str, com.tencent.mm.plugin.finder.storage.y90 mediaType) {
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        return new mn2.q3(str, mediaType);
    }

    public void f(java.lang.String str, android.widget.ImageView imageView, int i17, int i18) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        com.tencent.mars.xlog.Log.i("FinderLoaderApi", "#loadChattingFeedCoverImage url=" + str);
        if (str == null || str.length() == 0) {
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        yo0.f fVar = new yo0.f();
        com.tencent.mm.sdk.platformtools.c4 INSTANCE = com.tencent.mm.sdk.platformtools.c4.f192496b;
        kotlin.jvm.internal.o.f(INSTANCE, "INSTANCE");
        fVar.f464088l = INSTANCE;
        fVar.f464078b = true;
        fVar.f464077a = true;
        if (i17 <= 0 || i18 <= 0) {
            fVar.f464084h = com.tencent.mm.R.color.BW_0_Alpha_0_0_4;
        } else {
            android.util.LruCache lruCache = f460503b;
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) lruCache.get(new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
            if (drawable != null) {
                fVar.f464085i = drawable;
            } else {
                int dimensionPixelSize = imageView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479654bs);
                int color = imageView.getContext().getColor(com.tencent.mm.R.color.FG_4);
                int color2 = imageView.getContext().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_4);
                boolean z17 = com.tencent.mm.sdk.platformtools.x.f193064a;
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/BitmapUtil", "createIconBitmapWithBg", "(IIIIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, createBitmap, "com/tencent/mm/sdk/platformtools/BitmapUtil", "createIconBitmapWithBg", "(IIIIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                android.graphics.drawable.Drawable drawable2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.picture_filled, null);
                int i19 = (i17 - dimensionPixelSize) / 2;
                int i27 = (i18 - dimensionPixelSize) / 2;
                drawable2.setBounds(i19, i27, i19 + dimensionPixelSize, dimensionPixelSize + i27);
                drawable2.draw(canvas);
                canvas.drawColor(color, android.graphics.PorterDuff.Mode.SRC_IN);
                canvas.drawColor(color2, android.graphics.PorterDuff.Mode.DST_OVER);
                android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable((android.content.res.Resources) null, createBitmap);
                lruCache.put(new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), bitmapDrawable);
                fVar.f464085i = bitmapDrawable;
            }
        }
        fVar.f464082f = ((java.lang.Number) t70Var.u().r()).intValue();
        fVar.f464081e = ((java.lang.Number) t70Var.v().r()).intValue();
        yo0.i a17 = fVar.a();
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(str, "token");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(j17.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).b(new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), a17).c(imageView);
    }

    public void g(android.widget.ImageView view, java.lang.String url, com.tencent.mm.plugin.finder.storage.y90 mediaType) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.a().c(new mn2.n(url, mediaType), view, g1Var.h(mn2.f1.f329957h));
    }

    public void h(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType) {
        kotlin.jvm.internal.o.g(loaderType, "loaderType");
        com.tencent.mars.xlog.Log.i("FinderLoaderApi", "#loadImage url=" + str);
        if (str == null || str.length() == 0) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        yo0.i h17 = g1Var.h(loaderType);
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(str, "token");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(j17.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        mn2.c1 c1Var = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
        if (imageView != null) {
            g1Var.e().b(c1Var, h17).c(imageView);
        } else {
            g1Var.e().b(c1Var, h17).a();
        }
    }

    public void i(java.lang.String str, android.view.View qImageView) {
        kotlin.jvm.internal.o.g(qImageView, "qImageView");
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e));
        ya2.j jVar = new ya2.j(qImageView);
        a17.getClass();
        a17.f447873d = jVar;
        a17.f();
    }

    public void j(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType) {
        kotlin.jvm.internal.o.g(loaderType, "loaderType");
        if ((str == null || str.length() == 0) || imageView == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.f().c(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(loaderType));
    }

    public void k(java.lang.String url, android.widget.ImageView imageView, java.lang.String str) {
        kotlin.jvm.internal.o.g(url, "url");
        if (url.length() == 0) {
            return;
        }
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(url, "token");
        if (str == null) {
            str = j17;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        mb4Var.set(0, url);
        mb4Var.set(1, url);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        mn2.j3 j3Var = new mn2.j3(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (imageView == null) {
            g1Var.j().b(j3Var, g1Var.h(mn2.f1.f329971y)).a();
        } else {
            g1Var.j().b(j3Var, g1Var.h(mn2.f1.f329971y)).c(imageView);
        }
    }

    public void l(java.lang.String str, android.widget.ImageView imageView, mn2.f1 loaderType, java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.o.g(loaderType, "loaderType");
        if ((str == null || str.length() == 0) || imageView == null) {
            return;
        }
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String j17 = hc2.l.j(str, "token");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.b(j17.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(j17);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        mn2.c1 c1Var = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
        mn2.g1 g1Var = mn2.g1.f329975a;
        ((mn2.d1) g1Var.e()).j(c1Var, g1Var.h(loaderType)).i(imageView, new ya2.k(weakReference));
    }
}
