package ha3;

/* loaded from: classes15.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.d0 f279797d;

    public a0(ha3.d0 d0Var) {
        this.f279797d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk4.c cVar = this.f279797d.f279815e;
        if (cVar != null) {
            ((kk4.f0) cVar).prepareAsync();
        }
    }
}
