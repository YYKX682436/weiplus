package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jj0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f113117p;

    /* renamed from: q, reason: collision with root package name */
    public r45.rm1 f113118q;

    /* renamed from: r, reason: collision with root package name */
    public int f113119r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f113120s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f113121t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f113122u;

    /* renamed from: v, reason: collision with root package name */
    public r45.d22 f113123v;

    /* renamed from: w, reason: collision with root package name */
    public bl2.k f113124w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f113125x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113117p = "Finder.FinderLiveVisitorMusicPlugin";
        root.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.fj0(this, root));
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.qfa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f113120s = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f483367d16);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f113121t = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.qf_);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f113122u = findViewById3;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f113118q = null;
        this.f113119r = 0;
        this.f113125x = false;
        bl2.k kVar = this.f113124w;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        java.lang.String str = this.f113117p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SEI music info curBgmPlayingInfo:");
        r45.rm1 rm1Var = this.f113118q;
        sb6.append(rm1Var != null ? dk2.q.h(rm1Var) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.rm1 rm1Var2 = this.f113118q;
        if (rm1Var2 != null) {
            int i17 = ((mm2.n0) S0().a(mm2.n0.class)).f329273r ? 16 : 2;
            dk2.xf j17 = dk2.ef.f233372a.j(R0());
            if (j17 != null) {
                long j18 = ((mm2.e1) S0().a(mm2.e1.class)).f328988r.getLong(0);
                byte[] bArr = ((mm2.e1) S0().a(mm2.e1.class)).f328985o;
                android.content.Context context = this.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "<get-context>(...)");
                ((dk2.r4) j17).O(j18, bArr, xy2.c.e(context), ((mm2.e1) S0().a(mm2.e1.class)).f328983m, i17, kz5.b0.c(rm1Var2), new com.tencent.mm.plugin.finder.live.plugin.ij0(this));
            }
        }
    }

    public final void u1(int i17, boolean z17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("listen_source_type", z17 ? 1 : 2);
        jSONObject.put("base_listenid", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327222d2, t17, 0L, null, null, null, null, null, 252, null);
    }

    public final void v1(boolean z17) {
        android.view.View view = this.f113120s;
        int i17 = z17 ^ true ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f113121t;
        int i18 = z17 ^ true ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f113122u;
        int i19 = z17 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorMusicPlugin", "updateMusicIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
