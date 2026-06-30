package dv2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f243823d;

    /* renamed from: e, reason: collision with root package name */
    public int f243824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dv2.e1 f243825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.g9 f243826g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.m8 f243827h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(dv2.e1 e1Var, com.tencent.mm.plugin.finder.assist.g9 g9Var, com.tencent.mm.plugin.finder.assist.m8 m8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243825f = e1Var;
        this.f243826g = g9Var;
        this.f243827h = m8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dv2.c1(this.f243825f, this.f243826g, this.f243827h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dv2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dv2.e1 e1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243824e;
        dv2.e1 e1Var2 = this.f243825f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("Finder.PostSafePreCheckUIC", "[preCheckInner] wait for watermark detect result");
            ub2.k kVar = (ub2.k) ((jz5.n) e1Var2.f243841r).getValue();
            this.f243823d = e1Var2;
            this.f243824e = 1;
            obj = kVar.c(this);
            if (obj == aVar) {
                return aVar;
            }
            e1Var = e1Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1Var = (dv2.e1) this.f243823d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        e1Var.f243839p = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("Finder.PostSafePreCheckUIC", "[preCheckInner] receive watermark detect result, " + e1Var2.f243839p);
        dv2.e1 e1Var3 = this.f243825f;
        pf5.e.launchUI$default(e1Var3, null, null, new dv2.b1(this.f243826g, e1Var3, this.f243827h, null), 3, null);
        return jz5.f0.f302826a;
    }
}
