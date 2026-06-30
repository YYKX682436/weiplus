package rj1;

/* loaded from: classes7.dex */
public final class o implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BubbleTips.XMLConsumer", "values are null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo = new com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo();
        tipsMsgInfo.field_appId = (java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.appid");
        tipsMsgInfo.field_createTime = java.lang.Long.parseLong((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.create_time"));
        tipsMsgInfo.field_receiveTime = com.tencent.mm.sdk.platformtools.t8.i1();
        tipsMsgInfo.field_expireTime = java.lang.Long.parseLong((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.expire_time"));
        tipsMsgInfo.field_opType = java.lang.Integer.parseInt((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.op_type"));
        tipsMsgInfo.field_msgId = (java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.msg_id");
        tipsMsgInfo.field_busiType = java.lang.Integer.parseInt((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.busi_type"));
        tipsMsgInfo.field_msgType = java.lang.Integer.parseInt((java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.msg_type"));
        tipsMsgInfo.field_dataJson = (java.lang.String) kz5.c1.h(map, ".sysmsg.mm_miniapp_wxa_tipsmsg_newxml.data_json");
        com.tencent.mars.xlog.Log.i("MicroMsg.BubbleTips.XMLConsumer", "receive bubble tips, content = " + tipsMsgInfo);
        int i17 = tipsMsgInfo.field_opType;
        if (i17 == 1) {
            com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
            java.lang.String field_appId = tipsMsgInfo.field_appId;
            kotlin.jvm.internal.o.f(field_appId, "field_appId");
            rj1.k kVar = new rj1.k(tipsMsgInfo);
            rj1.l lVar = new rj1.l(tipsMsgInfo);
            com.tencent.luggage.sdk.processes.s sVar = (com.tencent.luggage.sdk.processes.s) kz5.z.O(a17.j(field_appId, -1));
            if (sVar != null) {
                com.tencent.luggage.sdk.processes.h.q(a17.f(sVar), (com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage) kVar.invoke(sVar), null, 2, null);
            } else {
                lVar.invoke();
            }
        } else if (i17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BubbleTips.XMLConsumer", "opType is illegal, ignore.");
        } else {
            rj1.m.b(tipsMsgInfo, 5);
            rj1.m.a(tipsMsgInfo);
        }
        return null;
    }
}
