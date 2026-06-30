package nu0;

/* loaded from: classes5.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f339893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(nu0.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339893d = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.c0(this.f339893d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = this.f339893d.f340075r;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (mJImageSession == null) {
            return f0Var;
        }
        try {
            mJImageSession.q(null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("ImageControlUIC", "release - unbindRenderView failed:" + e17.getMessage(), e17);
        }
        try {
            mJImageSession.j();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("ImageControlUIC", "release - failed:" + e18.getMessage(), e18);
        }
        this.f339893d.f340075r = null;
        return f0Var;
    }
}
