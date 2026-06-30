package hy;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285733d;

    public e(hy.a0 a0Var) {
        this.f285733d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285733d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).R9();
        }
    }
}
