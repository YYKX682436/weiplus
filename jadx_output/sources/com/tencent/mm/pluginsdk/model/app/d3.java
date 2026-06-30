package com.tencent.mm.pluginsdk.model.app;

@j95.b
/* loaded from: classes12.dex */
public final class d3 extends i95.w implements ct.w2 {
    public void Ai(com.tencent.mm.storage.f9 msgInfo, java.lang.String fileExt, int i17, java.lang.String dataId) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        kotlin.jvm.internal.o.g(dataId, "dataId");
        v05.b bVar = new v05.b();
        java.lang.String U1 = msgInfo.U1();
        if (U1 == null) {
            U1 = "";
        }
        bVar.fromXml(U1);
        boolean z17 = !r26.n0.N(dataId);
        long j17 = 0;
        int i18 = bVar.f432315e;
        if (z17) {
            r45.gp0 n17 = bt3.g2.n(bVar.getString(i18 + 44), dataId);
            if (n17 != null) {
                j17 = n17.R;
            }
        } else {
            v05.a aVar = (v05.a) bVar.getCustom(i18 + 8);
            if (aVar != null) {
                j17 = aVar.getLong(aVar.f368364d + 0);
            }
        }
        com.tencent.mm.ui.report.o oVar = new com.tencent.mm.ui.report.o(msgInfo, fileExt, dataId, j17);
        com.tencent.mm.ui.report.j.f209673e.getClass();
        com.tencent.mm.ui.report.j jVar = (com.tencent.mm.ui.report.j) ((java.util.LinkedHashMap) com.tencent.mm.ui.report.j.f209674f).get(java.lang.Integer.valueOf(i17));
        if (jVar == null) {
            jVar = com.tencent.mm.ui.report.j.f209675g;
        }
        oVar.f209716k = jVar;
        com.tencent.mm.ui.report.d0.f209626a.d(com.tencent.mm.ui.report.p.f209722g, oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(android.content.Context r14, com.tencent.mm.storage.f9 r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.d3.Bi(android.content.Context, com.tencent.mm.storage.f9, java.lang.String, java.lang.String):boolean");
    }

    public int wi(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }
}
