package vi1;

/* loaded from: classes7.dex */
public final class h3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437328d;

    public h3(vi1.k3 k3Var) {
        this.f437328d = k3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.text.Editable text;
        android.text.Editable text2;
        android.text.Editable text3;
        java.lang.Object[] objArr = new java.lang.Object[1];
        vi1.k3 k3Var = this.f437328d;
        android.widget.EditText editText = k3Var.f437390g;
        java.lang.Integer num = null;
        boolean z17 = false;
        objArr[0] = editText != null ? editText.getText() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "to verify sms %s", objArr);
        android.widget.EditText editText2 = k3Var.f437390g;
        if (editText2 != null && (text3 = editText2.getText()) != null && text3.length() == 6) {
            z17 = true;
        }
        android.content.Context context = k3Var.f437384a;
        if (!z17) {
            java.lang.Integer valueOf = (editText2 == null || (text2 = editText2.getText()) == null) ? null : java.lang.Integer.valueOf(text2.length());
            kotlin.jvm.internal.o.d(valueOf);
            if (valueOf.intValue() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "code is empty");
                com.tencent.mm.plugin.appbrand.utils.m1.a(context, context.getString(com.tencent.mm.R.string.f490149ma), context.getString(com.tencent.mm.R.string.f490143m4), vi1.f3.f437320d);
                return;
            }
            if (editText2 != null && (text = editText2.getText()) != null) {
                num = java.lang.Integer.valueOf(text.length());
            }
            kotlin.jvm.internal.o.d(num);
            if (num.intValue() < 6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PhoneNumberVerifyCodeDialog", "code is length is < 6");
                com.tencent.mm.plugin.appbrand.utils.m1.a(context, context.getString(com.tencent.mm.R.string.f490150mb), context.getString(com.tencent.mm.R.string.f490143m4), vi1.g3.f437324d);
                return;
            }
            return;
        }
        dialogInterface.dismiss();
        k3Var.g();
        android.view.View view = k3Var.f437389f;
        if (view != null) {
            view.post(new vi1.b3(k3Var));
        }
        java.lang.String valueOf2 = java.lang.String.valueOf(editText2 != null ? editText2.getText() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "doVerifyCode");
        vi1.j2 j2Var = k3Var.f437386c;
        if (j2Var != null) {
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j2Var.f437375x);
            kotlin.jvm.internal.o.d(valueOf3);
            j2Var.f437375x = valueOf3.longValue() + 1;
        }
        com.tencent.mm.ui.widget.dialog.g4 c17 = com.tencent.mm.ui.widget.dialog.g4.c(context, context.getString(com.tencent.mm.R.string.a3w), true, null);
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = k3Var.f437387d;
        boolean z18 = phoneItem.f87406n;
        java.lang.String mobile = phoneItem.f87399d;
        java.lang.String appId = k3Var.f437385b;
        if (z18) {
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(mobile, "mobile");
            vi1.w2 w2Var = new vi1.w2(c17, k3Var);
            r45.w20 w20Var = new r45.w20();
            w20Var.f388798d = appId;
            w20Var.f388799e = mobile;
            w20Var.f388800f = valueOf2;
            ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/checkverifycode", appId, w20Var, r45.x20.class).n(new vi1.i(w2Var))).s(new vi1.j(w2Var));
            return;
        }
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mobile, "mobile");
        vi1.z2 z2Var = new vi1.z2(c17, k3Var);
        r45.w20 w20Var2 = new r45.w20();
        w20Var2.f388798d = appId;
        w20Var2.f388799e = mobile;
        w20Var2.f388800f = valueOf2;
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", appId, w20Var2, r45.x20.class).n(new vi1.g(z2Var))).s(new vi1.h(z2Var));
    }
}
