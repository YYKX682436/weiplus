package fl1;

/* loaded from: classes7.dex */
public class h0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl1.i0 f263778a;

    public h0(fl1.i0 i0Var) {
        this.f263778a = i0Var;
    }

    @Override // q80.f0
    public void fail() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openGameLiteApp fail, ");
        fl1.i0 i0Var = this.f263778a;
        sb6.append(i0Var.f263789e.f372458i);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", sb6.toString());
        i0Var.f263791g.a();
        i0Var.f263790f.run();
    }

    @Override // q80.f0
    public void success() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openGameLiteApp success, ");
        fl1.i0 i0Var = this.f263778a;
        sb6.append(i0Var.f263789e.f372458i);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", sb6.toString());
        i0Var.f263791g.a();
        i0Var.f263790f.run();
    }
}
