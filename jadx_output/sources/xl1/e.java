package xl1;

/* loaded from: classes7.dex */
public class e implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew f455104d;

    public e(com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew) {
        this.f455104d = editVerifyCodeViewNew;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.widget.TextView[] textViewArr;
        xl1.i iVar;
        if (editable == null) {
            return;
        }
        editable.toString();
        java.lang.String obj = editable.toString();
        int i17 = com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew.f92109g;
        com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew = this.f455104d;
        editVerifyCodeViewNew.getClass();
        int length = obj.length();
        int i18 = 0;
        while (true) {
            textViewArr = editVerifyCodeViewNew.f92110d;
            if (i18 >= length) {
                break;
            }
            char charAt = obj.charAt(i18);
            textViewArr[i18].setText(java.lang.String.valueOf(charAt));
            textViewArr[i18].setSelected(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.EditVerifyCodeViewNew", "i:%d text:%s", java.lang.Integer.valueOf(i18), java.lang.String.valueOf(charAt));
            i18++;
        }
        boolean z17 = true;
        int i19 = length;
        while (true) {
            if (i19 >= 6) {
                break;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EditVerifyCodeViewNew", "i:%d text:%s", java.lang.Integer.valueOf(i19), "");
            textViewArr[i19].setText("");
            if (z17) {
                textViewArr[i19].setSelected(true);
                z17 = false;
            } else {
                textViewArr[i19].setSelected(false);
            }
            i19++;
        }
        if (length != 6 || (iVar = editVerifyCodeViewNew.f92112f) == null) {
            return;
        }
        vi1.z3 z3Var = ((vi1.o3) iVar).f437422a;
        com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew2 = z3Var.f437528r;
        java.lang.String text = editVerifyCodeViewNew2 != null ? editVerifyCodeViewNew2.getText() : null;
        java.lang.String str = text != null ? text : "";
        com.tencent.mars.xlog.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "doVerifyCode: code:".concat(str));
        vi1.j2 j2Var = z3Var.f437520g;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437375x);
            kotlin.jvm.internal.o.d(valueOf);
            j2Var.f437375x = valueOf.longValue() + 1;
        }
        android.content.Context context = z3Var.f437517d;
        com.tencent.mm.ui.widget.dialog.g4 c17 = com.tencent.mm.ui.widget.dialog.g4.c(context, context.getString(com.tencent.mm.R.string.a3w), true, null);
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = z3Var.f437521h;
        boolean z18 = phoneItem.f87406n;
        java.lang.String mobile = phoneItem.f87399d;
        java.lang.String appId = z3Var.f437519f;
        if (z18) {
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(mobile, "mobile");
            vi1.w3 w3Var = new vi1.w3(z3Var, c17);
            r45.w20 w20Var = new r45.w20();
            w20Var.f388798d = appId;
            w20Var.f388799e = mobile;
            w20Var.f388800f = str;
            ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/checkverifycode", appId, w20Var, r45.x20.class).n(new vi1.i(w3Var))).s(new vi1.j(w3Var));
            return;
        }
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mobile, "mobile");
        vi1.y3 y3Var = new vi1.y3(c17, z3Var);
        r45.w20 w20Var2 = new r45.w20();
        w20Var2.f388798d = appId;
        w20Var2.f388799e = mobile;
        w20Var2.f388800f = str;
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", appId, w20Var2, r45.x20.class).n(new vi1.g(y3Var))).s(new vi1.h(y3Var));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
