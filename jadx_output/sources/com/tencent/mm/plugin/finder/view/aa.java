package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class aa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f131625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f131626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f131627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f131628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f131629h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(yz5.a aVar, tx2.i0 i0Var, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f131626e = aVar;
        this.f131627f = i0Var;
        this.f131628g = noticeStatusView;
        this.f131629h = finderFeedLiveNoticeView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.aa(this.f131626e, this.f131627f, this.f131628g, this.f131629h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.aa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f131625d;
        tx2.i0 i0Var = this.f131627f;
        yz5.a aVar2 = this.f131626e;
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView = this.f131628g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.q65 q65Var = (r45.q65) ((r45.h32) aVar2.invoke()).getCustom(10);
            boolean z17 = false;
            if (q65Var != null && q65Var.getBoolean(0)) {
                z17 = true;
            }
            if (z17) {
                i0Var.a();
                this.f131625d = 1;
                if (noticeStatusView.a(1, this) == aVar) {
                    return aVar;
                }
                com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView.a(this.f131629h);
            } else {
                this.f131625d = 2;
                if (noticeStatusView.a(1, this) == aVar) {
                    return aVar;
                }
                i0Var.z(noticeStatusView.getDm.i4.COL_USERNAME java.lang.String(), (r45.h32) aVar2.invoke(), null);
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView.a(this.f131629h);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            i0Var.z(noticeStatusView.getDm.i4.COL_USERNAME java.lang.String(), (r45.h32) aVar2.invoke(), null);
        }
        return jz5.f0.f302826a;
    }
}
