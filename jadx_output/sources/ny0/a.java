package ny0;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f341382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ny0.d f341383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ny0.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f341383e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ny0.a(this.f341383e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ny0.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f341382d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelServerRequest taskId:");
            ny0.d dVar = this.f341383e;
            sb6.append(dVar.f341391m);
            com.tencent.mars.xlog.Log.i("MicroMsg.AIGC.AIMGSnsPollingTask", sb6.toString());
            r45.u86 u86Var = new r45.u86();
            u86Var.set(1, dVar.f341391m);
            com.tencent.mm.modelbase.i d17 = u86Var.d();
            this.f341382d = 1;
            obj = rm0.h.b(d17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AIGC.AIMGSnsPollingTask", "cancelServerRequest result:" + ((com.tencent.mm.modelbase.f) obj).b());
        return jz5.f0.f302826a;
    }
}
