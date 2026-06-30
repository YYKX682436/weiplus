package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class qc extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.rc f116611d;

    public qc(com.tencent.mm.plugin.finder.live.view.rc rcVar) {
        this.f116611d = rcVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/ScreenRecordSystemAllowGuideWidget$initContentView$3$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.finder.live.view.rc rcVar = this.f116611d;
        yz5.a aVar = rcVar.f116661m;
        if (aVar != null) {
            aVar.invoke();
        }
        rcVar.getClass();
        i95.m c17 = i95.n0.c(zg0.u2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) zg0.u2.K2((zg0.u2) c17, rcVar.f118381d, "https://channels-aladin.wxqcloud.qq.com/aladin/html/f3737be7-ef4a-4bb0-acc2-7aabe7d27597.html?hexBackgroundColor=FFFFFF#/", null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, 1, false, false, 0, false, false, 0, false, false, false, "#FFFFFF", false, 0, false, 2, false, false, false, 7831247, null), 4, null)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/ScreenRecordSystemAllowGuideWidget$initContentView$3$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f116611d.f118381d.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
    }
}
