package wr3;

/* loaded from: classes11.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr3.t0 f448877d;

    public s0(wr3.t0 t0Var) {
        this.f448877d = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f448877d.notifyDataSetChanged();
    }
}
