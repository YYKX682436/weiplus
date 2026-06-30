package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes12.dex */
public class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ExtTranslateVoiceEvent f185589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.a7 f185590e;

    public z6(com.tencent.mm.plugin.webview.ui.tools.jsapi.a7 a7Var, com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent) {
        this.f185590e = a7Var;
        this.f185589d = extTranslateVoiceEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent = this.f185589d;
        if (extTranslateVoiceEvent.f54214h.f8269b) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.a7 a7Var = this.f185590e;
            android.app.ProgressDialog progressDialog = a7Var.f184925h.f184979h;
            if (progressDialog != null) {
                progressDialog.dismiss();
                a7Var.f184925h.f184979h = null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(extTranslateVoiceEvent.f54214h.f8268a)) {
                a7Var.f184925h.i5(a7Var.f184922e, "translateVoice:fail", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("translateResult", extTranslateVoiceEvent.f54214h.f8268a);
            a7Var.f184925h.i5(a7Var.f184922e, "translateVoice:ok", hashMap);
        }
    }
}
