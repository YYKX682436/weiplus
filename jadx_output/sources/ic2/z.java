package ic2;

/* loaded from: classes10.dex */
public final class z implements vg3.a5 {
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r0 == null) goto L43;
     */
    @Override // vg3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.tencent.mm.modelbase.p0 r23, com.tencent.mm.storage.f9 r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.z.b(com.tencent.mm.modelbase.p0, com.tencent.mm.storage.f9, java.util.Map):void");
    }

    @Override // vg3.a
    public boolean c(com.tencent.mm.modelbase.p0 addMsgInfo, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        if (f9Var != null) {
            f9Var.u1("notifymessage");
        }
        if (map == null) {
            return false;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.revoke_id");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.live_widget.status");
        if (str3 == null) {
            str3 = "";
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str3, 0);
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.force_push_info");
        java.lang.String str5 = str4 != null ? str4 : "";
        com.tencent.mars.xlog.Log.i("FinderLiveNotifyMsgInterceptor", "liveStatus = " + D1 + ",expiredTime = " + ((str5.length() > 0 ? str5 : null) != null ? new cl0.g(str5).optLong("expiredTime") : -1L));
        if (kotlin.jvm.internal.o.b(map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.not_filter_by_live_id"), "1")) {
            ce2.l D0 = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Pj().D0(str2);
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyMsgInterceptor", "notFilterByLiveId," + str + ' ' + str2 + ' ' + D0.systemRowid);
            return D0.systemRowid == -1;
        }
        r45.j4 j4Var = addMsgInfo.f70726a;
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(x51.j1.g(j4Var.f377558e), j4Var.f377568r);
        com.tencent.mars.xlog.Log.i("FinderLiveNotifyMsgInterceptor", "[FINDER_SERVICE_NOTIFY_FOLLOW_LIVE]  liveId " + str + " revokeId " + str2 + " info.systemRowid " + o27.systemRowid);
        boolean z18 = o27.systemRowid == -1;
        if (!z18) {
            com.tencent.mars.xlog.Log.i("FinderLiveNotifyMsgInterceptor", "[FINDER_SERVICE_NOTIFY_FOLLOW_LIVE]  this msg has been insert");
        }
        return z18;
    }
}
