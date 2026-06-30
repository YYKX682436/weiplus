package fl1;

/* loaded from: classes4.dex */
public class u0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263874e;

    public u0(fl1.c1 c1Var, java.lang.Runnable runnable) {
        this.f263874e = c1Var;
        this.f263873d = runnable;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "user dismiss evaluate dialog");
        fl1.c1 c1Var = this.f263874e;
        if (!c1Var.f263730b) {
            c1Var.getClass();
            r45.et6 et6Var = new r45.et6();
            java.lang.String str = c1Var.f263729a;
            et6Var.f373724d = str;
            et6Var.f373725e = 4;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "reportSkipEvaluate, userName:%s", str);
            c1Var.j(et6Var);
        }
        c1Var.getClass();
        java.lang.Runnable runnable = this.f263873d;
        if (runnable != null) {
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 100L);
        }
    }
}
