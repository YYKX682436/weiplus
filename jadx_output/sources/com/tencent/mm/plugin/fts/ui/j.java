package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class j extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final j23.a f138078q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138079r;

    public j(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        super(w0Var);
        this.f138079r = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f138078q = new j23.a(w0Var.getContext(), this, 0);
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        int j17 = this.f138078q.j(0);
        n(j17);
        notifyDataSetChanged();
        l(j17, true);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        return this.f138078q.b(i17);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        this.f138078q.f(this.f138050g, this.f138079r, new java.util.HashSet(), 0L);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }
}
