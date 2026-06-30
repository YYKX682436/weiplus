package od0;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PSIR", "[+] report yap task start running.");
        try {
            w04.l.INSTANCE.Q3();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PSIR", th6, "[yap] unexpected exception was thrown.", new java.lang.Object[0]);
        }
    }
}
