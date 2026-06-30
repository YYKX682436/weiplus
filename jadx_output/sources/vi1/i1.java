package vi1;

/* loaded from: classes7.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j1 f437330d;

    public i1(vi1.j1 j1Var) {
        this.f437330d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi1.j1 j1Var = this.f437330d;
        vi1.d0 d0Var = j1Var.f437345b;
        if (d0Var != null) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = j1Var.f437349f;
            java.lang.Boolean valueOf = mMSwitchBtn != null ? java.lang.Boolean.valueOf(mMSwitchBtn.f211363x) : null;
            kotlin.jvm.internal.o.d(valueOf);
            boolean booleanValue = valueOf.booleanValue();
            com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = j1Var.f437347d;
            java.lang.String valueOf2 = java.lang.String.valueOf(mMFormVerifyCodeInputView != null ? mMFormVerifyCodeInputView.getText() : null);
            com.tencent.mm.ui.base.MMFormInputView mMFormInputView = j1Var.f437348e;
            java.lang.String valueOf3 = java.lang.String.valueOf(mMFormInputView != null ? mMFormInputView.getText() : null);
            vi1.b1 b1Var = (vi1.b1) d0Var;
            vi1.l2 l2Var = vi1.l2.f437401a;
            java.lang.String str = b1Var.f437274b;
            vi1.j2 a17 = l2Var.a(str);
            if (a17 != null) {
                vi1.j2 a18 = l2Var.a(str);
                java.lang.Long valueOf4 = a18 != null ? java.lang.Long.valueOf(a18.f437366o) : null;
                kotlin.jvm.internal.o.d(valueOf4);
                a17.f437366o = valueOf4.longValue() + 1;
            }
            if (booleanValue) {
                vi1.j2 a19 = l2Var.a(str);
                if (a19 != null) {
                    vi1.j2 a27 = l2Var.a(str);
                    java.lang.Long valueOf5 = a27 != null ? java.lang.Long.valueOf(a27.f437369r) : null;
                    kotlin.jvm.internal.o.d(valueOf5);
                    a19.f437369r = valueOf5.longValue() + 1;
                }
            } else {
                vi1.j2 a28 = l2Var.a(str);
                if (a28 != null) {
                    vi1.j2 a29 = l2Var.a(str);
                    java.lang.Long valueOf6 = a29 != null ? java.lang.Long.valueOf(a29.f437370s) : null;
                    kotlin.jvm.internal.o.d(valueOf6);
                    a28.f437370s = valueOf6.longValue() + 1;
                }
            }
            com.tencent.mars.xlog.Log.i("PhoneNumberAddLogic", "verifyCode mAppId:" + str + ", mobile:" + valueOf2 + " code:" + valueOf3);
            android.content.Context context = b1Var.f437273a;
            vi1.a1 a1Var = new vi1.a1(b1Var, booleanValue, valueOf2, com.tencent.mm.ui.widget.dialog.g4.c(context, context.getString(com.tencent.mm.R.string.a3w), true, null));
            r45.w20 w20Var = new r45.w20();
            w20Var.f388798d = str;
            w20Var.f388799e = valueOf2;
            w20Var.f388800f = valueOf3;
            ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode", str, w20Var, r45.x20.class).n(new vi1.g(a1Var))).s(new vi1.h(a1Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberAddView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
