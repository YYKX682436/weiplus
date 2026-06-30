package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.v2 f116848e;

    public z0(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView, so2.v2 v2Var) {
        this.f116847d = finderLiveAfterPluginRecommendLiveView;
        this.f116848e = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protobuf.g byteString;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView.f115780x;
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f116847d;
        finderLiveAfterPluginRecommendLiveView.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "jumpToFinderLiveEntrance: navigate to finder live entrance");
        java.util.HashMap hashMap = new java.util.HashMap();
        so2.v2 v2Var = this.f116848e;
        hashMap.put("liveid", pm0.v.u(v2Var.f410659n.getLong(0)));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f328012z3;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        ml2.q1 q1Var = ml2.q1.f327812e;
        zy2.zb.T8(zbVar, t1Var, hashMap, b17, "temp_30", null, null, false, 112, null);
        long j17 = c01.z1.j();
        if ((9007199254740992L & j17) != 0) {
            long j18 = j17 & (-9007199254740993L);
            c01.z1.Q(java.lang.Long.valueOf(j18));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "jumpToFinderLiveEntrance: opened live entrance, newExtStatus=" + j18);
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 65;
            p53Var.f382762e = 1;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        android.content.Intent intent = new android.content.Intent();
        ws5.j[] jVarArr = ws5.j.f449218d;
        intent.putExtra("nearby_live_enter_source_params_key", 6);
        intent.putExtra("nearby_live_disable_clean_red_params_key", true);
        intent.putExtra("nearby_live_forbid_enter_preload_params_key", true);
        intent.putExtra("KEY_FROM_SHARE_REL", true);
        intent.putExtra("KEY_FORBID_SQUARE_TEEN", true);
        r45.la2 la2Var = v2Var.f410667v;
        if (la2Var != null && (byteString = la2Var.getByteString(2)) != null) {
            intent.putExtra("nearby_live_target_last_buffer_params_key", byteString.g());
        }
        r45.ow1 ow1Var = v2Var.f410669x;
        if (ow1Var != null) {
            r45.lp1 lp1Var = new r45.lp1();
            java.lang.String string = ow1Var.getString(2);
            if (string != null) {
                lp1Var.set(0, string);
            }
            java.lang.String string2 = ow1Var.getString(3);
            if (string2 != null) {
                lp1Var.set(1, string2);
            }
            intent.putExtra("nearby_live_guide_ext_info_params_key", lp1Var.toByteArray());
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAfterPluginRecommendLiveView", "jumpToFinderLiveEntrance: extInfo lightUrl=" + lp1Var.getString(0) + ", darkUrl=" + lp1Var.getString(1));
        }
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        android.content.Context context = finderLiveAfterPluginRecommendLiveView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((v40.s) nVar).wi(context, intent);
        android.content.Context context2 = finderLiveAfterPluginRecommendLiveView.getContext();
        if (context2 instanceof androidx.appcompat.app.AppCompatActivity) {
            ((androidx.appcompat.app.AppCompatActivity) context2).finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveAfterPluginRecommendLiveView$renderMoreBtn$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
