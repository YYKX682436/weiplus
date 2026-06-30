package i55;

/* loaded from: classes8.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f288866d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f288867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f288868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i55.p f288869g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, i55.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f288868f = j17;
        this.f288869g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        i55.o oVar = new i55.o(this.f288868f, this.f288869g, continuation);
        oVar.f288867e = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((i55.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f288866d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f288867e;
            long j17 = this.f288868f;
            this.f288867e = y0Var;
            this.f288866d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        i55.s sVar = i55.s.f288878a;
        java.util.Map c17 = sVar.c();
        i55.p pVar = this.f288869g;
        synchronized (c17) {
            g55.h hVar = (g55.h) sVar.c().get(new java.lang.Integer(pVar.f288872c));
            if (hVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleLogic", "check end cur back 4tab cnt = " + hVar.f268997c);
                int i18 = hVar.f268997c - 1;
                hVar.f268997c = i18;
                if (i18 >= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleLogic", "red dot is consumed!");
                    pVar.a(true);
                } else {
                    sVar.c().remove(new java.lang.Integer(pVar.f288872c));
                    com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleLogic", "red dot is not consumed");
                    pVar.a(false);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleLogic", "get page delay info err");
            }
        }
        return jz5.f0.f302826a;
    }
}
