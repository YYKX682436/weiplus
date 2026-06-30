package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/q1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class q1 extends com.tencent.mm.plugin.lite.api.p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [jz5.f0] */
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("productId");
            java.lang.String optString2 = jSONObject.optString("priceNumber");
            java.lang.String optString3 = jSONObject.optString("priceType");
            kotlin.jvm.internal.o.d(optString);
            if (!(optString.length() == 0)) {
                kotlin.jvm.internal.o.d(optString2);
                if (!(optString2.length() == 0)) {
                    kotlin.jvm.internal.o.d(optString3);
                    if (!(optString3.length() == 0)) {
                        int optInt = jSONObject.optInt("rewardScene", 1);
                        int optInt2 = jSONObject.optInt("entranceScene", 0);
                        if (((com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class)) != null) {
                            android.content.Context c17 = c();
                            kotlin.jvm.internal.o.f(c17, "getContext(...)");
                            com.tencent.mm.plugin.lite.jsapi.comms.p1 p1Var = new com.tencent.mm.plugin.lite.jsapi.comms.p1(optString, this);
                            d22.a aVar = new d22.a(optString, optString2, optString3, optInt, optInt2);
                            aVar.f225822f = c17;
                            aVar.f225823g = p1Var;
                            d22.a0 a0Var = new d22.a0(aVar);
                            r45.uj0 uj0Var = new r45.uj0();
                            d22.a aVar2 = a0Var.f225824d;
                            uj0Var.f387412f = aVar2.f225819c;
                            uj0Var.f387411e = aVar2.f225818b;
                            java.lang.String str2 = aVar2.f225817a;
                            uj0Var.f387413g = str2;
                            uj0Var.f387410d = "元";
                            gm0.j1.n().f273288b.a(830, a0Var);
                            android.content.Context context = aVar2.f225822f;
                            a0Var.f225826f = db5.e1.Q(context, context != null ? context.getString(com.tencent.mm.R.string.f490573yv) : null, context != null ? context.getString(com.tencent.mm.R.string.f490604zq) : null, true, true, new d22.z(a0Var));
                            a0Var.f225827g = new z12.f(str2, uj0Var, aVar2.f225820d, aVar2.f225821e);
                            gm0.j1.n().f273288b.g(a0Var.f225827g);
                            r0 = jz5.f0.f302826a;
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonReward", "missing arguments. no param provided");
            this.f143443f.a("missing arguments.");
            return;
        }
        if (r0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonReward", "missing arguments. no json object provided");
            this.f143443f.a("missing arguments.");
        }
    }
}
