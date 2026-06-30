package sg0;

/* loaded from: classes8.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f407785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f407786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f407788g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f407789h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f407790i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(sg0.w2 w2Var, java.lang.Long l17, java.lang.String str, boolean z17, java.util.Map map, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407785d = w2Var;
        this.f407786e = l17;
        this.f407787f = str;
        this.f407788g = z17;
        this.f407789h = map;
        this.f407790i = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sg0.q2(this.f407785d, this.f407786e, this.f407787f, this.f407788g, this.f407789h, this.f407790i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sg0.q2 q2Var = (sg0.q2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.websearch.m2 bj6 = sg0.w2.bj(this.f407785d, this.f407786e);
        if (bj6 != null) {
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("query", this.f407787f);
            lVarArr[1] = new jz5.l("addToKvHistory", java.lang.Boolean.valueOf(this.f407788g));
            java.util.Map map = this.f407789h;
            if (map == null) {
                map = new java.util.LinkedHashMap();
            }
            lVarArr[2] = new jz5.l("searchCgiParams", java.lang.String.valueOf(ri.l0.a(map)));
            bj6.a("onSearchClick", kz5.c1.k(lVarArr));
        }
        kotlinx.coroutines.z0.e(this.f407790i, null, 1, null);
        return jz5.f0.f302826a;
    }
}
