package cq;

/* loaded from: classes5.dex */
public final class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f221234a;

    public l0(yz5.p pVar) {
        this.f221234a = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.pt2 pt2Var = fVar != null ? (r45.pt2) fVar.f70618d : null;
        boolean z17 = (fVar != null && fVar.b()) && pt2Var != null;
        yz5.p pVar = this.f221234a;
        if (pVar == null) {
            return null;
        }
        pVar.invoke(java.lang.Boolean.valueOf(z17), pt2Var);
        return jz5.f0.f302826a;
    }
}
