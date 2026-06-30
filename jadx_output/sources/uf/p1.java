package uf;

/* loaded from: classes7.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f427088d;

    public p1(uf.c2 c2Var) {
        this.f427088d = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uf.c2 c2Var = this.f427088d;
        if (c2Var.e() && c2Var.f426997g != null) {
            uf.v1 v1Var = c2Var.f427000m;
            if (v1Var != null) {
                v1Var.notifyDataSetChanged();
            } else {
                kotlin.jvm.internal.o.o("recycleViewAdapter");
                throw null;
            }
        }
    }
}
