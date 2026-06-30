package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public final class b3 {
    public b3(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.View feedbackView, java.lang.String query) {
        kotlin.jvm.internal.o.g(feedbackView, "feedbackView");
        kotlin.jvm.internal.o.g(query, "query");
        android.view.View inflate = android.view.View.inflate(feedbackView.getContext(), com.tencent.mm.R.layout.en6, null);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        android.view.View rootView = feedbackView.getRootView();
        kotlin.jvm.internal.o.f(rootView, "getRootView(...)");
        ym5.v6.b(rootView, inflate);
        rl5.r rVar = new rl5.r(feedbackView.getContext(), feedbackView);
        rVar.E = true;
        rVar.S = false;
        rVar.f397335J = feedbackView.getContext().getString(com.tencent.mm.R.string.ogh);
        rVar.f397353w = new com.tencent.mm.plugin.fts.ui.z2(feedbackView, query);
        rVar.L = new com.tencent.mm.plugin.fts.ui.a3(inflate);
        rVar.m();
    }
}
