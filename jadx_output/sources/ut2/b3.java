package ut2;

/* loaded from: classes3.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f430835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f430836f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f430837g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(ut2.s3 s3Var, gk2.e eVar, cm2.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430835e = s3Var;
        this.f430836f = eVar;
        this.f430837g = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut2.b3(this.f430835e, this.f430836f, this.f430837g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.b3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f430834d;
        ut2.s3 s3Var = this.f430835e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j18 = this.f430837g.f43369w;
            this.f430834d = 1;
            int i18 = ut2.s3.f431069l1;
            s3Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            r45.ld2 ld2Var = new r45.ld2();
            gk2.e eVar = this.f430836f;
            ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
            r45.r32 r32Var = new r45.r32();
            r32Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
            r32Var.set(2, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0)));
            r32Var.set(3, pm0.b0.h(((mm2.e1) eVar.a(mm2.e1.class)).f328985o));
            r32Var.set(4, java.lang.Long.valueOf(j18));
            ke2.o0 o0Var = new ke2.o0("/cgi-bin/mmbiz-bin/finderliveopenprehotproductprice", 7247, r32Var, ld2Var, null);
            android.content.Context context = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            az2.j.u(o0Var, context, null, 0L, 6, null);
            o0Var.l().K(new ut2.n1(nVar));
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        if (((java.lang.Boolean) j17).booleanValue()) {
            androidx.recyclerview.widget.f2 f2Var = s3Var.L;
            tt2.e1 e1Var = f2Var instanceof tt2.e1 ? (tt2.e1) f2Var : null;
            if (e1Var != null) {
                e1Var.Z(false);
            }
        } else {
            db5.t7.g(s3Var.itemView.getContext(), s3Var.itemView.getContext().getString(com.tencent.mm.R.string.m3w));
        }
        return jz5.f0.f302826a;
    }
}
