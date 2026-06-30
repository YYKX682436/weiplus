package hy;

/* loaded from: classes14.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f285757e;

    public s(hy.a0 a0Var, int i17) {
        this.f285756d = a0Var;
        this.f285757e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285756d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).Qc(this.f285757e);
        }
    }
}
