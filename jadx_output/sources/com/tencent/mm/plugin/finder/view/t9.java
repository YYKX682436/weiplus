package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class t9 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f133094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133095b;

    public t9(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, java.lang.String str) {
        this.f133094a = finderFeedLiveNoticeView;
        this.f133095b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.m70 m70Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f133094a;
        com.tencent.mars.xlog.Log.i(finderFeedLiveNoticeView.f131086f, "CgiFinderLiveReceiveConcertTicket errCode: " + fVar.f70616b + ", errMsg: " + fVar.f70617c + ", errType: " + fVar.f70615a);
        if (fVar.f70616b == 0 && fVar.f70615a == 0 && (m70Var = (r45.m70) ((r45.o62) fVar.f70618d).getCustom(1)) != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.view.s9(finderFeedLiveNoticeView, m70Var, this.f133095b));
        }
        return jz5.f0.f302826a;
    }
}
