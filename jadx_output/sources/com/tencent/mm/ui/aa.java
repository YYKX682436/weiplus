package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class aa extends com.tencent.mm.ui.ga {

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f197127y0;

    public aa(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f197127y0 = mMActivity;
    }

    @Override // com.tencent.mm.ui.ga
    public s75.b B() {
        return this.f197127y0.getIdentString();
    }

    @Override // com.tencent.mm.ui.ga
    public int C() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f197127y0;
        int layoutId = mMActivity.getLayoutId();
        return layoutId == 0 ? mMActivity.getLayoutUIC().getLayoutId() : layoutId;
    }

    @Override // com.tencent.mm.ui.ga
    public android.view.View D() {
        return this.f197127y0.getLayoutView();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean T() {
        return this.f197127y0.isActionbarCenterLayoutMode();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean U() {
        return this.f197127y0.isActionbarMenuUseOriginalSys();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean V() {
        return false;
    }

    @Override // com.tencent.mm.ui.ga
    public boolean Y() {
        return this.f197127y0.isLayoutInDecorView();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean b0() {
        return this.f197127y0.needResetStatusBarColorOnActivityCreate();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean c0() {
        return this.f197127y0.needShowIdcError();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean d0() {
        return this.f197127y0.noActionBar();
    }

    @Override // com.tencent.mm.ui.ga
    public void f0() {
        this.f197127y0.onCreateBeforeSetContentView();
    }

    @Override // com.tencent.mm.ui.ga
    public void i0() {
        this.f197127y0.onKeyboardStateChanged();
    }

    @Override // com.tencent.mm.ui.ga
    public void m(android.view.View view) {
        this.f197127y0.dealContentView(view);
    }

    @Override // com.tencent.mm.ui.ga
    public android.view.View m0() {
        return this.f197127y0.provideCustomActivityContentView();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean s() {
        return this.f197127y0.fromFullScreenActivity();
    }

    @Override // com.tencent.mm.ui.ga
    public java.lang.String v() {
        return this.f197127y0.getClass().getName();
    }

    @Override // com.tencent.mm.ui.ga
    public int y() {
        return this.f197127y0.getCustomBounceId();
    }
}
