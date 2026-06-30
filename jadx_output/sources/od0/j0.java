package od0;

/* loaded from: classes13.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od0.v f344550d;

    public j0(od0.v vVar) {
        this.f344550d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            fo3.s sVar = fo3.s.INSTANCE;
            byte[] Ci = sVar.Ci("ce_pp");
            if (Ci == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] pci is null");
                return;
            }
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(Ci);
            k57Var.f378395e = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.h());
            k57Var.f378396f = cu5Var2;
            this.f344550d.Ai(540999713, k57Var.toByteArray(), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report pci suc");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report pci error, msg:" + th6);
        }
    }
}
