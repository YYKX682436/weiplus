package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public abstract class i2 implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f148407d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f148408e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f148409f;

    public i2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2, android.content.Context context, android.view.View view) {
        this.f148407d = context;
        a(view);
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
            this.f148409f.setVisibility(8);
            return true;
        }
        this.f148409f.setVisibility(0);
        this.f148409f.setText(this.f148407d.getString(com.tencent.mm.R.string.f490501wv));
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (!z17) {
            this.f148409f.setVisibility(8);
            return true;
        }
        this.f148409f.setVisibility(0);
        java.lang.String str = pm6Var.f383186d + "";
        if (pm6Var.f383186d > 99) {
            str = this.f148407d.getString(com.tencent.mm.R.string.f493304jo3);
        }
        this.f148409f.setText(str);
        return true;
    }

    public abstract void a(android.view.View view);

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
            this.f148408e.setVisibility(0);
            return true;
        }
        this.f148408e.setVisibility(8);
        return true;
    }
}
