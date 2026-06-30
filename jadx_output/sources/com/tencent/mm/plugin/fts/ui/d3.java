package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class d3 extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public j23.a0 f138040q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138041r;

    public d3(com.tencent.mm.plugin.fts.ui.w0 w0Var, java.lang.String str, int i17) {
        super(w0Var);
        this.f138041r = new com.tencent.mm.sdk.platformtools.n3();
        j23.a0 a0Var = new j23.a0(w0Var.getContext(), this, i17);
        this.f138040q = a0Var;
        a0Var.f297268q = str;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSServiceNotifyAdapter", "on data ready, is success: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            n(kVar.j(0));
        } else {
            n(0);
        }
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f138040q.b(i17);
        if (b17 != null) {
            b17.f423763f = 7;
        }
        return b17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        this.f138040q.f(this.f138050g, this.f138041r, new java.util.HashSet(), 0L);
        com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSServiceNotifyAdapter", "do search %s", this.f138050g);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }
}
