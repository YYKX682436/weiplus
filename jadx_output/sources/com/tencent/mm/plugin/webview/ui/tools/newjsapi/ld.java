package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ld extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.od f186348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$JumpProfileData f186349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186350f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(com.tencent.mm.plugin.webview.ui.tools.newjsapi.od odVar, com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$JumpProfileData jsApiShowOpenIMContactProfile$JumpProfileData, com.tencent.mm.ipcinvoker.r rVar) {
        super(0);
        this.f186348d = odVar;
        this.f186349e = jsApiShowOpenIMContactProfile$JumpProfileData;
        this.f186350f = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.od odVar = this.f186348d;
        odVar.getClass();
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$JumpProfileData jsApiShowOpenIMContactProfile$JumpProfileData = this.f186349e;
        com.tencent.mm.ipcinvoker.r rVar = this.f186350f;
        if (jsApiShowOpenIMContactProfile$JumpProfileData != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.ggd), true, 3, null);
            f17.setOnCancelListener(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.md(((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Di(context, jsApiShowOpenIMContactProfile$JumpProfileData.f185923d, jsApiShowOpenIMContactProfile$JumpProfileData.f185926g, jsApiShowOpenIMContactProfile$JumpProfileData.f185925f, jsApiShowOpenIMContactProfile$JumpProfileData.f185927h, jsApiShowOpenIMContactProfile$JumpProfileData.f185928i, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.nd(rVar, odVar, f17)), rVar, odVar));
        } else if (rVar != null) {
            rVar.a(odVar.a("fail_data_null", null));
        }
        return jz5.f0.f302826a;
    }
}
