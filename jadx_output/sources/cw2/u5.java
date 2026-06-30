package cw2;

/* loaded from: classes14.dex */
public final class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f224042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f224043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f224044f;

    public u5(cw2.z5 z5Var, int i17, int i18) {
        this.f224042d = z5Var;
        this.f224043e = i17;
        this.f224044f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.SurfaceTexture surfaceTexture;
        cw2.b6 b6Var = this.f224042d.f224135c;
        if (b6Var == null || (surfaceTexture = b6Var.f223596b) == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(this.f224043e, this.f224044f);
    }
}
