package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f114509f;

    public u1(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, int i17) {
        this.f114507d = h0Var;
        this.f114508e = v3Var;
        this.f114509f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$configThankGuidePanelByCurrentDataUnit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) this.f114507d.f310123d;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114508e;
        if (finderJumpInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = v3Var.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453252n = 0;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        java.lang.String username = ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o;
        long j17 = ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0);
        r0Var.getClass();
        kotlin.jvm.internal.o.g(username, "username");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("finder_username", username);
        hashMap.put("liveId", java.lang.String.valueOf(j17));
        int i17 = this.f114509f;
        hashMap.put("analysis_type", java.lang.String.valueOf(i17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f327994v2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.T8(zbVar, t1Var, hashMap, b17, "1002", null, null, false, 112, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndThankGuideItemClick report23059, liveid = " + j17 + ", analysisType=" + i17);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$configThankGuidePanelByCurrentDataUnit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
