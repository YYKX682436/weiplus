package jr2;

/* loaded from: classes10.dex */
public final class v implements vg3.q4 {

    /* renamed from: d, reason: collision with root package name */
    public volatile int f301386d;

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 p0Var) {
        kotlin.jvm.internal.o.g(values, "values");
        if (!gm0.j1.a()) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.finderliveclosenotifymsg.revoke_id");
        ce2.l D0 = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Pj().D0(str2);
        java.lang.String str3 = (java.lang.String) values.get(".sysmsg.finderliveclosenotifymsg.functionmsgid");
        com.tencent.mars.xlog.Log.i("FinderLiveNotifyRevokeConsumer", "get close live notify, revokeID = " + str2 + " rowId = " + D0.systemRowid + " exposure = " + D0.field_exposureStatus + " , funcMsgId =  " + str3 + " ,msdId = " + D0.field_msgId);
        if (D0.systemRowid != -1) {
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(D0.field_talker, D0.field_msgId);
            if (n17.getMsgId() <= 0) {
                com.tencent.mars.xlog.Log.i("FinderLiveNotifyRevokeConsumer", "msg info not exist, id = " + D0.field_msgId);
                return null;
            }
            java.lang.String j17 = n17.j();
            int L = j17 != null ? r26.n0.L(j17, "<status>", 0, false, 6, null) : 0;
            java.lang.String j18 = n17.j();
            int L2 = j18 != null ? r26.n0.L(j18, "</status>", 0, false, 6, null) : 0;
            if (L == -1 || L2 == -1) {
                pm0.z.b(xy2.b.f458155b, "FinderLiveNotifyRevokeConsumer", false, null, null, false, false, new jr2.u(n17), 60, null);
            } else {
                java.lang.String j19 = n17.j();
                n17.d1(j19 != null ? r26.n0.b0(j19, L + 8, L2, "0").toString() : null);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(n17.getMsgId(), n17, true);
                ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Pj().L0(n17.getMsgId(), 0);
                if (c01.id.e() > this.f301386d) {
                    if (str3 == null) {
                        str3 = "";
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveNotifyRevokeConsumer", "[requestLiveNotify] funcMsgId:".concat(str3));
                    if (str3.length() > 0) {
                        this.f301386d = c01.id.e() + 1;
                        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveNotifyFuncMsgExtension", "requestOnLiveClose");
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put(".sysmsg.functionmsg.cgi", "/cgi-bin/micromsg-bin/findergetlivetips");
                        hashMap.put(".sysmsg.functionmsg.cmdid", "6407");
                        hashMap.put(".sysmsg.functionmsg.functionmsgid", str3);
                        hashMap.put(".sysmsg.functionmsg.businessid", java.lang.String.valueOf(70001L));
                        ic2.u.f290372f = (java.lang.String) hashMap.get(".sysmsg.functionmsg.functionmsgid");
                        ((rj.p) ((qk.w7) i95.n0.c(qk.w7.class))).getClass();
                        xr.a.f456127a.b(new r45.j4(), hashMap, "requestOnLiveClose");
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("FinderLiveNotifyRevokeConsumer", "funcMsgId：" + str3 + " but Frequency limit");
                }
            }
        }
        return null;
    }
}
