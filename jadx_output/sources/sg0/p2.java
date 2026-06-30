package sg0;

/* loaded from: classes8.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f407776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f407777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407779g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f407780h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(sg0.w2 w2Var, java.lang.Long l17, java.lang.String str, java.lang.String str2, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407776d = w2Var;
        this.f407777e = l17;
        this.f407778f = str;
        this.f407779g = str2;
        this.f407780h = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sg0.p2(this.f407776d, this.f407777e, this.f407778f, this.f407779g, this.f407780h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sg0.p2 p2Var = (sg0.p2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.websearch.m2 bj6 = sg0.w2.bj(this.f407776d, this.f407777e);
        if (bj6 != null) {
            bj6.a("onInputChanged", kz5.c1.k(new jz5.l("totalText", this.f407778f), new jz5.l("inEditText", this.f407779g)));
        }
        kotlinx.coroutines.z0.e(this.f407780h, null, 1, null);
        return jz5.f0.f302826a;
    }
}
