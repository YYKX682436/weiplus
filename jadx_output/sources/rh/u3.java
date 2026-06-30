package rh;

/* loaded from: classes12.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f395515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f395516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rh.x3 f395517f;

    public u3(rh.x3 x3Var, android.os.Handler handler, long j17) {
        this.f395517f = x3Var;
        this.f395515d = handler;
        this.f395516e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        rh.x3 x3Var = this.f395517f;
        int i17 = x3Var.f395555c + 1;
        x3Var.f395555c = i17;
        rh.v3 v3Var = x3Var.f395557e;
        if (v3Var != null) {
            rh.w3 w3Var = x3Var.f395554b;
            rh.p3 p3Var = (rh.p3) v3Var;
            rh.q3 q3Var = p3Var.f395494b;
            q3Var.f395499a.f395294a.h(i17, w3Var);
            rh.x3 x3Var2 = p3Var.f395493a;
            if (x3Var2.f395555c >= 30) {
                rh.z3 z3Var = q3Var.f395499a;
                x3Var2.a(z3Var.f395294a.f363337f);
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) z3Var.f395575c).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((java.util.Map.Entry) it.next()).getValue() == x3Var2) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        int i18 = x3Var.f395555c;
        x3Var.getClass();
        if (i18 < 30) {
            this.f395515d.postDelayed(this, this.f395516e);
        }
    }
}
