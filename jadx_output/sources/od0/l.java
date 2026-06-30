package od0;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f344555d;

    public l(byte[] bArr) {
        this.f344555d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] report turing owner task start running.");
        try {
            w04.l.INSTANCE.C2(this.f344555d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PSIR", th6, "[TuringOwner] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
