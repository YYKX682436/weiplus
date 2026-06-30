package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mj implements ns2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget f119076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f119078c;

    public mj(com.tencent.mm.plugin.finder.live.widget.FinderLiveFinderDetailWidget finderLiveFinderDetailWidget, java.lang.String str, r45.h32 h32Var) {
        this.f119076a = finderLiveFinderDetailWidget;
        this.f119077b = str;
        this.f119078c = h32Var;
    }

    public void a(java.lang.String username, r45.h32 liveNoticeInfo, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(liveNoticeInfo, "liveNoticeInfo");
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView = this.f119076a.f117625o;
        kotlin.jvm.internal.o.f(noticeStatusView, "access$getLiveNoticeActionBtn$p(...)");
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.g(noticeStatusView, username, false, new com.tencent.mm.plugin.finder.live.widget.kj(liveNoticeInfo), 2, null);
    }
}
