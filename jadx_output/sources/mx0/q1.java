package mx0;

/* loaded from: classes5.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.r1 f332231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(mx0.r1 r1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332231d = r1Var;
        this.f332232e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.q1(this.f332231d, this.f332232e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f332231d.f332279g = this.f332232e;
        mx0.r1 r1Var = this.f332231d;
        boolean z17 = r1Var.f332280h;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.p6(m7Var, null), 3, null);
            return f0Var;
        }
        if (r1Var.f332279g) {
            yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.z5(m7Var2, null), 3, null);
        } else {
            yy0.m7 m7Var3 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var3.Di(), null, null, new yy0.q6(m7Var3, null), 3, null);
        }
        this.f332231d.a(this.f332232e);
        return f0Var;
    }
}
