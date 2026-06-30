package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class b80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC f133846d;

    public b80(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC) {
        this.f133846d = finderTabUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC = this.f133846d;
        finderTabUIC.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "onActionbarClick");
        zx2.i b76 = finderTabUIC.b7(finderTabUIC.a7());
        if (b76 != null) {
            finderTabUIC.e7();
            androidx.appcompat.app.AppCompatActivity context = finderTabUIC.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mars.xlog.Log.i("Finder.FinderTabViewAction", "onTabClick : " + b76.f477040a);
        }
    }
}
