package cv4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/b;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class b extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiAddMinimizeTask", "addToStar: liteapp: handleMsg: %s", java.lang.String.valueOf(jSONObject));
        android.content.Context context = c();
        if (!(context instanceof android.app.Activity)) {
            throw new java.lang.IllegalStateException("LiteAppJsApiAddMinimizeTask addToStar need Activity Context");
        }
        if (!(com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a) instanceof android.view.View)) {
            throw new java.lang.IllegalStateException("LiteAppJsApiAddMinimizeTask addToStar uiCallback is not View");
        }
        kotlin.jvm.internal.o.d(jSONObject);
        java.lang.Object uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a);
        kotlin.jvm.internal.o.e(uICallback, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) uICallback;
        zv4.g gVar = zv4.h.f476461a;
        android.graphics.RectF e17 = gVar.e(jSONObject);
        android.graphics.Rect c17 = gVar.c(e17, view);
        if (!jSONObject.optBoolean("coverImgSnapshot", false)) {
            gVar.a((android.app.Activity) context, jSONObject, c17, null);
            return;
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        e17.roundOut(new android.graphics.Rect());
        cv4.a aVar = new cv4.a(context, jSONObject, c17);
        com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
        iVar.getClass();
        if (!(view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "capture view is not WxaLiteAppBaseView");
            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddMinimizeTask", "dl: onScreenshotFailed, bitmap is null");
            kotlin.jvm.internal.o.f(context, "$context");
            gVar.a((android.app.Activity) context, jSONObject, c17, null);
            return;
        }
        com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = (com.tencent.liteapp.ui.WxaLiteAppBaseView) view;
        final com.tencent.mm.feature.lite.a1 a1Var = new com.tencent.mm.feature.lite.a1(iVar, aVar);
        io.flutter.embedding.engine.renderer.RenderSurface attachedRenderSurface = wxaLiteAppBaseView.f46042f.f349795d.getAttachedRenderSurface();
        float f17 = wxaLiteAppBaseView.getContext().getResources().getDisplayMetrics().density;
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (int) (r11.left * f17);
        rect.top = (int) (r11.top * f17);
        rect.right = (int) (r11.right * f17);
        rect.bottom = (int) (r11.bottom * f17);
        if (attachedRenderSurface instanceof io.flutter.embedding.android.FlutterTextureView) {
            android.view.TextureView textureView = (android.view.TextureView) wxaLiteAppBaseView.f46042f.f349795d.getChildAt(0);
            android.graphics.Bitmap bitmap = textureView.getBitmap();
            if (bitmap == null) {
                kd.c.e("WxaLiteApp.WxaLiteAppBaseView", "captureScreenshotInRect failed. render Surface is textureView", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("LiteAppJsApiAddMinimizeTask", "dl: onScreenshotFailed, bitmap is null");
                android.content.Context context2 = aVar.f222580a;
                kotlin.jvm.internal.o.f(context2, "$context");
                gVar.a((android.app.Activity) context2, aVar.f222581b, aVar.f222582c, null);
                return;
            }
            android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, bitmap.getWidth(), textureView.getHeight());
            if (!java.lang.Boolean.valueOf(rect2.intersect(rect)).booleanValue()) {
                kd.c.e("WxaLiteApp.WxaLiteAppBaseView", "The given captureRegion is out of range. render Surface is textureView", new java.lang.Object[0]);
            }
            int i17 = rect2.left;
            int i18 = rect2.top;
            int width = rect2.width();
            int height = rect2.height();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(bitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/liteapp/ui/WxaLiteAppBaseView", "captureScreenshotInRect", "(Landroid/graphics/Rect;Lcom/tencent/liteapp/ui/WxaLiteAppBaseView$ScreenshotCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/liteapp/ui/WxaLiteAppBaseView", "captureScreenshotInRect", "(Landroid/graphics/Rect;Lcom/tencent/liteapp/ui/WxaLiteAppBaseView$ScreenshotCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            a1Var.a(createBitmap);
            return;
        }
        if (!(attachedRenderSurface instanceof io.flutter.embedding.android.FlutterSurfaceView)) {
            kd.c.e("WxaLiteApp.WxaLiteAppBaseView", "captureScreenshotInRect failed. SurfaceView CopyPixel min API 26", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddMinimizeTask", "dl: onScreenshotFailed, bitmap is null");
            android.content.Context context3 = aVar.f222580a;
            kotlin.jvm.internal.o.f(context3, "$context");
            gVar.a((android.app.Activity) context3, aVar.f222581b, aVar.f222582c, null);
            return;
        }
        android.view.SurfaceView surfaceView = (android.view.SurfaceView) wxaLiteAppBaseView.f46042f.f349795d.getChildAt(0);
        if (android.os.Build.VERSION.SDK_INT < 26) {
            kd.c.e("WxaLiteApp.WxaLiteAppBaseView", "captureScreenshotInRect failed. SurfaceView CopyPixel min API 26", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddMinimizeTask", "dl: onScreenshotFailed, bitmap is null");
            android.content.Context context4 = aVar.f222580a;
            kotlin.jvm.internal.o.f(context4, "$context");
            gVar.a((android.app.Activity) context4, aVar.f222581b, aVar.f222582c, null);
            return;
        }
        android.graphics.Rect rect3 = new android.graphics.Rect(0, 0, surfaceView.getWidth(), surfaceView.getHeight());
        if (!java.lang.Boolean.valueOf(rect3.intersect(rect)).booleanValue()) {
            kd.c.e("WxaLiteApp.WxaLiteAppBaseView", "The given captureRegion is out of range. render Surface is surfaceView", new java.lang.Object[0]);
        }
        int width2 = rect3.width();
        int height2 = rect3.height();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(height2));
        arrayList2.add(java.lang.Integer.valueOf(width2));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/liteapp/ui/WxaLiteAppBaseView", "captureScreenshotInRect", "(Landroid/graphics/Rect;Lcom/tencent/liteapp/ui/WxaLiteAppBaseView$ScreenshotCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        final android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap2, "com/tencent/liteapp/ui/WxaLiteAppBaseView", "captureScreenshotInRect", "(Landroid/graphics/Rect;Lcom/tencent/liteapp/ui/WxaLiteAppBaseView$ScreenshotCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.view.PixelCopy.request(surfaceView, rect3, createBitmap2, new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: com.tencent.liteapp.ui.WxaLiteAppBaseView$$a
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i19) {
                int i27 = com.tencent.liteapp.ui.WxaLiteAppBaseView.W;
                com.tencent.liteapp.ui.q qVar = com.tencent.liteapp.ui.q.this;
                if (i19 == 0) {
                    ((com.tencent.mm.feature.lite.a1) qVar).a(createBitmap2);
                    return;
                }
                kd.c.e("WxaLiteApp.WxaLiteAppBaseView", "captureScreenshotInRect failed. render Surface is surfaceView", new java.lang.Object[0]);
                cv4.a aVar2 = (cv4.a) ((com.tencent.mm.feature.lite.a1) qVar).f67121a;
                aVar2.getClass();
                com.tencent.mars.xlog.Log.i("LiteAppJsApiAddMinimizeTask", "dl: onScreenshotFailed, bitmap is null");
                zv4.g gVar2 = zv4.h.f476461a;
                android.content.Context context5 = aVar2.f222580a;
                kotlin.jvm.internal.o.f(context5, "$context");
                gVar2.a((android.app.Activity) context5, aVar2.f222581b, aVar2.f222582c, null);
            }
        }, new android.os.Handler(android.os.Looper.getMainLooper()));
    }
}
