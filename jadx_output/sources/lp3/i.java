package lp3;

/* loaded from: classes5.dex */
public class i implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp3.l f320288d;

    public i(lp3.l lVar) {
        this.f320288d = lVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        r45.k55 e17;
        r45.l55 Ui;
        if (message.what == 291) {
            op3.c cVar = (op3.c) message.obj;
            android.util.Pair pair = cVar.f347258e;
            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "send pat msg, msgId:%d, createTime:%d scene:%d, talker:%s, patUser:%s", pair.first, pair.second, java.lang.Integer.valueOf(cVar.f347255b), cVar.f347256c, cVar.f347257d);
            int i17 = cVar.f347255b;
            android.util.Pair pair2 = cVar.f347258e;
            boolean z17 = cVar.f347259f;
            java.lang.String str = cVar.f347256c;
            lp3.l lVar = this.f320288d;
            lVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "send pat, scene %d, msg (%d,%d)", java.lang.Integer.valueOf(i17), pair2.first, pair2.second);
            if (((lp3.r) i95.n0.c(lp3.r.class)).Di()) {
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, ((java.lang.Long) pair2.first).longValue());
                if (Li.getMsgId() == ((java.lang.Long) pair2.first).longValue() && (Ui = lVar.Ui((e17 = bm5.d1.e(Li.j())), ((java.lang.Long) pair2.second).longValue())) != null) {
                    if (lVar.wi(i17, e17.f378385d, Ui.f379153e)) {
                        com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct sendPatActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct();
                        sendPatActionReportStruct.f60217d = i17;
                        if (com.tencent.mm.storage.z3.N4(e17.f378385d)) {
                            sendPatActionReportStruct.f60221h = sendPatActionReportStruct.b("ChatroomName", e17.f378385d, true);
                        }
                        sendPatActionReportStruct.f60223j = ((java.lang.Long) pair2.second).longValue() - ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ri(e17.f378385d, pair2);
                        sendPatActionReportStruct.f60225l = lVar.hj(e17.f378385d, pair2) ? 1 : 0;
                        sendPatActionReportStruct.f60226m = lVar.Vi(e17, ((java.lang.Long) pair2.second).longValue()) + 1;
                        sendPatActionReportStruct.f60219f = sendPatActionReportStruct.b("Username", Ui.f379152d, true);
                        sendPatActionReportStruct.f60220g = sendPatActionReportStruct.b("PattedUserName", Ui.f379153e, true);
                        sendPatActionReportStruct.f60218e = Ui.f379155g;
                        sendPatActionReportStruct.f60227n = sendPatActionReportStruct.b("PatSuffix", lp3.p.a(Ui.f379153e), true);
                        sendPatActionReportStruct.f60230q = z17 ? 1 : 0;
                        op3.b bVar = new op3.b(pair2, e17.f378385d, Ui.f379153e, 0);
                        bVar.f347253g = sendPatActionReportStruct;
                        gm0.j1.d().g(bVar);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.PatMsgExtension", "cannot pat, scene %d, talker %s, patUser %s", java.lang.Integer.valueOf(i17), e17.f378385d, Ui.f379153e);
                    }
                }
            }
        }
        return false;
    }
}
