package ut2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f431168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f431169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ut2.s3 s3Var, gk2.e eVar, cm2.m0 m0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431167e = s3Var;
        this.f431168f = eVar;
        this.f431169g = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ut2.z0(this.f431167e, this.f431168f, this.f431169g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f431166d;
        cm2.m0 m0Var = this.f431169g;
        ut2.s3 s3Var = this.f431167e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.y23 y23Var = m0Var.f43368v;
            this.f431166d = 1;
            int i18 = ut2.s3.f431069l1;
            s3Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            r45.ld2 ld2Var = new r45.ld2();
            gk2.e eVar = this.f431168f;
            ld2Var.set(3, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
            r45.ee1 ee1Var = new r45.ee1();
            ee1Var.set(0, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o);
            ee1Var.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f328983m));
            ee1Var.set(2, hc2.b.a(y23Var));
            ee1Var.set(3, 0);
            ke2.o0 o0Var = new ke2.o0("/cgi-bin/mmbiz-bin/finderliveaddproducttoshopbag", 8726, ee1Var, ld2Var, null);
            android.content.Context context = s3Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            az2.j.u(o0Var, context, null, 500L, 2, null);
            o0Var.l().K(new ut2.m1(rVar));
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
        jz5.l lVar = (jz5.l) j17;
        if (((java.lang.Boolean) lVar.f302833d).booleanValue()) {
            s3Var.Q(m0Var);
        } else {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) lVar.f302834e;
            if (charSequence.length() == 0) {
                charSequence = s3Var.itemView.getContext().getString(com.tencent.mm.R.string.dq_);
                kotlin.jvm.internal.o.f(charSequence, "getString(...)");
            }
            db5.t7.g(s3Var.itemView.getContext(), (java.lang.String) charSequence);
        }
        return jz5.f0.f302826a;
    }
}
