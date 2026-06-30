package yf5;

/* loaded from: classes11.dex */
public final class w0 extends android.widget.BaseAdapter implements l75.z0, yf5.j0 {
    public boolean A;
    public com.tencent.mm.sdk.event.IListener B;
    public boolean C;
    public yf5.h0 D;
    public boolean E;
    public int F;
    public java.lang.String G;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.FragmentActivity f461975d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.o5 f461976e;

    /* renamed from: f, reason: collision with root package name */
    public final yf5.i0 f461977f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f461978g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f461979h;

    /* renamed from: i, reason: collision with root package name */
    public final yf5.g0 f461980i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f461981m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f461982n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f461983o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f461984p;

    /* renamed from: q, reason: collision with root package name */
    public final yf5.a f461985q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f461986r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b0 f461987s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.b3 f461988t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f461989u;

    /* renamed from: v, reason: collision with root package name */
    public long f461990v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f461991w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f461992x;

    /* renamed from: y, reason: collision with root package name */
    public yf5.d f461993y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f461994z;

    public w0(androidx.fragment.app.FragmentActivity activity, com.tencent.mm.ui.conversation.o5 folderHelper, yf5.i0 i0Var) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(folderHelper, "folderHelper");
        this.f461975d = activity;
        this.f461976e = folderHelper;
        this.f461977f = i0Var;
        this.f461978g = "MicroMsg.ConversationAdapter.MvvmConversationAdapter";
        this.f461980i = new yf5.g0(activity);
        this.f461981m = jz5.h.b(new yf5.n0(this));
        this.f461982n = jz5.h.b(new yf5.m0(this));
        this.f461983o = jz5.h.b(new yf5.v0(this));
        this.f461985q = new yf5.a();
        this.f461986r = jz5.h.b(new yf5.t0(this));
        this.f461988t = new com.tencent.mm.ui.conversation.b3();
        this.f461989u = gg5.b.f271789b;
        this.f461992x = jz5.h.b(new yf5.r0(this));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        this.F = calendar.get(6);
        this.G = com.tencent.mm.sdk.platformtools.m2.d();
    }

    public void a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(this.f461978g, "[frozenNotify] from:%s", new com.tencent.mm.sdk.platformtools.z3());
        this.A = true;
    }

    public final yf5.m c() {
        return (yf5.m) ((jz5.n) this.f461982n).getValue();
    }

    public final yf5.w d() {
        return (yf5.w) ((jz5.n) this.f461981m).getValue();
    }

    @Override // android.widget.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.storage.l4 getItem(int i17) {
        yf5.a aVar = this.f461985q;
        return (com.tencent.mm.storage.l4) aVar.f461846c.get(aVar.f461845b.get(i17));
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f461983o).getValue(), null, new yf5.u0(obj, this, i17, a1Var, null), 1, null);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f461985q.f461844a;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x060e A[Catch: Exception -> 0x061f, TRY_LEAVE, TryCatch #0 {Exception -> 0x061f, blocks: (B:161:0x05e9, B:165:0x0603, B:169:0x060e, B:171:0x05f0, B:175:0x05fa), top: B:160:0x05e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x037a  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r28, android.view.View r29, android.view.ViewGroup r30) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf5.w0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public com.tencent.mm.storage.l4 h(java.lang.String str) {
        java.util.HashMap hashMap = this.f461985q.f461846c;
        if (str == null) {
            str = "";
        }
        return (com.tencent.mm.storage.l4) hashMap.get(str);
    }

    public void j(int i17) {
        com.tencent.mm.storage.l4 l4Var;
        if (i17 < 0 || i17 >= this.f461985q.f461844a) {
            return;
        }
        try {
            l4Var = getItem(i17);
        } catch (java.lang.NullPointerException unused) {
            com.tencent.mars.xlog.Log.w(this.f461978g, "preLoad position:%s is null!", java.lang.Integer.valueOf(i17));
            l4Var = null;
        }
        if (l4Var == null) {
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        com.tencent.mm.pluginsdk.ui.u.c().loadBitmap(l4Var.h1());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (!this.A) {
            yf5.i0 i0Var = this.f461977f;
            if (i0Var != null) {
                com.tencent.mm.ui.conversation.d7 d7Var = (com.tencent.mm.ui.conversation.d7) i0Var;
                com.tencent.mm.ui.conversation.ConversationListView conversationListView = d7Var.f207634a.f207372o;
                if (conversationListView != null) {
                    conversationListView.post(new com.tencent.mm.ui.conversation.c7(d7Var));
                }
            }
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f461984p;
            if (mvvmList == null) {
                kotlin.jvm.internal.o.o("mvvmList");
                throw null;
            }
            this.f461985q.a(mvvmList.f152065o);
            super.notifyDataSetChanged();
            this.f461989u.clear();
            com.tencent.mm.ui.conversation.o5 o5Var = this.f461976e;
            if (o5Var.f207943z) {
                o5Var.f207943z = false;
                o5Var.A = false;
                com.tencent.mm.ui.conversation.ConversationListView conversationListView2 = o5Var.f207926f;
                if (conversationListView2 != null) {
                    conversationListView2.postDelayed(new com.tencent.mm.ui.conversation.m5(o5Var), o5Var.f207940w > 50 ? 100L : 0L);
                }
            }
            if (i0Var != null) {
                com.tencent.mm.plugin.report.service.f0.a(12);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f461978g, "clear usernamePositionMap %s", java.lang.Boolean.valueOf(this.A));
    }
}
