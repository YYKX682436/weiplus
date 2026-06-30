package z83;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI f470736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI kidsWatchRegSuccessUI) {
        super(0);
        this.f470736d = kidsWatchRegSuccessUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f470736d.findViewById(com.tencent.mm.R.id.hrf);
        int i17 = com.tencent.mm.R.id.atb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.atb);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.cu_;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.cu_);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.gsf;
                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.gsf);
                if (button != null) {
                    i17 = com.tencent.mm.R.id.gxl;
                    com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
                    if (kidsWatchHeadComponent != null) {
                        i17 = com.tencent.mm.R.id.hdb;
                        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hdb);
                        if (inputPanelLinearLayout != null) {
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                            i17 = com.tencent.mm.R.id.j8d;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.j8d);
                            if (linearLayout2 != null) {
                                return new w83.k(relativeLayout, linearLayout, textView, button, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
