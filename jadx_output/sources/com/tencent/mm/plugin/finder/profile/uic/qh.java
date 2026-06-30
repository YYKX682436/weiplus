package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class qh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f124161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        super(0);
        this.f124161d = finderProfileTingAudioUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f124161d.findViewById(com.tencent.mm.R.id.m7g);
        int i17 = com.tencent.mm.R.id.dft;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.dft);
        if (textView != null) {
            i17 = com.tencent.mm.R.id.f484229dg3;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f484229dg3);
            if (frameLayout != null) {
                i17 = com.tencent.mm.R.id.lbi;
                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.tencent.mm.R.id.lbi);
                if (progressBar != null) {
                    i17 = com.tencent.mm.R.id.lqa;
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.lqa);
                    if (wxRecyclerView != null) {
                        i17 = com.tencent.mm.R.id.m2g;
                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.m2g);
                        if (textView2 != null) {
                            i17 = com.tencent.mm.R.id.m6e;
                            com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                            if (finderRefreshLayout != null) {
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
                                return new vb2.m0(constraintLayout, textView, frameLayout, progressBar, wxRecyclerView, textView2, finderRefreshLayout, constraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
