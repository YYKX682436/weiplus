package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f114319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f114320e;

    public sy(com.tencent.mm.plugin.finder.live.plugin.ty tyVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f114319d = tyVar;
        this.f114320e = finderJumpInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$updateHotCardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.f328383v2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f114320e;
        jSONObject.put("report_info", finderJumpInfo.getReport_info());
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f114319d;
        tyVar.u1();
        df2.nm nmVar = (df2.nm) tyVar.R0().getController(df2.nm.class);
        if (nmVar != null) {
            nmVar.Z6(finderJumpInfo);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMemberListPlugin$updateHotCardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
