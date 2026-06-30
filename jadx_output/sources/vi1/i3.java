package vi1;

/* loaded from: classes7.dex */
public final class i3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437338d;

    public i3(vi1.k3 k3Var) {
        this.f437338d = k3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "cancel to verify sms");
        dialogInterface.dismiss();
        vi1.k3 k3Var = this.f437338d;
        k3Var.g();
        vi1.k3.a(k3Var, "user cancel");
        android.view.View view = k3Var.f437389f;
        if (view != null) {
            view.post(new vi1.b3(k3Var));
        }
    }
}
