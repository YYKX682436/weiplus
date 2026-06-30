package ka2;

/* loaded from: classes10.dex */
public final class l implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI f306037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f306038e;

    public l(com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI, java.util.ArrayList arrayList) {
        this.f306037d = finderPoiNormalLbsListUI;
        this.f306038e = arrayList;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI finderPoiNormalLbsListUI = this.f306037d;
        java.lang.Object obj = null;
        if (i17 == finderPoiNormalLbsListUI.f101795v && finderPoiNormalLbsListUI.f101794u != null) {
            finderPoiNormalLbsListUI.f101795v = -1;
            finderPoiNormalLbsListUI.f101794u = null;
            com.tencent.mm.ui.widget.button.WeButton weButton = finderPoiNormalLbsListUI.f101798y;
            if (weButton != null) {
                weButton.setEnabled(false);
            }
            adapter.notifyItemChanged(i17);
            return;
        }
        java.lang.Object obj2 = this.f306038e.get(i17);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        ha2.a aVar = (ha2.a) obj2;
        switch (aVar.f279792e) {
            case 4:
            case 7:
                return;
            case 5:
                boolean z17 = finderPoiNormalLbsListUI.f101793t;
                ka2.d dVar = finderPoiNormalLbsListUI.L;
                java.util.Iterator it = (z17 ? dVar.f306017b : dVar.f306016a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (((ha2.a) next).f279792e == 5) {
                            obj = next;
                        }
                    }
                }
                ha2.a aVar2 = (ha2.a) obj;
                if (aVar2 != null) {
                    aVar2.f279796i = true;
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderPoiNormalLbsListUI.f101793t ? dVar.f306021f : dVar.f306020e;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI.n7(finderPoiNormalLbsListUI, finderPoiNormalLbsListUI.f101799z, finderPoiNormalLbsListUI.f101793t, true, false, ka2.f.f306029e, 0, 40, null);
                return;
            case 6:
            case 8:
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("is_only_show_media_with_location", true);
                ((w40.e) i95.n0.c(w40.e.class)).getClass();
                qs2.v vVar = qs2.v.f366327a;
                androidx.appcompat.app.AppCompatActivity context = finderPoiNormalLbsListUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                qs2.t.a(vVar, context, intent, 3, 1, java.lang.Boolean.TRUE, 10001, 41, false, 128, null);
                return;
            default:
                int i18 = finderPoiNormalLbsListUI.f101795v;
                if (i18 >= 0) {
                    adapter.notifyItemChanged(i18);
                }
                finderPoiNormalLbsListUI.f101794u = aVar;
                finderPoiNormalLbsListUI.f101795v = i17;
                adapter.notifyItemChanged(i17);
                com.tencent.mm.ui.widget.button.WeButton weButton2 = finderPoiNormalLbsListUI.f101798y;
                if (weButton2 != null) {
                    weButton2.setEnabled(true);
                }
                if (1 == aVar.f279792e) {
                    r45.hd1 hd1Var = aVar.f279791d;
                    if (hd1Var.getInteger(5) == 1 && finderPoiNormalLbsListUI.f7()) {
                        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                        androidx.appcompat.app.AppCompatActivity context2 = finderPoiNormalLbsListUI.getContext();
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        ka2.j jVar = new ka2.j(finderPoiNormalLbsListUI, aVar);
                        i0Var.getClass();
                        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderPostPromotionShopAppId");
                        if (d17 == null) {
                            d17 = "wxalitecd3434f9a28b4db218f4730961d39d55";
                        }
                        java.lang.String str2 = d17;
                        com.tencent.mars.xlog.Log.i("FinderConfig", "FINDER_POST_PROMOTION_SHOP_APP_ID appId = ".concat(str2));
                        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
                        if (finderFeedReportObject == null || (str = finderFeedReportObject.getPostId()) == null) {
                            str = "";
                        }
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderPostPromotionShopPath");
                        if (d18 == null) {
                            d18 = "pages/local/postWithCoupon/index";
                        }
                        com.tencent.mars.xlog.Log.i("FinderConfig", "FINDER_POST_PROMOTION_SHOP_PATH path = ".concat(d18));
                        sb6.append(d18);
                        sb6.append("?sessionId=");
                        sb6.append(str);
                        sb6.append("&poiId=");
                        sb6.append(hd1Var.getString(0));
                        java.lang.String sb7 = sb6.toString();
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        zy2.ta.f(ya2.e1.f460472a, context2, str2, sb7, null, false, true, false, null, new com.tencent.mm.plugin.finder.assist.h0(i0Var, jVar), 216, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
