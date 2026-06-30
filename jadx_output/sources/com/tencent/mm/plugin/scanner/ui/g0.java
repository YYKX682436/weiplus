package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class g0 extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public final android.content.Context M;
    public java.util.List N;

    public g0(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.N = null;
        this.M = context;
        this.G = com.tencent.mm.R.layout.ca9;
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
        android.widget.GridView gridView = (android.widget.GridView) this.L.findViewById(com.tencent.mm.R.id.j8r);
        com.tencent.mm.plugin.scanner.ui.f0 f0Var = new com.tencent.mm.plugin.scanner.ui.f0(this);
        gridView.setAdapter((android.widget.ListAdapter) f0Var);
        java.util.List list = this.N;
        if (list != null) {
            ((java.util.HashMap) f0Var.f159543f).clear();
            f0Var.f159542e.clear();
            f0Var.f159542e = list;
            f0Var.notifyDataSetChanged();
        }
    }
}
