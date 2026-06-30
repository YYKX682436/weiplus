package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f175592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f175592d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.vlog.model.z it = (com.tencent.mm.plugin.vlog.model.z) obj;
        kotlin.jvm.internal.o.g(it, "it");
        yz5.l lVar = (yz5.l) this.f175592d.f310123d;
        if (lVar != null) {
            lVar.invoke(it);
        }
        return jz5.f0.f302826a;
    }
}
