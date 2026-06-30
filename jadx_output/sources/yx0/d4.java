package yx0;

/* loaded from: classes5.dex */
public final class d4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467248e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.d4(this.f467248e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.d4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Boolean bool;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467247d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bool = null;
            if (this.f467248e.f467192s == yx0.v.f467700n) {
                kotlinx.coroutines.l.f(null, new yx0.c4(this.f467248e, null), 1, null);
            }
            if (this.f467248e.f467192s != yx0.v.f467695f && this.f467248e.f467192s != yx0.v.f467699m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "pauseMusic >> but state is " + this.f467248e.f467192s);
                return f0Var;
            }
            pp0.p0 p0Var = this.f467248e.K;
            if (p0Var != null) {
                this.f467247d = 1;
                obj = p0Var.H(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "pauseMusic >> " + bool);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "pauseMusic >> " + bool);
        return f0Var;
    }
}
