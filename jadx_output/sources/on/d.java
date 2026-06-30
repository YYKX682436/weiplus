package on;

/* loaded from: classes5.dex */
public class d implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        new java.util.LinkedList();
        new java.util.LinkedList();
        new java.util.LinkedList();
        try {
            if (map == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] values == null ");
                return null;
            }
            java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377558e);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] type:%s, values size:%s", "", java.lang.Integer.valueOf(map.size()));
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.confirm_username");
            long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.newmsgid"), 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[parseXml] mConfirmUsername:%s, mDisableMsgId:%s username:%s", str2, java.lang.Long.valueOf(V), g17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "[handle] username is null!");
                return null;
            }
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, V);
            if (o27 != null && o27.getMsgId() > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(o27.Q0())) {
                o27.l1(o27.F | 128);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(o27.I0(), o27);
            }
            p75.n0 n0Var = dm.w9.f240866o;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            p75.d dVar = dm.w9.f240868q;
            p75.y yVar = new p75.y(dVar.j(g17));
            yVar.f(dm.w9.f240869r.i(java.lang.Long.valueOf(V)));
            p75.n0 n0Var2 = dm.w9.f240866o;
            p75.i0 g18 = n0Var2.g(linkedList);
            g18.f352657d = yVar;
            g18.f352659f = linkedList2;
            g18.f352660g = linkedList3;
            dm.w9 w9Var = (dm.w9) g18.a().o(gm0.j1.u().f273153f, dm.w9.class);
            if (w9Var == null) {
                return null;
            }
            w9Var.field_state = 1;
            w9Var.updateToDB(gm0.j1.u().f273153f, true);
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            p75.y yVar2 = new p75.y(dVar.j(g17));
            yVar2.f(dm.w9.f240871t.i(0).c(dm.w9.f240870s.i(0)));
            linkedList5.add(dm.w9.f240872u.u());
            p75.i0 g19 = n0Var2.g(linkedList4);
            g19.f352657d = yVar2;
            g19.f352659f = linkedList5;
            g19.f352660g = linkedList6;
            java.util.List k17 = g19.a().k(gm0.j1.u().f273153f, dm.w9.class);
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(g17);
            java.util.ArrayList arrayList = (java.util.ArrayList) k17;
            p17.Z1(arrayList.size());
            if (arrayList.isEmpty()) {
                g95.u.l(g17, 7);
            } else {
                g95.u.j(g17, 7);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", "DisableChatroomAccessVerifyNewXmlMsg cvs.setUnReadInvite:%s", java.lang.Integer.valueOf(arrayList.size()));
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, g17);
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DisableChatroomAccessVerifyNewXmlMsg", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
