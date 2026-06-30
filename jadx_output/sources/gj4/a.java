package gj4;

/* loaded from: classes8.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f272402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f272403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f272404g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, long j18, long j19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272402e = j17;
        this.f272403f = j18;
        this.f272404g = j19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gj4.a(this.f272402e, this.f272403f, this.f272404g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gj4.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272401d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getTextStatusHistoryList >> ");
                long j17 = this.f272402e;
                sb6.append(j17);
                sb6.append(", ");
                long j18 = this.f272403f;
                sb6.append(j18);
                sb6.append(", ");
                long j19 = this.f272404g;
                sb6.append(j19);
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusHistoryCgiHelper", sb6.toString());
                com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                pj4.f1 f1Var = new pj4.f1();
                f1Var.f355040e = j17;
                f1Var.f355041f = j18;
                f1Var.f355042g = j19;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = f1Var;
                lVar.f70665b = new pj4.g1();
                lVar.f70667d = 4245;
                lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusgetselfhistories";
                iVar.p(lVar.a());
                this.f272401d = 1;
                obj = rm0.h.b(iVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            pj4.g1 g1Var = (pj4.g1) ((com.tencent.mm.modelbase.f) obj).f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusHistoryCgiHelper", "getTextStatusHistoryList result >> " + g1Var.f355059d.size());
            return g1Var.f355059d;
        } catch (rm0.j e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatusHistoryCgiHelper", "getTextStatusHistoryList error >> " + e17);
            return null;
        }
    }
}
