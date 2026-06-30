package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bf extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.cf f117876d;

    public bf(com.tencent.mm.plugin.finder.live.widget.cf cfVar) {
        this.f117876d = cfVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View p07) {
        java.lang.String str;
        r45.eq1 eq1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$setSubTitleContent$1$rightSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(p07, "p0");
        android.content.Intent intent = new android.content.Intent();
        mm2.n2 n2Var = (mm2.n2) dk2.ef.f233372a.i(mm2.n2.class);
        if (n2Var == null || (eq1Var = n2Var.f329279g) == null || (str = eq1Var.getString(3)) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        com.tencent.mm.plugin.finder.live.widget.cf cfVar = this.f117876d;
        android.view.View view = cfVar.K;
        j45.l.j(view != null ? view.getContext() : null, "webview", ".ui.tools.WebViewUI", intent, null);
        cfVar.e0();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$setSubTitleContent$1$rightSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f117876d.f118183e.getResources().getColor(com.tencent.mm.R.color.Link_100));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
