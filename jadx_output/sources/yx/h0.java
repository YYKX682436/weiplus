package yx;

/* loaded from: classes3.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f467027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f467028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f467029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f467030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467031h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(boolean z17, kotlinx.coroutines.r2 r2Var, kotlinx.coroutines.y0 y0Var, yz5.a aVar, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467027d = z17;
        this.f467028e = r2Var;
        this.f467029f = y0Var;
        this.f467030g = aVar;
        this.f467031h = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx.h0(this.f467027d, this.f467028e, this.f467029f, this.f467030g, this.f467031h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx.h0 h0Var = (yx.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f467027d;
        kotlinx.coroutines.r2 r2Var = this.f467028e;
        if (z17) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            kotlinx.coroutines.l.d(this.f467029f, null, null, new yx.g0(this.f467030g, this.f467031h, null), 3, null);
        } else {
            r2Var.start();
        }
        return jz5.f0.f302826a;
    }
}
