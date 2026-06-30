package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class wf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f211231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView f211232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f211233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f211234g;

    public wf(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI, int[] iArr, com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView, android.view.ViewGroup viewGroup) {
        this.f211234g = newChattingTabUI;
        this.f211231d = iArr;
        this.f211232e = fitSystemWindowLayoutView;
        this.f211233f = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f211234g;
        newChattingTabUI.f197014a.getSupportActionBar().j().getLocationInWindow(this.f211231d);
        int j17 = newChattingTabUI.j();
        com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = this.f211232e;
        if (j17 <= 0) {
            if (fp.h.c(20)) {
                fitSystemWindowLayoutView.setOnApplyWindowInsetsListener(new com.tencent.mm.ui.vf(this));
            }
        } else {
            android.graphics.Rect rect = new android.graphics.Rect(0, j17, 0, 0);
            ((com.tencent.mm.ui.HomeUI) newChattingTabUI.f197015b).getClass();
            fitSystemWindowLayoutView.setActionBarContainer(this.f211233f);
            fitSystemWindowLayoutView.fitSystemWindows(rect);
        }
    }
}
