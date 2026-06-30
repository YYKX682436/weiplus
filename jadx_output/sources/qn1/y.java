package qn1;

/* loaded from: classes12.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f365027d;

    public y(qn1.c0 c0Var, java.util.Set set) {
        this.f365027d = set;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f365027d.iterator();
        while (it.hasNext()) {
            ((rn1.a0) ((kn1.d) it.next())).b();
        }
    }
}
