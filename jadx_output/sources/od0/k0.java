package od0;

/* loaded from: classes13.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f344553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od0.v f344554e;

    public k0(od0.v vVar, byte[] bArr) {
        this.f344554e = vVar;
        this.f344553d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.network.AccInfo accInfo;
        try {
            com.tencent.mm.network.g1 c17 = com.tencent.mm.network.x2.c();
            if (c17 != null && (accInfo = c17.f71993n) != null && accInfo.isLogin()) {
                byte[] bArr = this.f344553d;
                if (bArr == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "ari is null");
                    return;
                }
                byte[] u37 = fo3.s.INSTANCE.u3(bArr);
                if (u37 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "niarifo is null");
                    return;
                }
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(u37);
                k57Var.f378411x = cu5Var;
                this.f344554e.Ai(540999714, k57Var.toByteArray(), false);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "[+] report niarifo error: " + th6);
        }
    }
}
