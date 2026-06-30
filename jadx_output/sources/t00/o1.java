package t00;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt00/o1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserTicket;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCSingleUserInfo;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class o1 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        c00.h3 h3Var;
        com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket selectContactEcsActionHandler$IPCUserTicket = (com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket) obj;
        java.lang.String userName = selectContactEcsActionHandler$IPCUserTicket != null ? selectContactEcsActionHandler$IPCUserTicket.f65637d : null;
        if (com.tencent.mm.storage.z3.m4(userName)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactEcsActionHandler", "IPCGetExclusiveSelectedUserInfo, select contact is open im");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo("", "", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nel)));
                return;
            }
            return;
        }
        boolean z17 = false;
        if ((userName == null || userName.length() == 0) || !com.tencent.mm.storage.z3.O4(userName)) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo("", "", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nek)));
                return;
            }
            return;
        }
        java.lang.String Di = ((j00.u1) ((c00.i3) i95.n0.c(c00.i3.class))).Di(selectContactEcsActionHandler$IPCUserTicket.f65638e);
        kotlin.jvm.internal.o.g(userName, "userName");
        if (com.tencent.mm.storage.z3.R4(Di)) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(Di);
            kotlin.jvm.internal.o.d(m17);
            if (!m17.isEmpty()) {
                java.util.Iterator it = m17.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((java.lang.String) it.next()).equals(userName)) {
                        z17 = true;
                        break;
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsUtil", "isInChatRoomList, chatroom:" + Di + " is not group");
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactEcsActionHandler", "IPCGetExclusiveSelectedUserInf, select contact is not in group");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo("", "", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nej)));
                return;
            }
            return;
        }
        j00.u1 u1Var = (j00.u1) ((c00.i3) i95.n0.c(c00.i3.class));
        u1Var.wi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSendGiftSessionRecipientUsername passedTicket:");
        java.lang.String str = selectContactEcsActionHandler$IPCUserTicket.f65638e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSendSessionMgr", sb6.toString());
        if (u1Var.Ai(str) && (h3Var = (c00.h3) u1Var.Ni().get(str)) != null) {
            h3Var.f36982a = userName;
        }
        c00.e4 wi6 = ((b00.t2) ((c00.f4) i95.n0.c(c00.f4.class))).wi(userName, Di);
        if (rVar != null) {
            rVar.a(new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo(wi6.f36967a, wi6.f36968b, ""));
        }
    }
}
