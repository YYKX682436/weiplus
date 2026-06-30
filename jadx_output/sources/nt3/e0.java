package nt3;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f339767e = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f339768f = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public static final long f339769g = 1380 + (300 / 2);

    /* renamed from: h, reason: collision with root package name */
    public static final long f339770h = 1680;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f339771a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final nt3.b f339772b = new nt3.b();

    /* renamed from: c, reason: collision with root package name */
    public ib5.j f339773c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f339774d;

    public final nt3.c0 a(long j17) {
        float f17;
        long j18 = j17;
        nt3.c0 c0Var = new nt3.c0(this);
        java.util.ArrayList arrayList = this.f339771a;
        if (arrayList.size() == 0) {
            return null;
        }
        int size = arrayList.size();
        float[] fArr = f339768f;
        float[] fArr2 = f339767e;
        float[] fArr3 = c0Var.f339757e;
        float[] fArr4 = c0Var.f339756d;
        if (size == 1) {
            c0Var.f339753a = 0;
            c0Var.f339754b = 0.0f;
            c0Var.f339755c = 1.0f;
            float[] fArr5 = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            float f18 = ((((float) j18) / ((float) 15000)) / 2) + 1.0f;
            fArr5[0] = f18;
            fArr5[5] = f18;
            android.opengl.Matrix.multiplyMM(c0Var.f339756d, 0, fArr2, 0, fArr, 0);
            android.opengl.Matrix.multiplyMM(c0Var.f339757e, 0, fArr5, 0, fArr, 0);
            if (this.f339774d) {
                android.opengl.Matrix.scaleM(fArr4, 0, 1.0f, -1.0f, 1.0f);
                android.opengl.Matrix.scaleM(fArr3, 0, 1.0f, -1.0f, 1.0f);
            }
            return c0Var;
        }
        android.opengl.Matrix.multiplyMM(c0Var.f339756d, 0, fArr2, 0, fArr, 0);
        android.opengl.Matrix.multiplyMM(c0Var.f339757e, 0, fArr2, 0, fArr, 0);
        long size2 = arrayList.size() - 1;
        long j19 = f339770h;
        long j27 = f339769g;
        boolean z17 = j18 < (size2 * j19) + j27;
        long size3 = j18 > j27 ? (((j18 - j27) / j19) + 1) % arrayList.size() : 0L;
        c0Var.f339753a = (int) size3;
        if (size3 == 0 && z17) {
            c0Var.f339754b = 0.0f;
            c0Var.f339755c = 1.0f;
            f17 = 1.0f;
        } else {
            if (j18 > j27) {
                j18 = (j18 - j27) % j19;
            }
            if (j18 < 300) {
                float f19 = ((float) j18) / ((float) 300);
                c0Var.f339755c = f19;
                f17 = 1.0f;
                c0Var.f339754b = 1.0f - f19;
            } else {
                f17 = 1.0f;
                c0Var.f339754b = 0.0f;
                c0Var.f339755c = 1.0f;
            }
        }
        if (this.f339774d) {
            android.opengl.Matrix.scaleM(fArr4, 0, f17, -1.0f, f17);
            android.opengl.Matrix.scaleM(fArr3, 0, f17, -1.0f, f17);
        }
        return c0Var;
    }

    public final void b(nt3.d0 d0Var) {
        int i17;
        if (d0Var.f339759a == null || d0Var.f339760b == null) {
            pm0.c cVar = new pm0.c("addImage");
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            java.lang.String str = d0Var.f339765g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            int i18 = options.outWidth;
            int i19 = options.outHeight;
            st3.o oVar = st3.o.f412557a;
            options.inSampleSize = com.tencent.mm.sdk.platformtools.x.f(i18, i19, oVar.a(), oVar.a());
            options.inJustDecodeBounds = false;
            android.graphics.Bitmap c17 = c(com.tencent.mm.graphics.e.d(d0Var.f339765g, options));
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryImagePlayer", "resizeBitmap first " + cVar);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            options.inSampleSize = com.tencent.mm.sdk.platformtools.x.f(i18, i19, oVar.a() / 2, oVar.a() / 2);
            android.graphics.Bitmap c18 = c(com.tencent.mm.graphics.e.d(d0Var.f339765g, options));
            try {
                if (this.f339773c == null) {
                    this.f339773c = new ib5.j(com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
                ib5.j jVar = this.f339773c;
                kotlin.jvm.internal.o.d(jVar);
                jVar.b(c18, 4.0f);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Story.StoryImagePlayer", e17, "rsblur exception", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryImagePlayer", "rsblur exception, path:%s", d0Var.f339765g);
                if (com.tencent.mars.xlog.Log.getLogLevel() >= 1) {
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "RenderScript Exception", 0).show();
                }
                android.graphics.Point c19 = oVar.c();
                c18 = com.tencent.mm.sdk.platformtools.x.q(android.graphics.Color.parseColor("#ff000000"), c19.x, c19.y);
                kotlin.jvm.internal.o.f(c18, "createColorBitmap(...)");
            }
            android.graphics.Bitmap bitmap = c18;
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.StoryImagePlayer", "fastblur cost:%s, sampleSize:%s, width:%s, height:%s resizeBitmap second " + cVar, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(options.inSampleSize), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
            if (c17 != null) {
                java.lang.String path = d0Var.f339765g;
                kotlin.jvm.internal.o.g(path, "path");
                try {
                    i17 = com.tencent.mm.sdk.platformtools.l.a(path);
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Story.StoryImagePlayer", e18, "readPictureDegree", new java.lang.Object[0]);
                    i17 = 0;
                }
                if (i17 == 0) {
                    d0Var.f339759a = c17;
                    d0Var.f339760b = bitmap;
                    d0Var.f339761c = c17.getWidth();
                    android.graphics.Bitmap bitmap2 = d0Var.f339759a;
                    kotlin.jvm.internal.o.d(bitmap2);
                    d0Var.f339762d = bitmap2.getHeight();
                    return;
                }
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postRotate(i17);
                int width = c17.getWidth();
                int height = c17.getHeight();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                aVar.c(bool);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(0);
                aVar.c(0);
                aVar.c(c17);
                java.lang.Object obj2 = new java.lang.Object();
                yj0.a.d(obj2, aVar.b(), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                zj0.a aVar2 = new zj0.a();
                aVar2.c(bool);
                aVar2.c(matrix);
                aVar2.c(java.lang.Integer.valueOf(height2));
                aVar2.c(java.lang.Integer.valueOf(width2));
                aVar2.c(0);
                aVar2.c(0);
                aVar2.c(bitmap);
                java.lang.Object obj3 = new java.lang.Object();
                yj0.a.d(obj3, aVar2.b(), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
                yj0.a.e(obj3, createBitmap2, "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "loadImage", "(Lcom/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer$PlayItem;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap2, "createBitmap(...)");
                d0Var.f339759a = createBitmap;
                d0Var.f339761c = createBitmap.getWidth();
                android.graphics.Bitmap bitmap3 = d0Var.f339759a;
                kotlin.jvm.internal.o.d(bitmap3);
                d0Var.f339762d = bitmap3.getHeight();
                d0Var.f339760b = createBitmap2;
            }
        }
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        if (bitmap.getWidth() % 2 != 1) {
            return bitmap;
        }
        int width = bitmap.getWidth() + 1;
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "resizeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/background/image2video/StoryImagePlayer", "resizeBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.d(createBitmap);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        return createBitmap;
    }
}
