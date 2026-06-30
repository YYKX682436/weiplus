package od0;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f344593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ od0.v f344595g;

    public x(od0.v vVar, java.lang.String str, boolean z17, int i17) {
        this.f344595g = vVar;
        this.f344592d = str;
        this.f344593e = z17;
        this.f344594f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            fo3.s sVar = fo3.s.INSTANCE;
            byte[] Ci = sVar.Ci(this.f344592d);
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(Ci);
            k57Var.f378395e = cu5Var;
            if (this.f344593e) {
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(sVar.h());
                k57Var.f378396f = cu5Var2;
            }
            this.f344595g.Ai(this.f344594f, k57Var.toByteArray(), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report ci suc");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report ci error, msg:" + th6);
        }
    }
}
