package cq;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f221244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bq.g f221245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yz5.p pVar, bq.g gVar, yz5.l lVar) {
        super(1);
        this.f221244d = pVar;
        this.f221245e = gVar;
        this.f221246f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.dw0 dw0Var = fVar != null ? (r45.dw0) fVar.f70618d : null;
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17 || dw0Var == null) {
            yz5.l lVar = this.f221246f;
            if (lVar == null) {
                return null;
            }
            lVar.invoke(fVar);
        } else {
            yz5.p pVar = this.f221244d;
            if (pVar == null) {
                return null;
            }
            com.tencent.mm.protobuf.f fVar2 = this.f221245e.f70646f.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBindPoiResponse");
            pVar.invoke(dw0Var, ((r45.dw0) fVar2).getList(1));
        }
        return f0Var;
    }
}
