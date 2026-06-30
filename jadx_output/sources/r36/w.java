package r36;

/* loaded from: classes16.dex */
public class w extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f369465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.m0 f369466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r36.y f369467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r36.y yVar, java.lang.String str, java.lang.Object[] objArr, boolean z17, r36.m0 m0Var) {
        super(str, objArr);
        this.f369467g = yVar;
        this.f369465e = z17;
        this.f369466f = m0Var;
    }

    @Override // m36.b
    public void a() {
        int i17;
        r36.g0[] g0VarArr;
        long j17;
        r36.y yVar = this.f369467g;
        boolean z17 = this.f369465e;
        r36.m0 m0Var = this.f369466f;
        synchronized (yVar.f369470f.A) {
            synchronized (yVar.f369470f) {
                try {
                    int a17 = yVar.f369470f.f369489y.a();
                    if (z17) {
                        r36.m0 m0Var2 = yVar.f369470f.f369489y;
                        m0Var2.f369440a = 0;
                        java.util.Arrays.fill(m0Var2.f369441b, 0);
                    }
                    r36.m0 m0Var3 = yVar.f369470f.f369489y;
                    m0Var3.getClass();
                    for (int i18 = 0; i18 < 10; i18++) {
                        boolean z18 = true;
                        if (((1 << i18) & m0Var.f369440a) == 0) {
                            z18 = false;
                        }
                        if (z18) {
                            m0Var3.b(i18, m0Var.f369441b[i18]);
                        }
                    }
                    int a18 = yVar.f369470f.f369489y.a();
                    g0VarArr = null;
                    if (a18 == -1 || a18 == a17) {
                        j17 = 0;
                    } else {
                        j17 = a18 - a17;
                        if (!yVar.f369470f.f369473f.isEmpty()) {
                            g0VarArr = (r36.g0[]) ((java.util.LinkedHashMap) yVar.f369470f.f369473f).values().toArray(new r36.g0[yVar.f369470f.f369473f.size()]);
                        }
                    }
                } finally {
                }
            }
            try {
                r36.z zVar = yVar.f369470f;
                zVar.A.a(zVar.f369489y);
            } catch (java.io.IOException unused) {
                yVar.f369470f.b();
            }
        }
        if (g0VarArr != null) {
            for (r36.g0 g0Var : g0VarArr) {
                synchronized (g0Var) {
                    g0Var.f369396b += j17;
                    if (j17 > 0) {
                        g0Var.notifyAll();
                    }
                }
            }
        }
        ((java.util.concurrent.ThreadPoolExecutor) r36.z.D).execute(new r36.x(yVar, "OkHttp %s settings", yVar.f369470f.f369474g));
    }
}
