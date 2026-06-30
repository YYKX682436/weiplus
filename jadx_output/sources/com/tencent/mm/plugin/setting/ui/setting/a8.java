package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class a8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f160806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        super(0);
        this.f160806d = settingsAuthUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f160806d.findViewById(com.tencent.mm.R.id.m7j);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        int i17 = com.tencent.mm.R.id.mow;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.mow);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.mox;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.mox);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.mp8;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.mp8);
                if (progressBar != null) {
                    i17 = com.tencent.mm.R.id.mp9;
                    com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = (com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.mp9);
                    if (loadMoreRecyclerView != null) {
                        i17 = com.tencent.mm.R.id.mp_;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.mp_);
                        if (weImageView != null) {
                            i17 = com.tencent.mm.R.id.mpa;
                            android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.mpa);
                            if (textView2 != null) {
                                return new g14.a(relativeLayout, relativeLayout, linearLayout, textView, progressBar, loadMoreRecyclerView, weImageView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
