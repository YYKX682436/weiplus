package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class s7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderKitUI f129796d;

    public s7(com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI) {
        this.f129796d = finderKitUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = dialogInterface instanceof com.tencent.mm.ui.widget.dialog.j0 ? (com.tencent.mm.ui.widget.dialog.j0) dialogInterface : null;
        java.lang.String h17 = j0Var != null ? j0Var.h() : null;
        if (h17 == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", h17);
        intent.putExtra("convertActivityFromTranslucent", true);
        intent.putExtra("immersiveUIStyle", 1);
        intent.putExtra("immersivePageBgIsDark", true);
        intent.putExtra("webview_bg_color_rsID", android.R.color.black);
        intent.putExtra("customize_status_bar_color", -16777216);
        intent.addFlags(268435456);
        j45.l.j(this.f129796d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
