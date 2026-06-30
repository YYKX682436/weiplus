package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class g80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.h80 f134478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(com.tencent.mm.plugin.finder.viewmodel.component.h80 h80Var) {
        super(0);
        this.f134478d = h80Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USREINFO_FINDER_TEENS_GUIDE_TIPS_LASTIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mm.plugin.finder.viewmodel.component.h80 h80Var = this.f134478d;
        h80Var.Q6();
        ay2.i iVar = h80Var.f134597d;
        if (iVar != null) {
            iVar.f15249q = new com.tencent.mm.plugin.finder.viewmodel.component.f80(h80Var);
        }
        return jz5.f0.f302826a;
    }
}
