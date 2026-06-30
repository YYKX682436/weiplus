package rj1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrj1/h;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/tipsmsg/TipsIPCData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData tipsIPCData = (com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData) obj;
        if (tipsIPCData == null) {
            return;
        }
        boolean z17 = tipsIPCData.f89232e;
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo = tipsIPCData.f89231d;
        if (z17) {
            rj1.n nVar = (rj1.n) com.tencent.mm.plugin.appbrand.app.r9.fj(rj1.n.class);
            if (nVar != null) {
                nVar.y0(tipsMsgInfo);
                return;
            }
            return;
        }
        rj1.n nVar2 = (rj1.n) com.tencent.mm.plugin.appbrand.app.r9.fj(rj1.n.class);
        if (nVar2 != null) {
            nVar2.z0(tipsMsgInfo);
        }
    }
}
