package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class z1 extends com.tencent.mm.plugin.fts.ui.f0 implements o13.x {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f138389q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f138390r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138391s;

    /* renamed from: t, reason: collision with root package name */
    public p13.c f138392t;

    /* renamed from: u, reason: collision with root package name */
    public p13.v f138393u;

    public z1(com.tencent.mm.plugin.fts.ui.w0 w0Var, java.lang.String str) {
        super(w0Var);
        this.f138391s = new com.tencent.mm.sdk.platformtools.n3();
        this.f138389q = str;
        if (com.tencent.mm.storage.z3.R4(str)) {
            this.f138390r = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        }
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f351158c;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            n(0);
            notifyDataSetChanged();
            l(getCount(), true);
        } else {
            if (i17 != 0) {
                return;
            }
            this.f138393u = vVar;
            n(vVar.f351160e.size());
            notifyDataSetChanged();
            l(getCount(), true);
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        e23.k kVar = new e23.k(i17);
        kVar.f246925q = (p13.y) this.f138393u.f351160e.get(i17);
        kVar.f423762e = this.f138393u.f351159d;
        kVar.f423764g = -14;
        kVar.B = this.f138390r;
        kVar.f423766i = i17;
        kVar.f423763f = 6;
        if (i17 == getCount() - 1) {
            kVar.f423761d = true;
        }
        return kVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        c();
        if (this.f138392t != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f138392t);
        }
        p13.u uVar = new p13.u();
        uVar.f351141c = this.f138050g;
        uVar.f351142d = this.f138389q;
        uVar.f351150l = r13.e.f368605d;
        uVar.f351148j.add("create_talker_message\u200b");
        uVar.f351151m = this;
        uVar.f351152n = this.f138391s;
        uVar.f351140b = 3;
        this.f138392t = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(3, uVar);
        com.tencent.mars.xlog.Log.i("MicroMSsg.FTS.FTSChattingConvAdapter", "do search %s", this.f138050g);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void g() {
        super.g();
        if (this.f138392t != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f138392t);
        }
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }
}
