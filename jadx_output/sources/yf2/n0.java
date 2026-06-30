package yf2;

/* loaded from: classes10.dex */
public final class n0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.s0 f461754d;

    public n0(yf2.s0 s0Var) {
        this.f461754d = s0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.n73 n73Var = (r45.n73) obj;
        if (n73Var != null) {
            com.tencent.mars.xlog.Log.i("FinderStartLivePostLicenseWidget", "gameAppInfo changed: " + n73Var);
            yf2.s0.Z6(this.f461754d);
        }
        return jz5.f0.f302826a;
    }
}
