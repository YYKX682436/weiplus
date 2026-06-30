package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class rc extends com.tencent.mm.ui.ga {

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragment f209607y0;

    public rc(com.tencent.mm.ui.MMFragment mMFragment) {
        this.f209607y0 = mMFragment;
    }

    @Override // com.tencent.mm.ui.ga
    public s75.b B() {
        return this.f209607y0.getIdentityString();
    }

    @Override // com.tencent.mm.ui.ga
    public int C() {
        return this.f209607y0.getF72225d();
    }

    @Override // com.tencent.mm.ui.ga
    public android.view.View D() {
        return this.f209607y0.getLayoutView();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean U() {
        return this.f209607y0.isActionbarMenuUseOriginalSys();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean V() {
        return true;
    }

    @Override // com.tencent.mm.ui.ga
    public boolean Y() {
        return this.f209607y0.isLayoutInDecorView();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean d0() {
        return this.f209607y0.noActionBar();
    }

    @Override // com.tencent.mm.ui.ga
    public void f0() {
        this.f209607y0.onCreateBeforeSetContentView();
    }

    @Override // com.tencent.mm.ui.ga
    public void i0() {
        this.f209607y0.onKeyboardStateChanged();
    }

    @Override // com.tencent.mm.ui.ga
    public void m(android.view.View view) {
        this.f209607y0.dealContentView(view);
    }

    @Override // com.tencent.mm.ui.ga
    public boolean s() {
        return false;
    }

    @Override // com.tencent.mm.ui.ga
    public java.lang.String v() {
        return this.f209607y0.getClass().getName();
    }

    @Override // com.tencent.mm.ui.ga
    public int y() {
        return this.f209607y0.getCustomBounceId();
    }
}
