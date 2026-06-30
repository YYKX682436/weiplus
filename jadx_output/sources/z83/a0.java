package z83;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI f470730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI kidsWatchRegRebindUI) {
        super(0);
        this.f470730d = kidsWatchRegRebindUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f470730d.findViewById(com.tencent.mm.R.id.hre);
        int i17 = com.tencent.mm.R.id.atb;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.atb);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.f483556b75;
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f483556b75);
            if (linearLayout2 != null) {
                i17 = com.tencent.mm.R.id.bei;
                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.bei);
                if (button != null) {
                    i17 = com.tencent.mm.R.id.gxl;
                    com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
                    if (kidsWatchHeadComponent != null) {
                        i17 = com.tencent.mm.R.id.hdb;
                        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hdb);
                        if (inputPanelLinearLayout != null) {
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                            i17 = com.tencent.mm.R.id.f485475ht2;
                            com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f485475ht2);
                            if (roundCornerImageView != null) {
                                i17 = com.tencent.mm.R.id.f485476ht3;
                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f485476ht3);
                                if (textView != null) {
                                    i17 = com.tencent.mm.R.id.lku;
                                    android.widget.Button button2 = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.lku);
                                    if (button2 != null) {
                                        return new w83.j(relativeLayout, linearLayout, linearLayout2, button, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, roundCornerImageView, textView, button2);
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
