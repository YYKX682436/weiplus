package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vt extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wt f120088d;

    public vt(com.tencent.mm.plugin.finder.live.widget.wt wtVar) {
        this.f120088d = wtVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelTipWidget$setCopyLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.finder.live.widget.wt wtVar = this.f120088d;
        wtVar.getClass();
        com.tencent.mm.sdk.platformtools.b0.e("https://channels.weixin.qq.com/");
        android.content.Context context = wtVar.f118381d;
        db5.t7.h(context, context.getString(com.tencent.mm.R.string.f490361st));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayCancelTipWidget$setCopyLink$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f120088d.f118381d.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
