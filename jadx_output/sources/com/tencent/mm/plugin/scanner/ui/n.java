package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class n extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public boolean Q;
    public boolean R;
    public java.lang.Boolean S;
    public java.lang.String T;
    public android.view.View.OnTouchListener U;
    public android.view.ViewTreeObserver.OnGlobalLayoutListener V;
    public com.tencent.mm.plugin.scanner.ui.m W;

    public n(android.app.Activity activity) {
        super(activity);
        this.Q = false;
        this.R = false;
        this.G = com.tencent.mm.R.layout.f489289c03;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.M == null) {
            this.M = (android.widget.TextView) view.findViewById(android.R.id.title);
        }
        if (this.N == null) {
            this.N = (android.widget.TextView) view.findViewById(android.R.id.summary);
        }
        if (this.P == null) {
            this.P = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jqf);
        }
        if (this.U == null) {
            com.tencent.mm.plugin.scanner.ui.k kVar = new com.tencent.mm.plugin.scanner.ui.k(this);
            this.U = kVar;
            this.P.setOnTouchListener(kVar);
        }
        com.tencent.mm.plugin.scanner.ui.m mVar = this.W;
        if (mVar != null) {
            java.lang.String str = this.f197780q;
            java.lang.Boolean bool = (str == null || str.length() <= 0) ? null : (java.lang.Boolean) ((com.tencent.mm.plugin.scanner.ui.v0) mVar).f159657a.A.get(str);
            this.S = bool;
            if (bool == null) {
                this.P.setVisibility(8);
                this.N.setMaxLines(6);
            } else if (bool.booleanValue()) {
                this.P.setVisibility(8);
                this.N.setMaxLines(2000);
            } else {
                this.P.setVisibility(0);
                this.N.setMaxLines(5);
            }
        } else {
            this.P.setVisibility(8);
            this.N.setMaxLines(6);
        }
        if (this.V == null) {
            this.V = new com.tencent.mm.plugin.scanner.ui.l(this);
            this.N.getViewTreeObserver().addOnGlobalLayoutListener(this.V);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.T)) {
            this.M.setVisibility(8);
        } else {
            this.M.setText(this.T);
            this.M.setVisibility(0);
        }
    }
}
