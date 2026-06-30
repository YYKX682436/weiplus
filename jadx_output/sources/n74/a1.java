package n74;

/* loaded from: classes4.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n74.b1 f335301f;

    public a1(n74.b1 b1Var, java.lang.String str, java.lang.String str2) {
        this.f335301f = b1Var;
        this.f335299d = str;
        this.f335300e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = this.f335299d;
        n74.b1 b1Var = this.f335301f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
        try {
            n74.b1.b(b1Var, str2);
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "run";
        }
        if (n74.b1.a(b1Var) == null) {
            com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", "adInfo is null, can not update AdInfo, snsId = " + str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
            return;
        }
        ca4.b bVar = new ca4.b();
        java.util.LinkedList linkedList = bVar.f39822d;
        str = "run";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(this.f335300e);
            if (jSONObject.has("WordingComplexString")) {
                bVar.f39825g = jSONObject.optString("WordingComplexString");
            }
            if (jSONObject.has("WordingComplexExchangeValue")) {
                bVar.f39826h = jSONObject.optInt("WordingComplexExchangeValue");
            }
            if (jSONObject.has("WordingLink")) {
                bVar.f39821c = jSONObject.optString("WordingLink");
            } else {
                bVar.f39821c = null;
            }
            if (jSONObject.has("WordingType")) {
                int optInt = jSONObject.optInt("WordingType");
                bVar.f39819a = optInt;
                if (optInt == com.tencent.mm.plugin.sns.storage.ADInfo.ADChainStrengthenUserInfoFormatWording) {
                    if (jSONObject.has("UserNameList")) {
                        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("UserNameList");
                        linkedList.clear();
                        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                            linkedList.add(optJSONArray.optString(i17));
                        }
                    } else {
                        linkedList.clear();
                    }
                    if (jSONObject.has("WordingRepAndroid")) {
                        java.lang.String optString = jSONObject.optString("WordingRepAndroid");
                        boolean z17 = optString.indexOf("%s") >= 0;
                        int indexOf = optString.indexOf("%");
                        int lastIndexOf = optString.lastIndexOf("%");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && z17 && indexOf == lastIndexOf) {
                            bVar.f39820b = optString;
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f39820b)) {
                            java.lang.String str3 = "";
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                java.lang.String str4 = (java.lang.String) it.next();
                                com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.storage.k4) com.tencent.mm.plugin.sns.model.l4.pj()).f0(str4);
                                if (f07 != null) {
                                    java.lang.String g27 = f07.g2();
                                    str3 = com.tencent.mm.sdk.platformtools.t8.K0(g27) ? str3 + str4 : str3 + g27;
                                } else {
                                    str3 = str3 + str4;
                                }
                                if (linkedList.getLast() != str4) {
                                    str3 = str3 + ",";
                                }
                            }
                            bVar.f39823e = str3;
                            bVar.f39824f = java.lang.String.format(bVar.f39820b, str3);
                        }
                    } else {
                        n74.b1.c(b1Var, bVar);
                    }
                } else if (optInt == com.tencent.mm.plugin.sns.storage.ADInfo.ADChainStrengthenDefaultWording && jSONObject.has("Wording")) {
                    bVar.f39820b = jSONObject.optString("Wording");
                } else {
                    n74.b1.c(b1Var, bVar);
                }
            } else {
                n74.b1.c(b1Var, bVar);
            }
            n74.b1.d(b1Var, bVar);
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mars.xlog.Log.e("DynamicDataReqHelper", th.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback$2");
    }
}
