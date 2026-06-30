package vr4;

/* loaded from: classes8.dex */
public class c1 extends com.tencent.mm.sdk.event.n {
    public c1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.util.LinkedList linkedList = ((com.tencent.mm.autogen.events.SaveBankLogoEvent) iEvent).f54723g.f7361a;
        java.lang.String str = dt4.b.f243228a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        try {
            if (dt4.b.f243229b == null) {
                dt4.b.f243229b = new java.util.HashMap();
            }
            android.content.SharedPreferences.Editor edit = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("bank_logo", 0).edit();
            int size = linkedList.size();
            for (int i17 = 0; i17 < size; i17++) {
                org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) linkedList.get(i17));
                java.lang.String optString = c01.z1.I() ? jSONObject.optString("bank_desc") : jSONObject.optString("bank_type");
                jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, currentTimeMillis);
                java.lang.String jSONObject2 = jSONObject.toString();
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(jSONObject2)) {
                    break;
                }
                edit.putString(optString, jSONObject2);
                ((java.util.HashMap) dt4.b.f243229b).put(optString, jSONObject2);
            }
            edit.commit();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBankLogoStorage", e17, "", new java.lang.Object[0]);
        }
        new com.tencent.mm.autogen.events.BankcardLogoReadyEvent().e();
        return false;
    }
}
