package o30;

/* loaded from: classes9.dex */
public class d implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        h62.d vj6 = h62.d.vj();
        vj6.getClass();
        if (!"expt".equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExptService.Write", "receive expt xml but subtype[%s] is error", str);
        } else if (map == null || map.size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExptService.Write", "receive expt xml but map is null");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.content");
            boolean z17 = false;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExptService.Write", "receive expt xml but content is null");
            } else {
                j62.a aVar = new j62.a();
                if (aVar.a(str2) && aVar.f297887o == 1 && aVar.f297879d > 0) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    if (aVar.f297881f < 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(863L, 164L, 1L);
                        linkedList.add(java.lang.Integer.valueOf(aVar.f297879d));
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(863L, 165L, 1L);
                        linkedList2.add(aVar);
                    }
                    vj6.Jj(0, linkedList, linkedList2);
                    vj6.Cj(false);
                    vj6.Dj(null, aVar);
                    z17 = true;
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ExptService.Write", "consumeNewXml xml [%s] ", str2);
            } else {
                vj6.yj(str2);
            }
        }
        return null;
    }
}
