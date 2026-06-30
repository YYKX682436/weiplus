package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class yb extends com.tencent.mm.ui.ga implements ma5.d {
    public ma5.e A0;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragment f212584y0 = null;

    /* renamed from: z0, reason: collision with root package name */
    public androidx.appcompat.app.b f212585z0;

    @Override // com.tencent.mm.ui.ga
    public int A() {
        return 1;
    }

    @Override // com.tencent.mm.ui.ga
    public s75.b B() {
        com.tencent.mm.ui.MMFragment mMFragment = this.f212584y0;
        if (mMFragment != null) {
            return mMFragment.getIdentityString();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.ga
    public int C() {
        com.tencent.mm.ui.MMFragment mMFragment = this.f212584y0;
        if (mMFragment != null) {
            return mMFragment.getF72225d();
        }
        return -1;
    }

    @Override // com.tencent.mm.ui.ga
    public android.view.View D() {
        com.tencent.mm.ui.MMFragment mMFragment = this.f212584y0;
        if (mMFragment != null) {
            return mMFragment.getLayoutView();
        }
        return null;
    }

    @Override // com.tencent.mm.ui.ga
    public androidx.appcompat.app.b F() {
        if (this.f212585z0 == null) {
            this.f212585z0 = this.A0.e();
        }
        return this.f212585z0;
    }

    @Override // com.tencent.mm.ui.ga
    public void N0() {
        ma5.e eVar = this.A0;
        if (eVar.f325240o) {
            return;
        }
        eVar.f325240o = true;
        ((ma5.c) eVar.f325241p).run();
    }

    @Override // com.tencent.mm.ui.ga
    public boolean V() {
        return true;
    }

    @Override // ma5.d
    public void a(o.r rVar, boolean z17) {
    }

    @Override // ma5.d
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        return j0(menuItem);
    }

    @Override // com.tencent.mm.ui.ga
    public void f0() {
        com.tencent.mm.ui.MMFragment mMFragment = this.f212584y0;
        if (mMFragment != null) {
            mMFragment.onCreateBeforeSetContentView();
        }
    }

    @Override // com.tencent.mm.ui.ga
    public void i0() {
        com.tencent.mm.ui.MMFragment mMFragment = this.f212584y0;
        if (mMFragment != null) {
            mMFragment.onKeyboardStateChanged();
        }
    }

    @Override // com.tencent.mm.ui.ga
    public void m(android.view.View view) {
        com.tencent.mm.ui.MMFragment mMFragment = this.f212584y0;
        if (mMFragment != null) {
            mMFragment.dealContentView(view);
        }
    }

    @Override // ma5.d
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        this.f212584y0.onCreateOptionsMenu(menu, this.A0.f());
        return true;
    }

    @Override // ma5.d
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu menu) {
        com.tencent.mm.ui.MMFragment mMFragment = this.f212584y0;
        if (mMFragment == null) {
            return true;
        }
        mMFragment.onPrepareOptionsMenu(menu);
        return true;
    }

    @Override // com.tencent.mm.ui.ga
    public boolean s() {
        return false;
    }

    @Override // com.tencent.mm.ui.ga
    public java.lang.String v() {
        return this.f212584y0.getClass().getName();
    }

    @Override // com.tencent.mm.ui.ga
    public int y() {
        com.tencent.mm.ui.MMFragment mMFragment = this.f212584y0;
        if (mMFragment != null) {
            return mMFragment.getCustomBounceId();
        }
        return -1;
    }
}
