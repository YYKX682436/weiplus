package gg2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg2.m f271687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f271688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f271689f;

    public j(gg2.m mVar, r45.y23 y23Var, int i17) {
        this.f271687d = mVar;
        this.f271688e = y23Var;
        this.f271689f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/exp/LiveExpOneItem$renderExp1Layout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        gg2.m mVar = this.f271687d;
        in5.s0 s0Var = mVar.f271664a.f417149i;
        if (s0Var == null || (view2 = s0Var.itemView) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpOneItem$renderExp1Layout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        intent.putExtra("KEY_PARAMS_DO_ACTION", 9);
        intent.putExtra("KEY_PARAMS_AUTO_OPEN_PRODUCT_INFO", this.f271688e.toByteArray());
        uc2.i iVar = (uc2.i) mVar.f271664a.b(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        uc2.g gVar = (uc2.g) mVar.f271664a.b(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        ml2.t1 t1Var = ml2.t1.D2;
        jz5.l[] lVarArr = new jz5.l[3];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = mVar.f271664a.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        java.lang.String str2 = mVar.f271696d;
        lVarArr[1] = new jz5.l("productid", str2 != null ? str2 : "");
        lVarArr[2] = new jz5.l("com_label_type", java.lang.String.valueOf(this.f271689f));
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = mVar.f271664a.f417148h;
        if (baseFinderFeed2 != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedActionType", 88);
            jSONObject.put("feedActionSubType", 1);
            jSONObject.put("value", 1);
            jSONObject.put("strValue", mVar.f271696d);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            v3Var.a(c76, baseFinderFeed2, jSONObject2);
        }
        mVar.k();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpOneItem$renderExp1Layout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
