package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class g implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ActionBarSearchView f210433d;

    public g(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView) {
        this.f210433d = actionBarSearchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView = this.f210433d;
        android.view.View.OnFocusChangeListener onFocusChangeListener = actionBarSearchView.f209972r;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
        actionBarSearchView.i(z17);
    }
}
