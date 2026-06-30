package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.n f175590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f175591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.vlog.model.n nVar, yz5.a aVar) {
        super(0);
        this.f175590d = nVar;
        this.f175591e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CompositionExporter", "export: canceled");
        com.tencent.mm.plugin.vlog.model.n nVar = this.f175590d;
        rm5.v vVar = nVar.f175695n;
        if (vVar != null) {
            vVar.f397593u = null;
        }
        yz5.l lVar = nVar.f175694m;
        if (lVar != null) {
            lVar.invoke(new com.tencent.mm.plugin.vlog.model.z(false, true, true, 0, false, false, false, 120, null));
        }
        nVar.f175694m = null;
        yz5.a aVar = this.f175591e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
