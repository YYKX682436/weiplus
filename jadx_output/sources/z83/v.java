package z83;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI f470756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
        super(0);
        this.f470756d = kidsWatchRegMobileVerifyUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f470756d.findViewById(com.tencent.mm.R.id.hrd);
        int i17 = com.tencent.mm.R.id.atb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.atb);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.auy;
            android.view.View a17 = x4.b.a(findViewById, com.tencent.mm.R.id.auy);
            if (a17 != null) {
                i17 = com.tencent.mm.R.id.g66;
                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.g66);
                if (button != null) {
                    i17 = com.tencent.mm.R.id.gxl;
                    com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
                    if (kidsWatchHeadComponent != null) {
                        i17 = com.tencent.mm.R.id.had;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.had);
                        if (linearLayout2 != null) {
                            i17 = com.tencent.mm.R.id.hdb;
                            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hdb);
                            if (inputPanelLinearLayout != null) {
                                i17 = com.tencent.mm.R.id.hdc;
                                com.tencent.mm.ui.base.MMClearEditText mMClearEditText = (com.tencent.mm.ui.base.MMClearEditText) x4.b.a(findViewById, com.tencent.mm.R.id.hdc);
                                if (mMClearEditText != null) {
                                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                                    i17 = com.tencent.mm.R.id.j8d;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.j8d);
                                    if (linearLayout3 != null) {
                                        i17 = com.tencent.mm.R.id.jmq;
                                        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.jmq);
                                        if (textView != null) {
                                            i17 = com.tencent.mm.R.id.f486646m01;
                                            android.widget.Button button2 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.f486646m01);
                                            if (button2 != null) {
                                                return new w83.i(relativeLayout, linearLayout, a17, button, kidsWatchHeadComponent, linearLayout2, inputPanelLinearLayout, mMClearEditText, relativeLayout, linearLayout3, textView, button2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
