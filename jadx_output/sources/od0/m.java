package od0;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f344558d;

    public m(int i17) {
        this.f344558d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] report finder task start running.");
        try {
            w04.l.INSTANCE.xg(this.f344558d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PSIR", th6, "[finder] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
