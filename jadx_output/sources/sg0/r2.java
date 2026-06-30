package sg0;

/* loaded from: classes8.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f407796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f407797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f407798f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(sg0.w2 w2Var, java.lang.Long l17, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407796d = w2Var;
        this.f407797e = l17;
        this.f407798f = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sg0.r2(this.f407796d, this.f407797e, this.f407798f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sg0.r2 r2Var = (sg0.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.websearch.m2 bj6 = sg0.w2.bj(this.f407796d, this.f407797e);
        if (bj6 != null) {
            bj6.a("onUserToggleFullScreen", null);
        }
        kotlinx.coroutines.z0.e(this.f407798f, null, 1, null);
        return jz5.f0.f302826a;
    }
}
