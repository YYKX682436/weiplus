package lv4;

/* loaded from: classes12.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lv4.b f321511d;

    public a(lv4.b bVar) {
        this.f321511d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachBoxTitleItem$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lv4.b bVar = this.f321511d;
        jv4.i iVar = bVar.f321514c.f400557c;
        if (iVar != null) {
            ((jv4.e) ((jv4.p) iVar).f302262e).f302235a.l();
        }
        qv4.r0 r0Var = (qv4.r0) bVar.f321513b;
        r0Var.f367020n = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        rv4.b0 b0Var = r0Var.f367012f;
        if (b0Var != null) {
            java.util.List list = b0Var.f400442e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                rv4.c0 c0Var = (rv4.c0) ((mv4.j) it.next());
                java.util.Map l17 = kz5.c1.l(new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, c0Var.f400449c), new jz5.l("visible", java.lang.Boolean.valueOf(c0Var.b())), new jz5.l("settingType", 2));
                java.lang.Long l18 = c0Var.f400450d;
                if (l18 != null) {
                    l17.put("isSwitchOn", java.lang.Long.valueOf(l18.longValue()));
                }
                java.lang.Boolean bool = c0Var.f400454h;
                if (bool != null) {
                    l17.put("isSwitchClosed", java.lang.Boolean.valueOf(bool.booleanValue()));
                }
                java.lang.Integer num = c0Var.f400451e;
                if (num != null) {
                    l17.put("businessType", java.lang.Integer.valueOf(num.intValue()));
                }
                org.json.JSONObject a17 = ri.l0.a(l17);
                arrayList3.add(a17 != null ? java.lang.Boolean.valueOf(arrayList2.add(a17)) : null);
            }
        }
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new qv4.n0(r0Var);
        org.json.JSONObject a18 = ri.l0.a(kz5.c1.k(new jz5.l("sourceFrom", 1), new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, r0Var.f367007a.f331674a), new jz5.l("verticalSettingItems", arrayList2)));
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.tencent.mm.ui.MMActivity mMActivity = r0Var.f367008b;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite292c2ce0ae0ce2b6ff62226ac60ed4b4");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "pages/seach-vertical-setting/entry");
        bundle.putBoolean("forbidRightGesture", true);
        bundle.putString("minVersion", "2.0.9");
        bundle.putDouble("heightPercent", 0.67d);
        bundle.putBoolean("isHalfScreen", true);
        bundle.putString("query", java.lang.String.valueOf(a18));
        ((com.tencent.mm.feature.lite.i) g0Var).jk(mMActivity, bundle, true, false, sVar, new qv4.o0());
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachBoxTitleItem$bindData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
