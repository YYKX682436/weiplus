package l41;

/* loaded from: classes4.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f315937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f315938g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f315939h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f315940i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315941m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.lang.String str, java.lang.String str2, double d17, double d18, double d19, int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f315935d = str;
        this.f315936e = str2;
        this.f315937f = d17;
        this.f315938g = d18;
        this.f315939h = d19;
        this.f315940i = i17;
        this.f315941m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l41.u1(this.f315935d, this.f315936e, this.f315937f, this.f315938g, this.f315939h, this.f315940i, this.f315941m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        l41.u1 u1Var = (l41.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.i05 i05Var = new r45.i05();
        i05Var.f376623d = this.f315935d;
        java.lang.String str = this.f315936e;
        if (str != null) {
            i05Var.f376624e = str;
        }
        i05Var.f376625f = this.f315937f;
        i05Var.f376626g = this.f315938g;
        i05Var.f376627h = this.f315939h;
        i05Var.f376628i = this.f315940i;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/openimkefucontactreportlocation";
        lVar.f70667d = 8291;
        lVar.f70664a = i05Var;
        lVar.f70665b = new r45.j05();
        kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(lVar.a());
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.c(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, kotlinx.coroutines.a1.DEFAULT, new l41.t1(a17, this.f315941m, null));
        }
        return jz5.f0.f302826a;
    }
}
