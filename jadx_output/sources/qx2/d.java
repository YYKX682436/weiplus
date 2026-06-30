package qx2;

/* loaded from: classes2.dex */
public final class d extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx2.g f367329e;

    public d(java.lang.String str, qx2.g gVar) {
        this.f367328d = str;
        this.f367329e = gVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f367328d);
        j45.l.j(this.f367329e.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(android.graphics.Color.parseColor("#7D90A9"));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
