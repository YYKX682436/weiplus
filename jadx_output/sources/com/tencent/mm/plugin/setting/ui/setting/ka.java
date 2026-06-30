package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class ka extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI f161233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI) {
        super(0);
        this.f161233d = settingsDelAuthUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f161233d.findViewById(com.tencent.mm.R.id.mpc);
        int i17 = com.tencent.mm.R.id.moq;
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) x4.b.a(findViewById, com.tencent.mm.R.id.moq);
        if (mMRoundCornerImageView != null) {
            i17 = com.tencent.mm.R.id.mor;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.mor);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.mos;
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) x4.b.a(findViewById, com.tencent.mm.R.id.mos);
                if (mMNeat7extView != null) {
                    i17 = com.tencent.mm.R.id.mot;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.mot);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.mou;
                        android.widget.Button button = (android.widget.Button) x4.b.a(findViewById, com.tencent.mm.R.id.mou);
                        if (button != null) {
                            i17 = com.tencent.mm.R.id.mov;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.mov);
                            if (textView2 != null) {
                                i17 = com.tencent.mm.R.id.f486864mp0;
                                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.f486864mp0);
                                if (recyclerView != null) {
                                    android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById;
                                    return new g14.b(scrollView, mMRoundCornerImageView, linearLayout, mMNeat7extView, textView, button, textView2, recyclerView, scrollView);
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
