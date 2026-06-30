package n41;

/* loaded from: classes5.dex */
public class i implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "onNewXmlReceived() ");
        if (map != null) {
            r45.j4 j4Var = p0Var.f70726a;
            int i17 = j4Var.f377560g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (!(i17 == 10002)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "not new xml type:%d ", java.lang.Integer.valueOf(i17));
                return;
            }
            java.lang.String g17 = x51.j1.g(j4Var.f377561h);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "msg content is null");
                return;
            }
            java.lang.String g18 = x51.j1.g(j4Var.f377558e);
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g18, j4Var.f377568r);
            boolean z18 = o27.getMsgId() > 0;
            o27.o1(j4Var.f377568r);
            o27.e1(c01.w9.m(g18, j4Var.f377565o));
            o27.setType(10002);
            o27.d1(g17);
            o27.j1(0);
            o27.u1(g18);
            o27.u3(j4Var.f377566p);
            o27.l1(o27.F & (-129));
            c01.w9.n(o27, p0Var);
            if (z18) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j4Var.f377568r, o27);
            } else {
                c01.w9.x(o27);
            }
        }
    }
}
