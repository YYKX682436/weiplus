package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView f120456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f120457e;

    public yp(com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView finderLiveNoticeBannerView, r45.h32 h32Var) {
        this.f120456d = finderLiveNoticeBannerView;
        this.f120457e = h32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveNoticeBannerView finderLiveNoticeBannerView = this.f120456d;
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView = finderLiveNoticeBannerView.f117669e;
        if (finderLiveMarqueeTextView == null) {
            kotlin.jvm.internal.o.o("noticeItemTxt");
            throw null;
        }
        r45.h32 h32Var = this.f120457e;
        java.lang.String string = h32Var != null ? (finderLiveNoticeBannerView.f117671g != finderLiveNoticeBannerView.f117670f || h32Var.getInteger(5) <= 0) ? h32Var.getInteger(20) == 1 ? finderLiveNoticeBannerView.getContext().getString(com.tencent.mm.R.string.nta, zl2.q4.f473933a.v(h32Var.getInteger(0) * 1000)) : finderLiveNoticeBannerView.getContext().getString(com.tencent.mm.R.string.nta, zl2.q4.r(zl2.q4.f473933a, h32Var.getInteger(0) * 1000, null, false, false, 14, null)) : finderLiveNoticeBannerView.getContext().getString(com.tencent.mm.R.string.m8v, java.lang.Integer.valueOf(h32Var.getInteger(5))) : null;
        if (string == null) {
            string = zl2.r4.f473950a.w1() ? finderLiveNoticeBannerView.getContext().getString(com.tencent.mm.R.string.f491333cs4) : "";
            kotlin.jvm.internal.o.d(string);
        }
        finderLiveMarqueeTextView.d(string, false);
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView2 = finderLiveNoticeBannerView.f117669e;
        if (finderLiveMarqueeTextView2 == null) {
            kotlin.jvm.internal.o.o("noticeItemTxt");
            throw null;
        }
        finderLiveMarqueeTextView2.f116025f = 0;
        finderLiveMarqueeTextView2.f116026g = true;
        finderLiveMarqueeTextView2.f116027h = true;
        if (finderLiveMarqueeTextView2.f116032p > 0) {
            finderLiveMarqueeTextView2.c();
        } else {
            finderLiveMarqueeTextView2.b();
        }
    }
}
