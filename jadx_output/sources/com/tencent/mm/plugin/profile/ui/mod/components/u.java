package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f153988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f153989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.j0 f153990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var) {
        super(0);
        this.f153988d = h0Var;
        this.f153989e = h0Var2;
        this.f153990f = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.jvm.internal.h0 h0Var = this.f153988d;
        if (h0Var.f310123d == null) {
            com.tencent.mm.plugin.profile.ui.mod.components.j0 j0Var = this.f153990f;
            this.f153989e.f310123d = kotlinx.coroutines.l.d(j0Var.getLifecycleScope(), null, null, new com.tencent.mm.plugin.profile.ui.mod.components.t(h0Var, j0Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
