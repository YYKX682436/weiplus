package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes10.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static org.json.JSONObject f176983b;

    /* renamed from: c, reason: collision with root package name */
    public static org.json.JSONObject f176984c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.ui.s0 f176982a = new com.tencent.mm.plugin.voip.ui.s0();

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voip.ui.VoipAutomatedTestSetupShell$listener$1 f176985d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShellExecEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.voip.ui.VoipAutomatedTestSetupShell$listener$1
        {
            this.__eventId = -2024436119;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ShellExecEvent shellExecEvent) {
            com.tencent.mm.autogen.events.ShellExecEvent event = shellExecEvent;
            kotlin.jvm.internal.o.g(event, "event");
            if (!z65.c.a()) {
                return true;
            }
            am.lu luVar = event.f54777g;
            if (!kotlin.jvm.internal.o.b(luVar.f7274b, "wechat.shell.SET_VOIP_SETTING_CUSTOM")) {
                return true;
            }
            com.tencent.mm.plugin.voip.ui.s0 s0Var = com.tencent.mm.plugin.voip.ui.s0.f176982a;
            android.content.Intent intent = luVar.f7273a;
            kotlin.jvm.internal.o.f(intent, "intent");
            java.lang.String stringExtra = intent.getStringExtra("config_path");
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.j(com.tencent.mm.sdk.platformtools.x2.f193071a, 1, new com.tencent.mm.plugin.voip.ui.q0(stringExtra), new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, null, null);
            return true;
        }
    };

    public final void a() {
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_VOIP_TestEncodeParam_Int, 0);
        org.json.JSONObject jSONObject = f176983b;
        org.json.JSONObject jSONObject2 = f176984c;
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalFilesDir(null) + "/voip_test_result.json";
        if (g17 == 0 || jSONObject == null || jSONObject2 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "write report to " + str);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("temperature", jSONObject);
        jSONObject3.put("render", jSONObject2);
        com.tencent.mm.vfs.w6.h(str);
        com.tencent.mm.vfs.w6.e(str);
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        byte[] bytes = jSONObject4.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        com.tencent.mm.vfs.w6.S(str, bytes, 0, bytes.length);
        f176983b = null;
        f176984c = null;
    }
}
