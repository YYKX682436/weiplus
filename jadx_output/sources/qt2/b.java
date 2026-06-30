package qt2;

/* loaded from: classes2.dex */
public final class b implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qt2.e f366547a;

    public b(qt2.e eVar) {
        this.f366547a = eVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        qt2.u uVar;
        int i17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        so2.j5 j5Var;
        qt2.e eVar = this.f366547a;
        android.app.Activity context = eVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        androidx.fragment.app.Fragment fragment = eVar.getFragment();
        if (fragment == null || (uVar = (qt2.u) pf5.z.f353948a.b(fragment).e(qt2.u.class)) == null) {
            androidx.appcompat.app.AppCompatActivity activity = eVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            uVar = (qt2.u) pf5.z.f353948a.a(activity).e(qt2.u.class);
        }
        androidx.recyclerview.widget.k3 q07 = uVar != null ? uVar.P6().q0(uVar.f366614g, false) : null;
        in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        in5.c cVar = s0Var != null ? (in5.c) s0Var.f293125i : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
        long j17 = 0;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        if (uVar != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = uVar.f366612e;
            if (baseFeedLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            java.util.ArrayList dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter();
            if (dataListJustForAdapter != null) {
                java.util.Iterator it = dataListJustForAdapter.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    if (((so2.j5) it.next()).getItemId() == itemId) {
                        break;
                    }
                    i17++;
                }
            }
        }
        i17 = -1;
        if (i17 >= 0 && uVar != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = uVar.f366612e;
            if (baseFeedLoader2 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            java.util.List dataListJustForAdapter2 = baseFeedLoader2.getDataListJustForAdapter();
            if (dataListJustForAdapter2 != null && (j5Var = (so2.j5) kz5.n0.a0(dataListJustForAdapter2, i17 + 1)) != null) {
                j17 = j5Var.getItemId();
            }
        }
        long j18 = j17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        r45.jt2 jt2Var = eVar.f366561s;
        if (jt2Var == null || (str2 = jt2Var.getString(1)) == null) {
            str2 = "";
        }
        jSONObject.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str2);
        r45.jt2 jt2Var2 = eVar.f366561s;
        jSONObject.put("play_progress", jt2Var2 != null ? jt2Var2.getInteger(0) : 0);
        jSONObject.put("next_objectid", pm0.v.u(j18));
        r45.jt2 jt2Var3 = eVar.f366561s;
        if (jt2Var3 == null || (list2 = jt2Var3.getList(2)) == null) {
            str3 = "";
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList.add(((r45.g53) it6.next()).getString(0));
            }
            str3 = kz5.n0.g0(arrayList, "|", null, null, 0, null, null, 62, null);
        }
        jSONObject.put("username_list", str3);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.finder.report.l0.f(com.tencent.mm.plugin.finder.report.l0.f125109a, V6, baseFinderFeed, 86, r26.i0.t(jSONObject2, ",", ";", false), null, null, 48, null);
        jz5.l[] lVarArr = new jz5.l[9];
        if (V6 == null || (str4 = V6.getString(0)) == null) {
            str4 = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", str4);
        if (V6 == null || (str5 = V6.getString(1)) == null) {
            str5 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str5);
        if (V6 == null || (str6 = V6.getString(2)) == null) {
            str6 = "";
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", str6);
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.getInteger(5) : 0));
        lVarArr[4] = new jz5.l("feed_id", pm0.v.u(itemId));
        lVarArr[5] = new jz5.l("next_feedid", pm0.v.u(j18));
        r45.jt2 jt2Var4 = eVar.f366561s;
        if (jt2Var4 == null || (str7 = jt2Var4.getString(1)) == null) {
            str7 = "";
        }
        lVarArr[6] = new jz5.l("recommendation_text", str7);
        r45.jt2 jt2Var5 = eVar.f366561s;
        lVarArr[7] = new jz5.l("avatar_cnt", java.lang.Integer.valueOf((jt2Var5 == null || (list = jt2Var5.getList(2)) == null) ? 0 : list.size()));
        r45.jt2 jt2Var6 = eVar.f366561s;
        lVarArr[8] = new jz5.l("expose_playpercent", java.lang.Integer.valueOf(jt2Var6 != null ? jt2Var6.getInteger(0) : 0));
        return kz5.c1.k(lVarArr);
    }
}
