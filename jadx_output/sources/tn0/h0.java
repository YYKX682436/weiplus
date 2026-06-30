package tn0;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f420677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420678f;

    public h0(tn0.w0 w0Var, android.graphics.SurfaceTexture surfaceTexture, java.lang.String str) {
        this.f420676d = w0Var;
        this.f420677e = surfaceTexture;
        this.f420678f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn0.w0 w0Var = this.f420676d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = w0Var.X;
        if (iTPPlayer != null) {
            iTPPlayer.setSurface(new android.view.Surface(this.f420677e));
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = w0Var.X;
        if (iTPPlayer2 != null) {
            iTPPlayer2.prepareAsync();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer3 = w0Var.X;
        if (iTPPlayer3 != null) {
            iTPPlayer3.setOnPreparedListener(new tn0.g0(w0Var, this.f420678f));
        }
    }
}
