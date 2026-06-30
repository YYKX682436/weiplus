package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class p3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel f116579d;

    public p3(com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel) {
        this.f116579d = finderLiveCommentPostRealNamePanel;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
        com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = this.f116579d;
        yz5.q qVar = finderLiveCommentPostRealNamePanel.f115825d;
        if (qVar != null) {
            android.content.Context context = finderLiveCommentPostRealNamePanel.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            qVar.invoke(context, intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(android.graphics.Color.parseColor("#7D90A9"));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
