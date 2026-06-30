package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z3 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f120515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f120517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120518g;

    public z3(android.view.View view, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.live.widget.b4 b4Var, java.lang.String str) {
        this.f120515d = view;
        this.f120516e = h0Var;
        this.f120517f = b4Var;
        this.f120518g = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f120515d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        java.lang.Object element = this.f120516e.f310123d;
        kotlin.jvm.internal.o.f(element, "element");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView) element;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f120517f.f117820a.getContext();
        ((ke0.e) xVar).getClass();
        java.lang.String spannableString = com.tencent.mm.pluginsdk.ui.span.c0.n(context, this.f120518g, 0.0f).toString();
        kotlin.jvm.internal.o.f(spannableString, "toString(...)");
        int width = view.getWidth();
        java.lang.String str = com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView.f115893x1;
        finderLiveFoldTextView.o(spannableString, 5, width, true, null, false, false);
    }
}
