package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f180879a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f180880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.i f180881c;

    public f(com.tencent.mm.plugin.wallet_core.utils.m mVar, java.util.List list, java.util.Map map, com.tencent.mm.plugin.wallet_core.utils.i iVar) {
        this.f180879a = list;
        this.f180880b = map;
        this.f180881c = iVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.Map map;
        java.util.Iterator it = this.f180879a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = this.f180880b;
            at4.k kVar = null;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
            java.lang.String str = bankcard.field_bankcardType;
            if (dt4.b.f243229b == null) {
                dt4.b.d();
            }
            boolean z17 = true;
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) ((java.util.HashMap) dt4.b.f243229b).get(str))) {
                java.lang.String str2 = (java.lang.String) ((java.util.HashMap) dt4.b.f243229b).get(str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    at4.k kVar2 = new at4.k();
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                        long optLong = jSONObject.optLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, 0L);
                        kVar2.f13878a = jSONObject.getString("logo2x_url");
                        kVar2.f13879b = jSONObject.getString("bg2x_url");
                        kVar2.f13880c = jSONObject.getString("wl2x_url");
                        if ((java.lang.System.currentTimeMillis() / 1000) - optLong <= 7200) {
                            z17 = false;
                        }
                        kVar2.f13884g = z17;
                        kVar2.f13881d = dt4.b.a(kVar2.f13878a);
                        kVar2.f13885h = jSONObject.optString("bank_name_pinyin", "");
                        kVar = kVar2;
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBankLogoStorage", e17, "", new java.lang.Object[0]);
                    }
                }
            }
            map.put(bankcard.field_bankcardType, kVar);
        }
        com.tencent.mm.plugin.wallet_core.utils.i iVar = this.f180881c;
        if (iVar != null) {
            com.tencent.mars.xlog.Log.i("WalletBankCardSelectUI", "get logo callback: %s", java.lang.Integer.valueOf(map.size()));
            ((com.tencent.mm.plugin.wallet_core.ui.t0) iVar).f180621a.V6(map);
        }
        return null;
    }
}
