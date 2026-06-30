package yf0;

/* loaded from: classes5.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f461624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f461625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f461626g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f461627h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f461628i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f461629m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yf0.k0 k0Var, zf0.v0 v0Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlinx.coroutines.z zVar, kotlinx.coroutines.z zVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461624e = k0Var;
        this.f461625f = v0Var;
        this.f461626g = f0Var;
        this.f461627h = f0Var2;
        this.f461628i = zVar;
        this.f461629m = zVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf0.z(this.f461624e, this.f461625f, this.f461626g, this.f461627h, this.f461628i, this.f461629m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461623d;
        kotlinx.coroutines.z zVar = this.f461628i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yf0.y yVar = new yf0.y(zVar);
            this.f461623d = 1;
            obj = yf0.k0.U6(this.f461624e, this.f461625f, yVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        this.f461626g.f310116d = intValue;
        this.f461627h.f310116d = intValue2;
        boolean A = ((kotlinx.coroutines.c3) zVar).A();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!A) {
            ((kotlinx.coroutines.a0) zVar).U(f0Var);
        }
        ((kotlinx.coroutines.a0) this.f461629m).U(f0Var);
        return f0Var;
    }
}
