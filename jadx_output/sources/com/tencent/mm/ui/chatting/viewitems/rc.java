package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class rc implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f205422e;

    public rc(com.tencent.mm.ui.chatting.viewitems.nc ncVar, java.lang.String str, android.util.Pair pair) {
        this.f205421d = str;
        this.f205422e = pair;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        android.util.Pair pair = this.f205422e;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f205421d, ((java.lang.Long) pair.first).longValue());
        r45.k55 e17 = bm5.d1.e(Li.j());
        r45.l55 Ui = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ui(e17, ((java.lang.Long) pair.second).longValue());
        if (Ui != null) {
            if (Ui.f379157i != 0) {
                com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct revokePatActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct();
                revokePatActionReportStruct.f60013e = Ui.f379155g;
                revokePatActionReportStruct.f60014f = java.lang.System.currentTimeMillis();
                revokePatActionReportStruct.f60015g = revokePatActionReportStruct.b("UserName", Ui.f379152d, true);
                revokePatActionReportStruct.f60016h = revokePatActionReportStruct.b("PattedUserName", Ui.f379153e, true);
                revokePatActionReportStruct.f60017i = revokePatActionReportStruct.b("PatSuffix", lp3.p.a(Ui.f379153e), true);
                if (com.tencent.mm.storage.z3.N4(e17.f378385d)) {
                    revokePatActionReportStruct.f60018j = revokePatActionReportStruct.b("ChatRoomName", e17.f378385d, true);
                    revokePatActionReportStruct.f60012d = 2;
                } else {
                    revokePatActionReportStruct.f60012d = 1;
                }
                revokePatActionReportStruct.f60019k = 1;
                revokePatActionReportStruct.f60021m = 2;
                revokePatActionReportStruct.f60020l = 1;
                revokePatActionReportStruct.k();
                revokePatActionReportStruct.o();
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct sendPatActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct();
            if (com.tencent.mm.storage.z3.R4(Li.Q0())) {
                sendPatActionReportStruct.f60221h = sendPatActionReportStruct.b("ChatroomName", Li.Q0(), true);
                sendPatActionReportStruct.f60217d = 2;
            } else {
                sendPatActionReportStruct.f60217d = 1;
            }
            sendPatActionReportStruct.f60223j = ((java.lang.Long) pair.second).longValue() - ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ri(e17.f378385d, pair);
            sendPatActionReportStruct.f60225l = ((java.lang.Long) pair.second).longValue() <= ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().w3(e17.f378385d) ? 1 : 0;
            sendPatActionReportStruct.f60219f = sendPatActionReportStruct.b("Username", c01.z1.r(), true);
            sendPatActionReportStruct.f60220g = sendPatActionReportStruct.b("PattedUserName", e17.f378385d, true);
            sendPatActionReportStruct.f60218e = Ui.f379155g;
            sendPatActionReportStruct.f60227n = sendPatActionReportStruct.b("PatSuffix", lp3.p.a(Ui.f379153e), true);
            sendPatActionReportStruct.f60229p = 1;
            sendPatActionReportStruct.f60228o = 2;
            mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
            java.lang.String str = sendPatActionReportStruct.f60219f;
            java.lang.String str2 = sendPatActionReportStruct.f60220g;
            ((lp3.l) jVar).getClass();
            java.lang.String Vi = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str);
            java.lang.String Ui2 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ui(str);
            java.lang.String Vi2 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Vi(str2);
            java.lang.String Ui3 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).Ui(str2);
            sendPatActionReportStruct.f60231r = sendPatActionReportStruct.b("FromStatusID", Vi, true);
            sendPatActionReportStruct.f60233t = sendPatActionReportStruct.b("FromStatusIcon", Ui2, true);
            sendPatActionReportStruct.f60232s = sendPatActionReportStruct.b("ToStatusID", Vi2, true);
            sendPatActionReportStruct.f60234u = sendPatActionReportStruct.b("ToStatusIcon", Ui3, true);
            sendPatActionReportStruct.k();
            sendPatActionReportStruct.o();
        }
    }
}
