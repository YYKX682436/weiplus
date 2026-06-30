package du0;

/* loaded from: classes.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f243334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f243335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f243336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.l lVar, float f17, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243334e = lVar;
        this.f243335f = f17;
        this.f243336g = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du0.c0(this.f243334e, this.f243335f, this.f243336g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243333d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            du0.b0 b0Var = new du0.b0(this.f243335f, this.f243336g, null);
            this.f243333d = 1;
            obj = kotlinx.coroutines.a4.c(2000L, b0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f243334e.invoke((com.tencent.mm.modelgeo.Addr) obj);
        return jz5.f0.f302826a;
    }
}
