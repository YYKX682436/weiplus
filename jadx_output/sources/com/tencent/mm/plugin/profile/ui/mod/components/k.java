package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var) {
        super(1);
        this.f153940d = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mr3.l it = (mr3.l) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f153940d;
        j0Var.f153937y++;
        ((java.util.ArrayList) j0Var.f153931s).remove(it);
        j0Var.e7();
        return jz5.f0.f302826a;
    }
}
