package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f134683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.j f134684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.l f134685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134686g;

    public i(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.viewmodel.component.j jVar, com.tencent.mm.plugin.finder.viewmodel.component.l lVar, int i17) {
        this.f134683d = finderObject;
        this.f134684e = jVar;
        this.f134685f = lVar;
        this.f134686g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$RvAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String username = this.f134683d.getUsername();
        if (username != null) {
            android.view.View itemView = this.f134685f.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            com.tencent.mm.plugin.finder.viewmodel.component.j jVar = this.f134684e;
            java.util.List list = jVar.f134782e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 0));
            }
            android.content.Context context = itemView.getContext();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Pj((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()));
            }
            android.content.Intent intent2 = new android.content.Intent();
            int i17 = this.f134686g;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) arrayList2.get(i17);
            long id6 = finderItem.getFeedObject().getId();
            java.lang.String dupFlag = finderItem.getDupFlag();
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            kotlin.jvm.internal.o.d(context);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent2, id6, null, 0, 0, false, 0, dupFlag, 248, null);
            hc2.e0.b(intent2, i17, arrayList3, null, null);
            intent2.putExtra("finder_username", username);
            intent2.putExtra("KEY_FINDER_SELF_FLAG", false);
            intent2.putExtra("KEY_FINDER_FEEDID", id6);
            intent2.putExtra("KEY_FINDER_FEED_DUP_FLAG", dupFlag);
            intent2.putExtra("KEY_SPECIFY_COMMENTSCENE", 319);
            wa2.x.e(intent2, itemView, 0L, false, false, null, 30, null);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).lk(context, intent2);
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity == null || (intent = mMActivity.getIntent()) == null || (str = intent.getStringExtra("profile_username")) == null) {
                str = "";
            }
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
            r45.qt2 V6 = e17 != null ? e17.V6() : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("recommend_source_finder_username", str);
            com.tencent.mm.protocal.protobuf.FinderContact contact = ((com.tencent.mm.plugin.finder.storage.FinderItem) arrayList2.get(i17)).getFinderObject().getContact();
            jSONObject.put("finder_nickname", contact != null ? contact.getNickname() : null);
            jSONObject.put("click_item", 2);
            jSONObject.put("finderusername", username);
            jSONObject.put("finder_index", jVar.f134785h + 1);
            jSONObject.put("click_item", 2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("feedid", pm0.v.u(id6));
            jSONObject2.put(ya.b.INDEX, i17);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            jSONObject.put("feed_info", r26.i0.t(jSONObject3, ",", ";", false));
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "channel_profile_otherfrdfollow_authorcard", 1, jSONObject, false, null, 48, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$RvAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
