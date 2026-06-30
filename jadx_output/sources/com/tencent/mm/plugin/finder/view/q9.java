package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class q9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedAlbumView f132884d;

    public q9(com.tencent.mm.plugin.finder.view.FinderFeedAlbumView finderFeedAlbumView) {
        this.f132884d = finderFeedAlbumView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f132884d.requestLayout();
    }
}
