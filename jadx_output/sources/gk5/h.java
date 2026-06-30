package gk5;

/* loaded from: classes9.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String user, java.lang.String msgContent, java.lang.Boolean bool, long j17, java.lang.String str, java.lang.String str2) {
        r45.gv2 gv2Var;
        kotlin.jvm.internal.o.g(user, "user");
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        int i17 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (msgContent.length() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardFinderFeedUIC", "transfer finder feed to %s", user);
            ot0.q v17 = ot0.q.v(msgContent);
            if (v17 != null) {
                zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
                if (iVar != null) {
                    if (((r45.gv2) iVar.f477411b.getCustom(30)) == null) {
                        iVar.f477411b.set(30, new r45.gv2());
                    }
                    if (bool != null && (gv2Var = (r45.gv2) iVar.f477411b.getCustom(30)) != null) {
                        gv2Var.set(0, java.lang.Boolean.valueOf(bool.booleanValue()));
                    }
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(new android.util.Pair(iVar.f477411b.getString(0), iVar.f477411b.getString(8)));
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList, false);
                }
                android.util.Pair L = com.tencent.mm.pluginsdk.model.app.k0.L(v17, "", "", user, "", null, null, "", "", new com.tencent.mm.plugin.msg.MsgIdTalker(j17, str), j17 > 0, str2);
                if (!((L.first == null || L.second == null) ? false : true)) {
                    L = null;
                }
                if (L != null) {
                    com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(user, (java.lang.Long) L.second);
                }
                return true;
            }
        }
        return false;
    }
}
