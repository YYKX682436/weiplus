package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f133913d;

    public bn(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        this.f133913d = mnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f133913d.S6(), false, 1, null);
    }
}
