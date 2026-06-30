package iu1;

/* loaded from: classes9.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu1.r1 f294934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f294935e;

    public p1(iu1.r1 r1Var, yz5.a aVar) {
        this.f294934d = r1Var;
        this.f294935e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iu1.r1 r1Var = this.f294934d;
        r1Var.f294944d = r1Var.itemView.getHeight();
        r1Var.f294945e = r1Var.itemView.getWidth();
        this.f294935e.invoke();
    }
}
