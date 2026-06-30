package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class k3 extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final j23.b0 f138094q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138095r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f138096s;

    public k3(com.tencent.mm.plugin.fts.ui.w0 w0Var, java.lang.String str, int i17) {
        super(w0Var);
        this.f138095r = new com.tencent.mm.sdk.platformtools.n3();
        j23.b0 b0Var = new j23.b0(w0Var.getContext(), this, i17);
        this.f138094q = b0Var;
        b0Var.f297270q = str;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f138094q.b(i17);
        if (b17 != null) {
            b17.f423763f = 3;
        }
        return b17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        this.f138096s = false;
        this.f138094q.f(this.f138050g, this.f138095r, new java.util.HashSet(), 0L);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void g() {
        super.g();
        if (this.f138096s) {
            return;
        }
        this.f138096s = true;
        com.tencent.mm.plugin.fts.ui.x2.m(this.f138050g, false, this.f138094q.r(), -2);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        j23.b0 b0Var = this.f138094q;
        b0Var.a(view, gVar, z17);
        if (gVar.f423772o && !this.f138096s) {
            this.f138096s = true;
            com.tencent.mm.plugin.fts.ui.x2.m(this.f138050g, true, b0Var.r(), -2);
        }
        c();
        n(b0Var.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
        return true;
    }
}
