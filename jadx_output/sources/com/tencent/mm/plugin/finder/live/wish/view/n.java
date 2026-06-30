package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class n implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.s f120640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f120641c;

    public n(com.tencent.mm.plugin.finder.live.wish.view.x xVar, com.tencent.mm.plugin.lite.s sVar, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f120639a = xVar;
        this.f120640b = sVar;
        this.f120641c = finderJumpInfo;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        int i18;
        int i19;
        com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[audience_board] actionName = " + str);
        try {
            com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[audience_board] actionName = " + str + ", data = " + obj);
            com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120639a;
            com.tencent.mm.plugin.lite.s sVar = this.f120640b;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f120641c;
            if (str != null && obj != null) {
                int hashCode = str.hashCode();
                if (hashCode != -934521548) {
                    if (hashCode != -476586329) {
                        if (hashCode == 152756384 && str.equals("openProfileSheet")) {
                            if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) != null) {
                                java.lang.String optString = ((org.json.JSONObject) obj).optString("userName");
                                java.lang.String optString2 = ((org.json.JSONObject) obj).optString("nickName");
                                java.lang.String optString3 = ((org.json.JSONObject) obj).optString("headUrl");
                                kotlin.jvm.internal.o.d(optString);
                                if (optString.length() > 0) {
                                    kotlin.jvm.internal.o.d(optString2);
                                    kotlin.jvm.internal.o.d(optString3);
                                    if (com.tencent.mm.plugin.finder.live.wish.view.x.b(xVar, optString, optString2, optString3)) {
                                        com.tencent.mm.plugin.finder.live.wish.view.o oVar = xVar.f120678o;
                                        if (oVar != null) {
                                            oVar.b();
                                        }
                                        i19 = 0;
                                        cl0.g gVar = new cl0.g();
                                        gVar.o("errCode", i19);
                                        gVar.r("exit", true);
                                        java.lang.String gVar2 = gVar.toString();
                                        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                                        sVar.c(j17, i17, gVar2);
                                    }
                                }
                                i19 = -1;
                                cl0.g gVar3 = new cl0.g();
                                gVar3.o("errCode", i19);
                                gVar3.r("exit", true);
                                java.lang.String gVar22 = gVar3.toString();
                                kotlin.jvm.internal.o.f(gVar22, "toString(...)");
                                sVar.c(j17, i17, gVar22);
                            }
                        }
                    } else if (str.equals("sendRewardGift")) {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) != null) {
                            java.lang.String optString4 = ((org.json.JSONObject) obj).optString("productId");
                            int optInt = ((org.json.JSONObject) obj).optInt("productCount");
                            int optInt2 = ((org.json.JSONObject) obj).optInt("actionType");
                            com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[sendRewardGift] actionType:" + optInt2);
                            kotlin.jvm.internal.o.d(optString4);
                            if (com.tencent.mm.plugin.finder.live.wish.view.x.c(xVar, optString4, optInt, optInt2)) {
                                com.tencent.mm.plugin.finder.live.wish.view.o oVar2 = xVar.f120678o;
                                if (oVar2 != null) {
                                    oVar2.b();
                                }
                                com.tencent.mm.plugin.finder.live.wish.view.x.f120663r = finderJumpInfo;
                                i18 = 0;
                            } else {
                                i18 = -1;
                            }
                            cl0.g gVar4 = new cl0.g();
                            gVar4.o("errCode", i18);
                            java.lang.String gVar5 = gVar4.toString();
                            kotlin.jvm.internal.o.f(gVar5, "toString(...)");
                            sVar.c(j17, i17, gVar5);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("type", optInt2);
                            java.lang.String jSONObject2 = jSONObject.toString();
                            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                            xVar.l(jSONObject2);
                        }
                    }
                } else if (str.equals("report")) {
                    org.json.JSONObject jSONObject3 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
                    if (jSONObject3 != null) {
                        java.lang.String jSONObject4 = jSONObject3.toString();
                        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                        com.tencent.mm.plugin.finder.live.wish.view.x.d(xVar, jSONObject4);
                    }
                }
                com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[audience_board] invalid action");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("GiftWallViewHelper", "[audience_board] e = " + e17.getMessage());
        }
        return false;
    }
}
