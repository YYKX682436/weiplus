package sj;

/* loaded from: classes11.dex */
public final class b implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "consumeNewXml start!!");
        if (map == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "values is null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "consumeNewXml start!!: ".concat(kz5.n0.g0(map.entrySet(), null, null, null, 0, null, sj.a.f408331d, 31, null)));
        q15.a aVar = new q15.a();
        aVar.fromXmlMap(map);
        if (!ot5.h.f348877a.a(aVar.l(), wo.w0.k(), "MicroMsg.AccStrikeNewXmlConsumer", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "consumeNewXml err!! deviceId check fail");
            return null;
        }
        ((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).onReceiveStrikeMsg(aVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AccStrikeNewXmlConsumer", "consumeNewXml success!!");
        return null;
    }
}
