package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class e5 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView f116272d;

    public e5(com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView) {
        this.f116272d = finderLiveFoldTextView;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeCanFoldFullText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView = this.f116272d;
        finderLiveFoldTextView.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFoldTextView", "fold execute");
        if (!finderLiveFoldTextView.f115897p1) {
            finderLiveFoldTextView.setMaxLines(finderLiveFoldTextView.f115895l1);
        }
        finderLiveFoldTextView.b(finderLiveFoldTextView.f115898x0);
        finderLiveFoldTextView.isFolding = true;
        finderLiveFoldTextView.setScrollY(0);
        yz5.a aVar = finderLiveFoldTextView.foldListener;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView$makeCanFoldFullText$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        ds6.setColor(this.f116272d.getContext().getResources().getColor(com.tencent.mm.R.color.f479049ak4));
    }
}
