package y83;

/* loaded from: classes14.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst f459996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst) {
        super(0);
        this.f459996d = kidsWatchLoginFirst;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f459996d.findViewById(com.tencent.mm.R.id.hr9);
        int i17 = com.tencent.mm.R.id.f483556b75;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f483556b75);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.gxl;
            com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
            if (kidsWatchHeadComponent != null) {
                i17 = com.tencent.mm.R.id.hdb;
                com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hdb);
                if (inputPanelLinearLayout != null) {
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                    i17 = com.tencent.mm.R.id.io9;
                    android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.io9);
                    if (button != null) {
                        i17 = com.tencent.mm.R.id.lre;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.lre);
                        if (linearLayout2 != null) {
                            i17 = com.tencent.mm.R.id.lrg;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.lrg);
                            if (textView != null) {
                                i17 = com.tencent.mm.R.id.f487364of2;
                                android.view.View a17 = x4.b.a(findViewById, com.tencent.mm.R.id.f487364of2);
                                if (a17 != null) {
                                    return new w83.e(relativeLayout, linearLayout, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, button, linearLayout2, textView, a17);
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
