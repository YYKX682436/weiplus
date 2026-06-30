package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class cf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qf f134017d;

    public cf(com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar) {
        this.f134017d = qfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.text.TextPaint paint;
        com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar = this.f134017d;
        if (qfVar.getActivity().isFinishing() || qfVar.getActivity().isDestroyed()) {
            return;
        }
        android.view.View inflate = android.view.View.inflate(qfVar.getContext(), com.tencent.mm.R.layout.aco, null);
        db5.d5 d5Var = qfVar.f135698h;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        db5.d5 d5Var2 = new db5.d5(inflate);
        d5Var2.setAnimationStyle(com.tencent.mm.R.style.f494816x2);
        qfVar.f135698h = d5Var2;
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g2p) : null;
        android.widget.TextView textView2 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g2q) : null;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.g2n) : null;
        java.lang.String string = qfVar.getActivity().getResources().getString(com.tencent.mm.R.string.cox);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        int measureText = (textView2 == null || (paint = textView2.getPaint()) == null) ? 0 : (int) paint.measureText(string);
        java.lang.String string2 = qfVar.getActivity().getResources().getString(com.tencent.mm.R.string.f492072f51, qfVar.f135697g);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        if (textView != null) {
            int b17 = (com.tencent.mm.ui.bh.a(qfVar.getContext()).f197135a - i65.a.b(qfVar.getContext(), 136)) - measureText;
            if (b17 <= 0) {
                qfVar.f135698h = null;
                com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", "showTipsBar error, availableWidth:" + b17);
                return;
            }
            android.text.TextPaint paint2 = textView.getPaint();
            kotlin.jvm.internal.o.f(paint2, "getPaint(...)");
            android.text.StaticLayout staticLayout = new android.text.StaticLayout(string2, 0, string2.length(), paint2, b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
            if (staticLayout.getLineCount() > 2) {
                java.lang.String string3 = textView.getContext().getString(com.tencent.mm.R.string.f492073f52);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                int measureText2 = (int) textView.getPaint().measureText(string3);
                int lineEnd = staticLayout.getLineEnd(0);
                java.lang.String substring = string2.substring(0, lineEnd);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                int lineStart = staticLayout.getLineStart(1);
                java.lang.String substring2 = string2.substring(lineStart, string2.length());
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                int i17 = b17 - measureText2;
                if (i17 <= 0) {
                    qfVar.f135698h = null;
                    com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", "showTipsBar error, leftAvailableWidth:" + i17);
                    return;
                }
                android.text.TextPaint paint3 = textView.getPaint();
                kotlin.jvm.internal.o.f(paint3, "getPaint(...)");
                int lineEnd2 = new android.text.StaticLayout(substring2, 0, substring2.length(), paint3, i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineEnd(0);
                java.lang.String substring3 = substring2.substring(0, lineEnd2);
                kotlin.jvm.internal.o.f(substring3, "substring(...)");
                android.text.SpannableString spannableString = new android.text.SpannableString(substring + substring3 + string3);
                com.tencent.mars.xlog.Log.i("FinderFeedShareDescToCommentUIC", lineEnd + ' ' + lineStart + ' ' + lineEnd2 + " textLine0=" + substring + " textLine1=" + substring3 + " textStartFromLine1=" + substring2);
                textView.setText(spannableString);
            } else {
                textView.setText(string2);
            }
        }
        if (textView2 != null) {
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.of(qfVar));
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.pf(qfVar));
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = qfVar.f135696f;
        java.lang.String u17 = pm0.v.u(finderItem != null ? finderItem.getExpectId() : 0L);
        kotlin.jvm.internal.o.d(inflate);
        qfVar.P6(inflate, "guide_bubble", u17, qfVar.f135697g, 32);
        if (textView2 != null) {
            qfVar.P6(textView2, "guide_bubble_comment_button", u17, qfVar.f135697g, 8);
        }
        if (findViewById != null) {
            qfVar.P6(findViewById, "guide_bubble_close_button", u17, qfVar.f135697g, 8);
        }
        db5.d5 d5Var3 = qfVar.f135698h;
        if (d5Var3 != null) {
            d5Var3.setWidth(-1);
        }
        db5.d5 d5Var4 = qfVar.f135698h;
        if (d5Var4 != null) {
            d5Var4.setHeight(-2);
        }
        int dimensionPixelSize = qfVar.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479650ab4);
        db5.d5 d5Var5 = qfVar.f135698h;
        if (d5Var5 != null) {
            d5Var5.showAtLocation(qfVar.getContext().getWindow().getDecorView(), 80, 0, dimensionPixelSize);
        }
        qfVar.Q6(true);
    }
}
