package yy0;

/* loaded from: classes4.dex */
public final class e8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f468075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f468078g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(int i17, java.lang.String str, int i18, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468075d = i17;
        this.f468076e = str;
        this.f468077f = i18;
        this.f468078g = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.e8(this.f468075d, this.f468076e, this.f468077f, this.f468078g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.e8 e8Var = (yy0.e8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        i95.m c17 = i95.n0.c(g65.a.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        g65.a.hg((g65.a) c17, 34, this.f468075d, this.f468076e, this.f468077f, this.f468078g.f310116d, 0, 0L, 0L, 0L, 0L, 0, null, null, null, null, 32736, null);
        return jz5.f0.f302826a;
    }
}
