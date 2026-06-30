package ne4;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne4.g f336550d;

    public e(ne4.g gVar) {
        this.f336550d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        this.f336550d.f336551d.getClass();
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMdd");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String format = simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis()));
        if (com.tencent.mm.sdk.platformtools.t8.K0(ne4.h.f336552e)) {
            o4Var = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
            ne4.h.f336552e = o4Var.getString("MMKV_KEY_SOTER_REPORT_SRV_DATE", "");
        } else {
            o4Var = null;
        }
        if (format.equals(ne4.h.f336552e)) {
            return;
        }
        if (o4Var == null) {
            o4Var = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
        }
        o4Var.putString("MMKV_KEY_SOTER_REPORT_SRV_DATE", format);
        java.lang.String str = "isSupport:" + wo.v1.f447828h.f447811b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" forceFingerStatus:");
        wo.z0 z0Var = wo.v1.f447826f;
        sb6.append(z0Var.f447867a);
        java.lang.String str2 = (sb6.toString() + " allowExternal:" + z0Var.f447868b) + " fingerType:" + ((vc.s) ((wc.o) i95.n0.c(wc.o.class))).wi();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "8", "1", java.lang.String.valueOf(300), str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginSoter", "reportSrvConfig msg:%s", str2);
    }
}
