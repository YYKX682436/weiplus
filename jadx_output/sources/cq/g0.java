package cq;

/* loaded from: classes2.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f221197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221198b;

    public g0(yz5.p pVar, yz5.l lVar) {
        this.f221197a = pVar;
        this.f221198b = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17) {
            yz5.p pVar = this.f221197a;
            if (pVar != null) {
                com.tencent.mm.protobuf.f fVar2 = fVar.f70620f.f70646f.f70710a.f70684a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListRequest");
                com.tencent.mm.protobuf.f resp = fVar.f70618d;
                kotlin.jvm.internal.o.f(resp, "resp");
                pVar.invoke((r45.k61) fVar2, resp);
                return f0Var;
            }
        } else {
            yz5.l lVar = this.f221198b;
            if (lVar != null) {
                lVar.invoke(fVar);
                return f0Var;
            }
        }
        return null;
    }
}
