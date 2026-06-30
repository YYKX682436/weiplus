package th5;

/* loaded from: classes12.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419376d;

    /* renamed from: e, reason: collision with root package name */
    public int f419377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ th5.o f419378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ th5.g0 f419379g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(th5.o oVar, th5.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419378f = oVar;
        this.f419379g = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new th5.f0(this.f419378f, this.f419379g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f419377e;
        th5.o oVar = this.f419378f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oVar.getClass();
            java.lang.String b17 = th5.m.f419407a.b(oVar.b());
            java.lang.String str3 = oVar.f419420e;
            if (str3 == null) {
                str3 = "";
            }
            if (r26.n0.N(str3)) {
                java.lang.String str4 = oVar.f419419d;
                str = str4 != null ? str4 : "";
            } else {
                str = str3;
            }
            th5.f1 f1Var = th5.f1.f419380a;
            java.lang.String str5 = "thumb_download id=" + oVar.getId();
            this.f419376d = b17;
            this.f419377e = 1;
            java.lang.Object a17 = f1Var.a(str, b17, str5, th5.c1.f419357d, this);
            if (a17 == aVar) {
                return aVar;
            }
            str2 = b17;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) this.f419376d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        th5.g0 g0Var = this.f419379g;
        if (!booleanValue) {
            g0Var.W6(oVar, sf3.k.f407398f, oVar.e().a(sf3.m.f407404f));
            return f0Var;
        }
        oVar.getClass();
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        oVar.f419422g = str2;
        g0Var.W6(oVar, sf3.k.f407397e, oVar.e().a(sf3.m.f407404f));
        return f0Var;
    }
}
