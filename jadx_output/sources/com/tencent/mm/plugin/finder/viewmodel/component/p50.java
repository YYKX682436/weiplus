package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class p50 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.p50 f135517d = new com.tencent.mm.plugin.finder.viewmodel.component.p50();

    public p50() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.al newState = (com.tencent.mm.plugin.finder.view.al) obj;
        kotlin.jvm.internal.o.g(newState, "newState");
        com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "Speed indicator state changed to: " + newState);
        return jz5.f0.f302826a;
    }
}
