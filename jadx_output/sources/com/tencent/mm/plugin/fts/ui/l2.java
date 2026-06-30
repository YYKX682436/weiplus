package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class l2 extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {
    public boolean A;

    /* renamed from: q, reason: collision with root package name */
    public final int f138102q;

    /* renamed from: r, reason: collision with root package name */
    public final int f138103r;

    /* renamed from: s, reason: collision with root package name */
    public final t13.k f138104s;

    /* renamed from: t, reason: collision with root package name */
    public final g23.e f138105t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Boolean f138106u;

    /* renamed from: v, reason: collision with root package name */
    public final long f138107v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138108w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f138109x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f138110y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138111z;

    public l2(com.tencent.mm.plugin.fts.ui.w0 w0Var, int i17, int i18, long j17) {
        super(w0Var);
        int i19;
        this.f138106u = java.lang.Boolean.FALSE;
        this.f138108w = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f138111z = new com.tencent.mm.plugin.fts.ui.k2(this, android.os.Looper.getMainLooper());
        this.f138103r = i17;
        android.content.Context h17 = h();
        if (i17 == -32) {
            i19 = 4384;
        } else if (i17 == -15) {
            i19 = 4240;
        } else if (i17 != -13) {
            switch (i17) {
                case org.chromium.net.NetError.ERR_BLOCKED_BY_CSP /* -30 */:
                    i19 = 4193;
                    break;
                case -29:
                    i19 = 4210;
                    break;
                case -28:
                    i19 = 4368;
                    break;
                case -27:
                    i19 = 4209;
                    break;
                case -26:
                    i19 = 12294;
                    break;
                case -25:
                    i19 = 12293;
                    break;
                case -24:
                    i19 = 4352;
                    break;
                case -23:
                    i19 = 8224;
                    break;
                default:
                    switch (i17) {
                        case -7:
                            i19 = 4208;
                            break;
                        case -6:
                            i19 = 4160;
                            break;
                        case -5:
                            i19 = 4144;
                            break;
                        case -4:
                            i19 = 4112;
                            break;
                        case -3:
                            i19 = 4128;
                            break;
                        case -2:
                            i19 = 4176;
                            break;
                        case -1:
                            i19 = 4192;
                            break;
                        default:
                            i19 = -1;
                            break;
                    }
            }
        } else {
            i19 = 4224;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSDetailAdapter", "searchType=%d | uiLogicType=%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i19));
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(i19));
        this.f138104s = (t13.k) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Vi(hashSet, h17, this, i18).get(0);
        g23.e eVar = new g23.e();
        this.f138105t = eVar;
        eVar.f267905g = i17;
        this.f138102q = i18;
        this.f138107v = j17;
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        str.equals(this.f138050g);
        n(kVar.j(0));
        notifyDataSetChanged();
        l(getCount(), true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        g23.e eVar = this.f138105t;
        eVar.f267899a = currentTimeMillis;
        eVar.getClass();
        java.util.Iterator it = ((com.tencent.mm.plugin.fts.ui.a) kVar).f138009n.iterator();
        while (it.hasNext()) {
            eVar.f267901c += ((t13.i) it.next()).f414570f.size();
        }
        ((java.util.ArrayList) eVar.f267907i).addAll(kVar.h(eVar.f267900b));
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void c() {
        super.c();
        g23.e eVar = this.f138105t;
        eVar.f267899a = 0L;
        eVar.f267901c = 0;
        eVar.f267902d = 0L;
        ((java.util.ArrayList) eVar.f267906h).clear();
        ((java.util.ArrayList) eVar.f267907i).clear();
        t13.k kVar = this.f138104s;
        kVar.c();
        kVar.cancelSearch();
        this.f138111z.removeMessages(1);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = this.f138104s.b(i17);
        if (b17 != null) {
            b17.f423766i = i17;
            b17.f423763f = 2;
            b17.f423768k = java.lang.String.valueOf(this.f138105t.f267902d);
        }
        return b17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        g23.e eVar = this.f138105t;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(eVar.f267903e) && !this.f138106u.booleanValue() && eVar.f267902d != 0) {
            eVar.f267904f = z13.f.Y6(h()).b7();
            com.tencent.mm.plugin.fts.ui.x2.k(eVar);
        }
        this.f138106u = java.lang.Boolean.FALSE;
        this.f138109x = false;
        long j17 = this.f138107v;
        if (j17 == 0) {
            j17 = o13.n.g(this.f138102q);
        }
        eVar.f267902d = j17;
        eVar.f267903e = this.f138050g;
        eVar.f267900b = c01.id.c();
        t13.k kVar = this.f138104s;
        if (kVar instanceof j23.h) {
            j23.h hVar = (j23.h) kVar;
            boolean z17 = this.f138052i;
            hVar.f297272p = z17;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = hVar.f138007i;
            objArr[1] = z17 ? "yes" : "no";
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSContactDetailUIUnit", "fts: query: %s, setSearchByPinyin: %s", objArr);
        }
        this.f138104s.f(this.f138050g, this.f138108w, new java.util.HashSet(), 0L);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void g() {
        if (!this.f138109x) {
            this.f138109x = true;
            if (!this.A) {
                com.tencent.mm.plugin.fts.ui.x2.m(this.f138050g, false, this.f138104s.e(), this.f138103r);
            }
        }
        boolean booleanValue = this.f138106u.booleanValue();
        g23.e eVar = this.f138105t;
        if (!booleanValue) {
            this.f138106u = java.lang.Boolean.TRUE;
            eVar.f267904f = z13.f.Y6(h()).b7();
            com.tencent.mm.plugin.fts.ui.x2.k(eVar);
        }
        eVar.f267899a = 0L;
        eVar.f267901c = 0;
        eVar.f267902d = 0L;
        ((java.util.ArrayList) eVar.f267906h).clear();
        ((java.util.ArrayList) eVar.f267907i).clear();
        super.g();
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        t13.k kVar = this.f138104s;
        kVar.a(view, gVar, z17);
        boolean z18 = gVar.f423772o;
        g23.e eVar = this.f138105t;
        if (z18) {
            if (!this.f138109x) {
                com.tencent.mm.plugin.fts.ui.x2.m(this.f138050g, true, kVar.e(), gVar.f423764g);
                this.f138109x = true;
            }
            eVar.f267904f = z13.f.Y6(h()).b7();
            com.tencent.mm.plugin.fts.ui.x2.e(gVar, eVar);
            return false;
        }
        if (!(gVar instanceof e23.x)) {
            return false;
        }
        this.A = true;
        eVar.f267904f = z13.f.Y6(h()).b7();
        com.tencent.mm.plugin.fts.ui.x2.e(gVar, eVar);
        return false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void m(android.content.Context context, u13.g gVar) {
        ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).getClass();
        if (gVar == null ? false : gVar instanceof b05.f) {
            super.m(context, gVar);
            g23.e eVar = this.f138105t;
            eVar.getClass();
            int i17 = gVar.f423758a;
            if (i17 == -1 || i17 == 0 || i17 == 11) {
                return;
            }
            long c17 = c01.id.c();
            java.util.Iterator it = ((java.util.ArrayList) eVar.f267907i).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p13.e eVar2 = (p13.e) it.next();
                if (eVar2.f351074b == gVar.f423759b) {
                    eVar2.f351077e = c17 - eVar.f267900b;
                    eVar2.f351083k = c17;
                    break;
                }
            }
            java.lang.String wi6 = ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).wi(gVar);
            if (wi6 != "") {
                ((java.util.ArrayList) eVar.f267906h).add(wi6);
            }
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        super.onScrollStateChanged(absListView, i17);
        if (i17 == 2) {
            this.f138110y = true;
            ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).g();
            ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).G();
        } else {
            this.f138110y = false;
            if (((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c) {
                return;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f138111z;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessageDelayed(1, 200L);
        }
    }
}
