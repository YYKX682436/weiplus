package od0;

/* loaded from: classes13.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od0.v f344557e;

    public l0(od0.v vVar, java.lang.String str) {
        this.f344557e = vVar;
        this.f344556d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] a27 = fo3.s.INSTANCE.a2(this.f344556d);
            if (a27 != null && a27.length != 0) {
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(a27);
                k57Var.A = cu5Var;
                this.f344557e.Ai(540999717, k57Var.toByteArray(), false);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "pouissi is null");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[+] report pouissi error: " + th6);
        }
    }
}
