package yf2;

/* loaded from: classes2.dex */
public final class i0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f461715e;

    public i0(java.lang.String str, android.content.Context context) {
        this.f461714d = str;
        this.f461715e = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLivePostLicenseWidget$buildAgreementCheckboxText$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f461714d);
        j45.l.j(this.f461715e, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLivePostLicenseWidget$buildAgreementCheckboxText$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f461715e.getResources().getColor(com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
    }
}
