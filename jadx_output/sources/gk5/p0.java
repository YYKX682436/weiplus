package gk5;

/* loaded from: classes9.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f272694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f272695g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f272696h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, java.util.List list, gk5.r0 r0Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272693e = str;
        this.f272694f = list;
        this.f272695g = r0Var;
        this.f272696h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gk5.p0(this.f272693e, this.f272694f, this.f272695g, this.f272696h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gk5.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ot0.q v17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272692d;
        gk5.r0 r0Var = this.f272695g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oc0.b bVar = new oc0.b();
            java.lang.String str = this.f272693e;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            bVar.f344126e = str;
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
            bVar.f344128g = new bt3.g0();
            ym5.a1.f(new gk5.m0(r0Var));
            mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
            this.f272692d = 1;
            obj = ((zs3.z) kVar).hj(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        oc0.c cVar = (oc0.c) obj;
        ym5.a1.f(new gk5.n0(r0Var));
        if (cVar.f344131a == oc0.d.f344133d) {
            try {
                java.util.List<java.lang.String> list = this.f272694f;
                if (list != null) {
                    for (java.lang.String str2 : list) {
                        java.lang.String str3 = cVar.f344132b;
                        r0Var.getClass();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && (v17 = ot0.q.v(str3)) != null) {
                            ((ez.w0) ot0.j1.a()).wi(v17, v17.f348646d, v17.H, str2, "", null, true);
                        }
                    }
                }
                ym5.a1.f(new gk5.o0(this.f272696h));
            } catch (java.lang.Exception e17) {
                r0Var.V6();
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ForwardNoteToWeWorkUIC", e17, "record_attach_upload_xml", new java.lang.Object[0]);
            }
        } else {
            r0Var.V6();
        }
        return jz5.f0.f302826a;
    }
}
