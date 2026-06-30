package y83;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI f459990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI) {
        super(0);
        this.f459990d = kidsWatchLoginCardChooseUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f459990d.findViewById(com.tencent.mm.R.id.hr7);
        int i17 = com.tencent.mm.R.id.atb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.atb);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.atc;
            android.view.View a17 = x4.b.a(findViewById, com.tencent.mm.R.id.atc);
            if (a17 != null) {
                i17 = com.tencent.mm.R.id.f483556b75;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f483556b75);
                if (linearLayout2 != null) {
                    i17 = com.tencent.mm.R.id.gxl;
                    com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
                    if (kidsWatchHeadComponent != null) {
                        i17 = com.tencent.mm.R.id.hdb;
                        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hdb);
                        if (inputPanelLinearLayout != null) {
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                            i17 = com.tencent.mm.R.id.f486754mc5;
                            android.widget.ScrollView scrollView = (android.widget.ScrollView) x4.b.a(findViewById, com.tencent.mm.R.id.f486754mc5);
                            if (scrollView != null) {
                                i17 = com.tencent.mm.R.id.nsx;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.nsx);
                                if (textView != null) {
                                    return new w83.c(relativeLayout, linearLayout, a17, linearLayout2, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, scrollView, textView);
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
