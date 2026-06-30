package com.tencent.mm.plugin.profile.ui.tab.list;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment;", "Lcom/tencent/mm/plugin/profile/ui/tab/list/BaseBizProfileFragment;", "wr3/u0", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfileTabMsgFragment extends com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment {

    /* renamed from: p, reason: collision with root package name */
    public sr3.g f154434p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f154435q;

    /* renamed from: r, reason: collision with root package name */
    public long f154436r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f154437s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f154438t;

    /* renamed from: u, reason: collision with root package name */
    public wr3.t0 f154439u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.gl f154440v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f154441w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView f154442x;

    public BizProfileTabMsgFragment(sr3.g config) {
        kotlin.jvm.internal.o.g(config, "config");
        this.f154434p = config;
        this.f154435q = "BizProfileTabMsgFragment";
        r45.gl glVar = new r45.gl();
        glVar.f375323d = new java.util.LinkedList();
        glVar.f375326g = new r45.ul();
        this.f154440v = glVar;
        this.f154441w = new java.util.LinkedList();
    }

    public static final java.util.ArrayList q0(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment, r45.wl wlVar) {
        java.util.ArrayList arrayList;
        r45.vm vmVar;
        synchronized (bizProfileTabMsgFragment) {
            arrayList = new java.util.ArrayList();
            if (wlVar != null && (vmVar = wlVar.f389244r) != null && !vmVar.f388353e.isEmpty()) {
                arrayList = new java.util.ArrayList(wlVar.f389244r.f388353e);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.list.BaseBizProfileFragment, zy2.h5
    public void P() {
        try {
            if (this.f154442x != null) {
                com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView r07 = r0();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(r07, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
                r07.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(r07, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabMsgFragment", "onAppBarLayoutExpand", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f154435q, "onAppBarLayoutExpand: recyclerView error: " + e17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.a1c, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lqa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154442x = (com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView) findViewById;
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("contact") : null;
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        kotlin.jvm.internal.o.d(string);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) q17).n(string, true);
        com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView r07 = r0();
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.d(context);
        r07.N(new wr3.u0(context));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.d(context2);
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154415h;
        int i17 = m0Var != null ? m0Var.f154467v : 0;
        kotlin.jvm.internal.o.d(n17);
        this.f154439u = new wr3.t0(context2, i17, n17, this.f154436r, this.f154437s, this.f154438t, this.f154434p, "", this);
        r0().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(inflate.getContext()));
        com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView r08 = r0();
        wr3.t0 t0Var = this.f154439u;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
        r08.setAdapter(t0Var);
        wr3.t0 t0Var2 = this.f154439u;
        if (t0Var2 == null) {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
        t0Var2.D.alive();
        ((java.util.HashSet) t0Var2.f448814d.f448822a).clear();
        android.content.Context context3 = t0Var2.f448879m;
        kotlin.jvm.internal.o.g(context3, "context");
        int e17 = fq1.e.f265507a.e(context3);
        int round = e17 - (java.lang.Math.round(es.h.b(context3) * 8.0f) * 3);
        t0Var2.A = round / 2;
        com.tencent.mars.xlog.Log.i(t0Var2.f448886t, "initLayoutParams: screenWidth=" + e17 + ", availableWidth=" + round + ", itemWidth=" + t0Var2.A);
        r0().setOnScrollToTopListener(new wr3.v0(this));
        if (m0().f389235f != null) {
            wr3.t0 t0Var3 = this.f154439u;
            if (t0Var3 == null) {
                kotlin.jvm.internal.o.o("mAdapter");
                throw null;
            }
            r45.gl MsgList = m0().f389235f;
            kotlin.jvm.internal.o.f(MsgList, "MsgList");
            t0Var3.N(MsgList, java.lang.Integer.valueOf(m0().f389235f.f375328i), m0().f389235f.f375327h, this.f154441w);
            if (getContext() != null && (getContext() instanceof com.tencent.mm.plugin.profile.ui.ContactInfoUI)) {
                android.content.Context context4 = getContext();
                kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                java.lang.String a17 = gr3.c.f274848a.a((com.tencent.mm.plugin.profile.ui.ContactInfoUI) context4, "msglist");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = gr3.c.f274851d;
                java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(a17);
                if (l17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileMonitor", "recordMsgListLoadEnd: startTime is null for " + a17);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2127L, 31L, java.lang.System.currentTimeMillis() - l17.longValue(), false);
                    concurrentHashMap.remove(a17);
                }
            }
        }
        wr3.t0 t0Var4 = this.f154439u;
        if (t0Var4 == null) {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
        t0Var4.f448815e = new wr3.w0(this);
        p0(this.f154435q, new wr3.x0(this), new wr3.y0(this), new wr3.z0(this), new wr3.a1(this));
        wr3.t0 t0Var5 = this.f154439u;
        if (t0Var5 != null) {
            t0Var5.f448819i = new wr3.b1(this);
            return inflate;
        }
        kotlin.jvm.internal.o.o("mAdapter");
        throw null;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        wr3.t0 t0Var = this.f154439u;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
        t0Var.D.dead();
        ((java.util.HashSet) t0Var.f448814d.f448822a).clear();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView r0() {
        com.tencent.mm.plugin.profile.ui.tab.view.GradientBackgroundRecyclerView gradientBackgroundRecyclerView = this.f154442x;
        if (gradientBackgroundRecyclerView != null) {
            return gradientBackgroundRecyclerView;
        }
        kotlin.jvm.internal.o.o("mRecyclerView");
        throw null;
    }

    public final boolean s0(r45.s5 msg, yz5.l primary, yz5.l fallback) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(primary, "primary");
        kotlin.jvm.internal.o.g(fallback, "fallback");
        java.util.LinkedList linkedList = msg.f385514i.f382754e;
        kotlin.jvm.internal.o.d(linkedList);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (!((java.lang.Boolean) primary.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (!(arrayList.size() != linkedList.size())) {
            return false;
        }
        if (!arrayList.isEmpty()) {
            msg.f385514i.f382754e = new java.util.LinkedList(arrayList);
            return true;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (!((java.lang.Boolean) fallback.invoke(obj2)).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        if (!(arrayList2.size() != linkedList.size()) || !(!arrayList2.isEmpty())) {
            return false;
        }
        msg.f385514i.f382754e = new java.util.LinkedList(arrayList2);
        return true;
    }
}
