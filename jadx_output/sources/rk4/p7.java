package rk4;

/* loaded from: classes11.dex */
public final class p7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396900d;

    /* renamed from: e, reason: collision with root package name */
    public int f396901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f396904h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f396905i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ il4.e f396906m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f396907n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(rk4.k8 k8Var, android.content.Context context, boolean z17, bw5.lp0 lp0Var, il4.e eVar, android.os.Bundle bundle, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396902f = k8Var;
        this.f396903g = context;
        this.f396904h = z17;
        this.f396905i = lp0Var;
        this.f396906m = eVar;
        this.f396907n = bundle;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.p7(this.f396902f, this.f396903g, this.f396904h, this.f396905i, this.f396906m, this.f396907n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.p7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396901e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.k8 k8Var = this.f396902f;
            this.f396901e = 1;
            obj = rk4.k8.m(k8Var, false, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        rk4.k8 k8Var2 = this.f396902f;
        android.content.Context context = this.f396903g;
        boolean z17 = this.f396904h;
        bw5.lp0 lp0Var = this.f396905i;
        il4.e eVar = this.f396906m;
        android.os.Bundle bundle = this.f396907n;
        this.f396900d = obj;
        this.f396901e = 2;
        if (k8Var2.I((pi0.l1) obj, context, z17, lp0Var, eVar, bundle, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
