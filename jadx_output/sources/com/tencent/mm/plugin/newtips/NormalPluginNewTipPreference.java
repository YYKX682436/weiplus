package com.tencent.mm.plugin.newtips;

/* loaded from: classes11.dex */
public final class NormalPluginNewTipPreference extends com.tencent.mm.plugin.preference.PluginPreference implements com.tencent.mm.plugin.newtips.model.a {
    public final android.content.Context W;
    public android.view.View X;

    public NormalPluginNewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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
            this.R = false;
            this.Q = 8;
            return true;
        }
        this.R = false;
        this.Q = 0;
        this.N = this.W.getString(com.tencent.mm.R.string.f490501wv);
        this.P = com.tencent.mm.R.drawable.asx;
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        if (!z17) {
            this.R = false;
            this.Q = 8;
            return true;
        }
        this.Q = 0;
        java.lang.String str = pm6Var.f383186d + "";
        if (pm6Var.f383186d > 99) {
            str = this.W.getString(com.tencent.mm.R.string.f493304jo3);
        }
        int b17 = com.tencent.mm.ui.tools.pd.b(this.f197770d, pm6Var.f383186d);
        this.N = str;
        this.P = b17;
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
        return null;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        if (this.X == null) {
            this.X = new android.view.View(this.W);
        }
        return this.X;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.preference.PluginPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        if (this.X == null) {
            this.X = u17;
        }
        return u17;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        if (z17) {
            this.R = true;
        } else {
            this.R = false;
            this.Q = 8;
        }
        return true;
    }

    public NormalPluginNewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.W = context;
    }
}
