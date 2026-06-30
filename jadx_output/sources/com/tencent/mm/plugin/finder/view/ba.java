package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class ba extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f131702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f131703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f131704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f131705g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, yz5.a aVar, tx2.i0 i0Var, com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView) {
        super(0);
        this.f131702d = finderFeedLiveNoticeView;
        this.f131703e = aVar;
        this.f131704f = i0Var;
        this.f131705g = noticeStatusView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f131702d;
        kotlinx.coroutines.l.d(finderFeedLiveNoticeView.f131084d, null, null, new com.tencent.mm.plugin.finder.view.aa(this.f131703e, this.f131704f, this.f131705g, finderFeedLiveNoticeView, null), 3, null);
        return jz5.f0.f302826a;
    }
}
