package oy1;

/* loaded from: classes13.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final oy1.p0 f349917d = new oy1.p0();

    @Override // java.lang.Runnable
    public final void run() {
        qy1.g gVar = qy1.g.f367725a;
        r45.rv e17 = gVar.e(16);
        if (e17 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - e17.f385222e;
            if (currentTimeMillis > 86400000) {
                e17.f385222e = java.lang.System.currentTimeMillis();
                gVar.n(16, e17);
                oy1.q0 q0Var = oy1.q0.f349919d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                oy1.n nVar = new oy1.n(16, false);
                nVar.f349900f = 2;
                nVar.f349906o = "live_notify_get_config";
                nVar.f349901g = "live_notify_get_config";
                arrayList.add(nVar);
                q0Var.e(16, arrayList, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "bizId = 16 start get config time " + currentTimeMillis + '!');
            }
        }
    }
}
