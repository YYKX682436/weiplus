package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.InputPanelLinearLayout f173177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f173178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f173179f;

    public w5(com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout, int i17, android.widget.ScrollView scrollView) {
        this.f173177d = inputPanelLinearLayout;
        this.f173178e = i17;
        this.f173179f = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = this.f173177d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(inputPanelLinearLayout.getHeight());
        int i17 = this.f173178e;
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeGuardianInfoUI", "inputContainer.height: %d, screenHeight: %d", valueOf, java.lang.Integer.valueOf(i17));
        if (inputPanelLinearLayout.getHeight() > i17) {
            this.f173179f.scrollBy(0, inputPanelLinearLayout.getHeight() - i17);
        }
    }
}
