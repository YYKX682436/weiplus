package it4;

/* loaded from: classes.dex */
public class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String[] split;
        com.tencent.mm.autogen.events.ECardJsApiCheckEvent eCardJsApiCheckEvent = (com.tencent.mm.autogen.events.ECardJsApiCheckEvent) iEvent;
        ht4.g gVar = (ht4.g) i95.n0.c(ht4.g.class);
        gVar.getClass();
        am.i4 i4Var = eCardJsApiCheckEvent.f54096g;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i4Var.f6903d) && (split = i4Var.f6903d.split("&")) != null && split.length > 0) {
            for (int i17 = 0; i17 < split.length; i17++) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(split[i17])) {
                    java.lang.String[] split2 = split[i17].split("=");
                    if (split2.length == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(split2[0])) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
        }
        java.lang.String str = (java.lang.String) hashMap.get("extradata");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreECard", "start openECard, extraData: %s, packageExt: %s", str, hashMap);
        ss4.d dVar = new ss4.d(i4Var.f6900a, i4Var.f6901b, i4Var.f6902c, i4Var.f6903d, i4Var.f6905f, i4Var.f6904e, i4Var.f6906g, 15, "openECard", i4Var.f6912m);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(580, new ht4.e(gVar, i4Var, eCardJsApiCheckEvent, str));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(dVar);
        return false;
    }
}
