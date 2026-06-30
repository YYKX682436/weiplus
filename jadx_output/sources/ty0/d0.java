package ty0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f422817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f422818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f422819g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0.f1 f1Var, n0.e5 e5Var, n0.e5 e5Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f422817e = f1Var;
        this.f422818f = e5Var;
        this.f422819g = e5Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ty0.d0(this.f422817e, this.f422818f, this.f422819g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ty0.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f422816d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n0.e5 e5Var = this.f422818f;
            java.util.Iterator it = ty0.z0.h(e5Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.maas.model.MJMusicInfo) obj2).getMusicID(), (java.lang.String) this.f422819g.getValue())) {
                    break;
                }
            }
            com.tencent.maas.model.MJMusicInfo mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) obj2;
            int indexOf = mJMusicInfo != null ? ((java.util.List) e5Var.getValue()).indexOf(mJMusicInfo) : 0;
            e0.f1 f1Var = this.f422817e;
            this.f422816d = 1;
            if (e0.f1.g(f1Var, indexOf, 0, this, 2, null) == aVar) {
                return aVar;
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
