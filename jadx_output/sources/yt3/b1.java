package yt3;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.c1 f465350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dw3.o0 f465351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dw3.k0 f465352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f465353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(yt3.c1 c1Var, dw3.o0 o0Var, dw3.k0 k0Var, java.lang.Integer num, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465350d = c1Var;
        this.f465351e = o0Var;
        this.f465352f = k0Var;
        this.f465353g = num;
        this.f465354h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yt3.b1(this.f465350d, this.f465351e, this.f465352f, this.f465353g, this.f465354h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yt3.b1 b1Var = (yt3.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dw3.u0 u0Var = dw3.u0.f244283a;
        yt3.c1 c1Var = this.f465350d;
        android.content.Context context = c1Var.f465379f.getContext();
        yt3.a1 a1Var = new yt3.a1(c1Var, null);
        int b17 = dw3.j0.f244218a.b();
        dw3.l0 l0Var = new dw3.l0(null, c1Var.f465388r, this.f465351e, this.f465352f, this.f465353g, 1, null);
        kotlin.jvm.internal.o.d(context);
        u0Var.f(context, a1Var, this.f465354h, b17, l0Var, null);
        return jz5.f0.f302826a;
    }
}
