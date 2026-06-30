package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes12.dex */
public class y6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.a7 f185569d;

    public y6(com.tencent.mm.plugin.webview.ui.tools.jsapi.a7 a7Var) {
        this.f185569d = a7Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.autogen.events.ExtTranslateVoiceEvent extTranslateVoiceEvent = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent();
        extTranslateVoiceEvent.f54213g.f8179c = 3;
        extTranslateVoiceEvent.e();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.a7 a7Var = this.f185569d;
        a7Var.f184925h.i5(a7Var.f184922e, "translateVoice:fail", null);
    }
}
