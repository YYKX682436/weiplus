package com.tencent.mm.plugin.subapp.jdbiz;

/* loaded from: classes8.dex */
public class l implements c01.yc {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f172125d;

    public l() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f172125d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyStartWebViewParamsEvent>(a0Var) { // from class: com.tencent.mm.plugin.subapp.jdbiz.JDSysMsgNotifyLsn$1
            {
                this.__eventId = -382749404;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.NotifyStartWebViewParamsEvent notifyStartWebViewParamsEvent) {
                java.lang.String str;
                java.lang.String str2;
                com.tencent.mm.autogen.events.NotifyStartWebViewParamsEvent notifyStartWebViewParamsEvent2 = notifyStartWebViewParamsEvent;
                if (!(notifyStartWebViewParamsEvent2 instanceof com.tencent.mm.autogen.events.NotifyStartWebViewParamsEvent)) {
                    return false;
                }
                am.yl ylVar = notifyStartWebViewParamsEvent2.f54553g;
                if (ylVar.f8469b == null || (str = ylVar.f8468a) == null || !"bizjd".equals(str)) {
                    return false;
                }
                am.yl ylVar2 = notifyStartWebViewParamsEvent2.f54553g;
                java.lang.String string = ylVar2.f8469b.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = ylVar2.f8469b.getString("jump_url");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11179, string2 != null ? string2 : "", com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b, 4);
                com.tencent.mm.plugin.subapp.jdbiz.o Zi = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi();
                if (Zi != null && (str2 = Zi.f172133b) != null && str2.equals(string)) {
                    com.tencent.mm.plugin.subapp.jdbiz.q.Di().wi();
                    com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ai();
                }
                com.tencent.mm.plugin.subapp.jdbiz.l.this.f172125d.dead();
                return false;
            }
        };
    }

    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JDSysMsgNotifyLsn", "receivemsg jd");
        r45.j4 j4Var = p0Var.f70726a;
        if (j4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JDSysMsgNotifyLsn", "onPreAddMessage cmdAM is null");
            return;
        }
        com.tencent.mm.plugin.subapp.jdbiz.o oVar = new com.tencent.mm.plugin.subapp.jdbiz.o();
        oVar.b(x51.j1.g(j4Var.f377561h));
        java.lang.String str = oVar.f172132a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JDSysMsgNotifyLsn", "bizType ".concat(str));
        if (com.tencent.mm.sdk.platformtools.t8.K0(oVar.f172132a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JDSysMsgNotifyLsn", "bizTye is null or nil");
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(oVar.f172133b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JDSysMsgNotifyLsn", "activity id is null");
        } else if (!oVar.c(com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JDSysMsgNotifyLsn", "fo zu baoyou! the activityid is same");
        } else if (!com.tencent.mm.plugin.subapp.jdbiz.q.Di().aj()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JDSysMsgNotifyLsn", "no config entrance, ignore msg");
        } else if (oVar.f172132a.equals("3")) {
            j4Var.f377567q = null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(oVar.f172143l) || com.tencent.mm.sdk.platformtools.t8.K0(oVar.f172146o) || com.tencent.mm.sdk.platformtools.t8.K0(oVar.f172144m) || com.tencent.mm.sdk.platformtools.t8.K0(oVar.f172145n) || com.tencent.mm.sdk.platformtools.t8.K0(oVar.f172142k)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JDSysMsgNotifyLsn", "invalid params");
            } else if (oVar.d()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JDSysMsgNotifyLsn", "ingore msg due to msg is expired");
            } else {
                com.tencent.mm.plugin.subapp.jdbiz.q Di = com.tencent.mm.plugin.subapp.jdbiz.q.Di();
                java.lang.String str2 = oVar.f172133b;
                Di.getClass();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2) ? false : ((java.util.HashMap) Di.f172152e).containsKey(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JDSysMsgNotifyLsn", "activity id already show, " + oVar.f172133b);
                } else if (oVar.c(com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi())) {
                    com.tencent.mm.plugin.subapp.jdbiz.q Di2 = com.tencent.mm.plugin.subapp.jdbiz.q.Di();
                    java.lang.String str3 = oVar.f172133b;
                    Di2.getClass();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        ((java.util.HashMap) Di2.f172152e).put(str3, 1);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JDSysMsgNotifyLsn", "add activity id" + oVar.f172133b);
                    new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.subapp.jdbiz.k(this, oVar));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JDSysMsgNotifyLsn", "the remind activitid is same");
                }
            }
            com.tencent.mm.plugin.subapp.jdbiz.q.cj(oVar);
        } else if (oVar.f172132a.equals("1")) {
            com.tencent.mm.plugin.subapp.jdbiz.q.cj(oVar);
        } else if (oVar.f172132a.equals("2")) {
            com.tencent.mm.plugin.subapp.jdbiz.q.cj(oVar);
            java.lang.String str4 = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Vi().f172129a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                str4 = com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ui();
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11178, str4, oVar.f172133b, 3, 1);
        }
        c01.d9.b().p().i(true);
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
