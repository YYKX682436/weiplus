package oe2;

/* loaded from: classes8.dex */
public final class u extends com.tencent.mm.sdk.event.n {
    public u() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        rl2.v b17;
        com.tencent.mm.autogen.events.FinderLiveTipsBarEvent event = (com.tencent.mm.autogen.events.FinderLiveTipsBarEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ec ecVar = event.f54300g;
        if (ecVar != null && (str = ecVar.f6549b) != null) {
            oe2.x xVar = oe2.x.f344786a;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "tipsBarEventListener recv type:" + ecVar.f6548a + ", chatRoomId:" + str);
            int i17 = ecVar.f6548a;
            if (i17 == 1) {
                r45.g92 g92Var = ecVar.f6550c;
                if (g92Var == null) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "tipsBarEventListener ADD_APPMSG finderShareObject null");
                } else {
                    oe2.x xVar2 = oe2.x.f344786a;
                    java.lang.String anchorWxUsername = ecVar.f6551d;
                    kotlin.jvm.internal.o.f(anchorWxUsername, "anchorWxUsername");
                    dm.s4 s4Var = new dm.s4();
                    s4Var.field_liveId = pm0.v.Z(g92Var.getString(0));
                    s4Var.field_hostRoomId = str;
                    s4Var.field_timeStamp = c01.id.e();
                    s4Var.field_anchorWxUsername = anchorWxUsername;
                    s4Var.field_anchorFinderUsername = g92Var.getString(26);
                    s4Var.field_anchorFinderNickname = g92Var.getString(25);
                    s4Var.field_finderObjectId = pm0.v.Z(g92Var.getString(2));
                    s4Var.field_finderNonceId = g92Var.getString(12);
                    s4Var.field_sourceType = g92Var.getInteger(15);
                    if (s4Var.field_liveId == 0) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "liveId invalid");
                        s4Var = null;
                    }
                    if (s4Var != null) {
                        oe2.x.a(xVar2, s4Var);
                    }
                }
            } else if (i17 == 2 && (b17 = oe2.x.b(oe2.x.f344786a)) != null) {
                int delete = b17.f397217d.delete("FinderLiveTipsBar", "hostRoomId= ? ", new java.lang.String[]{str});
                if (delete < 0) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderLiveTipsBarStorage", "deleteByHostRoomId failed, hostRoomId:" + str + ", result:" + delete);
                } else {
                    java.util.Vector vector = rl2.v.f397214g;
                    synchronized (vector) {
                        pm0.v.c0(vector, new rl2.o(str));
                    }
                    java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(ps5.f.class)).all()).iterator();
                    while (true) {
                        fs.f fVar = (fs.f) it;
                        if (!fVar.hasNext()) {
                            break;
                        }
                        fs.q qVar = (fs.q) fVar.next();
                        if (fs.g.d(fs.g.f266086c, qVar)) {
                            ((yj5.w) ((ps5.f) ((fs.n) qVar.get()))).b(str);
                        }
                    }
                    b17.J0(str);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", "deleteByHostRoomId, hostRoomId:" + str + ", result:" + delete);
                }
            }
        }
        return false;
    }
}
