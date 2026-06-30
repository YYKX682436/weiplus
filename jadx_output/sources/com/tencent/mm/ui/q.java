package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class q implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.DoubleTabView f209526d;

    public q(com.tencent.mm.ui.DoubleTabView doubleTabView, java.lang.String str) {
        this.f209526d = doubleTabView;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "textstate_history";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f209526d;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        com.tencent.mm.ui.DoubleTabView doubleTabView = this.f209526d;
        if (z17) {
            doubleTabView.f196644s = true;
            com.tencent.mm.ui.MMTabView mMTabView = doubleTabView.f196639n;
            if (mMTabView != null) {
                mMTabView.f196914e.setVisibility(0);
            }
        } else {
            doubleTabView.f196644s = false;
            com.tencent.mm.ui.MMTabView mMTabView2 = doubleTabView.f196639n;
            if (mMTabView2 != null) {
                mMTabView2.f196914e.setVisibility(4);
            }
        }
        return true;
    }
}
