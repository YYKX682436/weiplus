package hw2;

/* loaded from: classes10.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.e0 f285511d;

    public d0(hw2.e0 e0Var) {
        this.f285511d = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hw2.e0 e0Var = this.f285511d;
        java.util.Iterator it = e0Var.f285525d.iterator();
        while (it.hasNext()) {
            dw3.c0.f244182a.A((java.lang.String) it.next());
        }
        e0Var.f285525d.clear();
    }
}
