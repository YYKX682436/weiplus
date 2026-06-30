package gk5;

/* loaded from: classes9.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f272656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f272657g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.String str, gk5.r0 r0Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272655e = str;
        this.f272656f = r0Var;
        this.f272657g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gk5.g0(this.f272655e, this.f272656f, this.f272657g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gk5.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272654d;
        gk5.r0 r0Var = this.f272656f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oc0.b bVar = new oc0.b();
            java.lang.String str = this.f272655e;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            bVar.f344126e = str;
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
            bVar.f344128g = new bt3.g0();
            ym5.a1.f(new gk5.d0(r0Var));
            mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
            this.f272654d = 1;
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
        ym5.a1.f(new gk5.e0(r0Var));
        if (cVar.f344131a == oc0.d.f344133d) {
            try {
                ym5.a1.f(new gk5.f0(this.f272657g, cVar));
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
