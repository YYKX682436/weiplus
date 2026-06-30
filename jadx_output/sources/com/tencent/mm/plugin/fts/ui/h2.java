package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class h2 extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final j23.k f138068q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138069r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f138070s;

    public h2(com.tencent.mm.plugin.fts.ui.w0 w0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        super(w0Var);
        this.f138069r = new com.tencent.mm.sdk.platformtools.n3();
        j23.k kVar = new j23.k(w0Var.getContext(), this, i17);
        this.f138068q = kVar;
        kVar.f297270q = str2;
        kVar.f297276r = str;
        kVar.f297277s = str3;
        kVar.f297278t = i18;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f138068q.b(i17);
        if (b17 != null) {
            b17.f423763f = 5;
        }
        return b17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        this.f138070s = false;
        this.f138068q.f(this.f138050g, this.f138069r, new java.util.HashSet(), 0L);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void g() {
        super.g();
        if (this.f138070s) {
            return;
        }
        this.f138070s = true;
        com.tencent.mm.plugin.fts.ui.x2.m(this.f138050g, false, this.f138068q.r(), -2);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        j23.k kVar = this.f138068q;
        kVar.a(view, gVar, z17);
        if (gVar.f423772o && !this.f138070s) {
            this.f138070s = true;
            com.tencent.mm.plugin.fts.ui.x2.m(this.f138050g, true, kVar.r(), -2);
        }
        c();
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
        return true;
    }
}
