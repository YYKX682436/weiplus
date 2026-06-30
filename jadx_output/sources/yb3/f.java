package yb3;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.plugin.luckymoney.model.c6 {

    /* renamed from: h, reason: collision with root package name */
    public final int f460690h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460691i;

    /* renamed from: m, reason: collision with root package name */
    public int f460692m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460693n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f460694o;

    /* renamed from: p, reason: collision with root package name */
    public int f460695p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f460696q;

    public f() {
        this("");
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public java.lang.String H() {
        return "/cgi-bin/mmpay-bin/h5operationwxhb";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2832;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.o5
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "errCode: %s, errMsg: %s ，json：%s", java.lang.Integer.valueOf(i17), str, jSONObject.toString());
        if (i17 == 0) {
            this.f460692m = jSONObject.optInt("randomAmount");
            this.f460693n = jSONObject.optString("randomWishing");
            this.f460694o = jSONObject.optString("sceneName");
            jSONObject.optString("sceneBackgroup");
            this.f460695p = jSONObject.optInt("sceneSwitch");
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_HK_NEWYEAR_SWITCH_INT_SYNC, java.lang.Integer.valueOf(this.f460695p));
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_HK_NEWYEAR_NAME_STRING_SYNC, this.f460694o);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("yearMess");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "yearMessJson is empty!");
            } else {
                this.f460696q = new java.util.LinkedList();
                for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                    com.tencent.mm.plugin.luckymoney.model.f5 f5Var = new com.tencent.mm.plugin.luckymoney.model.f5();
                    f5Var.f145274a = optJSONObject.optInt("yearAmount", 0);
                    f5Var.f145275b = optJSONObject.optString("yearWish");
                    this.f460696q.add(f5Var);
                }
            }
            com.tencent.mm.plugin.luckymoney.model.c1 c1Var = new com.tencent.mm.plugin.luckymoney.model.c1();
            c1Var.f145184f = jSONObject.optString("groupHint");
            c1Var.f145185g = jSONObject.optString("personalHint");
            c1Var.f145183e = jSONObject.optLong("totalAmount", 200000L) / 100.0d;
            c1Var.f145182d = jSONObject.optInt("totalNum", 100);
            c1Var.f145186h = jSONObject.optLong("perPersonMaxValue", 20000L) / 100.0d;
            c1Var.f145187i = jSONObject.optLong("perGroupMaxValue", 20000L) / 100.0d;
            c1Var.f145188m = jSONObject.optLong("perMinValue", 1L) / 100.0d;
            c1Var.f145197v = jSONObject.optBoolean("enableExclusiveHb");
            c1Var.f145190o = jSONObject.optInt(ya.b.CURRENCY);
            c1Var.f145191p = jSONObject.optString("currencyUint");
            c1Var.f145192q = jSONObject.optString("currencyWording");
            c1Var.f145193r = jSONObject.optString("foreignFaqUrl");
            c1Var.f145194s = jSONObject.optString("foreignHongBaoName");
            com.tencent.mm.plugin.luckymoney.model.h4 Ai = hb3.o.Ni().Ai();
            Ai.f145311a = c1Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKConfigManager", "setConfig maxTotalAmount:" + Ai.f145311a.f145183e + " maxTotalNum:" + Ai.f145311a.f145182d + " perGroupMaxValue:" + Ai.f145311a.f145187i + " perMinValue:" + Ai.f145311a.f145188m + " perPersonMaxValue:" + Ai.f145311a.f145186h);
            try {
                java.lang.String str2 = new java.lang.String(Ai.f145311a.toByteArray(), com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_HK_CONFIG_STRING_SYNC, str2);
                gm0.j1.i();
                gm0.j1.u().c().i(true);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyHKConfigManager", "save config exp, " + e17.getLocalizedMessage());
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyHKConfigManager", "save config exp, " + e18.getLocalizedMessage());
            }
            this.f460691i = c1Var.f145191p;
        }
    }

    public f(java.lang.String str) {
        this.f460690h = 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyGetConfigHK", "request 2");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.CURRENCY, "2");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.storage.z3.R4(str)) {
            hashMap.put("chatroomUserCnt", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) + "");
        }
        setRequestData(hashMap);
    }
}
