package cz0;

/* loaded from: classes5.dex */
public final class a0 extends com.tencent.mm.sdk.event.n {
    public a0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.r2 r2Var = event.f54053g;
        if (r2Var.f7759a == 103) {
            int i17 = r2Var.f7760b;
            java.lang.String str = r2Var.f7761c;
            boolean z17 = r2Var.f7763e;
            int i18 = r2Var.f7762d;
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSdkResEventListener", "get res version:" + i18 + " subtype:" + i17 + " path:" + str + " updated:" + z17);
            if (str == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MassSdkResEventListener", "download failed: path is null, subtype=" + i17 + " version=" + i18);
                com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct();
                maasSdkResStruct.f59003d = cz0.y.f224970b;
                maasSdkResStruct.f59006g = 7;
                maasSdkResStruct.f59007h = i17;
                maasSdkResStruct.f59005f = 0;
                maasSdkResStruct.f59011l = 2;
                bz0.k.a(maasSdkResStruct, false);
            } else if (z17) {
                com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct();
                int i19 = cz0.y.f224970b;
                maasSdkResStruct2.f59003d = i19;
                maasSdkResStruct2.f59006g = 7;
                maasSdkResStruct2.f59007h = i17;
                maasSdkResStruct2.f59005f = 1;
                maasSdkResStruct2.f59011l = 2;
                maasSdkResStruct2.f59009j = i18;
                com.tencent.mars.xlog.Log.i("MicroMsg.MassSdkResEventListener", "download success: subtype=" + i17 + " version=" + i18);
                maasSdkResStruct2.k();
                jz5.l j17 = cz0.y.f224969a.j(i17, str, 2);
                boolean booleanValue = ((java.lang.Boolean) j17.f302833d).booleanValue();
                cz0.k kVar = (cz0.k) j17.f302834e;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unzipRes isSuccess:");
                sb6.append(booleanValue);
                sb6.append(" SdkCompatVersion:");
                sb6.append(i19);
                sb6.append(" compatVersion:");
                sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f224949b) : null);
                sb6.append(" resVersion:");
                sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f224950c) : null);
                sb6.append(" baseVersion:");
                sb6.append(kVar != null ? java.lang.Integer.valueOf(kVar.f224951d) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MassSdkResEventListener", sb6.toString());
                if (booleanValue) {
                    if (kVar != null && kVar.f224949b == i19) {
                        i95.m c17 = i95.n0.c(zy.r.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        ((yy.a) ((zy.r) c17)).Ri(103, i17, -1);
                    }
                }
            }
        }
        return false;
    }
}
