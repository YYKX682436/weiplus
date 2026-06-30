package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125671d;

    public e2(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        this.f125671d = finderFeedSearchUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125671d;
        finderFeedSearchUI.Q1.put(0, finderFeedSearchUI.f125549v);
        finderFeedSearchUI.o7(finderFeedSearchUI.E1, finderFeedSearchUI.X);
    }
}
