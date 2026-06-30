package vp;

/* loaded from: classes14.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f438816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wp.a f438817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(vp.v0 v0Var, wp.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438816d = v0Var;
        this.f438817e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp.n0(this.f438816d, this.f438817e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f438816d.f438851m;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            return f0Var;
        }
        java.lang.Object obj2 = this.f438816d.f438845g;
        if (obj2 == null) {
            kotlin.jvm.internal.o.o("taskChannel");
            throw null;
        }
        java.lang.Object e17 = ((u26.o) obj2).e(new vp.k0(this.f438817e));
        if (e17 instanceof u26.b0) {
            com.tencent.mars.xlog.Log.i("DanmakuAsyncDataSource", "addDanmakuToDrawListAsync: trySend failed, result=" + ((java.lang.Object) u26.c0.c(e17)));
        }
        return f0Var;
    }
}
