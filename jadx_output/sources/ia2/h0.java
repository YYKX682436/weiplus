package ia2;

/* loaded from: classes2.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader f289926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ia2.i0 f289927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader, ia2.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289926d = finderPoiFeedLoader;
        this.f289927e = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ia2.h0(this.f289926d, this.f289927e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ia2.h0 h0Var = (ia2.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f289926d.unregisterFetchDoneListener(this.f289927e);
        return jz5.f0.f302826a;
    }
}
