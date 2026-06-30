package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ma implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f f147174b;

    public ma(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, com.tencent.mm.plugin.luckymoney.model.f fVar) {
        this.f147173a = luckyMoneyNewPrepareUI;
        this.f147174b = fVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = fVar2 != null ? java.lang.Integer.valueOf(fVar2.f70615a) : null;
        objArr[1] = fVar2 != null ? java.lang.Integer.valueOf(fVar2.f70616b) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，errType：%s，cgiBack.errCode：%s", objArr);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147173a;
        if (luckyMoneyNewPrepareUI.isFinishing() || luckyMoneyNewPrepareUI.isDestroyed() || fVar2 == null || (fVar = fVar2.f70618d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，isFinishing() || isDestroyed() || cgiBack.resp == null");
            return java.lang.Boolean.TRUE;
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack, failed");
            return java.lang.Boolean.TRUE;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack, resp.cover_info_buff_base64: %s", ((r45.eg3) fVar).f373443d);
        gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
        r45.eg3 eg3Var = (r45.eg3) fVar2.f70618d;
        r45.jm5 Ai = ((com.tencent.mm.plugin.luckymoney.model.w2) jVar).Ai(eg3Var != null ? eg3Var.f373443d : null);
        if (Ai == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack, coverInfoDetailCgi is null");
            return java.lang.Boolean.TRUE;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyNewPrepareUI.f146286x0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，mMsgXml is null");
            return java.lang.Boolean.TRUE;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(luckyMoneyNewPrepareUI.f146286x0, "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，values is null");
            return java.lang.Boolean.TRUE;
        }
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.wcpayinfo.paymsgid");
        com.tencent.mm.plugin.luckymoney.model.f fVar3 = this.f147174b;
        java.lang.String str2 = fVar3.f145265m;
        java.lang.String str3 = luckyMoneyNewPrepareUI.A1;
        java.lang.String str4 = Ai.f377944p;
        java.lang.String str5 = fVar3.f145266n;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack， order_xml paymsgid： %s，cgi_sendid : %s , order_sendid: %s , cgi_xml packet_id : %s , cgi_pakcetid: %s", str, str2, str3, str4, str5);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str6 = fVar3.f145265m;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str6) && !com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                if (kotlin.jvm.internal.o.b(str, luckyMoneyNewPrepareUI.A1) && kotlin.jvm.internal.o.b(str6, luckyMoneyNewPrepareUI.A1) && kotlin.jvm.internal.o.b(str5, Ai.f377944p)) {
                    java.lang.String str7 = luckyMoneyNewPrepareUI.f146286x0;
                    r45.eg3 eg3Var2 = (r45.eg3) fVar2.f70618d;
                    luckyMoneyNewPrepareUI.f146286x0 = ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).sj(str7, "<coverinfo>", "</coverinfo>", ot0.q.g(eg3Var2 != null ? eg3Var2.f373443d : null));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(31063, str, 1, 5);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，pakcetid or send_id not match");
                }
                return java.lang.Boolean.TRUE;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUI", "[doCheckUpdateCoverInfoDetail] cgiBack，Util.isNullOrNil(payMsgid) || Util.isNullOrNil(cgi.getMSendId()) || Util.isNullOrNil(cgi.getMPacketId())");
        return java.lang.Boolean.TRUE;
    }
}
