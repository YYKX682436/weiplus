package u61;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424913d;

    /* renamed from: e, reason: collision with root package name */
    public int f424914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f424915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f424916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.gn4 f424917h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yz5.l lVar, android.content.Context context, r45.gn4 gn4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f424915f = lVar;
        this.f424916g = context;
        this.f424917h = gn4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new u61.m(this.f424915f, this.f424916g, this.f424917h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u61.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f424914e;
        yz5.l lVar2 = this.f424915f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                u61.o oVar = u61.o.f424924a;
                android.content.Context context = this.f424916g;
                r45.gn4 gn4Var = this.f424917h;
                this.f424913d = lVar2;
                this.f424914e = 1;
                obj = oVar.b(context, gn4Var, "BeforeReg", this);
                if (obj == aVar) {
                    return aVar;
                }
                lVar = lVar2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (yz5.l) this.f424913d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            lVar.invoke(obj);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GateWayRegHelper", "reqSimMobile error: " + e17.getMessage());
            lVar2.invoke(null);
        }
        return jz5.f0.f302826a;
    }
}
