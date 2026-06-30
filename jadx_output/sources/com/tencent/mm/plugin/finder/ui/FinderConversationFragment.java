package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationFragment;", "Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderConversationFragment extends com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment {
    public static final /* synthetic */ int I = 0;
    public com.tencent.mm.plugin.finder.report.g6 E;
    public final com.tencent.mm.plugin.finder.ui.FinderConversationFragment$notificationListener$1 H;
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.ui.x2(this));
    public final qb2.t D = com.tencent.mm.plugin.finder.storage.t80.f128066e.a();
    public final int[] F = {4};
    public final int G = 1;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.ui.FinderConversationFragment$notificationListener$1] */
    public FinderConversationFragment() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.H = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderSysNotificationEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderConversationFragment$notificationListener$1
            {
                this.__eventId = 1367267480;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderSysNotificationEvent finderSysNotificationEvent) {
                com.tencent.mm.autogen.events.FinderSysNotificationEvent event = finderSysNotificationEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.hd hdVar = event.f54328g;
                if (hdVar == null) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderBaseConversationFragment", "[notificationListener] brief:" + hdVar.f6831a + ", time:" + hdVar.f6832b);
                int i17 = com.tencent.mm.plugin.finder.ui.FinderConversationFragment.I;
                com.tencent.mm.plugin.finder.ui.FinderConversationFragment finderConversationFragment = com.tencent.mm.plugin.finder.ui.FinderConversationFragment.this;
                finderConversationFragment.N0();
                android.view.View view = finderConversationFragment.f206301h;
                if (view == null) {
                    return true;
                }
                view.post(new com.tencent.mm.plugin.finder.ui.s2(finderConversationFragment));
                return true;
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment
    public void L0() {
        com.tencent.mm.plugin.finder.report.g6 g6Var = this.E;
        boolean z17 = false;
        if (g6Var != null && g6Var.a()) {
            z17 = true;
        }
        if (z17) {
            M0();
        }
    }

    public final void M0() {
        java.lang.String str;
        android.content.Intent intent;
        r45.qt2 qt2Var = null;
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        int i17 = I1 != null ? I1.field_systemMsgCount : 0;
        if (i17 > 0) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ej(i17, 1L);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity != null) {
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                if (nyVar != null) {
                    qt2Var = nyVar.V6();
                }
            }
            com.tencent.mm.plugin.finder.report.o3.uj(o3Var, "11", 4, 1, 5, 0, i17, null, null, 0L, qt2Var, 0, 0, 3520, null);
        } else {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ej(0, 1L);
        }
        androidx.fragment.app.FragmentActivity activity2 = getActivity();
        if (activity2 == null || (intent = activity2.getIntent()) == null || (str = intent.getStringExtra("key_context_id")) == null) {
            str = "";
        }
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Xk(str, 0);
    }

    public final void N0() {
        java.util.List b17;
        boolean b18 = bq.q0.f23513t.b();
        qb2.t tVar = this.D;
        if (b18) {
            tVar.field_updateTime = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_TIME_LONG_SYNC, 0L) * 1000;
            tVar.field_digest = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_BRIEF_STRING_SYNC, "");
            com.tencent.mars.xlog.Log.i("Finder.FinderBaseConversationFragment", "newSysMsg, digest: " + tVar.field_digest);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            cu2.a0 a0Var = cu2.b0.f222371a;
            b17 = a0Var.b(com.tencent.wcdb.core.Database.DictDefaultMatchValue, 1, (r18 & 4) != 0 ? new int[0] : this.F, this.G, (java.lang.String) ((jz5.n) this.f128510w).getValue(), (r18 & 32) != 0 ? 0 : 0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                so2.i j17 = a0Var.j((dm.pd) it.next());
                if (j17 != null) {
                    arrayList2.add(j17);
                }
            }
            arrayList.addAll(arrayList2);
            if (!arrayList.isEmpty()) {
                r45.rk2 rk2Var = ((so2.i) arrayList.get(0)).f410411d.field_notify;
                tVar.field_updateTime = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_TIME_LONG_SYNC, ((so2.i) arrayList.get(0)).f410411d.field_createTime) * 1000;
                tVar.field_digest = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_BRIEF_STRING_SYNC, rk2Var.getString(0));
                com.tencent.mars.xlog.Log.i("Finder.FinderBaseConversationFragment", "sysMsg, digest: " + tVar.field_digest);
            }
        }
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        tVar.field_unReadCount = I1 != null ? I1.field_systemMsgCount : 0;
        tVar.field_readStatus = 0;
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.o1.c(dv2.h.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == 1) {
            wn.a w07 = w0();
            kotlin.jvm.internal.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationAdapter");
            ((qb2.b0) w07).J("findersayhisessionholder");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        alive();
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        zy2.z8 S = ((c61.l7) i95.n0.c(c61.l7.class)).nk().S();
        android.content.Context context = getContext();
        ((com.tencent.mm.plugin.finder.extension.reddot.e1) S).h(context != null ? xy2.c.e(context) : null, zy2.y8.f477618n);
        com.tencent.mm.plugin.finder.report.g6 g6Var = this.E;
        if (g6Var != null) {
            g6Var.f124999d = null;
            com.tencent.mm.plugin.finder.report.b bVar = g6Var.f125002g;
            if (bVar != null) {
                bVar.f124956a = false;
                bVar.f124957b = null;
            }
            g6Var.f125055h = null;
        }
        dead();
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.view.View view = this.f206301h;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.ui.w2(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        if (w0() instanceof qb2.i0) {
            java.lang.String string = getString(com.tencent.mm.R.string.cqn);
            qb2.t tVar = this.D;
            tVar.F1 = string;
            tVar.field_sessionId = "finder_system_message";
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = tVar.F1;
            if (str == null) {
                str = "";
            }
            ((ke0.e) xVar).getClass();
            tVar.E1 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
            N0();
            wn.a w07 = w0();
            kotlin.jvm.internal.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            ((qb2.i0) w07).f361222t.add(tVar);
        }
        super.onViewCreated(view, bundle);
        com.tencent.mm.plugin.finder.report.g6 g6Var = new com.tencent.mm.plugin.finder.report.g6();
        com.tencent.mm.plugin.finder.report.b bVar = g6Var.f125002g;
        if (bVar != null) {
            bVar.f124957b = new com.tencent.mm.plugin.finder.ui.r2(this);
        }
        androidx.recyclerview.widget.RecyclerView conversationRecyclerView = ((vb2.g) ((jz5.n) this.C).getValue()).f434606b;
        kotlin.jvm.internal.o.f(conversationRecyclerView, "conversationRecyclerView");
        g6Var.f124999d = conversationRecyclerView;
        conversationRecyclerView.i(g6Var);
        com.tencent.mm.plugin.finder.report.b bVar2 = g6Var.f125002g;
        if (bVar2 != null) {
            bVar2.f124956a = true;
        }
        if (conversationRecyclerView.getAdapter() instanceof qb2.i0) {
            androidx.recyclerview.widget.f2 adapter = conversationRecyclerView.getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            g6Var.f125055h = (qb2.i0) adapter;
        }
        this.E = g6Var;
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.a t0() {
        qb2.i0 i0Var = new qb2.i0(this);
        i0Var.f361177s = new qb2.l0(com.tencent.mm.plugin.finder.ui.o2.f129567d);
        i0Var.f361176r = new qb2.g0(this, new com.tencent.mm.plugin.finder.ui.p2(this), new com.tencent.mm.plugin.finder.ui.q2(this));
        return i0Var;
    }
}
