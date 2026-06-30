package d52;

/* loaded from: classes13.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f226532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d52.n f226533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d52.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f226533e = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new d52.h(this.f226533e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((d52.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f226532d;
        d52.n nVar = this.f226533e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            u26.w wVar = nVar.f226546c;
            this.f226532d = 1;
            i17 = ((u26.k) wVar).i(this);
            if (i17 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            i17 = ((u26.c0) obj).f424141a;
        }
        r45.hw3 hw3Var = (r45.hw3) u26.c0.b(i17);
        if (hw3Var != null) {
            try {
                d52.f fVar = nVar.f226527a;
                if (fVar != null) {
                    ((g52.c) fVar).a(d52.e.a(hw3Var));
                }
                java.lang.Thread.currentThread().getId();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewMsgQ", "onMsg err " + e17);
            }
        }
        return jz5.f0.f302826a;
    }
}
