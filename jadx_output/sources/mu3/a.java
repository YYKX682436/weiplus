package mu3;

/* loaded from: classes10.dex */
public final class a extends ms0.c {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f331395t;

    public a() {
        super(0, 0, 0, 0, 1, 1, 15, null);
        this.f331395t = "MicroMsg.RecorderTextureRenderer";
    }

    @Override // ms0.c
    public os0.a f() {
        return new os0.e(this.f330945a, this.f330946b, this.f330947c, this.f330948d, this.f330949e, this.f330950f);
    }

    @Override // ms0.c
    public void m(boolean z17) {
    }

    @Override // ms0.c
    public void r(int i17) {
    }

    @Override // ms0.c
    public void t(int i17, int i18) {
        super.t(i17, i18);
    }

    @Override // ms0.c
    public void u(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f331395t, "updateTextureSize " + i17 + ", " + i18 + "; " + this.f330945a + ", " + this.f330946b);
    }

    public final void v(int i17, int i18) {
        super.u(i17, i18);
    }
}
