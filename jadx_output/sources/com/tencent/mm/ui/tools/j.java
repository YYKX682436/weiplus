package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ActionBarSearchView f210500d;

    public j(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView) {
        this.f210500d = actionBarSearchView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView = this.f210500d;
        actionBarSearchView.f209962e.setText("");
        com.tencent.mm.ui.tools.q qVar = actionBarSearchView.f209968n;
        if (qVar != null) {
            qVar.x();
        }
    }
}
