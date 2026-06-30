package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class t8 implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f209884d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.TabIconView f209885e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f209886f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f209887g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f209888h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f209889i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LauncherUIBottomTabView f209890m;

    public t8(com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView) {
        this.f209890m = launcherUIBottomTabView;
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
        if (!z17) {
            this.f209887g.setText("");
            this.f209887g.setVisibility(4);
            return true;
        }
        this.f209887g.setText(this.f209890m.getResources().getString(com.tencent.mm.R.string.k29));
        this.f209887g.setBackgroundResource(com.tencent.mm.R.drawable.asx);
        this.f209887g.setTextSize(0, i65.a.f(r1.getContext(), com.tencent.mm.R.dimen.f479637bc));
        this.f209887g.setVisibility(0);
        this.f209888h.setVisibility(4);
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (!z17) {
            this.f209887g.setText("");
            this.f209887g.setVisibility(4);
            return true;
        }
        int i17 = pm6Var.f383186d;
        com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView = this.f209890m;
        if (i17 > 99) {
            this.f209887g.setText("");
            this.f209887g.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
            this.f209887g.setTextSize(0, i65.a.f(launcherUIBottomTabView.getContext(), com.tencent.mm.R.dimen.f480629ad3));
            this.f209887g.setVisibility(0);
            this.f209888h.setVisibility(4);
            return true;
        }
        this.f209887g.setText(java.lang.String.valueOf(i17));
        this.f209887g.setTextSize(0, i65.a.f(launcherUIBottomTabView.getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(launcherUIBottomTabView.getContext()));
        this.f209887g.setVisibility(0);
        this.f209887g.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(launcherUIBottomTabView.getContext(), pm6Var.f383186d));
        this.f209888h.setVisibility(4);
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return this.f209889i;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f209884d;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
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
        this.f209887g.setVisibility(4);
        this.f209888h.setVisibility(z17 ? 0 : 4);
        return true;
    }
}
