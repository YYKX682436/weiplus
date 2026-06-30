package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes.dex */
public class j0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseMainUI f138080d;

    public j0(com.tencent.mm.plugin.fts.ui.FTSBaseMainUI fTSBaseMainUI) {
        this.f138080d = fTSBaseMainUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        this.f138080d.getStateCenter().B3(new b23.d(z17));
    }
}
