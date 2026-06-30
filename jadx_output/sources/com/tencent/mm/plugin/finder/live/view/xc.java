package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class xc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f116809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView f116810e;

    public xc(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView) {
        this.f116809d = finderItem;
        this.f116810e = simpleLivingCardView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$renderView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f116809d;
        r45.nw1 liveInfo = finderItem.getLiveInfo();
        long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
        com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView simpleLivingCardView = this.f116810e;
        r45.qt2 reportObj = simpleLivingCardView.getReportObj();
        java.lang.String str = (reportObj == null || (string = reportObj.getString(1)) == null) ? "" : string;
        r0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", "1002");
        hashMap.put("liveid", java.lang.String.valueOf(j17));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.N1, hashMap, str, null, null, null, false, 120, null);
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndProfileBtnClicked report23059, page_id = " + ((java.lang.String) hashMap.get("page_id")) + ", liveid = " + ((java.lang.String) hashMap.get("liveid")));
        android.content.Context context = simpleLivingCardView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        so2.v2 v2Var = ((im2.i6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.i6.class)).f292393e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("liveid", pm0.v.u(v2Var.f410659n.getLong(0)));
        jSONObject.put("exposeType", 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ml2.x1 x1Var = ml2.x1.f328207n;
        com.tencent.mars.xlog.Log.i("Finder.LivingConvert", "abel end page log, 21053, action=7, extra=".concat(jSONObject2));
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        long refObjectId = finderItem.getRefObjectId();
        r45.nw1 liveInfo2 = finderItem.getLiveInfo();
        long j18 = liveInfo2 != null ? liveInfo2.getLong(0) : -1L;
        java.lang.String userName = finderItem.getUserName();
        long integer = finderItem.getLiveInfo() != null ? r14.getInteger(1) : -1L;
        ml2.q1 q1Var = ml2.q1.f327812e;
        j0Var.pj(refObjectId, j18, null, userName, -1L, integer, x1Var, "temp_30", jSONObject2, 1, finderItem.getFeedObject());
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        a52.a.d("temp_30");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        ml2.i4 i4Var = ml2.i4.f327567o;
        y4Var.getClass();
        y4Var.I = i4Var;
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        ((m30.m) rVar).Bi(b52.b.b());
        android.content.Intent intent = new android.content.Intent();
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        if (nVar != null) {
            nVar.b(intent);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(finderItem.getFeedObject());
        intent.putExtra("KEY_FEED_END_PAGE_EXPOSE_TYPE", 2);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(5, finderItem.getFeedObject());
        wk0Var.set(6, y74Var);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.content.Context context2 = simpleLivingCardView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context2, intent, arrayList2, 0, wk0Var, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$renderView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
