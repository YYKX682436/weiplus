package n83;

/* loaded from: classes4.dex */
public class w implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("WCONotifyListener", "WCONotify onRecieveMsg");
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        if (g17 == null || g17.length() == 0) {
            com.tencent.mars.xlog.Log.e("WCONotifyListener", "WCONotify onReceiveMsg, msgContent is null");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("WCONotifyListener", "WCONotify onReceiveMsg, values is null");
            return;
        }
        if (d17.containsKey(".sysmsg.WCONotify.NotifyGetBalance")) {
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.WCONotify.NotifyGetBalance"), 0);
            com.tencent.mars.xlog.Log.i("WCONotifyListener", "WCONotify NotifyGetBalance: %d", java.lang.Integer.valueOf(P));
            if (P > 0) {
                c01.d9.e().g(new p83.g(2));
            }
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
