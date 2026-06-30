package cz4;

/* loaded from: classes5.dex */
public final class i extends dp1.a {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f225040m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.app.Activity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f225040m = "MicroMsg.WeNoteFlutterFloatBallAdapter";
    }

    @Override // dp1.u, dp1.x
    public android.graphics.Bitmap getBitmap() {
        android.graphics.Bitmap bitmap;
        if (a() == null) {
            return null;
        }
        fz4.k kVar = fz4.k.f267314a;
        android.view.ViewGroup a17 = a();
        kotlin.jvm.internal.o.d(a17);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        kotlin.jvm.internal.o.g(config, "config");
        int width = a17.getWidth();
        int height = a17.getHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/wenote/flutter/util/WeNoteFlutterSnapShotUtilKt", "getBitmapFromSurfaceView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/wenote/flutter/util/WeNoteFlutterSnapShotUtilKt", "getBitmapFromSurfaceView", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.drawable.Drawable background = a17.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        if (fz4.k.f267315b == null) {
            int i17 = pu5.i.f358473b;
            android.os.HandlerThread a18 = pu5.f.a("SnapShotUtil", 0);
            fz4.k.f267315b = a18;
            a18.start();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotUtilKt", "start thread SnapShotUtil");
        }
        java.util.List a19 = kVar.a(a17, (int) a17.getX(), (int) a17.getY());
        a17.draw(canvas);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) a19;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                android.view.SurfaceView surfaceView = ((fz4.h) it.next()).f267309a;
                if (surfaceView instanceof io.flutter.embedding.android.FlutterSurfaceView) {
                    io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = ((io.flutter.embedding.android.FlutterSurfaceView) surfaceView).getAttachedRenderer();
                    bitmap = attachedRenderer != null ? attachedRenderer.getBitmap() : null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotUtilKt", "captureFlutterSurfaceView, result:" + bitmap);
                } else {
                    java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                    int width2 = surfaceView.getWidth();
                    int height2 = surfaceView.getHeight();
                    android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(config2);
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(java.lang.Integer.valueOf(height2));
                    arrayList3.add(java.lang.Integer.valueOf(width2));
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/wenote/flutter/util/WeNoteFlutterSnapShotUtilKt", "captureSurfaceView", "(Landroid/view/SurfaceView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                    yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/wenote/flutter/util/WeNoteFlutterSnapShotUtilKt", "captureSurfaceView", "(Landroid/view/SurfaceView;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    kotlin.jvm.internal.o.f(createBitmap2, "createBitmap(...)");
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        fz4.i iVar = new fz4.i(countDownLatch);
                        android.os.HandlerThread handlerThread = fz4.k.f267315b;
                        kotlin.jvm.internal.o.d(handlerThread);
                        android.view.PixelCopy.request(surfaceView, createBitmap2, iVar, com.tencent.mm.sdk.platformtools.n3.createFreeHandler(handlerThread.getLooper()));
                    } else {
                        countDownLatch.countDown();
                    }
                    countDownLatch.await();
                    bitmap = createBitmap2;
                }
                if (bitmap != null && !bitmap.isRecycled()) {
                    canvas.drawBitmap(bitmap, r2.f267310b, r2.f267311c, (android.graphics.Paint) null);
                }
            }
        }
        fz4.k.f267316c = java.lang.System.currentTimeMillis();
        ku5.u0 u0Var = ku5.t0.f312615d;
        fz4.j jVar = fz4.j.f267313d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(jVar, 60000L, false);
        return createBitmap;
    }

    @Override // dp1.u, dp1.x
    public android.view.View getMaskView() {
        return a();
    }

    @Override // dp1.u, dp1.x
    public boolean p() {
        return true;
    }

    @Override // dp1.u, dp1.x
    public void q(boolean z17) {
        if (getActivity() == null) {
            com.tencent.mars.xlog.Log.i(this.f225040m, "finish: activity null");
        } else if (getActivity() instanceof com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI) {
            super.q(z17);
        }
    }
}
