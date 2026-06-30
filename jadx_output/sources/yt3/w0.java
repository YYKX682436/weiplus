package yt3;

/* loaded from: classes10.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.y0 f465704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f465705e;

    public w0(yt3.y0 y0Var, ju3.d0 d0Var) {
        this.f465704d = y0Var;
        this.f465705e = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_VIDEO_NEED_CROP", false);
        this.f465704d.f465722d.setAlpha(0.99f);
        ju3.c0 c0Var = ju3.c0.D;
        ju3.d0 d0Var = this.f465705e;
        ju3.d0.k(d0Var, c0Var, null, 2, null);
        d0Var.w(ju3.c0.C1, bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoToVideoPlugin", "setup fakeVideoPlayView onPrepared");
    }
}
