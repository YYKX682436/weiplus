package od0;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f344566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f344567e;

    public o(int i17, byte[] bArr) {
        this.f344566d = i17;
        this.f344567e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] report task start running.");
        try {
            w04.l.INSTANCE.a8(this.f344566d, 1008, 0, 0, this.f344567e, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PSIR", th6, "unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
