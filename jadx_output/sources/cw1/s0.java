package cw1;

/* loaded from: classes12.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.t0 f223300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f223301e;

    public s0(cw1.t0 t0Var, java.util.ArrayList arrayList) {
        this.f223300d = t0Var;
        this.f223301e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.t0 t0Var = this.f223300d;
        t0Var.f223324d = this.f223301e;
        t0Var.notifyDataSetChanged();
        t0Var.f223326f.invoke();
    }
}
