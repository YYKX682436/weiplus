package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.promotion.t f129677d;

    public p(com.tencent.mm.plugin.finder.ui.promotion.t tVar) {
        this.f129677d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f129677d.getRecyclerView().requestLayout();
    }
}
