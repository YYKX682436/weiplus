package yt3;

/* loaded from: classes10.dex */
public final class s2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.z2 f465666d;

    public s2(yt3.z2 z2Var) {
        this.f465666d = z2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        boolean z17 = cVar.f475588b;
        yt3.z2 z2Var = this.f465666d;
        if (!z17) {
            z2Var.f465740g.g(1, 0);
            return;
        }
        android.os.Bundle bundle = cVar.f475589c;
        if (bundle != null) {
            z2Var.f465740g.g(3, bundle.getInt("PARAM_1_INT"));
        }
    }
}
