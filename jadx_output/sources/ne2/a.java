package ne2;

/* loaded from: classes2.dex */
public final class a extends android.text.style.ClickableSpan {
    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/charge/ChargeUtil$SpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mars.xlog.Log.i("setWhiteListSetterText", "copy https://channels.weixin.qq.com");
        com.tencent.mm.sdk.platformtools.b0.e("https://channels.weixin.qq.com");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.f490361st));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/charge/ChargeUtil$SpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
