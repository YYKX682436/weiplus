package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class tc implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210780d;

    public tc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210780d = showVideoUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210780d;
        showVideoUI.f210226n.getViewTreeObserver().removeOnPreDrawListener(this);
        showVideoUI.f210235w.c(showVideoUI.f210226n, showVideoUI.f210225m, new com.tencent.mm.ui.tools.sc(this));
        return true;
    }
}
