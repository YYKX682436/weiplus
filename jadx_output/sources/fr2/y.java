package fr2;

/* loaded from: classes2.dex */
public final class y extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.z f265772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f265774f;

    public y(fr2.z zVar, java.lang.String str, android.graphics.drawable.Drawable drawable) {
        this.f265772d = zVar;
        this.f265773e = str;
        this.f265774f = drawable;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeContentHeaderUIC$setSubTitleText$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        fr2.z zVar = this.f265772d;
        android.app.Activity context = zVar.getContext();
        zVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetailClick jumpUrl: ");
        java.lang.String str = this.f265773e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderLiveThemeContentH", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeContentHeaderUIC$setSubTitleText$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        this.f265774f.setAlpha(127);
        ds6.setColor(this.f265772d.getContext().getResources().getColor(com.tencent.mm.R.color.f479105q4));
        ds6.setUnderlineText(false);
    }
}
