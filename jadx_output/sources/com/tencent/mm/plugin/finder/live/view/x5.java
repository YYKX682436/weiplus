package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer f116798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f116799e;

    public x5(com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer, yz5.a aVar) {
        this.f116798d = finderLiveLikeContainer;
        this.f116799e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer = this.f116798d;
        if (finderLiveLikeContainer.F) {
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer.A(finderLiveLikeContainer, true);
        yz5.a aVar = this.f116799e;
        if (aVar != null) {
        }
        finderLiveLikeContainer.I = null;
    }
}
