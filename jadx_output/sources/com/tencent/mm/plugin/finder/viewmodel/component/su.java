package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class su implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC f135919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f135920e;

    public su(com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC finderPostRemindUIC, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f135919d = finderPostRemindUIC;
        this.f135920e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC.O6(this.f135919d, this.f135920e, sr2.u.f411726d);
    }
}
