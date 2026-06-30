package ro5;

/* loaded from: classes14.dex */
public final class l0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f398232d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f398233e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f398234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f398235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ro5.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f398235g = m1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        ro5.l0 l0Var = new ro5.l0(this.f398235g, (kotlin.coroutines.Continuation) obj3);
        l0Var.f398233e = intValue;
        l0Var.f398234f = (yz5.l) obj2;
        return l0Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f398232d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = this.f398233e;
            yz5.l lVar = (yz5.l) this.f398234f;
            int i19 = i18 | 268435456;
            com.tencent.mars.xlog.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "get decoder surfaceTexture for " + i18 + ", " + i19);
            ro5.m1 m1Var = this.f398235g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hw_decoder_");
            sb6.append(i18);
            java.lang.String sb7 = sb6.toString();
            ro5.m1 m1Var2 = this.f398235g;
            yo5.e eVar = (yo5.e) m1Var2.f398242d.f455798i.getValue();
            ro5.k0 k0Var = new ro5.k0(lVar, m1Var2, i18);
            this.f398232d = 1;
            obj = m1Var.e(sb7, i19, eVar, k0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
