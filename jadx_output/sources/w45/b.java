package w45;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final w45.b f442899a = new w45.b();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.autogen.events.WebViewExWindowCloseEvent f442900b;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewExWindowCloseEvent>(a0Var) { // from class: com.tencent.mm.qqlogin.ChangeQQLoginTypeManager$exWindowCloseEventIListener$1
            {
                this.__eventId = 1684674094;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WebViewExWindowCloseEvent webViewExWindowCloseEvent) {
                com.tencent.mm.autogen.events.WebViewExWindowCloseEvent event = webViewExWindowCloseEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (kotlin.jvm.internal.o.b(event.f54984g.f7220a, "escape_change_qq_login_type")) {
                    w45.b bVar = w45.b.f442899a;
                    if (r26.n0.B("", "ChangeQQLoginType_sendmsg", false)) {
                        w45.b.f442899a.a(event);
                    } else if (r26.n0.B("", "ChangeQQLoginType_kickout", false)) {
                        w45.b.f442900b = event;
                        w45.p pVar = new w45.p();
                        java.lang.Object l17 = gm0.j1.u().c().l(6, null);
                        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
                        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            db5.e1.C(context, context.getString(com.tencent.mm.R.string.f493043is1), null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bln), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490347sg), true, w45.k.f442911d, null);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChangeQQLoginType.LogoutHelper", "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(99L, 145L, 1L, false);
                            if (gm0.j1.d() != null && gm0.j1.d().f70764d != null) {
                                gm0.j1.d().f70764d.C(false);
                            }
                            com.tencent.mars.xlog.Log.w("MicroMsg.ChangeQQLoginType.LogoutHelper", "dklogout User LOGOUT Now uin:%d , clear cookie", java.lang.Integer.valueOf(gm0.j1.b().h()));
                            new com.tencent.mm.autogen.events.FcmUnRegisterEvent().e();
                            ((com.tencent.mm.plugin.expt.pageflow.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
                            com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                            w45.m mVar = new w45.m(pVar);
                            pVar.f442923c = mVar;
                            d17.a(255, mVar);
                            com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(2);
                            w0Var.f71444f = 2;
                            gm0.j1.d().g(w0Var);
                            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new w45.n(w0Var, pVar), false);
                            pVar.f442924d = b4Var;
                            b4Var.c(12000L, 12000L);
                            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            pVar.f442926f = db5.e1.Q(context2, context2.getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490393tq), true, false, new w45.o(w0Var, pVar));
                            if (gm0.j1.a()) {
                                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                                java.lang.String r17 = c01.z1.r();
                                ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                                c01.b9.f37069c.b(com.tencent.mm.modelavatar.g.c(r17, false, false));
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChangeQQLoginType.LogoutHelper", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
                        }
                    } else {
                        w45.b.f442899a.a(event);
                    }
                }
                return false;
            }
        };
    }

    public final void a(com.tencent.mm.autogen.events.WebViewExWindowCloseEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.Object obj = event.f54984g.f7221b.get("liteAppUuid");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        long parseLong = str != null ? java.lang.Long.parseLong(str) : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChangeQQLoginTypeManager", "NEXT_ESCAPE_CHANGE_QQ_LOGIN, liteAppUuid=" + parseLong);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.content.Intent intent = new android.content.Intent();
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(parseLong, intent);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, null, v45.c.class, w45.a.f442898d);
        f442900b = null;
    }
}
