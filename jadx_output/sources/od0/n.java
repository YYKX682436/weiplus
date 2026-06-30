package od0;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f344561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f344563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f344564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344565h;

    public n(int i17, java.lang.String str, long j17, int i18, java.lang.String str2) {
        this.f344561d = i17;
        this.f344562e = str;
        this.f344563f = j17;
        this.f344564g = i18;
        this.f344565h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] report sre start running.");
        try {
            w04.l.INSTANCE.k4(this.f344561d, this.f344562e, this.f344563f, this.f344564g, this.f344565h);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PSIR", th6, "[sre] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
