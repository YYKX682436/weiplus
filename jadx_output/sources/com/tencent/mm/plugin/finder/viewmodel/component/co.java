package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class co implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.eo f134029a;

    public co(com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar) {
        this.f134029a = eoVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if ((fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            com.tencent.mm.plugin.finder.viewmodel.component.eo eoVar = this.f134029a;
            eoVar.V6((r45.j71) resp);
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.bo(eoVar));
        }
        return jz5.f0.f302826a;
    }
}
