package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes11.dex */
public class z implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI f175343a;

    public z(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI) {
        this.f175343a = networkDiagnoseUI;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        if (sVar == null) {
            return;
        }
        jn4.m mVar = new jn4.m(c01.z1.r());
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI = this.f175343a;
        networkDiagnoseUI.f175313f = mVar;
        networkDiagnoseUI.f175313f.b(sVar.e1(true), true);
        networkDiagnoseUI.f175313f.b(sVar.e1(false), false);
        jn4.m mVar2 = networkDiagnoseUI.f175313f;
        mVar2.f300821f = new com.tencent.mm.plugin.traceroute.ui.v(this);
        mVar2.f300820e = new com.tencent.mm.plugin.traceroute.ui.w(this);
        mVar2.f300823h = new com.tencent.mm.plugin.traceroute.ui.x(this);
        mVar2.f300822g = new com.tencent.mm.plugin.traceroute.ui.y(this);
        java.util.Map map = mVar2.f300818c;
        if (map == null || ((java.util.HashMap) map).size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "no iplist");
        } else {
            if (jn4.m.f300815j == null) {
                jn4.m.f300815j = new jn4.p();
            }
            s75.d.b(new jn4.l(mVar2, null), "MMTraceRoute_start");
        }
        networkDiagnoseUI.f175316i.c(1200L, 1200L);
    }
}
