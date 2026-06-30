package yx0;

/* loaded from: classes5.dex */
public final class t3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f467656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(yx0.b8 b8Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467655d = b8Var;
        this.f467656e = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.t3(this.f467655d, this.f467656e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.t3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "notifyHorizontalFOV");
        pp0.p0 p0Var = this.f467655d.K;
        if (p0Var == null) {
            return null;
        }
        p0Var.u(this.f467656e);
        return jz5.f0.f302826a;
    }
}
