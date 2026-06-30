package vi1;

/* loaded from: classes7.dex */
public final class e3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437299d;

    public e3(vi1.k3 k3Var) {
        this.f437299d = k3Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "cancel to verify sms");
        vi1.k3 k3Var = this.f437299d;
        k3Var.g();
        android.view.View view = k3Var.f437389f;
        if (view != null) {
            view.post(new vi1.b3(k3Var));
        }
    }
}
