package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class r2 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.n2 f157913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.z0 f157914c;

    public r2(com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.ui.n2 n2Var, com.tencent.mm.plugin.remittance.model.z0 z0Var) {
        this.f157912a = h3Var;
        this.f157913b = n2Var;
        this.f157914c = z0Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.remittance.model.c1 c1Var;
        java.util.ArrayList arrayList2;
        com.tencent.mm.plugin.remittance.model.c1 c1Var2;
        java.util.ArrayList arrayList3;
        com.tencent.mm.plugin.remittance.model.c1 c1Var3;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "LiteAppStoreCallback called, instanceId: " + j17 + ", actionName: " + str + ", data: " + obj + ", callbackId: " + i17);
        if (kotlin.jvm.internal.o.b(str, "setSelectIndex") && (obj instanceof org.json.JSONObject)) {
            org.json.JSONArray optJSONArray = ((org.json.JSONObject) obj).optJSONArray("selectIndexes");
            int optInt = optJSONArray != null ? optJSONArray.optInt(0, 0) : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.remittance.model.z0 z0Var = this.f157914c;
            sb6.append(z0Var.f157087s.f156805a);
            sb6.append(((com.tencent.mm.plugin.remittance.model.c1) z0Var.f157087s.f156808d.get(optInt)).f156801b);
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.remittance.ui.l2 l2Var = com.tencent.mm.plugin.remittance.ui.h3.f157733t;
            com.tencent.mm.plugin.remittance.ui.n2 n2Var = this.f157913b;
            com.tencent.mm.plugin.remittance.ui.h3 h3Var = this.f157912a;
            h3Var.O(n2Var, sb7);
            int i18 = z0Var.f157069a;
            long j18 = 0;
            if (com.tencent.mm.sdk.platformtools.t8.K0(z0Var.f157088t)) {
                com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.remittance.ui.h3.f157733t.a();
                java.lang.String str2 = "TRANS_SELECTED_SHOP_" + i18;
                com.tencent.mm.plugin.remittance.model.d1 d1Var = z0Var.f157087s;
                a17.putLong(str2, (d1Var == null || (arrayList3 = d1Var.f156808d) == null || (c1Var3 = (com.tencent.mm.plugin.remittance.model.c1) arrayList3.get(optInt)) == null) ? 0L : c1Var3.f156800a);
            } else {
                com.tencent.mm.sdk.platformtools.o4 a18 = com.tencent.mm.plugin.remittance.ui.h3.f157733t.a();
                java.lang.String str3 = "TRANS_SELECTED_SHOP_" + i18 + '_' + z0Var.f157088t;
                com.tencent.mm.plugin.remittance.model.d1 d1Var2 = z0Var.f157087s;
                a18.putLong(str3, (d1Var2 == null || (arrayList = d1Var2.f156808d) == null || (c1Var = (com.tencent.mm.plugin.remittance.model.c1) arrayList.get(optInt)) == null) ? 0L : c1Var.f156800a);
            }
            com.tencent.mm.plugin.remittance.ui.m2 m2Var = h3Var.f157739h;
            if (m2Var != null) {
                java.lang.String str4 = z0Var.f157088t;
                com.tencent.mm.plugin.remittance.model.d1 d1Var3 = z0Var.f157087s;
                if (d1Var3 != null && (arrayList2 = d1Var3.f156808d) != null && (c1Var2 = (com.tencent.mm.plugin.remittance.model.c1) arrayList2.get(optInt)) != null) {
                    j18 = c1Var2.f156800a;
                }
                int i19 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
                com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = ((com.tencent.mm.plugin.remittance.ui.t5) m2Var).f157954a;
                ((java.util.HashMap) remittanceDetailUI.Z1).put(remittanceDetailUI.h7(i18, str4), java.lang.Long.valueOf(j18));
            }
            com.tencent.mm.plugin.remittance.ui.j2 j2Var = h3Var.f157737f;
            if (j2Var != null) {
                ((com.tencent.mm.plugin.remittance.ui.r5) j2Var).a(h3Var.f157740i, z0Var);
            }
            h3Var.z(z0Var, true);
            h3Var.L(z0Var);
        }
        return false;
    }
}
