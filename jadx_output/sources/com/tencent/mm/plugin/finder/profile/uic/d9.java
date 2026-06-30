package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class d9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f123619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f123620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f123621g;

    public d9(com.tencent.mm.plugin.finder.profile.uic.ob obVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, kotlin.jvm.internal.c0 c0Var, boolean z17) {
        this.f123618d = obVar;
        this.f123619e = finderJumpInfo;
        this.f123620f = c0Var;
        this.f123621g = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.app.Activity parentActivity;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleShopBrandArea$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123618d;
        android.app.Activity context = obVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.live.viewmodel.aa aaVar = (com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.v9.class));
        com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo = this.f123619e;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        com.tencent.mm.plugin.finder.live.viewmodel.z9 z9Var = com.tencent.mm.plugin.finder.live.viewmodel.aa.f116905h;
        z9Var.b(aaVar.f116906d, jumpInfo);
        xc2.p0 p0Var = new xc2.p0(jumpInfo);
        l81.b1 b1Var = p0Var.f453251m;
        if (b1Var == null) {
            b1Var = new l81.b1();
        }
        android.app.Activity context2 = obVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        z9Var.c(((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.v9.class))).f116906d, b1Var);
        p0Var.f453251m = b1Var;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ob).getValue()).r()).intValue() == 1 && obVar.getFragmentMode()) {
            p0Var.I = 1;
        }
        androidx.appcompat.app.AppCompatActivity activity = obVar.getActivity();
        in5.s0 s0Var = null;
        com.tencent.mm.ui.vas.VASActivity vASActivity = activity instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) activity : null;
        if (vASActivity != null && (parentActivity = vASActivity.getParentActivity()) != null && (recyclerView = (androidx.recyclerview.widget.RecyclerView) parentActivity.findViewById(com.tencent.mm.R.id.f486458la3)) != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
            if (finderLinearLayoutManager != null) {
                androidx.recyclerview.widget.k3 q07 = recyclerView.q0(finderLinearLayoutManager.w(), false);
                if (q07 instanceof in5.s0) {
                    s0Var = (in5.s0) q07;
                }
            }
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context3 = obVar.h7().f434560d0.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        xc2.y2.i(y2Var, context3, p0Var, 0, s0Var, 4, null);
        long longExtra = obVar.getIntent().getLongExtra("finder_from_feed_id", 0L);
        java.lang.String stringExtra = obVar.getIntent().getStringExtra("finder_from_feed_dup_flag");
        com.tencent.mm.plugin.finder.report.t2 t2Var = com.tencent.mm.plugin.finder.report.t2.f125363a;
        android.app.Activity context4 = obVar.getContext();
        java.lang.String username = obVar.getUsername();
        java.lang.String wording = jumpInfo.getWording();
        if (wording == null) {
            wording = "";
        }
        t2Var.c(context4, username, true, wording, this.f123620f.f310112d, longExtra, this.f123621g);
        if (longExtra != 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("feedActionType", 72);
            java.lang.String a17 = hc2.k.a(hashMap);
            r45.jn0 jn0Var = new r45.jn0();
            jn0Var.set(0, java.lang.Long.valueOf(longExtra));
            jn0Var.set(12, stringExtra);
            java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, stringExtra, obVar.getContextObj().getInteger(7));
            jn0Var.set(2, ek6);
            jn0Var.set(3, a17);
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "handleShopBrandArea reportExtStats json=" + a17 + ", sessionBuffer=" + ek6);
            if (bq.t.f23523s.a()) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                cq.j1.f((cq.k) c17, obVar.getContextObj(), 18054, kz5.c0.d(jn0Var), ek6);
            } else {
                gm0.j1.d().g(new db2.g5(obVar.getContextObj(), 18054, jn0Var, ek6));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleShopBrandArea$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
