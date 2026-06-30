package cq;

/* loaded from: classes.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221271b;

    public s(yz5.l lVar, yz5.l lVar2) {
        this.f221270a = lVar;
        this.f221271b = lVar2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17) {
            yz5.l lVar = this.f221270a;
            if (lVar != null) {
                com.tencent.mm.protobuf.f resp = fVar.f70618d;
                kotlin.jvm.internal.o.f(resp, "resp");
                lVar.invoke(resp);
                return f0Var;
            }
        } else {
            yz5.l lVar2 = this.f221271b;
            if (lVar2 != null) {
                lVar2.invoke(fVar);
                return f0Var;
            }
        }
        return null;
    }
}
