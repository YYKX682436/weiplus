package yx0;

/* loaded from: classes5.dex */
public final class b7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.b3 f467169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(nx0.b3 b3Var, yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467169d = b3Var;
        this.f467170e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.b7(this.f467169d, this.f467170e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.b7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        nx0.b3 b3Var = this.f467169d;
        b3Var.getClass();
        boolean z17 = b3Var == nx0.b3.f341074g;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> clearMakeup");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> " + this.f467169d.f341075a);
        }
        int ordinal = this.f467170e.f467192s.ordinal();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (ordinal != 2) {
            switch (ordinal) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "clearMakeup >> but state is " + this.f467170e.f467192s);
                    return f0Var;
            }
        }
        if (this.f467170e.f467192s != yx0.v.f467695f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> but state is " + this.f467170e.f467192s);
            return f0Var;
        }
        pp0.p0 p0Var = this.f467170e.K;
        if (p0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMakeup >> but setup is error");
            return f0Var;
        }
        if (z17) {
            kotlinx.coroutines.l.f(null, new yx0.y6(this.f467170e, p0Var, null), 1, null);
        } else {
            this.f467170e.q0(yx0.v.f467703q);
            yx0.b8 b8Var = this.f467170e;
            kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.z6(b8Var, p0Var, this.f467169d, null), 3, null);
            ((kotlinx.coroutines.c3) d17).p(new yx0.a7(this.f467170e));
            b8Var.f467194u = d17;
        }
        return f0Var;
    }
}
