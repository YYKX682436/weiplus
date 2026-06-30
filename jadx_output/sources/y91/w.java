package y91;

/* loaded from: classes16.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y91.x f460318d;

    public w(y91.x xVar, y91.u uVar) {
        this.f460318d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            y91.x.a(this.f460318d);
        } catch (java.lang.Exception e17) {
            if (e17.getCause() != null) {
                int i17 = y91.x.f460319h;
                v91.b.a("x", e17.getCause().toString());
            }
        }
    }
}
