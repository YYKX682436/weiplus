package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class o8 implements com.tencent.mm.ui.conversation.p5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.o8 f207946a = new com.tencent.mm.ui.conversation.o8();

    @Override // com.tencent.mm.ui.conversation.p5
    public boolean a(com.tencent.mm.ui.conversation.e8 context, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(context, "context");
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "handle, can not, customExtraInfo is null");
            return false;
        }
        yb5.d dVar = context.f207650a;
        r45.g15 g15Var = context.f207651b;
        byte[] bArr = context.f207652c;
        boolean optBoolean = jSONObject.optBoolean("isOrderMsg");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("orderParam");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("orderID") : null;
        boolean optBoolean2 = jSONObject.optBoolean("isProductMsg");
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("productParam");
        java.lang.String optString2 = optJSONObject2 != null ? optJSONObject2.optString("productID") : null;
        java.lang.String optString3 = optJSONObject2 != null ? optJSONObject2.optString("finderUsername") : null;
        java.lang.String optString4 = optJSONObject2 != null ? optJSONObject2.optString("ecSource") : null;
        if (optString != null && optBoolean) {
            ot0.q qVar = new ot0.q();
            qVar.f348654f = g15Var.f374805e;
            qVar.f348666i = 96;
            qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
            qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
            ((com.tencent.mm.feature.finder.live.t6) ((s40.b1) i95.n0.c(s40.b1.class))).Vi(context.f207650a.g(), optString, new com.tencent.mm.ui.conversation.m8(qVar, dVar));
            return true;
        }
        if (optBoolean2) {
            if (!(optString2 == null || optString2.length() == 0)) {
                r45.br2 br2Var = new r45.br2();
                br2Var.set(7, optString2);
                br2Var.set(17, optString4);
                br2Var.set(1, optString3);
                s40.b1 b1Var = (s40.b1) i95.n0.c(s40.b1.class);
                android.app.Activity g17 = context.f207650a.g();
                kotlin.jvm.internal.o.f(g17, "getContext(...)");
                com.tencent.mm.ui.conversation.n8 n8Var = new com.tencent.mm.ui.conversation.n8(br2Var, dVar, context);
                ((com.tencent.mm.feature.finder.live.t6) b1Var).getClass();
                zl2.b0.i(zl2.b0.f473663a, g17, br2Var, n8Var, false, 0, 24, null);
                return true;
            }
        }
        ot0.q qVar2 = new ot0.q();
        qVar2.f348654f = g15Var.f374805e;
        qVar2.f348666i = 33;
        java.lang.String str = g15Var.f374811n;
        if (str == null) {
            str = "";
        }
        qVar2.f348673j2 = str;
        qVar2.f348669i2 = g15Var.f374806f;
        java.lang.String str2 = g15Var.f374810m;
        if (str2 == null) {
            str2 = "";
        }
        qVar2.f348677k2 = str2;
        qVar2.f348737z2 = g15Var.f374814q;
        qVar2.A2 = g15Var.f374815r;
        java.lang.String str3 = g15Var.f374816s;
        if (str3 == null) {
            str3 = "";
        }
        qVar2.f348685m2 = str3;
        qVar2.f348681l2 = 2;
        java.lang.String str4 = g15Var.f374819v;
        if (str4 == null) {
            str4 = "";
        }
        qVar2.f348674k = str4;
        java.lang.String str5 = g15Var.f374813p;
        if (str5 == null) {
            str5 = "";
        }
        qVar2.B2 = str5;
        qVar2.L1 = "wxapp_" + g15Var.f374810m + g15Var.f374818u;
        java.lang.String str6 = g15Var.f374811n;
        if (str6 == null) {
            str6 = "";
        }
        qVar2.f348722w = str6;
        java.lang.String str7 = g15Var.f374812o;
        if (str7 == null) {
            str7 = "";
        }
        qVar2.f348726x = str7;
        com.tencent.mm.ui.conversation.l8 l8Var = new com.tencent.mm.ui.conversation.l8();
        java.lang.String str8 = g15Var.f374810m;
        l8Var.f207849e = str8 != null ? str8 : "";
        l8Var.f207848d = qVar2;
        l8Var.f207853i = g15Var.f374805e;
        l8Var.f207851g = g15Var.f374807g;
        l8Var.f207850f = g15Var.f374809i;
        l8Var.f207852h = dVar.x();
        l8Var.f207854m = g15Var.f374808h;
        l8Var.f207855n = bArr;
        ((ku5.t0) ku5.t0.f312615d).g(l8Var);
        return true;
    }
}
