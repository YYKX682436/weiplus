package yx0;

/* loaded from: classes5.dex */
public final class w4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467741e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.w4(this.f467741e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.w4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Boolean bool;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467740d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bool = null;
            if (this.f467741e.f467192s == yx0.v.f467700n) {
                kotlinx.coroutines.l.f(null, new yx0.v4(this.f467741e, null), 1, null);
            }
            if (this.f467741e.f467192s != yx0.v.f467695f && this.f467741e.f467192s != yx0.v.f467699m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "resumeMusic >> but state is " + this.f467741e.f467192s);
                return f0Var;
            }
            pp0.p0 p0Var = this.f467741e.K;
            if (p0Var != null) {
                this.f467740d = 1;
                obj = p0Var.j0(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "resumeMusic >> " + bool);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "resumeMusic >> " + bool);
        return f0Var;
    }
}
