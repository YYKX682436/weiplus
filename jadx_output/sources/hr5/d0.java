package hr5;

/* loaded from: classes15.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f284325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f284326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f284327g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f284328h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hr5.a1 a1Var, float f17, long j17, long j18, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284324d = a1Var;
        this.f284325e = f17;
        this.f284326f = j17;
        this.f284327g = j18;
        this.f284328h = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr5.d0(this.f284324d, this.f284325e, this.f284326f, this.f284327g, this.f284328h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr5.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        zq5.v a17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        hr5.a1 a1Var = this.f284324d;
        long j17 = a1Var.f284281e;
        zq5.g gVar = new zq5.g(j17);
        if (!zq5.h.c(j17)) {
            gVar = null;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (gVar != null) {
            long j18 = a1Var.f284282f;
            if ((zq5.h.c(j18) ? new zq5.g(j18) : null) != null) {
                float c17 = (a1Var.f284297u.c() * this.f284325e) / a1Var.f284295s.c();
                float d17 = a1Var.d(c17, a1Var.f284290n);
                zq5.v vVar = a1Var.f284296t;
                float c18 = vVar.c();
                long j19 = vVar.f475096b;
                long e17 = hr5.b1.e(c18, j19, d17, this.f284326f, this.f284327g, 0.0f);
                long c19 = a1Var.c(e17, d17);
                a17 = vVar.a((r20 & 1) != 0 ? vVar.f475095a : zq5.s.a(d17, d17), (r20 & 2) != 0 ? vVar.f475096b : c19, (r20 & 4) != 0 ? vVar.f475097c : 0.0f, (r20 & 8) != 0 ? vVar.f475098d : 0L, (r20 & 16) != 0 ? vVar.f475099e : 0L);
                hr5.a1 a1Var2 = this.f284324d;
                a1Var2.f284277a.a(new hr5.c0(c17, c18, d17, e17, j19, c19, a1Var2, this.f284326f, this.f284325e, this.f284327g, this.f284328h, vVar, a17));
                a1Var.j(a17);
            }
        }
        return f0Var;
    }
}
