package qn1;

/* loaded from: classes12.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f365028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f365029e;

    public z(qn1.b0 b0Var, java.util.Set set, int i17) {
        this.f365028d = set;
        this.f365029e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = this.f365028d.iterator();
        while (it.hasNext()) {
            ((rn1.a0) ((kn1.d) it.next())).a(this.f365029e);
        }
    }
}
