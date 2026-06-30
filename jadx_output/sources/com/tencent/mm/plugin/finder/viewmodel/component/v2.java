package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.u f136197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.finder.highlight.u uVar) {
        super(1);
        this.f136197d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a it = (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.highlight.u uVar = this.f136197d;
        if (uVar != null) {
            uVar.f111473i.add(it);
        }
        return jz5.f0.f302826a;
    }
}
