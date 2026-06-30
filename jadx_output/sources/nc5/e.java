package nc5;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336196d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336198f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nc5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336198f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        nc5.e eVar = new nc5.e(this.f336198f, continuation);
        eVar.f336197e = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nc5.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        aq.n nVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336196d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f336197e;
            android.util.Pair g17 = nc5.a.f336188a.g(this.f336198f.f336214b, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "get result >> " + ((java.util.ArrayList) g17.first).size() + ", " + ((java.util.ArrayList) g17.second).size());
            if (kotlinx.coroutines.z0.h(y0Var) && (nVar = aq.o.f12922c) != null) {
                java.lang.Object first = g17.first;
                kotlin.jvm.internal.o.f(first, "first");
                java.lang.Object second = g17.second;
                kotlin.jvm.internal.o.f(second, "second");
                this.f336196d = 1;
                if (nVar.c((java.util.ArrayList) first, (java.util.ArrayList) second, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
