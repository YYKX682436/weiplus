package e81;

/* loaded from: classes12.dex */
public class e implements xg3.i0 {
    public static void b(com.tencent.mm.storage.f9 f9Var) {
        java.util.Map d17;
        o72.r2 B;
        r45.bq0 bq0Var;
        if (f9Var.getType() != 1107296305 || (d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.J0(), "msg", null)) == null || d17.get(".msg.appmsg.announcement") == null || (bq0Var = (B = o72.x1.B(((java.lang.String) d17.get(".msg.appmsg.announcement")).replace("<group_notice_item", "<favitem").replace("group_notice_item>", "favitem>"), 18)).field_favProto) == null || bq0Var.f370964f.size() <= 0) {
            return;
        }
        java.util.Iterator it = B.field_favProto.f370964f.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            int i17 = gp0Var.I;
            if (i17 == 2 || i17 == 4 || i17 == 8 || i17 == 10130) {
                dm.a2 a2Var = new dm.a2();
                a2Var.field_msgId = f9Var.getMsgId();
                a2Var.field_dataId = gp0Var.T;
                a2Var.field_dataPath = hx1.b.c(gp0Var);
                a2Var.field_thumbPath = hx1.b.e(gp0Var);
                a2Var.field_size = gp0Var.R + gp0Var.f375418l1;
                new m75.c(a2Var, true, null, null, "MicroMsg.SDK.BaseChatroomNoticeAttachIndex").a(com.tencent.mm.plugin.announcement.s.f74705e.Q4());
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgListener", "insert item. msgId:%d, dataId:%s, dataPath:%s, thumbPath:%s", java.lang.Long.valueOf(f9Var.getMsgId()), gp0Var.T, a2Var.field_dataPath, a2Var.field_thumbPath);
            }
        }
    }

    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (l0Var.f454411b == "insert") {
            java.util.Iterator it = l0Var.f454412c.iterator();
            while (it.hasNext()) {
                b((com.tencent.mm.storage.f9) it.next());
            }
        }
    }
}
