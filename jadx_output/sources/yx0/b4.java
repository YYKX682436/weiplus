package yx0;

/* loaded from: classes5.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467163h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(yx0.b8 b8Var, java.lang.String str, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467160e = b8Var;
        this.f467161f = str;
        this.f467162g = str2;
        this.f467163h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.b4(this.f467160e, this.f467161f, this.f467162g, this.f467163h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467159d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int ordinal = this.f467160e.f467192s.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                kotlinx.coroutines.r2 r2Var = this.f467160e.f467194u;
                if (r2Var != null) {
                    yx0.b8 b8Var = this.f467160e;
                    this.f467159d = 1;
                    if (b8Var.a0(r2Var, "openAsyncAIGCDraft", this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "openAsyncAIGCDraft: " + this.f467160e.f467192s);
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).vj(true);
        yx0.b8 b8Var2 = this.f467160e;
        kotlinx.coroutines.l.d(b8Var2.L, null, null, new yx0.a4(b8Var2, this.f467161f, this.f467162g, this.f467163h, null), 3, null);
        return jz5.f0.f302826a;
    }
}
