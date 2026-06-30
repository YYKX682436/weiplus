package my1;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my1.j f332690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332691f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(my1.j jVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332690e = jVar;
        this.f332691f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new my1.i(this.f332690e, this.f332691f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((my1.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mk.e eVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332689d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            my1.j jVar = this.f332690e;
            bw5.t4 t4Var = new bw5.t4();
            t4Var.f33240d = this.f332691f;
            t4Var.f33241e[2] = true;
            bw5.u4 u4Var = new bw5.u4();
            this.f332689d = 1;
            obj = jVar.a(28220, "/cgi-bin/mmfddataecappsvr/edgesentinelrouter", t4Var, u4Var, null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bw5.u4 u4Var2 = (bw5.u4) ((my1.d) obj).f332675a;
        if (u4Var2 != null && (eVar = this.f332690e.f332692a) != null) {
            ((ry5.b) eVar).d(u4Var2.f33732e[2] ? u4Var2.f33731d : "");
        }
        return jz5.f0.f302826a;
    }
}
