package hy;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f285732d;

    public d(hy.a0 a0Var, java.util.ArrayList arrayList) {
        this.f285732d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f285732d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).getClass();
        }
    }
}
