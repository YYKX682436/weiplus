package th5;

/* loaded from: classes12.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419370d;

    /* renamed from: e, reason: collision with root package name */
    public int f419371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ th5.o f419372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ th5.g0 f419373g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(th5.o oVar, th5.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419372f = oVar;
        this.f419373g = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new th5.e0(this.f419372f, this.f419373g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f419371e;
        th5.g0 g0Var = this.f419373g;
        th5.o oVar = this.f419372f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oVar.getClass();
            java.lang.String a17 = th5.m.f419407a.a(oVar.b());
            java.lang.String str2 = oVar.f419419d;
            th5.f1 f1Var = th5.f1.f419380a;
            java.lang.String str3 = "origin_download id=" + oVar.getId();
            th5.d0 d0Var = new th5.d0(oVar, g0Var);
            this.f419370d = a17;
            this.f419371e = 1;
            java.lang.Object a18 = f1Var.a(str2, a17, str3, d0Var, this);
            if (a18 == aVar) {
                return aVar;
            }
            str = a17;
            obj = a18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f419370d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            oVar.f419424i = 0.0f;
            v65.i.c(g0Var.f418948f, null, new th5.a0(oVar, null), 1, null);
            g0Var.W6(oVar, sf3.k.f407398f, oVar.e().a(sf3.m.f407403e));
            return f0Var;
        }
        oVar.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        oVar.f419423h = str;
        oVar.f419424i = 1.0f;
        v65.i.c(g0Var.f418948f, null, new th5.b0(oVar, null), 1, null);
        g0Var.W6(oVar, sf3.k.f407397e, oVar.e().a(sf3.m.f407403e));
        return f0Var;
    }
}
