package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f191855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView f191856e;

    public q7(com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView, android.view.Surface surface) {
        this.f191856e = videoPlayerTextureView;
        this.f191855d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f191856e;
        android.view.Surface surface = this.f191855d;
        if (surface != null) {
            try {
                if (surface.isValid()) {
                    com.tencent.mars.xlog.Log.i(videoPlayerTextureView.f191448h, "%d release surface [%d]", java.lang.Integer.valueOf(videoPlayerTextureView.hashCode()), java.lang.Integer.valueOf(surface.hashCode()));
                    surface.release();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(videoPlayerTextureView.f191448h, e17, "release Surface error", new java.lang.Object[0]);
            }
        }
    }
}
