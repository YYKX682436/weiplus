package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class lp extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pp f118968d;

    public lp(com.tencent.mm.plugin.finder.live.widget.pp ppVar) {
        this.f118968d = ppVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMicSearchRecommAnchorPanelWidget$initRandomLinkGuideSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        ml2.q2 q2Var = ml2.q2.P;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 44 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        com.tencent.mm.plugin.finder.live.widget.pp ppVar = this.f118968d;
        ((mm2.o4) ppVar.f119395a.a(mm2.o4.class)).R = 4;
        ((mm2.o4) ppVar.f119395a.a(mm2.o4.class)).Q.postValue(java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMicSearchRecommAnchorPanelWidget$initRandomLinkGuideSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f118968d.f119396b.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
