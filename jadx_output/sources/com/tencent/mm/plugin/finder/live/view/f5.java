package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class f5 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView f116291d;

    public f5(com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView) {
        this.f116291d = finderLiveFoldTextView;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeFoldingText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView = this.f116291d;
        finderLiveFoldTextView.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFoldTextView", "unfold execute");
        finderLiveFoldTextView.setMaxLines(88);
        finderLiveFoldTextView.b(finderLiveFoldTextView.f115899y0);
        finderLiveFoldTextView.isFolding = false;
        yz5.a aVar = finderLiveFoldTextView.unFoldListener;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeFoldingText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        ds6.setColor(this.f116291d.getContext().getResources().getColor(com.tencent.mm.R.color.f479049ak4));
    }
}
