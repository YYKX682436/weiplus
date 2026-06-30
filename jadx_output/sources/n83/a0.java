package n83;

/* loaded from: classes4.dex */
public class a0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("WeChatOutMsgListener", "WeChatOutMsg onRecieveMsg");
        r45.j4 j4Var = p0Var.f70726a;
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (g17 == null || g17.length() == 0) {
            com.tencent.mars.xlog.Log.e("WeChatOutMsgListener", "WeChatOutMsg onReceiveMsg, msgContent is null");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("WeChatOutMsgListener", "WeChatOutMsg onReceiveMsg, values is null");
            return;
        }
        s83.h Ri = com.tencent.mm.plugin.ipcall.model.r.Ri();
        long j17 = j4Var.f377557d;
        Ri.getClass();
        s83.g gVar = new s83.g();
        gVar.field_svrId = j17;
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.WeChatOutMsg.Title");
        gVar.field_title = str;
        if (str == null) {
            gVar.field_title = "";
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.WeChatOutMsg.Content");
        gVar.field_content = str2;
        if (str2 == null) {
            gVar.field_content = "";
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.WeChatOutMsg.MsgType"), 0);
        gVar.field_msgType = P;
        gVar.field_pushTime = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".sysmsg.WeChatOutMsg.PushTime"), 0L);
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.WeChatOutMsg.DescUrl");
        gVar.field_descUrl = str3;
        if (str3 == null) {
            gVar.field_descUrl = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallMsgStorage", "insertNewXml svrId:%s,title:%s,content:%s,msgType:%s,pushTime:%s,descUrl=%s", gVar.field_svrId + "", gVar.field_title, gVar.field_content, gVar.field_msgType + "", gVar.field_pushTime + "", gVar.field_descUrl);
        Ri.insert(gVar);
        if (P != -1) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERFINO_IPCALL_MSG_CENTER_SHOW_REDDOT_TYPE_INT, java.lang.Integer.valueOf(P));
        }
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IPCALL_MSG_CENTER_SHOW_REDDOT_BOOLEAN, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13254, 4, 0, 0, -1, java.lang.Integer.valueOf(P), -1);
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
