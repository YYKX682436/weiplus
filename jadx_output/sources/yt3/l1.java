package yt3;

/* loaded from: classes10.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.o1 f465523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f465524e;

    public l1(yt3.o1 o1Var, ju3.d0 d0Var) {
        this.f465523d = o1Var;
        this.f465524e = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "onTextureUpdate");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f465523d.f465559d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.setAlpha(1.0f);
        }
        ju3.d0.k(this.f465524e, ju3.c0.D, null, 2, null);
    }
}
