package du0;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f243326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f243327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(float f17, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243326e = f17;
        this.f243327f = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.b0(this.f243326e, this.f243327f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243325d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f243325d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            du0.a0 a0Var = new du0.a0(rVar);
            com.tencent.mars.xlog.Log.i("LocationUIC", "pushLocationAddr: start");
            u60.f wi6 = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();
            u60.h hVar = new u60.h(this.f243326e, this.f243327f);
            hVar.f424874g = true;
            hVar.f424870c = 6;
            ((i11.g) wi6).b(hVar, a0Var);
            rVar.m(new du0.z(a0Var));
            obj = rVar.j();
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
