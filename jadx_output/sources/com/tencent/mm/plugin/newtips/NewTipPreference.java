package com.tencent.mm.plugin.newtips;

/* loaded from: classes8.dex */
public class NewTipPreference extends com.tencent.mm.ui.base.preference.Preference implements com.tencent.mm.plugin.newtips.model.a {
    public final android.content.Context L;
    public android.view.View M;
    public android.view.View N;
    public android.view.View P;
    public final java.lang.String Q;
    public java.lang.ref.WeakReference R;
    public boolean S;

    public NewTipPreference(android.content.Context context) {
        this(context, null);
    }

    public void M() {
        ((ua0.q) ((va0.o) i95.n0.c(va0.o.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.a(this);
    }

    public final boolean N(boolean z17) {
        if (this.N == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipPreference", "hash:%d, showRedDot() show:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.view.View view = this.N;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/newtips/NewTipPreference", "showRedDot", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/newtips/NewTipPreference", "showRedDot", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.view.View view2 = this.N;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/newtips/NewTipPreference", "showRedDot", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/newtips/NewTipPreference", "showRedDot", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
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
        ((ua0.q) ((va0.o) i95.n0.c(va0.o.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return this.Q;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        if (this.P == null) {
            this.P = new android.view.View(this.L);
        }
        return this.P;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        ((ua0.q) ((va0.o) i95.n0.c(va0.o.class))).getClass();
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.N = view.findViewById(com.tencent.mm.R.id.lqe);
        N(this.S);
        ((ua0.q) ((va0.o) i95.n0.c(va0.o.class))).getClass();
        int c17 = com.tencent.mm.plugin.newtips.model.i.c(this.Q);
        java.util.HashMap hashMap = com.tencent.mm.plugin.newtips.model.p.f152383f;
        rn3.i.Di().n(c17);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c0q, viewGroup2);
        this.M = u17;
        return u17;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        com.tencent.mm.ui.base.preference.r rVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipPreference", "hash:%d, showRedPoint() show:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
        if (!N(z17)) {
            return false;
        }
        this.S = z17;
        java.lang.ref.WeakReference weakReference = this.R;
        if (weakReference == null || (rVar = (com.tencent.mm.ui.base.preference.r) weakReference.get()) == null) {
            return true;
        }
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        return true;
    }

    public NewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.R = null;
        this.S = false;
        this.L = context;
        this.G = com.tencent.mm.R.layout.byv;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, di0.a.f232623a, i17, 0);
        java.lang.String string = obtainStyledAttributes.getString(0);
        this.Q = string;
        obtainStyledAttributes.recycle();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipPreference", "NewTipPreference() path:%s", string);
    }
}
