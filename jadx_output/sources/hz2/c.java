package hz2;

/* loaded from: classes.dex */
public final class c implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f286312b;

    public c(java.lang.String str, android.content.Context context) {
        this.f286311a = str;
        this.f286312b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            java.lang.String linkUrl = this.f286311a;
            kotlin.jvm.internal.o.f(linkUrl, "$linkUrl");
            if (linkUrl.length() > 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", linkUrl);
                j45.l.j(this.f286312b, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
    }
}
