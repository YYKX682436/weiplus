package vd2;

/* loaded from: classes3.dex */
public final class p3 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435854a;

    public p3(vd2.g5 g5Var) {
        this.f435854a = g5Var;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        vd2.g5 g5Var = this.f435854a;
        if (g5Var != null) {
            g5Var.a(java.lang.Boolean.valueOf(i17 != 2));
        }
    }
}
