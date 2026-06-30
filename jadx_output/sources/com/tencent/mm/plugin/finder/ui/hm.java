package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class hm implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f129336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton f129337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f129338c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129340e;

    public hm(in5.s0 s0Var, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, java.lang.String str2) {
        this.f129336a = s0Var;
        this.f129337b = finderThanksButton;
        this.f129338c = baseFinderFeed;
        this.f129339d = str;
        this.f129340e = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        cw2.da videoView;
        in5.s0 s0Var = this.f129336a;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        int currentPlayMs = (finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null) ? 0 : (int) ((((float) videoView.getCurrentPlayMs()) / ((float) videoView.getVideoDurationMs())) * 100);
        int i17 = this.f129337b.viewModel.f301853f;
        if ((str != null && str.equals("view_clk")) != false) {
            i17 = ~i17;
        }
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.Map c17 = d2Var.c(context);
        c17.putAll(kz5.c1.k(new jz5.l("feed_id", pm0.v.u(this.f129338c.getItemId())), new jz5.l("session_buffer", this.f129339d), new jz5.l("playpercent", java.lang.Integer.valueOf(currentPlayMs)), new jz5.l("thank_status", java.lang.Integer.valueOf(i17)), new jz5.l("share_username", this.f129340e)));
        return c17;
    }
}
