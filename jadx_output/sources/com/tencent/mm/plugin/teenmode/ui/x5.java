package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class x5 implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f173185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI f173186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.InputPanelLinearLayout f173187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f173188g;

    public x5(android.widget.Button button, com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI, com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout, android.widget.ScrollView scrollView) {
        this.f173185d = button;
        this.f173186e = teenModeGuardianInfoUI;
        this.f173187f = inputPanelLinearLayout;
        this.f173188g = scrollView;
    }

    @Override // al5.e0
    public final void J2(boolean z17, int i17) {
        android.widget.Button button = this.f173185d;
        android.view.ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        android.widget.ScrollView scrollView = this.f173188g;
        com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI = this.f173186e;
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = this.f173187f;
        if (!z17) {
            layoutParams2.bottomMargin = teenModeGuardianInfoUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
            layoutParams2.topMargin = 0;
            button.setLayoutParams(layoutParams2);
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), inputPanelLinearLayout.getPaddingTop(), inputPanelLinearLayout.getPaddingRight(), 0);
            scrollView.scrollBy(0, 0);
            return;
        }
        layoutParams2.bottomMargin = teenModeGuardianInfoUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn);
        layoutParams2.topMargin = teenModeGuardianInfoUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db);
        button.setLayoutParams(layoutParams2);
        inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), inputPanelLinearLayout.getPaddingTop(), inputPanelLinearLayout.getPaddingRight(), i17);
        int height = scrollView.getHeight();
        inputPanelLinearLayout.requestLayout();
        inputPanelLinearLayout.post(new com.tencent.mm.plugin.teenmode.ui.w5(inputPanelLinearLayout, height, scrollView));
    }
}
