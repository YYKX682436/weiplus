package sj3;

/* loaded from: classes14.dex */
public final class d5 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView f408485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f408486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f408487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f408488g;

    public d5(com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView, android.graphics.Bitmap bitmap, int i17, int i18) {
        this.f408485d = multitalkFrameView;
        this.f408486e = bitmap;
        this.f408487f = i17;
        this.f408488g = i18;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "drawBitmap";
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f408485d.f150341g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f408485d.f150339e;
        if (videoView != null) {
            videoView.setVisibility(0);
        }
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView = this.f408485d;
        android.graphics.Bitmap bitmap = this.f408486e;
        int i17 = this.f408487f;
        int i18 = this.f408488g;
        synchronized (multitalkFrameView) {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView2 = multitalkFrameView.f150339e;
                    if (videoView2 == null) {
                        return;
                    }
                    android.graphics.Canvas lockCanvas = videoView2.lockCanvas(null);
                    if (lockCanvas == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MultitalkFrameView", "getCanvasError");
                        return;
                    }
                    android.graphics.Matrix i19 = multitalkFrameView.i(lockCanvas.getWidth(), lockCanvas.getHeight(), bitmap.getWidth(), bitmap.getHeight(), i17, i18);
                    multitalkFrameView.f150352u = bitmap.getWidth();
                    multitalkFrameView.f150353v = bitmap.getHeight();
                    lockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    lockCanvas.drawColor(android.graphics.Color.parseColor("#232323"));
                    if (!bitmap.isRecycled()) {
                        try {
                            lockCanvas.drawBitmap(bitmap, i19, multitalkFrameView.f150346o);
                        } catch (java.lang.Exception unused) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MultitalkFrameView", "draw bitmap error");
                        }
                    }
                    try {
                        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView3 = multitalkFrameView.f150339e;
                        if (videoView3 != null) {
                            videoView3.unlockCanvasAndPost(lockCanvas);
                        }
                        multitalkFrameView.f150349r++;
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultitalkFrameView", e17, "drawBitmap unlockCanvasAndPost crash", new java.lang.Object[0]);
                    }
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MultitalkFrameView", "DrawBitmap, bitmap is null or recycled");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(220L, 27L, 1L, false);
        }
    }
}
