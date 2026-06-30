package rn2;

/* loaded from: classes2.dex */
public final class l3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f397795d;

    public l3(java.lang.ref.WeakReference rActivity) {
        kotlin.jvm.internal.o.g(rActivity, "rActivity");
        this.f397795d = rActivity;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/LotteryCreateLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        android.app.Activity activity = (android.app.Activity) this.f397795d.get();
        if (activity == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("LotteryCreateLicenseSpanClick", "on click but activity is null!", null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/LotteryCreateLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/3qn8dN8csoj0w1d2");
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent, null);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/LotteryCreateLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(android.graphics.Color.parseColor("#7D90A9"));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
