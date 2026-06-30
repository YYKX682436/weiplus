package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundedCornerFrameLayout f120624e;

    public c(com.tencent.mm.plugin.finder.live.wish.view.x xVar, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f120623d = xVar;
        this.f120624e = roundedCornerFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120623d;
        android.view.View view = xVar.f120675l;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f3w);
            java.lang.String string = textView.getContext().getString(com.tencent.mm.R.string.f491566dk0);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = textView.getContext().getString(com.tencent.mm.R.string.djz, string);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L <= string2.length()) {
                spannableString.setSpan(new com.tencent.mm.plugin.finder.live.wish.view.g(view, textView), L, string.length() + L, 33);
            }
            textView.setText(spannableString);
            textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            view.setOnTouchListener(com.tencent.mm.plugin.finder.live.wish.view.h.f120632d);
        }
        android.view.View view2 = xVar.f120675l;
        if (view2 != null) {
            view2.post(new com.tencent.mm.plugin.finder.live.wish.view.b(xVar, this.f120624e));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_GIFT_WALL_OPENED_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }
}
