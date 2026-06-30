package sg0;

/* loaded from: classes8.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f407759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f407760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f407762g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(sg0.w2 w2Var, java.lang.Long l17, java.lang.String str, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407759d = w2Var;
        this.f407760e = l17;
        this.f407761f = str;
        this.f407762g = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sg0.n2(this.f407759d, this.f407760e, this.f407761f, this.f407762g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sg0.n2 n2Var = (sg0.n2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.websearch.m2 bj6 = sg0.w2.bj(this.f407759d, this.f407760e);
        if (bj6 != null) {
            bj6.a("onFinderFeedFocusChanged", kz5.b1.e(new jz5.l("exportId", this.f407761f)));
        }
        kotlinx.coroutines.z0.e(this.f407762g, null, 1, null);
        return jz5.f0.f302826a;
    }
}
