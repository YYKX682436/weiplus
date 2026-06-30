package ns4;

/* loaded from: classes8.dex */
public final class w2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339672d;

    public w2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339672d = weCoinRechargeView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17 = ((ms4.k0) obj).f331057b;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339672d;
        if (z17) {
            ms4.o0 o0Var = weCoinRechargeView.f179185d;
            if (o0Var == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            if (o0Var.f331095q) {
                return;
            }
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.T6(weCoinRechargeView);
            return;
        }
        ms4.o0 o0Var2 = weCoinRechargeView.f179185d;
        if (o0Var2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        if (o0Var2.f331095q) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WECOIN_PAGE_HAS_SHOW_TUTORIAL_BOOLEAN_SYNC;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.Object m17 = c17.m(u3Var, bool);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            return;
        }
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.U6(weCoinRechargeView);
        if (bool != null) {
            android.widget.TextView textView = weCoinRechargeView.f179197s;
            if (textView == null) {
                kotlin.jvm.internal.o.o("mSwitchDeviceTipsView");
                throw null;
            }
            textView.setText(weCoinRechargeView.getString(com.tencent.mm.R.string.l_2));
        }
        if (weCoinRechargeView.f179185d != null) {
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }
}
