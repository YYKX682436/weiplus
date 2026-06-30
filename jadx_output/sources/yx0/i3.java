package yx0;

/* loaded from: classes5.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(yx0.b8 b8Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467377e = b8Var;
        this.f467378f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.i3(this.f467377e, this.f467378f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Boolean bool;
        pp0.p0 p0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467376d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.f467377e.f467192s != yx0.v.f467695f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "clearMusic >> but state is " + this.f467377e.f467192s);
                return null;
            }
            pp0.p0 p0Var2 = this.f467377e.K;
            if (p0Var2 == null) {
                bool = null;
                if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) && (p0Var = this.f467377e.K) != null) {
                    return p0Var.P(this.f467378f);
                }
            }
            java.lang.String str = this.f467378f;
            yx0.h3 h3Var = yx0.h3.f467358a;
            this.f467376d = 1;
            obj = p0Var2.D(str, h3Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bool = (java.lang.Boolean) obj;
        return !kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) ? null : null;
    }
}
