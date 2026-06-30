package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ab implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView f131630d;

    public ab(com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView finderHomeTabFeedBackBubbleView) {
        this.f131630d = finderHomeTabFeedBackBubbleView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f131630d.a("timeout");
    }
}
