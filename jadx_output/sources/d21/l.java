package d21;

/* loaded from: classes5.dex */
public class l implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mm.storage.a3 a3Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((str == null ? "" : str).equals("NewXmlUpgradeAssociateChatRoom")) {
            if (map == null) {
                return null;
            }
            if (!map.containsKey(".sysmsg.NewXmlUpgradeAssociateChatRoom.text")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "no contains text");
                return null;
            }
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.NewXmlUpgradeAssociateChatRoom.text");
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.NewXmlUpgradeAssociateChatRoom.roomname");
            java.lang.String str4 = str3 != null ? str3 : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "chatroom:%s text:%s ", str4, com.tencent.mm.sdk.platformtools.t8.G1(str2));
                return null;
            }
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.j1(0);
            f9Var.u1(str4);
            f9Var.r1(3);
            f9Var.d1(str2);
            f9Var.e1(c01.w9.m(str4, java.lang.System.currentTimeMillis() / 1000));
            f9Var.setType(10000);
            f9Var.f1(f9Var.w0() | 8);
            com.tencent.mars.xlog.Log.i("MicroMsg.UpgradeAssociateChatRoomNewXmlMsg", "chatroom:%s text:%s msgId:%s", str4, com.tencent.mm.sdk.platformtools.t8.G1(str2), java.lang.Long.valueOf(c01.w9.x(f9Var)));
            return null;
        }
        if (!"mmchatroombarannouncememt".equals(str)) {
            return null;
        }
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377558e);
        r45.j4 j4Var = p0Var.f70726a;
        java.lang.String g18 = x51.j1.g(j4Var.f377559f);
        if (c01.z1.r().equals(g17)) {
            a3Var = a17.z0(g18);
            if (a3Var == null) {
                a3Var = new com.tencent.mm.storage.a3();
                a3Var.field_chatroomname = g18;
            }
            a3Var.field_chatroomnoticeEditor = g17;
        } else {
            com.tencent.mm.storage.a3 z07 = a17.z0(g17);
            if (z07 == null) {
                z07 = new com.tencent.mm.storage.a3();
                z07.field_chatroomname = g17;
            }
            a3Var = z07;
            a3Var.field_chatroomnoticeEditor = c01.w9.s(j4Var.f377561h.f372756d);
        }
        a3Var.field_chatroomnoticePublishTime = j4Var.f377565o;
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.mmchatroombarannouncememt.content");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5) && !str5.equals(a3Var.field_chatroomnotice)) {
            a3Var.field_chatroomNoticeNew = 1;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            a3Var.field_chatroomNoticeNew = 0;
        }
        a3Var.field_chatroomnotice = str5;
        a17.replace(a3Var);
        return null;
    }
}
