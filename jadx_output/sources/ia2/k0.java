package ia2;

/* loaded from: classes2.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f289937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ia2.l0 f289938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ia2.n0 f289939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlin.jvm.internal.h0 h0Var, ia2.l0 l0Var, ia2.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289937d = h0Var;
        this.f289938e = l0Var;
        this.f289939f = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ia2.k0(this.f289937d, this.f289938e, this.f289939f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ia2.k0 k0Var = (ia2.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.internal.h0 h0Var = this.f289937d;
        ((com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) h0Var.f310123d).unregisterFetchDoneListener(this.f289938e);
        ((com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) h0Var.f310123d).registerFetchDoneListener(this.f289939f.f289968v);
        return jz5.f0.f302826a;
    }
}
