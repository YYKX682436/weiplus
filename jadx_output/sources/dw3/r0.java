package dw3;

/* loaded from: classes5.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f244263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f244266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dw3.l0 f244267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f244268i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(yz5.l lVar, java.lang.String str, int i17, dw3.l0 l0Var, android.app.Activity activity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f244264e = lVar;
        this.f244265f = str;
        this.f244266g = i17;
        this.f244267h = l0Var;
        this.f244268i = activity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dw3.r0(this.f244264e, this.f244265f, this.f244266g, this.f244267h, this.f244268i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dw3.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f244263d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f244263d = 1;
            obj = this.f244264e.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dw3.m0 m0Var = (dw3.m0) obj;
        dw3.u0 u0Var = dw3.u0.f244283a;
        u0Var.h(this.f244268i, u0Var.c(this.f244265f, m0Var.f244235a, this.f244266g, m0Var.f244236b, this.f244267h.a()));
        return jz5.f0.f302826a;
    }
}
