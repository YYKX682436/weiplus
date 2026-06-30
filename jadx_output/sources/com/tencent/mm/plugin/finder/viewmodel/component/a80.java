package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC f133744d;

    public a80(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC) {
        this.f133744d = finderTabUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC = this.f133744d;
        finderTabUIC.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "onActionbarDoubleClick");
        zx2.i b76 = finderTabUIC.b7(finderTabUIC.a7());
        if (b76 != null) {
            ((zx2.y) finderTabUIC.e7()).c(finderTabUIC.getActivity(), b76);
        }
    }
}
