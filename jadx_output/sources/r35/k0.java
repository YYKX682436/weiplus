package r35;

/* loaded from: classes15.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f369152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r35.m0 f369153e;

    public k0(r35.m0 m0Var, q11.b bVar) {
        this.f369153e = m0Var;
        this.f369152d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r35.m0 m0Var = this.f369153e;
        m0Var.f369187h = currentTimeMillis;
        r35.q3 q3Var = m0Var.f369183d;
        if (q3Var != null) {
            q3Var.onFinish();
            m0Var.f369183d = null;
        }
        if (r35.y.f369326a.a(m0Var.f369184e) && this.f369152d.f359532b == 2) {
            r35.x xVar = r35.x.f369320a;
            xVar.d(m0Var.f369185f, true, m0Var.f369187h - m0Var.f369186g);
            xVar.c(m0Var.f369185f, true);
        }
    }
}
