package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.z0 f157947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.n2 f157949f;

    public t2(com.tencent.mm.plugin.remittance.model.z0 z0Var, com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.ui.n2 n2Var) {
        this.f157947d = z0Var;
        this.f157948e = h3Var;
        this.f157949f = n2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemSubChannelLinearLayout clicked, type: ");
        com.tencent.mm.plugin.remittance.model.z0 z0Var = this.f157947d;
        sb6.append(z0Var.f157069a);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f157088t)) {
            j17 = com.tencent.mm.plugin.remittance.ui.h3.f157733t.a().getLong("TRANS_SELECTED_SHOP_" + z0Var.f157069a, 0L);
        } else {
            j17 = com.tencent.mm.plugin.remittance.ui.h3.f157733t.a().getLong("TRANS_SELECTED_SHOP_" + z0Var.f157069a + '_' + z0Var.f157088t, 0L);
        }
        com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157948e;
        int E = h3Var.E(z0Var, j17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("confirmBtnText", h3Var.f157735d.getString(com.tencent.mm.R.string.f490568yq));
        jSONObject.put("cancelBtnText", h3Var.f157735d.getString(com.tencent.mm.R.string.f490347sg));
        jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, z0Var.f157087s.f156807c);
        java.util.ArrayList sub_recv_channel_list = z0Var.f157087s.f156808d;
        kotlin.jvm.internal.o.f(sub_recv_channel_list, "sub_recv_channel_list");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(sub_recv_channel_list, 10));
        java.util.Iterator it = sub_recv_channel_list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.remittance.model.c1) it.next()).f156801b);
        }
        jSONObject.put("list", new org.json.JSONArray((java.util.Collection) arrayList2));
        jSONObject.put("preSelectIndex", new org.json.JSONArray((java.util.Collection) kz5.b0.c(java.lang.Integer.valueOf(E))));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new com.tencent.mm.plugin.remittance.ui.r2(h3Var, this.f157949f, z0Var);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite5902f97ca32a59d74355fc2e32843e79@pay");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "pages/home/home");
        bundle.putString("query", jSONObject2);
        bundle.putBoolean("isHalfScreen", true);
        bundle.putBoolean("forbidRightGesture", true);
        bundle.putDouble("heightPercent", 0.99d);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(h3Var.f157735d, bundle, true, false, sVar, new com.tencent.mm.plugin.remittance.ui.s2());
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
