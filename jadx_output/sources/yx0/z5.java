package yx0;

/* loaded from: classes5.dex */
public final class z5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f467812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(yx0.b8 b8Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467811e = b8Var;
        this.f467812f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.z5(this.f467811e, this.f467812f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.z5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467810d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f467811e.f467194u;
            if (r2Var != null) {
                yx0.b8 b8Var = this.f467811e;
                this.f467810d = 1;
                if (b8Var.a0(r2Var, com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME, this) == aVar) {
                    return aVar;
                }
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
        yx0.b8 b8Var2 = this.f467811e;
        boolean z17 = this.f467812f;
        this.f467810d = 2;
        if (yx0.b8.b(b8Var2, com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME, z17, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
