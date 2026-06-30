package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public abstract class h3 implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f152635d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f152636e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f152637f;

    public h3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        a();
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        if (!z17) {
            this.f152637f.setVisibility(8);
            this.f152636e.setVisibility(8);
            return true;
        }
        this.f152637f.setVisibility(0);
        this.f152636e.setVisibility(0);
        this.f152636e.setText(pm6Var.f383187e);
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        if (z17) {
            this.f152635d.setVisibility(0);
            return true;
        }
        this.f152635d.setVisibility(8);
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    public abstract void a();

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
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
        if (z17) {
            this.f152637f.setVisibility(0);
            return true;
        }
        this.f152637f.setVisibility(8);
        return true;
    }
}
