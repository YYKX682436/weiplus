package mm2;

/* loaded from: classes10.dex */
public final class t4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f329437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f329438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.v4 f329439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var, mm2.v4 v4Var) {
        super(2, continuation);
        this.f329437d = hVar;
        this.f329438e = h0Var;
        this.f329439f = v4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.t4(this.f329437d, continuation, this.f329438e, this.f329439f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mm2.t4 t4Var = (mm2.t4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.lt1 lt1Var = (r45.lt1) ((xg2.i) this.f329437d).f454393b;
        r45.f02 f02Var = lt1Var.f379812d;
        if (f02Var != null) {
            this.f329439f.N6(f02Var, "cgi");
        }
        this.f329438e.f310123d = lt1Var.f379812d;
        return jz5.f0.f302826a;
    }
}
