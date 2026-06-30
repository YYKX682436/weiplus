package od0;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f344552e;

    public k(java.lang.String str, byte[] bArr) {
        this.f344551d = str;
        this.f344552e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] report sensor scene info task start running.");
        try {
            w04.l.INSTANCE.kd(this.f344551d, this.f344552e);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PSIR", th6, "[sensor] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
