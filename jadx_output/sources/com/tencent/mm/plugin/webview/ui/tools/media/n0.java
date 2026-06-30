package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public ot0.m1 f185807a;

    public final boolean a(android.app.Activity activity, int i17, int i18, android.content.Intent intent) {
        nw4.n nVar;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (203 != i17) {
            return false;
        }
        if (this.f185807a == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MPVideoTransmit", "onActivityResult mpMsgInfo is null");
            return true;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            if (stringExtra != null) {
                ot0.m1 m1Var = this.f185807a;
                kotlin.jvm.internal.o.d(m1Var);
                com.tencent.mm.plugin.webview.ui.tools.media.m0 m0Var = new com.tencent.mm.plugin.webview.ui.tools.media.m0(this, activity);
                com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable mpVideoDataParcelable = new com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable();
                mpVideoDataParcelable.f185729d = stringExtra;
                mpVideoDataParcelable.f185731f = stringExtra2;
                mpVideoDataParcelable.f185733h = m1Var;
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, mpVideoDataParcelable, com.tencent.mm.plugin.webview.ui.tools.media.h0.class, m0Var);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MPVideoTransmit", "share cancel");
            if ((activity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) && (nVar = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) activity).f183844p0) != null) {
                ot0.m1 m1Var2 = this.f185807a;
                kotlin.jvm.internal.o.d(m1Var2);
                nVar.E(m1Var2.f373341f, "canceled");
            }
        }
        return true;
    }
}
