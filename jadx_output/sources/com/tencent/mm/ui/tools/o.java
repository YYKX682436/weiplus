package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ActionBarSearchView f210610d;

    public o(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView) {
        this.f210610d = actionBarSearchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView = this.f210610d;
        com.tencent.mm.ui.tools.ActionBarSearchView.ActionBarEditText actionBarEditText = actionBarSearchView.f209962e;
        if (actionBarEditText == null) {
            return;
        }
        actionBarEditText.requestFocus();
        if (actionBarSearchView.hasWindowFocus()) {
            actionBarSearchView.l();
        } else {
            actionBarSearchView.getViewTreeObserver().addOnWindowFocusChangeListener(new com.tencent.mm.ui.tools.n(this));
        }
    }
}
