package km2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f309085d;

    /* renamed from: e, reason: collision with root package name */
    public int f309086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f309087f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.g0 f309088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f309089h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.util.ArrayList arrayList, km2.g0 g0Var, com.tencent.mm.modelbase.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f309087f = arrayList;
        this.f309088g = g0Var;
        this.f309089h = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new km2.d0(this.f309087f, this.f309088g, this.f309089h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((km2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f309086e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList2 = this.f309087f;
            this.f309085d = arrayList2;
            this.f309086e = 1;
            km2.g0 g0Var = this.f309088g;
            g0Var.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.tencent.mm.modelbase.i iVar = this.f309089h;
            iVar.l().K(new km2.f0(g0Var, iVar, nVar));
            java.lang.Object a17 = nVar.a();
            if (a17 == aVar) {
                return aVar;
            }
            arrayList = arrayList2;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (java.util.ArrayList) this.f309085d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrayList.add(obj);
        return jz5.f0.f302826a;
    }
}
