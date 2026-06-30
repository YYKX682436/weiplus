package vi1;

/* loaded from: classes7.dex */
public final class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f437424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437425e;

    public p0(vi1.b1 b1Var, java.lang.String str) {
        this.f437424d = b1Var;
        this.f437425e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.appbrand.phonenumber.widget.MMFormVerifyCodeInputView mMFormVerifyCodeInputView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendSms appId:");
        vi1.b1 b1Var = this.f437424d;
        java.lang.String str = b1Var.f437274b;
        sb6.append(str);
        sb6.append(", mobile:");
        java.lang.String mobile = this.f437425e;
        sb6.append(mobile);
        com.tencent.mars.xlog.Log.i("PhoneNumberAddLogic", sb6.toString());
        vi1.e0 e0Var = b1Var.f437276d;
        if (e0Var != null && (mMFormVerifyCodeInputView = ((vi1.j1) e0Var).f437347d) != null) {
            mMFormVerifyCodeInputView.f87412g.setVisibility(8);
            mMFormVerifyCodeInputView.f87411f.setVisibility(0);
            mMFormVerifyCodeInputView.f87411f.setText(mMFormVerifyCodeInputView.getContext().getString(com.tencent.mm.R.string.f490647a30, java.lang.Integer.valueOf(mMFormVerifyCodeInputView.f87416n)));
            com.tencent.mm.sdk.platformtools.b4 b4Var = mMFormVerifyCodeInputView.f87418p;
            if (b4Var != null) {
                b4Var.d();
                mMFormVerifyCodeInputView.f87418p.c(1000L, 1000L);
            } else if (mMFormVerifyCodeInputView.getContext() != null) {
                com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(mMFormVerifyCodeInputView.getContext().getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new wi1.c(mMFormVerifyCodeInputView), true);
                mMFormVerifyCodeInputView.f87418p = b4Var2;
                b4Var2.c(1000L, 1000L);
            } else {
                com.tencent.mm.sdk.platformtools.b4 b4Var3 = mMFormVerifyCodeInputView.f87418p;
                if (b4Var3 != null) {
                    b4Var3.d();
                }
            }
        }
        android.content.Context context = b1Var.f437273a;
        com.tencent.mm.ui.widget.dialog.g4 c17 = com.tencent.mm.ui.widget.dialog.g4.c(context, context.getString(com.tencent.mm.R.string.a3u), true, null);
        vi1.l2 l2Var = vi1.l2.f437401a;
        vi1.j2 a17 = l2Var.a(str);
        if (a17 != null) {
            vi1.j2 a18 = l2Var.a(str);
            java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.f437363l) : null;
            kotlin.jvm.internal.o.d(valueOf);
            a17.f437363l = valueOf.longValue() + 1;
        }
        kotlin.jvm.internal.o.g(mobile, "mobile");
        vi1.u0 u0Var = new vi1.u0(b1Var, c17);
        r45.xz5 xz5Var = new r45.xz5();
        xz5Var.f390631d = str;
        xz5Var.f390632e = mobile;
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", str, xz5Var, r45.yz5.class).n(new vi1.n(u0Var))).s(new vi1.o(u0Var));
    }
}
