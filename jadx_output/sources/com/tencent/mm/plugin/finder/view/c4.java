package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f131748d;

    public c4(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f131748d = finderCollapsibleTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f131748d;
        try {
            boolean z17 = true;
            float f17 = finderCollapsibleTextView.getContentTextView().getLayout().f(finderCollapsibleTextView.getContentTextView().getLayout().g(finderCollapsibleTextView.getLimitLine() - 1, Float.MAX_VALUE));
            int width = finderCollapsibleTextView.getContentTextView().getWidth();
            if (finderCollapsibleTextView.f130896u != 0.0f) {
                z17 = false;
            }
            if (z17) {
                finderCollapsibleTextView.f130896u = finderCollapsibleTextView.getCollapseTextView().getPaint().measureText(finderCollapsibleTextView.getContext().getResources().getString(com.tencent.mm.R.string.f491276cl4));
            }
            float f18 = finderCollapsibleTextView.f130896u + 3;
            if (!finderCollapsibleTextView.getFadeCollapseStyle()) {
                com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView.c(finderCollapsibleTextView, f17, width, f18);
            } else {
                finderCollapsibleTextView.getClass();
                finderCollapsibleTextView.post(new com.tencent.mm.plugin.finder.view.d4(finderCollapsibleTextView, width, f18));
            }
        } catch (java.lang.Exception e17) {
            java.lang.String str = "#2:Exception:" + e17.getMessage();
            com.tencent.mm.plugin.finder.view.q3 q3Var = com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView.f130881z;
            finderCollapsibleTextView.d(str);
        }
    }
}
