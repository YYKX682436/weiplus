package dz4;

/* loaded from: classes8.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245196a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245197b;

    public d1(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245196a = holder;
        this.f245197b = "MicroMsg.WeNoteFlutterComplaintHelper";
    }

    public final void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
        kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{57}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        try {
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f245197b, "Failed to start H5 page", e17);
        }
    }
}
