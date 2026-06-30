package od0;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f344536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f344538g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ od0.v f344539h;

    public e0(od0.v vVar, java.lang.String str, long j17, java.lang.String str2, int i17) {
        this.f344539h = vVar;
        this.f344535d = str;
        this.f344536e = j17;
        this.f344537f = str2;
        this.f344538g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] d17 = com.tencent.mm.normsg.WCProbe$Info.d(this.f344535d, this.f344536e, this.f344537f, this.f344538g);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "get cssi failed");
                return;
            }
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(d17);
            k57Var.f378406s = cu5Var;
            this.f344539h.Ai(540999707, k57Var.toByteArray(), false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "report cssi error: %s", th6.toString());
        }
    }
}
