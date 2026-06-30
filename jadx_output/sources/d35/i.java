package d35;

/* loaded from: classes12.dex */
public final class i implements sm0.e {

    /* renamed from: a, reason: collision with root package name */
    public static final d35.i f226347a = new d35.i();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f226348b = false;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f226349c = "";

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LogoutEvent>(a0Var) { // from class: com.tencent.mm.pluginsdk.model.file.FileSmartServerMgr$logoutListener$1
            {
                this.__eventId = 276997888;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LogoutEvent logoutEvent) {
                com.tencent.mm.autogen.events.LogoutEvent event = logoutEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.FileSmartServerMgr", "LogoutEvent " + event.f54484g.f6836a);
                d35.i iVar = d35.i.f226347a;
                com.tencent.mm.lan_cs.SmartServer$Java2C.stopSmartServer();
                jz5.f0 f0Var = jz5.f0.f302826a;
                d35.i.f226348b = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.FileSmartServerMgr", "stop result:" + f0Var);
                return false;
            }
        }.alive();
    }

    public final java.lang.String a(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        if (!f226348b) {
            return "";
        }
        return "/lan_" + msgInfo.Q0() + '_' + gm0.m.g() + '_' + msgInfo.getMsgId() + '_' + msgInfo.getCreateTime();
    }

    public final long b() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_file_lan_send_idle_timeout_ms, 60000L);
    }

    public final java.lang.String c(java.lang.String cgi, java.lang.String aesKey) {
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        return f226349c + cgi + ';' + aesKey;
    }

    public final void d(com.tencent.mm.storage.f9 f9Var) {
        jz5.f0 f0Var;
        if (f9Var != null) {
            java.lang.String a17 = f226347a.a(f9Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSmartServerMgr", "removeFileInfo cgi:" + a17 + ' ' + com.tencent.mm.lan_cs.SmartServer$Java2C.removeFileInfo(a17));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileSmartServerMgr", "removeFileInfo msgInfo is null");
        }
    }

    public final void e() {
        java.lang.Object[] startSmartServer;
        java.lang.String string;
        if (f226348b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSmartServerMgr", "start no");
            return;
        }
        f226348b = false;
        sm0.f.f409313a = this;
        startSmartServer = com.tencent.mm.lan_cs.SmartServer$Java2C.startSmartServer();
        jz5.f0 f0Var = null;
        if (startSmartServer != null) {
            java.lang.Object obj = startSmartServer[0];
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            boolean z17 = num != null && num.intValue() > 0;
            f226348b = z17;
            if (z17) {
                try {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cf_, startSmartServer[1].toString(), startSmartServer[2].toString());
                    kotlin.jvm.internal.o.d(string);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FileSmartServerMgr", "start " + e17.getClass().getSimpleName() + ' ' + e17.getMessage());
                }
            } else {
                string = "";
            }
            f226349c = string;
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSmartServerMgr", "start startServer:" + f226348b + " serverUrl:" + f226349c);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileSmartServerMgr", "start result is null");
        }
        jx3.f.INSTANCE.idkeyStat(1680L, f226348b ? 0L : 1L, 1L, false);
    }
}
