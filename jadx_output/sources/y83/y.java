package y83;

/* loaded from: classes14.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI f460005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
        super(0);
        this.f460005d = kidsWatchLoginFirstChooseSceneUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f460005d.findViewById(com.tencent.mm.R.id.hra);
        int i17 = com.tencent.mm.R.id.a9n;
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) x4.b.a(findViewById, com.tencent.mm.R.id.a9n);
        if (roundCornerImageView != null) {
            i17 = com.tencent.mm.R.id.atb;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.atb);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.f483556b75;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f483556b75);
                if (linearLayout2 != null) {
                    i17 = com.tencent.mm.R.id.f484094d01;
                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f484094d01);
                    if (linearLayout3 != null) {
                        i17 = com.tencent.mm.R.id.gxl;
                        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
                        if (kidsWatchHeadComponent != null) {
                            i17 = com.tencent.mm.R.id.hdb;
                            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hdb);
                            if (inputPanelLinearLayout != null) {
                                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
                                i17 = com.tencent.mm.R.id.io8;
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.io8);
                                if (weImageView != null) {
                                    i17 = com.tencent.mm.R.id.io9;
                                    android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.io9);
                                    if (button != null) {
                                        i17 = com.tencent.mm.R.id.iob;
                                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.iob);
                                        if (weImageView2 != null) {
                                            i17 = com.tencent.mm.R.id.nuc;
                                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.nuc);
                                            if (textView != null) {
                                                i17 = com.tencent.mm.R.id.nue;
                                                android.widget.CheckBox checkBox = (android.widget.CheckBox) x4.b.a(findViewById, com.tencent.mm.R.id.nue);
                                                if (checkBox != null) {
                                                    i17 = com.tencent.mm.R.id.nuf;
                                                    android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.nuf);
                                                    if (relativeLayout2 != null) {
                                                        return new w83.g(relativeLayout, roundCornerImageView, linearLayout, linearLayout2, linearLayout3, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, weImageView, button, weImageView2, textView, checkBox, relativeLayout2);
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
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
