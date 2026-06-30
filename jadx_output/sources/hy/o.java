package hy;

/* loaded from: classes14.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285749d;

    public o(hy.a0 a0Var, java.lang.String str) {
        this.f285749d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285749d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).getClass();
        }
    }
}
