package pa3;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final pa3.w f353012a = new pa3.w();

    /* renamed from: b, reason: collision with root package name */
    public static android.os.HandlerThread f353013b;

    /* renamed from: c, reason: collision with root package name */
    public static long f353014c;

    public static android.graphics.Bitmap b(pa3.w wVar, android.view.View view, java.lang.Integer num, java.lang.Integer num2, android.graphics.Bitmap.Config config, int i17, java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        java.lang.Integer num3 = (i17 & 2) != 0 ? null : num;
        java.lang.Integer num4 = (i17 & 4) != 0 ? null : num2;
        android.graphics.Bitmap.Config config2 = (i17 & 8) != 0 ? android.graphics.Bitmap.Config.ARGB_8888 : config;
        wVar.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(config2, "config");
        int intValue = num3 != null ? num3.intValue() : view.getWidth();
        int intValue2 = num4 != null ? num4.intValue() : view.getHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config2);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intValue2));
        arrayList.add(java.lang.Integer.valueOf(intValue));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/lite/tasks/SnapShotUtilKt", "getBitmapFromSurfaceView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/lite/tasks/SnapShotUtilKt", "getBitmapFromSurfaceView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.drawable.Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        if (f353013b == null) {
            int i18 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a("SnapShotUtil", 0);
            f353013b = a17;
            a17.start();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotUtilKt", "start thread SnapShotUtil");
        }
        java.util.List a18 = wVar.a(view, (int) view.getX(), (int) view.getY());
        view.draw(canvas);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) a18;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                android.view.SurfaceView surfaceView = ((pa3.t) it.next()).f353007a;
                if (surfaceView instanceof io.flutter.embedding.android.FlutterSurfaceView) {
                    io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = ((io.flutter.embedding.android.FlutterSurfaceView) surfaceView).getAttachedRenderer();
                    bitmap = attachedRenderer != null ? attachedRenderer.getBitmap() : null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotUtilKt", "captureFlutterSurfaceView, result:" + bitmap);
                } else {
                    java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                    int width = surfaceView.getWidth();
                    int height = surfaceView.getHeight();
                    android.graphics.Bitmap.Config config3 = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(config3);
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(java.lang.Integer.valueOf(height));
                    arrayList3.add(java.lang.Integer.valueOf(width));
                    java.lang.Object obj3 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/lite/tasks/SnapShotUtilKt", "captureSurfaceView", "(Landroid/view/SurfaceView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                    yj0.a.e(obj3, createBitmap2, "com/tencent/mm/plugin/lite/tasks/SnapShotUtilKt", "captureSurfaceView", "(Landroid/view/SurfaceView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    kotlin.jvm.internal.o.f(createBitmap2, "createBitmap(...)");
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        pa3.u uVar = new pa3.u(countDownLatch);
                        android.os.HandlerThread handlerThread = f353013b;
                        kotlin.jvm.internal.o.d(handlerThread);
                        android.view.PixelCopy.request(surfaceView, createBitmap2, uVar, com.tencent.mm.sdk.platformtools.n3.createFreeHandler(handlerThread.getLooper()));
                    } else {
                        countDownLatch.countDown();
                    }
                    countDownLatch.await();
                    bitmap = createBitmap2;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, r6.f353008b, r6.f353009c, (android.graphics.Paint) null);
                }
            }
        }
        f353014c = java.lang.System.currentTimeMillis();
        ku5.u0 u0Var = ku5.t0.f312615d;
        pa3.v vVar = pa3.v.f353011d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(vVar, 60000L, false);
        return createBitmap;
    }

    public final java.util.List a(android.view.View view, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.SurfaceView) {
            arrayList.add(new pa3.t((android.view.SurfaceView) view, i17, i18));
        } else if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i19 = 0; i19 < childCount; i19++) {
                android.view.View childAt = viewGroup.getChildAt(i19);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                arrayList.addAll(a(childAt, (int) (viewGroup.getX() + i17), (int) (viewGroup.getY() + i18)));
            }
        }
        return arrayList;
    }
}
