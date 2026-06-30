package xt2;

/* loaded from: classes.dex */
public final class i6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.k6 f456804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f456805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f456806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f456807h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(xt2.k6 k6Var, java.lang.String str, android.content.Context context, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456804e = k6Var;
        this.f456805f = str;
        this.f456806g = context;
        this.f456807h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.i6(this.f456804e, this.f456805f, this.f456806g, this.f456807h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.i6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456803d;
        xt2.k6 k6Var = this.f456804e;
        java.lang.String str = this.f456805f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f456803d = 1;
            obj = xt2.k6.e(k6Var, str, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        cl0.g gVar = new cl0.g(str);
        xt2.u1 u1Var = new xt2.u1(this.f456806g, gVar.optLong("productId"), gVar.optInt("reqScene"), new xt2.h6(k6Var, str, null));
        u1Var.f((r45.s42) obj);
        this.f456807h.invoke(u1Var.d());
        return jz5.f0.f302826a;
    }
}
