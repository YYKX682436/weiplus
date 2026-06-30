package s82;

/* loaded from: classes9.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.ra f404833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s82.s0 f404834e;

    public r0(com.tencent.mm.plugin.fav.ui.ra raVar, s82.s0 s0Var) {
        this.f404833d = raVar;
        this.f404834e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        s82.s0 s0Var;
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        if (!fp.i.b()) {
            db5.t7.k(this.f404833d.f101384a, null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (v17.getTag() instanceof o72.r2) {
            java.lang.Object tag = v17.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.fav.api.FavItemInfo");
            o72.r2 r2Var = (o72.r2) tag;
            r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
            kotlin.jvm.internal.o.f(jq0Var, "getSourceItem(...)");
            r45.gp0 J2 = o72.x1.J(r2Var);
            if (J2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavTingMusicListItem", "data item is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.String str5 = jq0Var.f378050w;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String listenId = o72.x1.Z(J2, str5, bool).d().getListenId();
            boolean k07 = o72.x1.k0(J2);
            s82.s0 s0Var2 = this.f404834e;
            if (!k07) {
                if (!com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(v17.getContext(), null)) {
                    yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                int E = o72.x1.E(r2Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTingMusicListItem", "fav ting type = " + E);
                if (!o72.x1.F() || E == o72.x1.f343521g) {
                    str3 = "(Landroid/view/View;)V";
                    str4 = "onClick";
                    s0Var = s0Var2;
                    j17 = 9;
                    java.lang.String str6 = jq0Var.f378050w;
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    o72.x1.u0(J2, str6, bool, 1500, java.lang.String.valueOf(r2Var.field_id), java.lang.Boolean.FALSE, null, null);
                } else {
                    java.lang.String str7 = jq0Var.f378050w;
                    bw5.ar0 ar0Var2 = bw5.ar0.TingScene_UnDefined;
                    s0Var = s0Var2;
                    str3 = "(Landroid/view/View;)V";
                    str4 = "onClick";
                    j17 = 9;
                    o72.x1.v0(J2, str7, bool, 1500, r2Var.field_id + "", E);
                }
                s82.s0.l(s0Var, (android.widget.ImageView) v17);
                i95.m c17 = i95.n0.c(qk.k6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                if (qk.k6.w4((qk.k6) c17, listenId, null, null, 6, null) != qk.p9.f364313e) {
                    com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
                    mvCardActionReportStruct.f59456j = 1L;
                    mvCardActionReportStruct.f59457k = j17;
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                    zy2.oc.b(mvCardActionReportStruct);
                }
                str = str3;
                str2 = str4;
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", str2, str);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTingMusicListItem", "same song, do release");
            i95.m c18 = i95.n0.c(qk.k6.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            if (qk.k6.w4((qk.k6) c18, listenId, null, null, 6, null) != qk.p9.f364313e) {
                com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
                mvCardActionReportStruct2.f59456j = 2L;
                mvCardActionReportStruct2.f59457k = 9L;
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                zy2.oc.b(mvCardActionReportStruct2);
            }
            i95.m c19 = i95.n0.c(qk.k6.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            qk.k6.Xg((qk.k6) c19, null, listenId, null, null, 13, null);
            s82.s0.l(s0Var2, null);
        }
        str = "(Landroid/view/View;)V";
        str2 = "onClick";
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavTingMusicListItem$musicController$1", "android/view/View$OnClickListener", str2, str);
    }
}
