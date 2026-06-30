package yx0;

/* loaded from: classes5.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJExposureCheckParams f467362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.g0 f467363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(yx0.b8 b8Var, com.tencent.maas.camstudio.MJExposureCheckParams mJExposureCheckParams, com.tencent.maas.camstudio.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467361d = b8Var;
        this.f467362e = mJExposureCheckParams;
        this.f467363f = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.h5(this.f467361d, this.f467362e, this.f467363f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.h5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "setExposureCheck");
        pp0.p0 p0Var = this.f467361d.K;
        if (p0Var == null) {
            return null;
        }
        p0Var.r0(this.f467362e, this.f467363f);
        return jz5.f0.f302826a;
    }
}
