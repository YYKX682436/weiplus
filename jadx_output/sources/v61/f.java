package v61;

@j95.b
/* loaded from: classes10.dex */
public final class f extends i95.w implements zl.i {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f433435d = jz5.h.b(v61.e.f433433d);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.model.AuthSyncMsgService$exptListener$1 f433436e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.account.model.AuthSyncMsgService$exptListener$1] */
    public f() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f433436e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.account.model.AuthSyncMsgService$exptListener$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.AuthSyncMsgService", "received ExptChangeEvent");
                v61.f.this.Ai();
                return false;
            }
        };
    }

    public final void Ai() {
        int b17 = ih.a.b("clicfg_login_agree_sync_msg_enable_solid", 1);
        Bi().A("auth_sync_expt_enable_key", b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthSyncMsgService", "expt config clicfg_login_agree_sync_msg_enable: " + b17);
    }

    public final com.tencent.mm.sdk.platformtools.o4 Bi() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f433435d).getValue();
    }

    public boolean Di() {
        int i17 = Bi().getInt("auth_sync_expt_enable_key", 0);
        if (i17 == 0) {
            Ni(0);
        }
        return i17 != 0;
    }

    public void Ni(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthSyncMsgService", "setAuthSyncFlag: " + i17);
        if (i17 == 1) {
            Bi().putInt("auth_sync_flag_key", 1);
        } else if (i17 != 2) {
            Bi().putInt("auth_sync_flag_key", 0);
        } else {
            Bi().putInt("auth_sync_flag_key", 2);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthSyncMsgService", "onAccountInitialized");
        Ai();
        alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthSyncMsgService", "onAccountReleased");
        if (Di()) {
            Ni(2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthSyncMsgService", "onAccountReleased done");
    }

    public int wi() {
        int i17 = Bi().getInt("auth_sync_flag_key", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthSyncMsgService", "getAuthSyncFlag: " + i17);
        return i17;
    }
}
