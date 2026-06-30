package z83;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
        super(0);
        this.f470747d = kidsWatchRegGetInfoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f470747d.findViewById(com.tencent.mm.R.id.hrb);
        int i17 = com.tencent.mm.R.id.f482684l7;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(findViewById, com.tencent.mm.R.id.f482684l7);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.a9n;
            com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) x4.b.a(findViewById, com.tencent.mm.R.id.a9n);
            if (roundCornerImageView != null) {
                i17 = com.tencent.mm.R.id.atb;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.atb);
                if (linearLayout != null) {
                    i17 = com.tencent.mm.R.id.auy;
                    android.view.View a17 = x4.b.a(findViewById, com.tencent.mm.R.id.auy);
                    if (a17 != null) {
                        i17 = com.tencent.mm.R.id.f483556b75;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f483556b75);
                        if (linearLayout2 != null) {
                            i17 = com.tencent.mm.R.id.f483717bu4;
                            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f483717bu4);
                            if (relativeLayout != null) {
                                i17 = com.tencent.mm.R.id.gxl;
                                com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = (com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent) x4.b.a(findViewById, com.tencent.mm.R.id.gxl);
                                if (kidsWatchHeadComponent != null) {
                                    i17 = com.tencent.mm.R.id.had;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.had);
                                    if (linearLayout3 != null) {
                                        i17 = com.tencent.mm.R.id.hdb;
                                        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hdb);
                                        if (inputPanelLinearLayout != null) {
                                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) findViewById;
                                            i17 = com.tencent.mm.R.id.huk;
                                            android.widget.CheckBox checkBox = (android.widget.CheckBox) x4.b.a(findViewById, com.tencent.mm.R.id.huk);
                                            if (checkBox != null) {
                                                i17 = com.tencent.mm.R.id.hul;
                                                android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.hul);
                                                if (textView != null) {
                                                    i17 = com.tencent.mm.R.id.hum;
                                                    android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hum);
                                                    if (linearLayout4 != null) {
                                                        i17 = com.tencent.mm.R.id.jmp;
                                                        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = (com.tencent.mm.ui.base.MMClearEditText) x4.b.a(findViewById, com.tencent.mm.R.id.jmp);
                                                        if (mMClearEditText != null) {
                                                            i17 = com.tencent.mm.R.id.kb6;
                                                            com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = (com.tencent.mm.ui.base.MMClearEditText) x4.b.a(findViewById, com.tencent.mm.R.id.kb6);
                                                            if (mMClearEditText2 != null) {
                                                                i17 = com.tencent.mm.R.id.lrf;
                                                                android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.lrf);
                                                                if (button != null) {
                                                                    i17 = com.tencent.mm.R.id.f486754mc5;
                                                                    android.widget.ScrollView scrollView = (android.widget.ScrollView) x4.b.a(findViewById, com.tencent.mm.R.id.f486754mc5);
                                                                    if (scrollView != null) {
                                                                        return new w83.h(relativeLayout2, imageView, roundCornerImageView, linearLayout, a17, linearLayout2, relativeLayout, kidsWatchHeadComponent, linearLayout3, inputPanelLinearLayout, relativeLayout2, checkBox, textView, linearLayout4, mMClearEditText, mMClearEditText2, button, scrollView);
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
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
