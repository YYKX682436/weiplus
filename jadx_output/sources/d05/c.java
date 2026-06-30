package d05;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public double f225586d = 0.0d;

    public c(java.util.List list, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("session_key", str);
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            d05.l lVar = (d05.l) it.next();
            hashMap.put("qt_id_" + i17, lVar.f225610b);
            hashMap.put("ans_cont_" + i17, lVar.f225611c);
            hashMap.put("level_" + i17, lVar.f225615g + "");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parent_id_");
            sb6.append(i17);
            hashMap.put(sb6.toString(), lVar.f225612d);
            i17++;
            if (lVar.f225616h != null && "Y".equals(lVar.f225611c)) {
                hashMap.put("qt_id_" + i17, lVar.f225616h.f225610b);
                hashMap.put("ans_cont_" + i17, lVar.f225616h.f225611c);
                hashMap.put("level_" + i17, lVar.f225616h.f225615g + "");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("parent_id_");
                sb7.append(i17);
                hashMap.put(sb7.toString(), lVar.f225616h.f225612d);
                i17++;
            }
        }
        hashMap.put("total_num", i17 + "");
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 60;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            this.f225586d = jSONObject.getInt("credit_amount") / 100.0d;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", e17, "", new java.lang.Object[0]);
        }
    }
}
