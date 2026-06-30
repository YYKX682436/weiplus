package vi1;

/* loaded from: classes7.dex */
public final class q3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f437435d;

    public q3(vi1.z3 z3Var) {
        this.f437435d = z3Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View arg0) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(arg0);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$resetSendCodeTextToResend$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(arg0, "arg0");
        vi1.z3 z3Var = this.f437435d;
        if (z3Var.f437521h.f87405m) {
            z3Var.w();
        } else {
            java.lang.String string = z3Var.f437517d.getString(com.tencent.mm.R.string.f490147m8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            z3Var.u(string);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberVerifyCodeDialogNew$resetSendCodeTextToResend$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
