package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class d4 extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f145227d = lp0.b.e() + "luckymoney/";

    public d4() {
        super(0);
    }

    public static java.lang.String b(int i17) {
        return f145227d + "" + i17 + "/";
    }

    public static java.lang.String c(int i17) {
        return b(i17) + "story/";
    }

    public static java.lang.String f(int i17, int i18) {
        return c(i17) + "detail_video_" + i18 + ".mp4";
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        if (gm0.j1.a()) {
            am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
            int i17 = r2Var.f7759a;
            if (i17 == 58) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney resource file update, type: %s, subType: %s, filePath: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(r2Var.f7760b), r2Var.f7761c);
                if (gm0.j1.j()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 0);
                    s75.d.b(new com.tencent.mm.plugin.luckymoney.model.a4(this, checkResUpdateCacheFileEvent), "lucky_money_envelope_resource_checker");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "[-] kernel extension was not invoked, skip this time. type: %s, subType: %s, filePath: %s", java.lang.Integer.valueOf(r2Var.f7759a), java.lang.Integer.valueOf(r2Var.f7760b), r2Var.f7761c);
                }
            }
            int i18 = r2Var.f7759a;
            if (i18 == 104) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "luckyMoney new year resource file update, type: %s, subType: %s, filePath: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(r2Var.f7760b), r2Var.f7761c);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 21);
                s75.d.b(new com.tencent.mm.plugin.luckymoney.model.b4(this, checkResUpdateCacheFileEvent), "lucky_money_new_year_resource_checker");
            }
        }
        return false;
    }

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "resourceType.errType:%s，errCode：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if ((m1Var instanceof com.tencent.mm.pluginsdk.res.downloader.checkresupdate.j0) && i17 == 0 && i18 == 0) {
            r45.d20 d20Var = (r45.d20) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
            if (com.tencent.mm.sdk.platformtools.t8.L0(d20Var.f372005d)) {
                return;
            }
            for (r45.es5 es5Var : d20Var.f372005d) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(es5Var.f373713d);
                java.util.LinkedList linkedList = es5Var.f373714e;
                objArr[1] = com.tencent.mm.sdk.platformtools.t8.L0(linkedList) ? "null" : java.lang.String.valueOf(linkedList.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "resType：%d，responses.size()：%s", objArr);
                if (es5Var.f373713d == 58 && !com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "real donwload envelope resource");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 16);
                }
                if (es5Var.f373713d == 104 && !com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "real donwload pag resource");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 20);
                }
            }
        }
    }
}
