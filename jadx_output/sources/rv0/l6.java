package rv0;

/* loaded from: classes5.dex */
public final class l6 implements jx0.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400104a;

    public l6(rv0.z6 z6Var) {
        this.f400104a = z6Var;
    }

    @Override // jx0.h0
    public void a(com.tencent.maas.model.time.MJTime seekTime) {
        kotlin.jvm.internal.o.g(seekTime, "seekTime");
    }

    @Override // jx0.h0
    public java.lang.Object b(kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    @Override // jx0.h0
    public java.lang.Object c(boolean z17, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r2 r2Var = this.f400104a.A;
        boolean z18 = true;
        if (r2Var != null) {
            if (!((r2Var == null || r2Var.A()) ? false : true)) {
                z18 = false;
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
