package s82;

/* loaded from: classes9.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s82.c0 f404731d;

    public a0(s82.c0 c0Var) {
        this.f404731d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = fp.i.b();
        s82.c0 c0Var = this.f404731d;
        if (!b17) {
            db5.t7.k(c0Var.f404739c.f101384a, null);
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof o72.r2) {
            o72.r2 r2Var = (o72.r2) view.getTag();
            r45.jq0 jq0Var = r2Var.field_favProto.f370962d;
            r45.gp0 J2 = o72.x1.J(r2Var);
            if (J2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavBaseListItem", "data item is null");
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!o72.x1.k0(J2)) {
                if (!com.tencent.mm.sdk.platformtools.f9.SessionMusic.k(view.getContext(), null)) {
                    yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                int E = o72.x1.E(r2Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "favTingType = " + E);
                if (!o72.x1.F() || E == o72.x1.f343521g) {
                    str3 = "(Landroid/view/View;)V";
                    str4 = "onClick";
                    j17 = 9;
                    java.lang.String str5 = jq0Var.f378050w;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    o72.x1.u0(J2, str5, bool, 1500, r2Var.field_id + "", java.lang.Boolean.FALSE, null, null);
                } else {
                    java.lang.String str6 = jq0Var.f378050w;
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    bw5.ar0 ar0Var2 = bw5.ar0.TingScene_UnDefined;
                    str3 = "(Landroid/view/View;)V";
                    str4 = "onClick";
                    j17 = 9;
                    o72.x1.v0(J2, str6, bool2, 1500, r2Var.field_id + "", E);
                }
                s82.c0.l(c0Var, (android.widget.ImageView) view);
                com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
                mvCardActionReportStruct.f59456j = 1L;
                mvCardActionReportStruct.f59457k = j17;
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
                zy2.oc.b(mvCardActionReportStruct);
                str = str3;
                str2 = str4;
                yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", str2, str);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "same song, do release");
            com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct mvCardActionReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.MvCardActionReportStruct();
            mvCardActionReportStruct2.f59456j = 2L;
            mvCardActionReportStruct2.f59457k = 9L;
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            zy2.oc.b(mvCardActionReportStruct2);
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).pj();
            s82.c0.l(c0Var, null);
        }
        str = "(Landroid/view/View;)V";
        str2 = "onClick";
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/listitem/FavMusicMvListItem$1", "android/view/View$OnClickListener", str2, str);
    }
}
