package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class o1 implements zb5.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f202388d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f202389e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f202390f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f202391g;

    /* renamed from: h, reason: collision with root package name */
    public int f202392h;

    /* renamed from: i, reason: collision with root package name */
    public zb5.e f202393i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202394m;

    /* renamed from: n, reason: collision with root package name */
    public long f202395n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202396o;

    /* renamed from: p, reason: collision with root package name */
    public long f202397p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202398q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f202399r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String[] f202400s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String[] f202401t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f202402u;

    public o1(android.content.Context context, java.lang.String talker) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f202388d = context;
        this.f202389e = talker;
        this.f202394m = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f202396o = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f202398q = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f202399r = new int[]{754974769, 1241514033};
        this.f202400s = new java.lang.String[]{"msgId", "createTime"};
        this.f202401t = new java.lang.String[]{"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};
        this.f202402u = jz5.h.b(com.tencent.mm.ui.chatting.presenter.n1.f202354d);
    }

    public static final r45.bu2 c(com.tencent.mm.ui.chatting.presenter.o1 o1Var, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String j17;
        ot0.q v17;
        zy2.i iVar;
        r45.kv2 kv2Var;
        if (o1Var.f202394m.get() || (j17 = f9Var.j()) == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f348666i;
        if (!(i17 == 51 || i17 == 129) || (iVar = (zy2.i) v17.y(zy2.i.class)) == null || (kv2Var = iVar.f477411b) == null) {
            return null;
        }
        r45.bu2 bu2Var = new r45.bu2();
        bu2Var.set(0, java.lang.Long.valueOf(f9Var.getMsgId()));
        bu2Var.set(3, f9Var.Q0());
        bu2Var.set(1, java.lang.Long.valueOf(f9Var.getCreateTime()));
        bu2Var.set(2, kv2Var);
        return bu2Var;
    }

    public void a(boolean z17) {
        q40.e eVar;
        this.f202395n = java.lang.System.currentTimeMillis();
        this.f202396o.set(false);
        com.tencent.mars.xlog.Log.i("Finder.FeedHistoryListPresenter", "loadData isFirst=" + z17);
        zb5.e eVar2 = this.f202393i;
        if (eVar2 != null && (eVar = ((com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI) eVar2).f200564f) != null) {
            ((com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment) eVar).z0();
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.i1(this, z17));
    }

    public final boolean d(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        java.util.regex.Matcher matcher = ((java.util.regex.Pattern) ((jz5.n) this.f202402u).getValue()).matcher(str2);
        boolean z17 = false;
        while (matcher.find()) {
            java.lang.String group = matcher.group();
            kotlin.jvm.internal.o.d(group);
            boolean y17 = r26.i0.y(group, str, false);
            com.tencent.mars.xlog.Log.i("Finder.FeedHistoryListPresenter", "[isContains] search=" + str + " group=" + group);
            if (y17) {
                return y17;
            }
            z17 = y17;
        }
        return z17;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202394m.set(true);
        if (this.f202395n != 0) {
            boolean z17 = this.f202396o.get();
            long currentTimeMillis = z17 ? this.f202397p : java.lang.System.currentTimeMillis() - this.f202395n;
            com.tencent.mars.xlog.Log.i("Finder.FeedHistoryListPresenter", "[loadData][perf] exit, completed:%s, cost:%dms", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis));
            java.util.List list = this.f202391g;
            int size = list != null ? list.size() : 0;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.m1(z17, currentTimeMillis, this.f202389e, size));
        }
        zb5.e eVar = this.f202393i;
        if (eVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.FinderFeedHistoryListUI) eVar).f200562d = null;
        }
        this.f202393i = null;
        de5.a aVar = de5.a.f229396a;
        aVar.l("");
        aVar.j(21, 6);
    }
}
