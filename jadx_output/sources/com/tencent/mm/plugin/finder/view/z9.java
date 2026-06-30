package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class z9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f133455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView) {
        super(0);
        this.f133455d = finderFeedLiveNoticeView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f133455d;
        finderFeedLiveNoticeView.setVisibility(8);
        yz5.a onNoticeDoNotShowClicked = finderFeedLiveNoticeView.getOnNoticeDoNotShowClicked();
        if (onNoticeDoNotShowClicked != null) {
            onNoticeDoNotShowClicked.invoke();
        }
        return jz5.f0.f302826a;
    }
}
