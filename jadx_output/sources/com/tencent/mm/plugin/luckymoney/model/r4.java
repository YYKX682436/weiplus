package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class r4 implements com.tencent.mm.modelbase.u0, np5.e {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f145575d;

    /* renamed from: e, reason: collision with root package name */
    public np5.f f145576e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f145577f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f145578g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f145579h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f145580i = new java.util.HashSet();

    public r4(android.content.Context context, np5.f fVar) {
        this.f145576e = null;
        this.f145575d = context;
        this.f145576e = fVar;
    }

    @Override // np5.e
    public void a(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        if (m1Var != null && (m1Var instanceof com.tencent.mm.wallet_core.model.d1)) {
            ((com.tencent.mm.wallet_core.model.d1) m1Var).setProcessName(null);
        }
        this.f145577f.add(m1Var);
        if (z17 && ((u3Var = this.f145579h) == null || !u3Var.isShowing())) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f145579h;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            android.content.Context context = this.f145575d;
            this.f145579h = db5.e1.Q(context, null, context.getString(com.tencent.mm.R.string.ggc), true, false, new com.tencent.mm.plugin.luckymoney.model.p4(this));
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(m1Var);
    }

    @Override // np5.e
    public void b() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145579h;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f145579h.dismiss();
    }

    public void c(int i17) {
        ((java.util.HashSet) this.f145580i).add(java.lang.Integer.valueOf(i17));
        gm0.j1.i();
        gm0.j1.n().f273288b.a(i17, this);
    }

    public void d(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        if (m1Var != null && (m1Var instanceof com.tencent.mm.wallet_core.model.d1)) {
            ((com.tencent.mm.wallet_core.model.d1) m1Var).setProcessName(null);
        }
        this.f145578g.add(m1Var);
        if (z17 && ((u3Var = this.f145579h) == null || !u3Var.isShowing())) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f145579h;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            android.content.Context context = this.f145575d;
            this.f145579h = db5.e1.P(context, null, 3, context.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.model.q4(this));
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(m1Var);
    }

    public void e() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145579h;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f145579h = null;
        }
        java.util.HashSet hashSet = this.f145577f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) it.next();
            gm0.j1.i();
            gm0.j1.n().f273288b.d(m1Var);
        }
        java.util.HashSet hashSet2 = this.f145578g;
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.modelbase.m1 m1Var2 = (com.tencent.mm.modelbase.m1) it6.next();
            gm0.j1.i();
            gm0.j1.n().f273288b.d(m1Var2);
        }
        hashSet.clear();
        hashSet2.clear();
    }

    public void f(int i17) {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(i17, this);
        java.util.Set set = this.f145580i;
        ((java.util.HashSet) set).remove(java.lang.Integer.valueOf(i17));
        if (((java.util.HashSet) set).isEmpty()) {
            e();
            this.f145576e = null;
            this.f145575d = null;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        boolean z18;
        np5.f fVar;
        java.util.HashSet hashSet = this.f145578g;
        boolean contains = hashSet.contains(m1Var);
        java.util.HashSet hashSet2 = this.f145577f;
        if (contains) {
            hashSet.remove(m1Var);
        } else {
            if (!hashSet2.contains(m1Var)) {
                z17 = false;
                if (hashSet.isEmpty() || !hashSet2.isEmpty()) {
                    z18 = false;
                } else {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145579h;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        this.f145579h = null;
                    }
                    z18 = true;
                }
                if (z17 || (fVar = this.f145576e) == null) {
                }
                fVar.onSceneEnd(i17, i18, str, m1Var, z18);
                return;
            }
            hashSet2.remove(m1Var);
        }
        z17 = true;
        if (hashSet.isEmpty()) {
        }
        z18 = false;
        if (z17) {
        }
    }
}
