package yl2;

/* loaded from: classes3.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f463053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f463054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f463053d = hVar;
        this.f463054e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yl2.o0(this.f463053d, continuation, this.f463054e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yl2.o0 o0Var = (yl2.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.be2 be2Var = (r45.be2) ((xg2.i) this.f463053d).f454393b;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "liveVerify success, isVerified=" + be2Var.getBoolean(1));
        boolean z17 = be2Var.getBoolean(1);
        kotlin.jvm.internal.h0 h0Var = this.f463054e;
        if (z17) {
            h0Var.f310123d = new yl2.r();
        } else {
            h0Var.f310123d = new yl2.q(be2Var);
        }
        return jz5.f0.f302826a;
    }
}
