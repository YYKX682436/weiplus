package qn1;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f365000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f365001e;

    public q(qn1.t tVar, java.util.Set set, int i17) {
        this.f365000d = set;
        this.f365001e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f365000d.iterator();
        while (it.hasNext()) {
            ((rn1.a0) ((kn1.d) it.next())).a(this.f365001e);
        }
    }
}
