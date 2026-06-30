package rj1;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 1326;
    public static final java.lang.String NAME = "onGetNewXmlMsgEvent";

    public final void x(com.tencent.mm.plugin.appbrand.service.c0 service, java.util.List infoList) {
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(infoList, "infoList");
        if (infoList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EventOnGetNewXmlMsg", "empty list.");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = infoList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo = (com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo) it.next();
            arrayList.add(kz5.c1.k(new jz5.l("msg_id", tipsMsgInfo.field_msgId), new jz5.l("create_time", java.lang.Long.valueOf(tipsMsgInfo.field_createTime)), new jz5.l("expire_time", java.lang.Long.valueOf(tipsMsgInfo.field_expireTime)), new jz5.l("busi_type", java.lang.Integer.valueOf(tipsMsgInfo.field_busiType)), new jz5.l("msg_type", java.lang.Integer.valueOf(tipsMsgInfo.field_msgType)), new jz5.l("data_json", tipsMsgInfo.field_dataJson)));
            rj1.m.b(tipsMsgInfo, 1);
            rj1.m.a(tipsMsgInfo);
        }
        t(kz5.b1.e(new jz5.l("msgList", arrayList)));
        u(service);
        m();
    }
}
