package x51;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public x51.r f451995a;

    /* renamed from: b, reason: collision with root package name */
    public x51.s f451996b;

    /* renamed from: c, reason: collision with root package name */
    public x51.t f451997c;

    /* renamed from: d, reason: collision with root package name */
    public x51.o f451998d;

    /* renamed from: e, reason: collision with root package name */
    public x51.p f451999e;

    /* renamed from: f, reason: collision with root package name */
    public x51.l f452000f;

    public void a() {
        b(this.f451995a);
        b(this.f451996b);
        b(this.f451997c);
        b(this.f451998d);
        b(this.f451999e);
        b(this.f452000f);
    }

    public final void b(x51.g gVar) {
        if (gVar != null) {
            java.util.Iterator it = ((java.util.HashSet) gVar.f452006d).iterator();
            while (it.hasNext()) {
                gm0.j1.d().q(((java.lang.Integer) it.next()).intValue(), gVar);
            }
            gVar.f452007e = null;
        }
    }

    public boolean c(android.app.Activity activity, x51.r1 r1Var) {
        int i17 = r1Var.f452077a;
        if (i17 == 0 || r1Var.f452078b == 0) {
            return false;
        }
        switch (i17) {
            case 1:
                if (this.f451995a == null) {
                    this.f451995a = new x51.r(activity);
                }
                this.f451995a.f(r1Var);
                return true;
            case 2:
                if (this.f451996b == null) {
                    this.f451996b = new x51.s(activity);
                }
                this.f451996b.f(r1Var);
                return true;
            case 3:
                if (this.f451997c == null) {
                    this.f451997c = new x51.t(activity);
                }
                this.f451997c.f(r1Var);
                return true;
            case 4:
                if (this.f451998d == null) {
                    this.f451998d = new x51.o(activity);
                }
                this.f451998d.f(r1Var);
                return true;
            case 5:
                if (this.f451999e == null) {
                    this.f451999e = new x51.p(activity);
                }
                this.f451999e.f(r1Var);
                return true;
            case 6:
                if (this.f452000f == null) {
                    this.f452000f = new x51.l(activity);
                }
                this.f452000f.f(r1Var);
                return true;
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseErrorHelper", "Unkown error type");
                return false;
        }
    }
}
