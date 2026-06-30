package com.tencent.mm.pluginsdk.model;

/* loaded from: classes9.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.model.z1 f189507a = new com.tencent.mm.pluginsdk.model.z1();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f189508b;

    static {
        f189508b = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavCheckCdnFixSwitch()) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.storage.f9 r8, r45.gp0 r9) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.z1.a(com.tencent.mm.storage.f9, r45.gp0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.storage.f9 r8, r45.gp0 r9) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.z1.b(com.tencent.mm.storage.f9, r45.gp0):void");
    }

    public final void c(com.tencent.mm.storage.f9 f9Var, r45.gp0 dataItem) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        if (f189508b && f9Var != null) {
            java.lang.String str = dataItem.V;
            if (!com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FillFavMsgHelper", "fillFavVoice data not exist:" + str);
            }
            java.lang.String r17 = c01.w9.r(f9Var.S1());
            if (r17 == null) {
                return;
            }
            z15.b bVar = new z15.b();
            bVar.fromXml(r17);
            dataItem.b0(bVar.n());
            dataItem.a0(bVar.getAeskey());
            com.tencent.mars.xlog.Log.i("MicroMsg.FillFavMsgHelper", "fillFavVoice, dataItem tpthumburl:" + dataItem.f375405d2 + ", tpdataurl:" + dataItem.f375411g2 + ", cdnDataUrl:" + dataItem.f375434s + ", cdnThumbUrl:" + dataItem.f375412h);
            java.lang.String str2 = dataItem.f375434s;
            if (str2 == null || r26.n0.N(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FillFavMsgHelper", "fillFavVoice, xml:" + r17 + ", msgInfo.dbContent:" + f9Var.S1());
            }
        }
    }
}
