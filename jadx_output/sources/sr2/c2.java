package sr2;

/* loaded from: classes10.dex */
public final class c2 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f411529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411530e;

    public c2(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, sr2.y2 y2Var) {
        this.f411529d = wxRecyclerAdapter;
        this.f411530e = y2Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("PostLocationUIC", "click item pos:" + (i17 - this.f411529d.a0()));
        so2.d2 d2Var = (so2.d2) holder.f293125i;
        if (d2Var != null) {
            sr2.y2 y2Var = this.f411530e;
            ya2.p1 p1Var = y2Var.f411800d;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            r45.c64 c64Var = d2Var.f410312d;
            java.lang.String str2 = c64Var.A;
            float f17 = (float) c64Var.f371328y;
            float f18 = (float) c64Var.f371329z;
            yv2.b bVar = (yv2.b) p1Var;
            android.content.Intent intent = bVar.f466204m;
            if (intent == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            intent.putExtra("saveLocation", true);
            android.content.Intent intent2 = bVar.f466204m;
            if (intent2 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            java.lang.String str3 = c64Var.f371311e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            intent2.putExtra("get_poi_name", str3);
            android.content.Intent intent3 = bVar.f466204m;
            if (intent3 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            if (str2 == null) {
                str2 = "";
            }
            intent3.putExtra("get_city", str2);
            android.content.Intent intent4 = bVar.f466204m;
            if (intent4 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            intent4.putExtra("get_lat", f18);
            android.content.Intent intent5 = bVar.f466204m;
            if (intent5 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            intent5.putExtra("get_lng", f17);
            android.content.Intent intent6 = bVar.f466204m;
            if (intent6 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            java.util.LinkedList DescList = c64Var.f371316m;
            kotlin.jvm.internal.o.f(DescList, "DescList");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            int size = DescList.size();
            for (int i18 = 0; i18 < size; i18++) {
                r45.du5 du5Var = (r45.du5) DescList.get(i18);
                if (du5Var != null && (str = du5Var.f372756d) != null && !kotlin.jvm.internal.o.b(str, "")) {
                    java.lang.String str4 = du5Var.f372756d;
                    kotlin.jvm.internal.o.f(str4, "getString(...)");
                    java.lang.String lowerCase = str4.toLowerCase();
                    kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                    if (!kotlin.jvm.internal.o.b(lowerCase, "null")) {
                        stringBuffer.append(du5Var.f372756d);
                        if (i18 < DescList.size() - 1) {
                            stringBuffer.append("·");
                        }
                    }
                }
            }
            intent6.putExtra("get_poi_address", stringBuffer.toString());
            android.content.Intent intent7 = bVar.f466204m;
            if (intent7 == null) {
                kotlin.jvm.internal.o.o("intent");
                throw null;
            }
            java.lang.String str5 = c64Var.f371310d;
            intent7.putExtra("get_poi_classify_id", str5 != null ? str5 : "");
            ya2.p1 p1Var2 = y2Var.f411800d;
            if (p1Var2 == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var2).d(false);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = y2Var.f411801e;
            if (wxRecyclerView == null) {
                kotlin.jvm.internal.o.o("lbsRecyclerView");
                throw null;
            }
            wxRecyclerView.setVisibility(8);
            ya2.p1 p1Var3 = y2Var.f411800d;
            if (p1Var3 == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            r45.ze2 ze2Var = ((yv2.b) p1Var3).f466202h;
            if (ze2Var != null) {
                com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
                com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                if (finderFeedReportObject != null) {
                    finderFeedReportObject.setLbsFlag(5);
                    finderFeedReportObject.setSelectLocation(ze2Var);
                    finderFeedReportObject.setRecommend_lbs_position(i17);
                }
            }
        }
    }
}
