package nu0;

/* loaded from: classes5.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au0.b f340154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b1 f340155e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(au0.b bVar, nu0.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340154d = bVar;
        this.f340155e = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.z0(this.f340154d, this.f340155e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nu0.z0 z0Var = (nu0.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String value = this.f340154d.c().value();
        kotlin.jvm.internal.o.f(value, "value(...)");
        bu0.b b17 = this.f340154d.b();
        this.f340155e.Y6().e();
        com.tencent.maas.base.Vec2 b76 = this.f340155e.b7();
        cv0.e a76 = this.f340155e.W6().a7(b17);
        java.util.List f17 = cv0.h.f(this.f340155e.getContext(), b17, a76, b76);
        java.util.List Z6 = this.f340155e.Z6(b17);
        com.tencent.maas.model.MJEdgeInsets g17 = cv0.h.g(this.f340155e.getContext());
        com.tencent.maas.handlebox.model.MJHandleBoxBorderStyle e17 = cv0.h.e(this.f340155e.getContext());
        nu0.q0 q76 = this.f340155e.q7();
        q76.getClass();
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = q76.f340075r;
        if (mJImageSession != null) {
            mJImageSession.m(value, f17, Z6, g17, e17);
        }
        com.tencent.maas.imagestudio.MJImageSession mJImageSession2 = q76.f340075r;
        if (mJImageSession2 != null) {
            mJImageSession2.e();
        }
        com.tencent.mars.xlog.Log.i("ImageControlUIC", "[showBoxItem] enableHandleBox");
        a76.toString();
        return jz5.f0.f302826a;
    }
}
