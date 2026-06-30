package ix3;

/* loaded from: classes3.dex */
public final class e4 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j2 f295398d;

    public e4(kotlinx.coroutines.flow.j2 j2Var) {
        this.f295398d = j2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("RepairerUicStateDemo", java.lang.String.valueOf((java.lang.String) obj));
        com.tencent.mars.xlog.Log.i("RepairerUicStateDemo", java.lang.String.valueOf(((kotlinx.coroutines.flow.h3) this.f295398d).getValue()));
        return jz5.f0.f302826a;
    }
}
