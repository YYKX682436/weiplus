package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class d8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f191578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoTextureView f191579e;

    public d8(com.tencent.mm.pluginsdk.ui.tools.VideoTextureView videoTextureView, android.view.Surface surface) {
        this.f191579e = videoTextureView;
        this.f191578d = surface;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.Surface surface = this.f191578d;
        if (surface != null) {
            try {
                if (surface.isValid()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d release surface [%d]", java.lang.Integer.valueOf(this.f191579e.hashCode()), java.lang.Integer.valueOf(surface.hashCode()));
                    surface.release();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTextureView", e17, "release Surface error", new java.lang.Object[0]);
            }
        }
    }
}
