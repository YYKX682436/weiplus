package xn2;

/* loaded from: classes2.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f455510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xg2.h hVar, kotlin.coroutines.Continuation continuation, xn2.p0 p0Var) {
        super(2, continuation);
        this.f455510d = hVar;
        this.f455511e = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xn2.i(this.f455510d, continuation, this.f455511e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xn2.i iVar = (xn2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f455510d).f454381b;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xn2.p0 p0Var = this.f455511e;
        p0Var.f455564v = currentTimeMillis;
        com.tencent.mars.xlog.Log.i(p0Var.f455545c, "mega_verify CgiFeedSafeCheckNew fail: %s", java.lang.String.valueOf(aVar2.f454379a));
        return jz5.f0.f302826a;
    }
}
