package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class w9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f133288d;

    public w9(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView) {
        this.f133288d = finderFeedLiveNoticeView;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f133288d;
        g4Var.d(4, finderFeedLiveNoticeView.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), finderFeedLiveNoticeView.getContext().getResources().getString(com.tencent.mm.R.string.f491733e22));
    }
}
