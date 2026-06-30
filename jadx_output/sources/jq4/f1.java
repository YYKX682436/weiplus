package jq4;

/* loaded from: classes5.dex */
public final class f1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog f301145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f301146b;

    public f1(com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog voipFloatCardPermissionDialog, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f301145a = voipFloatCardPermissionDialog;
        this.f301146b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        boolean c17 = fp.h.c(23);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f301146b;
        com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog voipFloatCardPermissionDialog = this.f301145a;
        if (c17) {
            try {
                java.lang.Object obj = android.provider.Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(android.provider.Settings.class);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) obj)) {
                    com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog voipFloatCardPermissionDialog2 = this.f301145a;
                    android.content.Intent intent = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + com.tencent.mm.sdk.platformtools.x2.f193072b));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(voipFloatCardPermissionDialog2, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog$showDialog$dialog$1$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    voipFloatCardPermissionDialog2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(voipFloatCardPermissionDialog2, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog$showDialog$dialog$1$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    z2Var.B();
                    voipFloatCardPermissionDialog.finish();
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("VoipFloatCardPermission", "getField:ACTION_MANAGE_OVERLAY_PERMISSION! Error:%s, etype:%s", e17.getMessage(), e17.getClass().getCanonicalName());
            }
        }
        java.lang.String string = voipFloatCardPermissionDialog.getString(com.tencent.mm.R.string.fb_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", string);
        intent2.putExtra("useJs", true);
        intent2.putExtra("vertical_scroll", true);
        j45.l.j(voipFloatCardPermissionDialog, "webview", ".ui.tools.WebViewUI", intent2, null);
        z2Var.B();
        voipFloatCardPermissionDialog.finish();
    }
}
