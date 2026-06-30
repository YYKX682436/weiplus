package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public abstract class h0 extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f155400f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f155401g;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ListView f155406o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f155407p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.a f155408q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.f0 f155409r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.l2 f155410s;

    /* renamed from: t, reason: collision with root package name */
    public int f155411t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f155412u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f155413v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f155414w;

    /* renamed from: d, reason: collision with root package name */
    public int f155398d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155399e = "";

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SparseArray f155402h = new android.util.SparseArray();

    /* renamed from: i, reason: collision with root package name */
    public boolean f155403i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f155404m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f155405n = false;

    public h0(android.content.Context context, com.tencent.mm.plugin.record.ui.f0 f0Var) {
        this.f155401g = null;
        i65.a.b(this.f155400f, 35);
        this.f155407p = new java.util.LinkedList();
        this.f155411t = 0;
        this.f155412u = "";
        this.f155413v = "";
        this.f155414w = new com.tencent.mm.plugin.record.ui.b0(this);
        this.f155400f = context;
        this.f155401g = new com.tencent.mm.plugin.record.ui.a0(this, android.os.Looper.getMainLooper());
        this.f155409r = f0Var;
    }

    public void a() {
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f155402h;
            if (i17 >= sparseArray.size()) {
                break;
            }
            com.tencent.mm.plugin.record.ui.g0 g0Var = (com.tencent.mm.plugin.record.ui.g0) sparseArray.valueAt(i17);
            if (g0Var != null) {
                g0Var.destroy();
            }
            i17++;
        }
        com.tencent.mm.plugin.record.ui.f0 f0Var = this.f155409r;
        if (f0Var != null) {
            f0Var.d();
            this.f155409r = null;
        }
    }

    public abstract int c();

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public r45.gp0 getItem(int i17) {
        java.util.List list = this.f155407p;
        if (list != null && i17 >= 0 && i17 < ((java.util.LinkedList) list).size()) {
            return (r45.gp0) ((java.util.LinkedList) list).get(i17);
        }
        return null;
    }

    public final void f(java.lang.String str) {
        if (c01.e2.J(str)) {
            return;
        }
        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
        r0Var.f70529a = str;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
    }

    public abstract void g(et3.b bVar);

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f155407p;
        if (list == null) {
            return 0;
        }
        return ((java.util.LinkedList) list).size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        int i18 = getItem(i17).I;
        if (i18 == 1) {
            return 0;
        }
        if (i18 == 2) {
            return 1;
        }
        if (i18 != 3) {
            return i18 != 21 ? 3 : 5;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d2  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.record.ui.h0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 6;
    }

    public abstract void h(com.tencent.mm.plugin.record.ui.a aVar);

    public com.tencent.mm.plugin.record.ui.viewWrappers.m j(com.tencent.mm.plugin.record.ui.viewWrappers.m mVar) {
        return mVar;
    }
}
