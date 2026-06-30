package gm0;

/* loaded from: classes12.dex */
public class f0 implements l75.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm0.b0 f273184d;

    public f0(gm0.b0 b0Var) {
        this.f273184d = b0Var;
    }

    @Override // l75.i0
    public void d() {
        this.f273184d.f273149b.d();
    }

    @Override // l75.i0
    public void p() {
        gm0.b0 b0Var = this.f273184d;
        if (b0Var.f273154g != null) {
            com.tencent.mars.xlog.Log.i("MMKernel.CoreStorage", "summer preCloseCallback userConfigStg: " + b0Var.f273154g);
            b0Var.f273154g.i(true);
            com.tencent.mm.sdk.platformtools.n3 n3Var = b0Var.f273154g.f195155k;
            if (n3Var != null) {
                n3Var.quit();
            }
        }
        b0Var.f273149b.p();
    }

    @Override // l75.i0
    public void u() {
        this.f273184d.f273149b.u();
    }
}
