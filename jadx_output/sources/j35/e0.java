package j35;

/* loaded from: classes5.dex */
public class e0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog f297504d;

    public e0(com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog) {
        this.f297504d = requestFloatWindowPermissionDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog = this.f297504d;
        requestFloatWindowPermissionDialog.f189529f = true;
        qp1.l0 l0Var = com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189526h;
        if (l0Var != null) {
            l0Var.d();
            com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189526h = null;
        }
        if (fp.h.c(23)) {
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) android.provider.Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(android.provider.Settings.class))) {
                    requestFloatWindowPermissionDialog.startActivityForResult(new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", android.net.Uri.parse("package:" + com.tencent.mm.sdk.platformtools.x2.f193072b)), 1234);
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RequestFloatWindowPermissionDialog", "getField:ACTION_MANAGE_OVERLAY_PERMISSION! Error:%s, etype:%s", e17.getMessage(), e17.getClass().getCanonicalName());
            }
        }
        java.lang.String string = requestFloatWindowPermissionDialog.getString(com.tencent.mm.R.string.fb_);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        j45.l.j(requestFloatWindowPermissionDialog, "webview", ".ui.tools.WebViewUI", intent, null);
        requestFloatWindowPermissionDialog.finish();
    }
}
