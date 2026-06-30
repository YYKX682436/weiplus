package uw4;

/* loaded from: classes.dex */
public final class r implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f431748b;

    public r(java.lang.String str, android.content.Context context) {
        this.f431747a = str;
        this.f431748b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public final void a() {
        java.lang.String str = this.f431747a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMenuSheetHelper", "webview recent share: onContentClick: url is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("hide_option_menu", true);
        j45.l.j(this.f431748b, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
