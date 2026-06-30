package n41;

/* loaded from: classes4.dex */
public class l implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!str.equals("SendMsgFailed") || map == null) {
            return null;
        }
        try {
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.SendMsgFailed.newmsgid");
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String trim = str3.trim();
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.SendMsgFailed.tousername");
            if (str4 != null) {
                str2 = str4;
            }
            java.lang.String trim2 = str2.trim();
            com.tencent.mars.xlog.Log.i("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "msgId:%s toUsername:%s", trim, trim2);
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(trim2, com.tencent.mm.sdk.platformtools.t8.E1(trim));
            if (o27 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "info is null");
            } else {
                o27.r1(5);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.getMsgId(), o27, true);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.openim.OpenIMChatRoomSendMsgFailedNewXmlMsg", "consumeNewXml Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }
}
