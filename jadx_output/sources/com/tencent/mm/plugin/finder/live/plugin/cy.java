package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class cy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f112213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        super(0);
        this.f112213d = tyVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f112213d;
        tyVar.z1(2);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(tyVar.R0().getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.live.plugin.py(tyVar);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.live.plugin.qy(tyVar);
        k0Var.v();
        tyVar.A1(1, 1);
        return jz5.f0.f302826a;
    }
}
