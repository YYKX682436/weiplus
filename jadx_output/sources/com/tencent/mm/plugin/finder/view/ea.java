package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ea implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f131989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f131990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f131991c;

    public ea(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, boolean z17, r45.h32 h32Var) {
        this.f131989a = finderFeedLiveNoticeView;
        this.f131990b = z17;
        this.f131991c = h32Var;
    }

    @Override // i50.n
    public void a(boolean z17) {
        r45.q65 q65Var = (r45.q65) this.f131991c.getCustom(10);
        boolean z18 = false;
        if (q65Var != null && q65Var.getBoolean(0)) {
            z18 = true;
        }
        int i17 = com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView.f131083q;
        com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f131989a;
        if (this.f131990b) {
            db5.t7.m(finderFeedLiveNoticeView.getContext(), finderFeedLiveNoticeView.getContext().getString(com.tencent.mm.R.string.e0o));
            return;
        }
        java.lang.String string = z18 ? finderFeedLiveNoticeView.getContext().getString(com.tencent.mm.R.string.e0k) : finderFeedLiveNoticeView.getContext().getString(com.tencent.mm.R.string.e0j);
        kotlin.jvm.internal.o.d(string);
        db5.t7.m(finderFeedLiveNoticeView.getContext(), string);
    }
}
