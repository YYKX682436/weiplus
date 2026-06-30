package hz2;

/* loaded from: classes.dex */
public final class a implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f286308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f286309c;

    public a(java.lang.String str, int i17, android.content.Context context) {
        this.f286307a = str;
        this.f286308b = i17;
        this.f286309c = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            java.lang.String linkUrl = this.f286307a;
            kotlin.jvm.internal.o.f(linkUrl, "$linkUrl");
            if ((linkUrl.length() > 0) && this.f286308b == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", linkUrl);
                j45.l.j(this.f286309c, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
    }
}
