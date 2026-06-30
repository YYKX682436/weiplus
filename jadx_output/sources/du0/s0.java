package du0;

/* loaded from: classes5.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243434d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f243435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ du0.t0 f243436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(du0.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243436f = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        du0.s0 s0Var = new du0.s0(this.f243436f, continuation);
        s0Var.f243435e = obj;
        return s0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((du0.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f243434d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f243435e;
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("MaasCache") + "/MovieComposing/", "materials");
            if (!r6Var.m()) {
                r6Var.J();
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            du0.t0 t0Var = this.f243436f;
            java.util.List i18 = kz5.c0.i(kotlinx.coroutines.l.b(y0Var, p0Var, null, new du0.p0(t0Var, r6Var, null), 2, null), kotlinx.coroutines.l.b(y0Var, p0Var, null, new du0.q0(t0Var, r6Var, null), 2, null), kotlinx.coroutines.l.b(y0Var, p0Var, null, new du0.r0(t0Var, r6Var, null), 2, null));
            this.f243434d = 1;
            if (kotlinx.coroutines.h.a(i18, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
