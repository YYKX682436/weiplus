package k13;

/* loaded from: classes5.dex */
public final class j implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI f303225a;

    public j(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI forceNotifyAcceptUI) {
        this.f303225a = forceNotifyAcceptUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        boolean c17 = fp.h.c(23);
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI forceNotifyAcceptUI = this.f303225a;
        if (c17) {
            try {
                java.lang.Object obj = android.provider.Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(android.provider.Settings.class);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) obj)) {
                    forceNotifyAcceptUI.startActivityForResult(new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + com.tencent.mm.sdk.platformtools.x2.f193072b)), forceNotifyAcceptUI.f137331e);
                    return;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        java.lang.String string = forceNotifyAcceptUI.getString(com.tencent.mm.R.string.fb_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        j45.l.j(forceNotifyAcceptUI, "webview", ".ui.tools.WebViewUI", intent, null);
        forceNotifyAcceptUI.finish();
    }
}
