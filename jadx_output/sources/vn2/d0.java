package vn2;

/* loaded from: classes2.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f438251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f438252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f438253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym5.q1 f438254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438255h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(xg2.h hVar, kotlin.coroutines.Continuation continuation, jz5.l lVar, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, ym5.q1 q1Var, java.lang.String str) {
        super(2, continuation);
        this.f438251d = hVar;
        this.f438252e = lVar;
        this.f438253f = baseFeedLoader;
        this.f438254g = q1Var;
        this.f438255h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.d0(this.f438251d, continuation, this.f438252e, this.f438253f, this.f438254g, this.f438255h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vn2.d0 d0Var = (vn2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pm0.v.X(new vn2.a0(this.f438252e, this.f438253f, this.f438254g, this.f438255h));
        return jz5.f0.f302826a;
    }
}
