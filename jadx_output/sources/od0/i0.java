package od0;

/* loaded from: classes13.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.normsg.api.AudioModeStatus f344547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ od0.v f344549f;

    public i0(od0.v vVar, com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus, int i17) {
        this.f344549f = vVar;
        this.f344547d = audioModeStatus;
        this.f344548e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.network.AccInfo accInfo;
        com.tencent.mm.plugin.normsg.api.CameraStatus cameraStatus;
        od0.v vVar = this.f344549f;
        try {
            com.tencent.mm.network.g1 c17 = com.tencent.mm.network.x2.c();
            if (c17 != null && (accInfo = c17.f71993n) != null && accInfo.isLogin()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                com.tencent.mm.plugin.normsg.api.CameraStatus cameraStatus2 = ko3.a0.INSTANCE.f309934d;
                synchronized (cameraStatus2) {
                    cameraStatus = new com.tencent.mm.plugin.normsg.api.CameraStatus();
                    cameraStatus.a(cameraStatus2);
                }
                byte[] v86 = fo3.s.INSTANCE.v8(currentTimeMillis, cameraStatus, this.f344547d, vVar.f344582f, vVar.f344580d, vVar.f344581e);
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(v86);
                k57Var.f378410w = cu5Var;
                vVar.Ai(this.f344548e, k57Var.toByteArray(), false);
                vVar.f344580d.a(cameraStatus);
                com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus = vVar.f344581e;
                com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus2 = this.f344547d;
                audioModeStatus.getClass();
                audioModeStatus.f152401d = audioModeStatus2.f152401d;
                audioModeStatus.f152402e = audioModeStatus2.f152402e;
                audioModeStatus.f152403f = audioModeStatus2.f152403f;
                audioModeStatus.f152404g = audioModeStatus2.f152404g;
                vVar.f344582f = currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report cai suc");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report cai error, msg:" + th6);
        }
    }
}
