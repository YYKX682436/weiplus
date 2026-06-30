package yt3;

/* loaded from: classes10.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.o1 f465511d;

    public k1(yt3.o1 o1Var) {
        this.f465511d = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video onPrepared l:");
        yt3.o1 o1Var = this.f465511d;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = o1Var.f465559d;
        sb6.append(videoPlayerTextureView != null ? java.lang.Integer.valueOf(videoPlayerTextureView.getLeft()) : null);
        sb6.append(" t:");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView2 = o1Var.f465559d;
        sb6.append(videoPlayerTextureView2 != null ? java.lang.Integer.valueOf(videoPlayerTextureView2.getTop()) : null);
        sb6.append(" r:");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView3 = o1Var.f465559d;
        sb6.append(videoPlayerTextureView3 != null ? java.lang.Integer.valueOf(videoPlayerTextureView3.getRight()) : null);
        sb6.append(" b:");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView4 = o1Var.f465559d;
        sb6.append(videoPlayerTextureView4 != null ? java.lang.Integer.valueOf(videoPlayerTextureView4.getBottom()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", sb6.toString());
        lt3.n nVar = lt3.n.f321260a;
        android.graphics.Rect rect = lt3.n.f321263d;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView5 = o1Var.f465559d;
        kotlin.jvm.internal.o.d(videoPlayerTextureView5);
        int left = videoPlayerTextureView5.getLeft();
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView6 = o1Var.f465559d;
        kotlin.jvm.internal.o.d(videoPlayerTextureView6);
        int top = videoPlayerTextureView6.getTop();
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView7 = o1Var.f465559d;
        kotlin.jvm.internal.o.d(videoPlayerTextureView7);
        int right = videoPlayerTextureView7.getRight();
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView8 = o1Var.f465559d;
        kotlin.jvm.internal.o.d(videoPlayerTextureView8);
        rect.set(new android.graphics.Rect(left, top, right, videoPlayerTextureView8.getBottom()));
    }
}
