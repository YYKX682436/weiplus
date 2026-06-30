package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class e90 extends com.tencent.mm.ui.component.UIComponent implements ku2.b {

    /* renamed from: p, reason: collision with root package name */
    public static r45.cx2 f134230p;

    /* renamed from: d, reason: collision with root package name */
    public boolean f134231d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f134232e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f134233f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.n1 f134234g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.rc f134235h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f134236i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f134237m;

    /* renamed from: n, reason: collision with root package name */
    public ku2.a f134238n;

    /* renamed from: o, reason: collision with root package name */
    public long f134239o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134236i = new java.util.concurrent.ConcurrentHashMap();
        this.f134237m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    public static void T6(com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var, in5.s0 holder, boolean z17, int i17, int i18, boolean z18, int i19, java.lang.Object obj) {
        if ((i19 & 16) != 0) {
            z18 = false;
        }
        e90Var.getClass();
        kotlin.jvm.internal.o.g(holder, "holder");
        if (z18) {
            e90Var.f134237m.postUIDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.z80(e90Var, holder, z17, i17, i18), 500L);
        }
    }

    public final boolean O6() {
        boolean canShowEduTipsWithKey = com.tencent.wechat.aff.finder.FinderPrefetchManager.getInstance().canShowEduTipsWithKey(bw5.ms0.emFinderNewbieGuideType_TingEntryGuide);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return canShowEduTipsWithKey || (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ub).getValue()).r()).intValue() == 1);
    }

    public final java.lang.String P6(long j17) {
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(j17);
        kotlin.jvm.internal.o.d(q17);
        return q17;
    }

    public final java.util.Map Q6(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        java.lang.String str;
        java.lang.String string;
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("session_buffer", baseFinderFeed.g0());
        java.lang.String str2 = "";
        if (V6 == null || (str = V6.getString(1)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        if (V6 != null && (string = V6.getString(2)) != null) {
            str2 = string;
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", str2);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.getInteger(5) : 0));
        lVarArr[4] = new jz5.l("feed_id", java.lang.Long.valueOf(baseFinderFeed.getItemId()));
        lVarArr[5] = new jz5.l("remind_feedid", java.lang.Long.valueOf(this.f134239o));
        return kz5.c1.k(lVarArr);
    }

    public final void R6(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.v80 v80Var, boolean z17) {
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) itemView.findViewById(com.tencent.mm.R.id.tvy);
        if (frameLayout == null || frameLayout.getVisibility() == 8) {
            return;
        }
        java.lang.Object parent = frameLayout.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.y80(z17, this, frameLayout, v80Var, view, null), 3, null);
        }
    }

    public final void S6(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        com.tencent.mm.plugin.finder.viewmodel.component.v80 V6;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.dm2 object_extend;
        r45.o34 o34Var;
        com.tencent.mm.protobuf.g byteString;
        pf5.u uVar = pf5.u.f353936a;
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) uVar.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).c7(getActivity());
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class);
        finderVideoRecycler.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.n90(finderVideoRecycler));
        byte[] byteArray = new bw5.fb0().toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (object_extend = feedObject2.getObject_extend()) != null && (o34Var = (r45.o34) object_extend.getCustom(47)) != null && (byteString = o34Var.getByteString(1)) != null) {
            byteArray = byteString.g();
        }
        if (baseFinderFeed != null && (V6 = V6(baseFinderFeed)) != null) {
            V6.f136225c = true;
        }
        ((o40.e) i95.n0.c(o40.e.class)).getClass();
        ((wy2.g) ((o40.e) i95.n0.c(o40.e.class))).Bi(getContext(), null, kz5.c1.l(new jz5.l("finderSleepModeJumpInfo", byteArray)));
    }

    public final void U6(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.u80 u80Var) {
        com.tencent.mm.plugin.finder.viewmodel.component.v80 V6 = V6(baseFinderFeed);
        if (u80Var == com.tencent.mm.plugin.finder.viewmodel.component.u80.f136110f) {
            pi0.n1 n1Var = this.f134234g;
            if (n1Var != null) {
                n1Var.a();
            }
            this.f134234g = null;
        }
        if (V6 != null) {
            kotlin.jvm.internal.o.g(u80Var, "<set-?>");
            V6.f136224b = u80Var;
            this.f134236i.put(java.lang.Long.valueOf(baseFinderFeed.getItemId()), V6);
        }
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.v80 V6(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        return (com.tencent.mm.plugin.finder.viewmodel.component.v80) this.f134236i.get(java.lang.Long.valueOf(baseFinderFeed.getItemId()));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        this.f134237m.removeCallbacksAndMessages(null);
        java.lang.ref.WeakReference weakReference = this.f134233f;
        if (weakReference != null && (s0Var = (in5.s0) weakReference.get()) != null && (baseFinderFeed = this.f134232e) != null) {
            R6(s0Var, V6(baseFinderFeed), false);
        }
        this.f134236i.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134236i = new java.util.concurrent.ConcurrentHashMap();
        this.f134237m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }
}
