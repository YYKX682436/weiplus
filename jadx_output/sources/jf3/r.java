package jf3;

/* loaded from: classes5.dex */
public final class r implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String j17;
        com.tencent.mars.xlog.Log.i("MassSendTipNewXmlConsumer", "consumeNewXml start!!");
        if (map == null) {
            com.tencent.mars.xlog.Log.i("MassSendTipNewXmlConsumer", "values is null");
            return null;
        }
        if (!c01.z1.x()) {
            com.tencent.mars.xlog.Log.i("MassSendTipNewXmlConsumer", "is not ExDeviceEnv");
            return null;
        }
        q15.b bVar = new q15.b();
        bVar.fromXmlMap(map);
        q15.c j18 = bVar.j();
        if (j18 == null || (j17 = j18.j()) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("masMsgId");
            q15.c j19 = bVar.j();
            sb6.append(j19 != null ? j19.j() : null);
            com.tencent.mars.xlog.Log.i("MassSendTipNewXmlConsumer", sb6.toString());
        } else {
            long c17 = com.tencent.mm.sdk.platformtools.b8.c(j17);
            java.util.LinkedList<q15.d> k17 = bVar.k();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
            for (q15.d dVar : k17) {
                java.lang.String talker = dVar.getTalker();
                if (talker == null) {
                    talker = "";
                }
                java.lang.String j27 = dVar.j();
                arrayList.add(new jz5.l(talker, java.lang.Long.valueOf(j27 != null ? com.tencent.mm.sdk.platformtools.b8.c(j27) : 0L)));
            }
            java.util.Map q17 = kz5.c1.q(arrayList);
            com.tencent.mars.xlog.Log.i("MassSysTipHelper", "insertSysTip talkerMap:" + q17 + ", masMsgId:" + c17);
            ((ku5.t0) ku5.t0.f312615d).g(new if3.d0(q17, c17));
        }
        com.tencent.mars.xlog.Log.i("MassSendTipNewXmlConsumer", "consumeNewXml success!!");
        return null;
    }
}
