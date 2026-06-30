package mj2;

/* loaded from: classes10.dex */
public abstract class e implements android.view.View.OnClickListener, si2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f327013d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f327014e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f327015f;

    /* renamed from: g, reason: collision with root package name */
    public final zh2.c f327016g;

    /* renamed from: h, reason: collision with root package name */
    public final zh2.e f327017h;

    /* renamed from: i, reason: collision with root package name */
    public final zh2.d f327018i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f327019m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f327020n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f327021o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f327022p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f327023q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f327024r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f327025s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f327026t;

    /* renamed from: u, reason: collision with root package name */
    public final yh2.j f327027u;

    public e(android.content.Context context, gk2.e liveData, android.view.View root, zh2.c pluginAbility, zh2.e micUserInterface, zh2.d dVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(micUserInterface, "micUserInterface");
        this.f327013d = context;
        this.f327014e = liveData;
        this.f327015f = root;
        this.f327016g = pluginAbility;
        this.f327017h = micUserInterface;
        this.f327018i = dVar;
        this.f327019m = l();
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.fkj);
        this.f327020n = findViewById;
        this.f327021o = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.quy);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.qs7);
        this.f327022p = recyclerView;
        this.f327023q = root.findViewById(com.tencent.mm.R.id.eku);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f327024r = arrayList;
        this.f327025s = new java.util.ArrayList();
        this.f327026t = jz5.h.b(new mj2.c(this));
        yh2.j jVar = new yh2.j(new com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveVisitorLinkConvertFactory(liveData, new mj2.a(this)), arrayList);
        this.f327027u = jVar;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
        recyclerView.setAdapter(jVar);
        findViewById.setOnClickListener(this);
    }

    public mi2.h j() {
        return new mi2.h(this.f327013d, this.f327016g, new mj2.b(this));
    }

    public void k(java.lang.String source) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(source, "source");
        this.f327025s.clear();
        java.util.ArrayList arrayList2 = this.f327025s;
        java.util.List list = ((mm2.o4) this.f327014e.a(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!kotlin.jvm.internal.o.b(((km2.q) obj).f309189t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new vi2.j((km2.q) it.next()));
        }
        arrayList2.addAll(arrayList3);
        com.tencent.mars.xlog.Log.i(this.f327019m, "fillApplyLinkUserList source: " + source + " applyRealSize: " + this.f327025s.size() + " audienceLinkMicUserList: " + ((mm2.o4) this.f327014e.a(mm2.o4.class)).f329327v);
        this.f327024r.clear();
        this.f327024r.addAll(this.f327025s);
    }

    public java.lang.String l() {
        return "VisitorAcceptPanelWidget";
    }

    public void m() {
        this.f327016g.i();
    }

    public void n(int i17, km2.q hungupUser) {
        kotlin.jvm.internal.o.g(hungupUser, "hungupUser");
        if (i17 == -1 || i17 >= this.f327027u.getItemCount()) {
            return;
        }
        hungupUser.z();
        ((mm2.o4) this.f327014e.a(mm2.o4.class)).O7(hungupUser);
        ((com.tencent.mm.plugin.finder.live.plugin.u7) this.f327017h).b(hungupUser);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[EDGE_INSN: B:20:0x0055->B:21:0x0055 BREAK  A[LOOP:0: B:8:0x002b->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[LOOP:0: B:8:0x002b->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca A[EDGE_INSN: B:67:0x00ca->B:68:0x00ca BREAK  A[LOOP:1: B:55:0x00a0->B:78:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[LOOP:1: B:55:0x00a0->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(boolean r9, km2.q r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mj2.e.o(boolean, km2.q):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        kn0.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fkj) {
            tn0.w0 h17 = this.f327016g.h();
            boolean z17 = true;
            if ((h17 == null || (pVar = h17.D) == null || !pVar.f309589i) ? false : true) {
                android.content.Context context = this.f327013d;
                db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.mlm));
                z17 = false;
            }
            if (!z17) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                fj2.s.c(fj2.s.f263183a, ml2.q2.f327840y, null, null, 0, 0, 30, null);
                ((mi2.h) ((jz5.n) this.f327026t).getValue()).F();
                m();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void p() {
        android.view.View view = this.f327023q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "showContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f327022p.setVisibility(0);
        this.f327021o.setText(this.f327013d.getResources().getString(com.tencent.mm.R.string.lzc, java.lang.Integer.valueOf(this.f327025s.size())));
    }

    public void q() {
        android.view.View view = this.f327023q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveBaseVisitorAcceptPanelWidget", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f327022p.setVisibility(8);
        this.f327021o.setText(this.f327013d.getResources().getString(com.tencent.mm.R.string.f491676m00));
    }

    public void r(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        k(source);
        this.f327027u.notifyDataSetChanged();
        if (this.f327025s.size() > 0) {
            p();
        } else {
            q();
        }
    }
}
