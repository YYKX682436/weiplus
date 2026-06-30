package uf;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f427086d;

    public p(uf.o0 o0Var) {
        this.f427086d = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uf.c2 c2Var = this.f427086d.f427063f;
        if (c2Var != null) {
            if (c2Var != null) {
                c2Var.f();
            } else {
                kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
                throw null;
            }
        }
    }
}
