package sf;

/* loaded from: classes7.dex */
public class h extends com.tencent.xweb.XWebExtendPluginClient implements sf.d {

    /* renamed from: a, reason: collision with root package name */
    public gg.c f406942a;

    @Override // com.tencent.xweb.XWebExtendPluginClient
    public void onPluginDestroy(java.lang.String str, int i17) {
        super.onPluginDestroy(str, i17);
        gg.c cVar = this.f406942a;
        if (cVar != null) {
            ((gg.a) cVar).f(str, i17);
        }
    }

    @Override // com.tencent.xweb.XWebExtendPluginClient
    public void onPluginReady(java.lang.String str, int i17, android.graphics.SurfaceTexture surfaceTexture) {
        super.onPluginReady(str, i17, surfaceTexture);
        gg.c cVar = this.f406942a;
        if (cVar != null) {
            ((gg.a) cVar).g(str, i17, surfaceTexture);
        }
    }

    @Override // com.tencent.xweb.XWebExtendPluginClient
    public void onPluginReadyForGPUProcess(java.lang.String str, int i17, android.view.Surface surface) {
        super.onPluginReadyForGPUProcess(str, i17, surface);
        gg.c cVar = this.f406942a;
        if (cVar != null) {
            gg.a aVar = (gg.a) cVar;
            aVar.getClass();
            java.lang.String d17 = sf.i.d(str, i17);
            com.tencent.mars.xlog.Log.i(aVar.b(), "onPluginReady, key:%s", d17);
            eg.b c17 = aVar.c(str, i17, d17);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.w(aVar.b(), "onPluginReady, key:%s, handler is null", d17);
            } else {
                com.tencent.mars.xlog.Log.i(aVar.b(), "onPluginReady, key:%s, handler is ready", d17);
                c17.i(surface);
            }
        }
    }

    @Override // com.tencent.xweb.XWebExtendPluginClient
    public void onPluginScreenshotTaken(java.lang.String str, int i17, android.graphics.Bitmap bitmap) {
        super.onPluginScreenshotTaken(str, i17, bitmap);
        gg.c cVar = this.f406942a;
        if (cVar != null) {
            gg.a aVar = (gg.a) cVar;
            aVar.getClass();
            java.lang.String d17 = sf.i.d(str, i17);
            aVar.b();
            eg.b c17 = aVar.c(str, i17, d17);
            if (c17 == null) {
                com.tencent.mars.xlog.Log.w(aVar.b(), "onPluginScreenshotTaken, key:%s, handler is null", d17);
            } else {
                c17.k(bitmap);
            }
        }
    }

    @Override // com.tencent.xweb.XWebExtendPluginClient
    public void onPluginTouch(java.lang.String str, int i17, android.view.MotionEvent motionEvent) {
        super.onPluginTouch(str, i17, motionEvent);
        gg.c cVar = this.f406942a;
        if (cVar != null) {
            ((gg.a) cVar).h(str, i17, motionEvent);
        }
    }

    @Override // com.tencent.xweb.XWebExtendPluginClient, sf.d
    public void setPluginTextureScale(java.lang.String str, int i17, float f17, float f18) {
        super.setPluginTextureScale(str, i17, f17, f18);
    }

    @Override // com.tencent.xweb.XWebExtendPluginClient, sf.d
    public void takePluginScreenshot(java.lang.String str, int i17) {
        super.takePluginScreenshot(str, i17);
    }
}
