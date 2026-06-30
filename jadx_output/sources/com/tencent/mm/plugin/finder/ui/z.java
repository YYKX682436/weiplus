package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f130073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        super(1);
        this.f130073d = finderActivityDescUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.ui.f fVar = com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.f128488x1;
        com.tencent.mars.xlog.Log.i("Finder.FinderActivityDescUI", "setAnnounceView");
        androidx.appcompat.app.AppCompatActivity context = this.f130073d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        hc2.i.h(context);
        return jz5.f0.f302826a;
    }
}
