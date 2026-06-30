package du2;

/* loaded from: classes2.dex */
public final class u extends android.support.v4.media.session.v {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService f243503f;

    public u(com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService finderSystemPlayerService) {
        this.f243503f = finderSystemPlayerService;
    }

    @Override // android.support.v4.media.session.v
    public void b(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        if (str != null) {
            int hashCode = str.hashCode();
            com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService finderSystemPlayerService = this.f243503f;
            switch (hashCode) {
                case -1236803706:
                    if (str.equals("COMMAND_DISCONNECT_SERVICE")) {
                        du2.r rVar = com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService.f128477r;
                        finderSystemPlayerService.getClass();
                        com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "[disconnectService]");
                        finderSystemPlayerService.f();
                        return;
                    }
                    return;
                case -797253808:
                    if (str.equals("COMMAND_UPDATE_INFO")) {
                        i95.m c17 = i95.n0.c(du2.n.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        fu2.c Ai = du2.n.Ai((du2.n) c17, null, 1, null);
                        if (Ai == null) {
                            return;
                        }
                        du2.r rVar2 = com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService.f128477r;
                        finderSystemPlayerService.getClass();
                        eu2.j jVar = (eu2.j) Ai;
                        cw2.wa waVar = jVar.f256793d.f256758e;
                        if (waVar == null) {
                            com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "[onMediaInfoUpdate] type: " + jVar.f256790a + " mediaInfo is null, return!");
                            return;
                        }
                        if (jVar.f256792c.f266875b == 0) {
                            com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "[onMediaInfoUpdate] state: STATE_NONE");
                            return;
                        }
                        com.tencent.mm.plugin.finder.storage.FeedData feedData = waVar.f224099f;
                        if (feedData == null || (mediaList = feedData.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) == null) {
                            return;
                        }
                        mn2.u0 u0Var = new mn2.u0(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, 4, null);
                        if (kotlin.jvm.internal.o.b(u0Var.f330125h, jVar.f256791b.f266873b)) {
                            finderSystemPlayerService.h(Ai);
                            ((du2.q) ((jz5.n) finderSystemPlayerService.f128480p).getValue()).c(finderSystemPlayerService.f128478n, Ai, finderSystemPlayerService.f128481q);
                            return;
                        } else {
                            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(u0Var);
                            a17.f447873d = new du2.t(Ai, finderSystemPlayerService);
                            a17.f();
                            com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "[onMediaInfoUpdate] update successfully!");
                            return;
                        }
                    }
                    return;
                case -116344064:
                    if (str.equals("COMMAND_SET_ACTIVE_AND_CANCEL_NOTIFICATION")) {
                        if (bundle != null) {
                            boolean booleanValue = java.lang.Boolean.valueOf(bundle.getBoolean("key_set_session_active")).booleanValue();
                            android.support.v4.media.session.f0 f0Var = finderSystemPlayerService.f128478n;
                            if (f0Var != null) {
                                f0Var.e(booleanValue);
                            }
                        }
                        if (bundle != null) {
                            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bundle.getBoolean("key_need_cancel_notification"));
                            java.lang.Boolean bool = valueOf.booleanValue() ? valueOf : null;
                            if (bool != null) {
                                bool.booleanValue();
                                du2.r rVar3 = com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService.f128477r;
                                finderSystemPlayerService.e();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 137171919:
                    if (str.equals("COMMAND_UPDATE_PROGRESS")) {
                        i95.m c18 = i95.n0.c(du2.n.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        fu2.c Ai2 = du2.n.Ai((du2.n) c18, null, 1, null);
                        if (Ai2 == null) {
                            return;
                        }
                        du2.r rVar4 = com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService.f128477r;
                        finderSystemPlayerService.g(Ai2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.support.v4.media.session.v
    public void d() {
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "onPause");
        i95.m c17 = i95.n0.c(du2.n.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((du2.n) c17).Bi();
    }

    @Override // android.support.v4.media.session.v
    public void e() {
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "onPlay");
        i95.m c17 = i95.n0.c(du2.n.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((du2.n) c17).Di();
    }

    @Override // android.support.v4.media.session.v
    public void f(java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "onPlayFromMediaId mediaId: " + str);
    }

    @Override // android.support.v4.media.session.v
    public void j() {
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerService", "onStop");
        i95.m c17 = i95.n0.c(du2.n.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((du2.n) c17).Bi();
    }
}
