package r01;

/* loaded from: classes7.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f368247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f368248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f368249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(yz5.p pVar, com.tencent.wechat.mm.biz.b bVar, com.tencent.wechat.mm.biz.b bVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f368247d = pVar;
        this.f368248e = bVar;
        this.f368249f = bVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new r01.t0(this.f368247d, this.f368248e, this.f368249f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r01.t0 t0Var = (r01.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f368247d.invoke(this.f368248e, this.f368249f);
        return jz5.f0.f302826a;
    }
}
