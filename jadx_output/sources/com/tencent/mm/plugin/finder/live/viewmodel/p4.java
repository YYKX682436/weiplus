package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes2.dex */
public final class p4 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f117316d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f117317e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.GridLayout f117318f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f117319g;

    /* renamed from: h, reason: collision with root package name */
    public km2.p f117320h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f117316d = itemView.findViewById(com.tencent.mm.R.id.f485197u12);
        this.f117317e = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f485195u10);
        this.f117318f = (android.widget.GridLayout) itemView.findViewById(com.tencent.mm.R.id.u0w);
        this.f117319g = itemView.findViewById(com.tencent.mm.R.id.u0s);
    }

    public static final void i(com.tencent.mm.plugin.finder.live.viewmodel.p4 p4Var) {
        r45.lp1 lp1Var;
        com.tencent.mm.protobuf.g gVar;
        android.content.Context context = p4Var.itemView.getContext();
        com.tencent.mars.xlog.Log.i("FinderLiveGuideCard", "jumpToLiveSquare: navigate to live square");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.t1 t1Var = ml2.t1.f327942e;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        ml2.q1 q1Var = ml2.q1.f327812e;
        ((ml2.j0) ((zy2.zb) c17)).Sj("live_down_find_enter_pop", linkedHashMap, null, "temp_2", null, null);
        long j17 = c01.z1.j();
        if ((9007199254740992L & j17) != 0) {
            long j18 = j17 & (-9007199254740993L);
            c01.z1.Q(java.lang.Long.valueOf(j18));
            com.tencent.mars.xlog.Log.i("FinderLiveGuideCard", "jumpToLiveSquare: opened live entrance, newExtStatus=" + j18);
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
        km2.p pVar = p4Var.f117320h;
        if (pVar != null && (gVar = pVar.f309167b) != null) {
            intent.putExtra("nearby_live_target_last_buffer_params_key", gVar.f192156a);
            com.tencent.mars.xlog.Log.i("FinderLiveGuideCard", "jumpToLiveSquare: navBuffer size=" + gVar.f192156a.length);
        }
        km2.p pVar2 = p4Var.f117320h;
        if (pVar2 != null && (lp1Var = pVar2.f309168c) != null) {
            intent.putExtra("nearby_live_guide_ext_info_params_key", lp1Var.toByteArray());
            com.tencent.mars.xlog.Log.i("FinderLiveGuideCard", "jumpToLiveSquare: extInfo lightUrl=" + lp1Var.getString(0));
        }
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        kotlin.jvm.internal.o.d(context);
        ((v40.s) nVar).wi(context, intent);
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
    }
}
