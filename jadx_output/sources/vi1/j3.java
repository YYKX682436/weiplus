package vi1;

/* loaded from: classes7.dex */
public final class j3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437378d;

    public j3(vi1.k3 k3Var) {
        this.f437378d = k3Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View arg0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(arg0);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$updateSendText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(arg0, "arg0");
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "click the resend spanBuilder, do resend sms");
        vi1.k3 k3Var = this.f437378d;
        if (k3Var.f437387d.f87405m) {
            k3Var.e(false);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "allow_send_sms is false, show send_verify_code_frequent error");
            java.lang.String string = k3Var.f437384a.getString(com.tencent.mm.R.string.f490147m8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            k3Var.f(string);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialog$updateSendText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
