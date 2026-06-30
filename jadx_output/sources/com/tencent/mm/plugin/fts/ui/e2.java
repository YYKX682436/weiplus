package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class e2 extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final j23.j f138043q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138044r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f138045s;

    public e2(com.tencent.mm.plugin.fts.ui.w0 w0Var, java.lang.String str, int i17) {
        super(w0Var);
        this.f138044r = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        android.content.Context context = w0Var.getContext();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(160);
        j23.j jVar = (j23.j) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Vi(hashSet, context, this, i17).get(0);
        jVar.f297274q = str;
        if (com.tencent.mm.storage.z3.R4(str)) {
            jVar.f297275r = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        }
        this.f138043q = jVar;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f138043q.b(i17);
        if (b17 != null) {
            b17.f423766i = i17;
            b17.f423763f = 4;
        }
        return b17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        this.f138045s = false;
        this.f138043q.f(this.f138050g, this.f138044r, new java.util.HashSet(), 0L);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void g() {
        super.g();
        if (this.f138045s) {
            return;
        }
        this.f138045s = true;
        com.tencent.mm.plugin.fts.ui.x2.m(this.f138050g, false, this.f138043q.r(), -2);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        j23.j jVar = this.f138043q;
        jVar.a(view, gVar, z17);
        if (!gVar.f423772o || this.f138045s) {
            return false;
        }
        this.f138045s = true;
        com.tencent.mm.plugin.fts.ui.x2.m(this.f138050g, true, jVar.r(), -2);
        return false;
    }
}
