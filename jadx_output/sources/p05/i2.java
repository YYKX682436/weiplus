package p05;

/* loaded from: classes.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f350550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f350550d = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new p05.i2(this.f350550d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        p05.i2 i2Var = (p05.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WaveVideoModelResMgr", "mainScope launch is MainProcess. CheckResUpdate doCheck.");
            ((ku5.t0) ku5.t0.f312615d).k(new p05.h2(this.f350550d), 5000L);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WaveVideoModelResMgr", "mainScope launch is not MainProcess!");
        }
        return jz5.f0.f302826a;
    }
}
