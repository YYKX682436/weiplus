package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class je extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.se f118754d;

    public je(com.tencent.mm.plugin.finder.live.widget.se seVar) {
        this.f118754d = seVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("license click,licenseClickCallback is null:");
        com.tencent.mm.plugin.finder.live.widget.se seVar = this.f118754d;
        sb6.append(seVar.f119758f == null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveExceptionWidget", sb6.toString());
        yz5.l lVar = seVar.f119758f;
        if (lVar == null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
            j45.l.j(widget.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else if (lVar != null) {
            lVar.invoke("https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f118754d.f119753a.getContext().getResources().getColor(com.tencent.mm.R.color.Link_80));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
