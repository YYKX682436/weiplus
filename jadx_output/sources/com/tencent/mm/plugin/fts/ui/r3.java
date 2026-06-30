package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class r3 extends com.tencent.mm.plugin.fts.ui.d3 {

    /* renamed from: s, reason: collision with root package name */
    public boolean f138168s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f138169t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f138170u;

    /* renamed from: v, reason: collision with root package name */
    public int f138171v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f138172w;

    public r3(com.tencent.mm.plugin.fts.ui.w0 w0Var, java.lang.String str, int i17) {
        super(w0Var, str, i17);
        this.f138168s = false;
        this.f138169t = false;
        this.f138170u = false;
        com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "init adapter");
        j23.d0 d0Var = new j23.d0(w0Var.getContext(), this, i17);
        this.f138040q = d0Var;
        d0Var.f297268q = str;
    }

    @Override // com.tencent.mm.plugin.fts.ui.d3, t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "on data ready");
        this.f138169t = true;
        if (z17) {
            int j17 = kVar.j(0);
            if (this.f138172w.size() > 0) {
                if (j17 > 5) {
                    this.f138171v = j17;
                    n(6);
                    this.f138170u = true;
                } else {
                    this.f138170u = false;
                    n(j17 + 1);
                }
                com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "add related");
            } else {
                n(j17);
            }
        } else {
            n(0);
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_brand_search_related_function, false) || (this.f138169t && this.f138168s)) {
            c();
            notifyDataSetChanged();
            l(getCount(), true);
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.d3, com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "position: %s, has cgi result: %s, count: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f138168s), java.lang.Integer.valueOf(getCount()));
        if (i17 != getCount() - 1 || !this.f138168s || this.f138172w.size() <= 0) {
            return super.d(i17);
        }
        j23.d0 d0Var = (j23.d0) this.f138040q;
        java.util.LinkedList linkedList = this.f138172w;
        boolean z17 = this.f138170u;
        d0Var.getClass();
        e23.c2 c2Var = new e23.c2(i17);
        c2Var.f423764g = -21;
        c2Var.f423766i = i17;
        c2Var.f423763f = 7;
        c2Var.f246798q = linkedList;
        c2Var.f246799r = z17;
        return c2Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.d3, com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSWXPayServiceNotifyAdapter", "do search");
        super.f();
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        u13.g item = getItem(i17);
        android.view.View c17 = item.k().c(h(), viewGroup, view);
        u13.e eVar = (u13.e) c17.getTag();
        if (!item.f423760c) {
            item.a(h(), eVar, new java.lang.Object[0]);
            m(h(), item);
            item.f423760c = true;
        }
        item.k().b(h(), eVar, item, new java.lang.Object[0]);
        return c17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.d3, com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }
}
