package eb2;

/* loaded from: classes2.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u26.w f250842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f250843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u26.w wVar, com.tencent.mm.modelbase.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f250842d = wVar;
        this.f250843e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eb2.r(this.f250842d, this.f250843e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        eb2.r rVar = (eb2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.w("Finder.EnhanceStreamFetcher", "send...");
        com.tencent.mm.modelbase.f it = this.f250843e;
        kotlin.jvm.internal.o.f(it, "$it");
        java.lang.Object e17 = this.f250842d.e(it);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("done[");
        sb6.append(!(e17 instanceof u26.b0));
        sb6.append(']');
        com.tencent.mars.xlog.Log.w("Finder.EnhanceStreamFetcher", sb6.toString());
        return jz5.f0.f302826a;
    }
}
