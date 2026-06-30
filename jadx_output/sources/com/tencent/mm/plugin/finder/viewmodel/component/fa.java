package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fa implements com.tencent.mm.plugin.finder.view.mp {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ha f134381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f134382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f134383f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f134384g;

    public fa(com.tencent.mm.plugin.finder.viewmodel.component.ha haVar, int i17, yz5.l lVar, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar) {
        this.f134381d = haVar;
        this.f134382e = i17;
        this.f134383f = lVar;
        this.f134384g = aVar;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        if (aVar != null) {
            aVar.a(f17);
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        yz5.l lVar = this.f134383f;
        if (lVar != null) {
            lVar.invoke(this);
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = this.f134381d;
        if (!z18) {
            int i18 = this.f134382e;
            if (z17) {
                java.lang.Integer num = (java.lang.Integer) haVar.f134600d.peek();
                if (num == null || num.intValue() != i18) {
                    haVar.f134600d.push(java.lang.Integer.valueOf(i18));
                }
            } else {
                yz5.l lVar = this.f134383f;
                if (lVar != null) {
                    lVar.invoke(this);
                }
                java.lang.Integer num2 = (java.lang.Integer) haVar.f134600d.peek();
                if (num2 != null && num2.intValue() == i18) {
                    haVar.f134600d.pop();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderDrawerRecordUIC", "onDrawerOpen isOpen:" + z17 + " isBegin:" + z18 + " invokeSourceType:" + i17 + ", drawerStack:" + haVar.f134600d.size() + " top:" + haVar.f134600d.peek());
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        if (aVar != null) {
            aVar.c(z17, z18, i17);
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void d() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.mp
    public void e() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        l93.k0 k0Var = aVar instanceof l93.k0 ? (l93.k0) aVar : null;
        if (k0Var != null) {
            k0Var.e();
        }
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void f() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.mp
    public void i() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        l93.k0 k0Var = aVar instanceof l93.k0 ? (l93.k0) aVar : null;
        if (k0Var != null) {
            k0Var.i();
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.mp
    public void j() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        l93.k0 k0Var = aVar instanceof l93.k0 ? (l93.k0) aVar : null;
        if (k0Var != null) {
            k0Var.j();
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.mp
    public void m() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f134384g;
        l93.k0 k0Var = aVar instanceof l93.k0 ? (l93.k0) aVar : null;
        if (k0Var != null) {
            k0Var.m();
        }
    }
}
