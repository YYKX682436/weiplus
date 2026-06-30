package pp3;

/* loaded from: classes5.dex */
public class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f357478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pp3.j f357480f;

    public i(pp3.j jVar, android.util.Pair pair, java.lang.String str) {
        this.f357480f = jVar;
        this.f357478d = pair;
        this.f357479e = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 548) {
            this.f357480f.getClass();
            android.util.Pair pair = this.f357478d;
            r45.k55 e17 = bm5.d1.e(pt0.f0.Li(this.f357479e, ((java.lang.Long) pair.first).longValue()).j());
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
                    }
                    revokePatActionReportStruct.f60019k = 2;
                    revokePatActionReportStruct.f60021m = 2;
                    revokePatActionReportStruct.k();
                    revokePatActionReportStruct.o();
                    return;
                }
                com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct sendPatActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct();
                if (com.tencent.mm.storage.z3.N4(e17.f378385d)) {
                    sendPatActionReportStruct.f60221h = sendPatActionReportStruct.b("ChatroomName", e17.f378385d, true);
                }
                sendPatActionReportStruct.f60223j = ((java.lang.Long) pair.second).longValue() - ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ri(e17.f378385d, pair);
                sendPatActionReportStruct.f60225l = ((java.lang.Long) pair.second).longValue() <= ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().w3(e17.f378385d) ? 1 : 0;
                sendPatActionReportStruct.f60226m = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Vi(e17, ((java.lang.Long) pair.second).longValue()) + 1;
                sendPatActionReportStruct.f60219f = sendPatActionReportStruct.b("Username", c01.z1.r(), true);
                sendPatActionReportStruct.f60220g = sendPatActionReportStruct.b("PattedUserName", e17.f378385d, true);
                sendPatActionReportStruct.f60218e = Ui.f379155g;
                sendPatActionReportStruct.f60227n = sendPatActionReportStruct.b("PatSuffix", lp3.p.a(Ui.f379153e), true);
                sendPatActionReportStruct.f60228o = 2;
                sendPatActionReportStruct.f60229p = 2;
                lp3.l.Ni(sendPatActionReportStruct);
                sendPatActionReportStruct.k();
                sendPatActionReportStruct.o();
            }
        }
    }
}
