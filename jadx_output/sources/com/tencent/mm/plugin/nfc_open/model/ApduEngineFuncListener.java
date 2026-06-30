package com.tencent.mm.plugin.nfc_open.model;

/* loaded from: classes8.dex */
public class ApduEngineFuncListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ApduEngineFuncEvent> {
    public ApduEngineFuncListener() {
        super(com.tencent.mm.app.a0.f53288d);
        this.__eventId = 1620532420;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ApduEngineFuncEvent apduEngineFuncEvent) {
        am.o oVar;
        java.lang.String jSONObject;
        org.json.JSONObject jSONObject2;
        boolean b17;
        java.lang.String[] strArr;
        com.tencent.mm.autogen.events.ApduEngineFuncEvent apduEngineFuncEvent2 = apduEngineFuncEvent;
        int i17 = 0;
        if (!(apduEngineFuncEvent2 instanceof com.tencent.mm.autogen.events.ApduEngineFuncEvent) || (oVar = apduEngineFuncEvent2.f53975g) == null) {
            return false;
        }
        int i18 = oVar.f7493a;
        android.content.Context context = oVar.f7494b;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (i18 != 4008) {
            am.o oVar2 = apduEngineFuncEvent2.f53975g;
            switch (i18) {
                case 4001:
                    bundle.putInt("status", yn3.a.c().d(context));
                    break;
                case 4002:
                    int a17 = yn3.a.c().a(context);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ApduEngineFuncListener", "NFC connect status: %d", java.lang.Integer.valueOf(a17));
                    bundle.putInt("status", a17);
                    break;
                case com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE /* 4003 */:
                    java.lang.String str = oVar2.f7495c;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        try {
                            wn3.a aVar = new wn3.a(str);
                            yn3.a c17 = yn3.a.c();
                            c17.getClass();
                            xn3.a aVar2 = new xn3.a(1, "def", aVar);
                            c17.b(aVar2);
                            bundle.putString("result", aVar2.f455595g.toString());
                            break;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngineFuncListener", "alex: execute nfc command exception");
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ApduEngineFuncListener", e17, "", new java.lang.Object[0]);
                            bundle.putString("result", null);
                            break;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
                        break;
                    }
                case com.google.android.gms.wearable.WearableStatusCodes.INVALID_TARGET_NODE /* 4004 */:
                    try {
                        java.lang.String str2 = oVar2.f7495c;
                        boolean z17 = oVar2.f7496d;
                        boolean z18 = oVar2.f7497e;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
                            break;
                        } else {
                            java.lang.String[] split = str2.split("\\|");
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            int length = split.length;
                            int i19 = 0;
                            while (i19 < length) {
                                java.lang.String str3 = split[i19];
                                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ApduEngineFuncListener", "[NFC] batch transceive apduStr is null");
                                    strArr = split;
                                } else {
                                    java.lang.String[] split2 = str3.split(":");
                                    if (split2 != null && split2.length >= 2) {
                                        int P = com.tencent.mm.sdk.platformtools.t8.P(split2[i17], i17);
                                        strArr = split;
                                        arrayList.add(new xn3.a(P, java.lang.String.valueOf(P), new wn3.a(split2[1])));
                                    }
                                    strArr = split;
                                    com.tencent.mars.xlog.Log.w("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu's size is wrong");
                                }
                                i19++;
                                split = strArr;
                                i17 = 0;
                            }
                            yn3.a c18 = yn3.a.c();
                            c18.getClass();
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext() && (((b17 = c18.b((xn3.a) it.next())) || !z17) && (!b17 || !z18))) {
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                xn3.a aVar3 = (xn3.a) it6.next();
                                if (aVar3.f455595g == null) {
                                    bundle.putString("result", sb6.toString());
                                    break;
                                } else {
                                    sb6.append(aVar3.f455592d);
                                    sb6.append(":");
                                    sb6.append(aVar3.f455595g.toString());
                                    sb6.append("|");
                                }
                            }
                            bundle.putString("result", sb6.toString());
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ApduEngineFuncListener", "alex: execute nfc command exception");
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ApduEngineFuncListener", e18, "", new java.lang.Object[0]);
                        bundle.putString("result", null);
                        break;
                    }
                    break;
                case com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE /* 4005 */:
                    bundle.putString(dm.i4.COL_ID, zn3.a.a(yn3.a.c().f455597b));
                    break;
            }
        } else {
            yn3.a c19 = yn3.a.c();
            if (c19.f455596a == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: tag null");
                jSONObject = null;
            } else {
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.System.currentTimeMillis();
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                ((java.util.HashSet) c19.f464014c).size();
                java.util.Iterator it7 = ((java.util.HashSet) c19.f464014c).iterator();
                while (it7.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it7.next();
                    try {
                        if (str4.equals(android.nfc.tech.NfcA.class.getName())) {
                            jSONObject3.put(android.nfc.tech.NfcA.class.getSimpleName(), yn3.c.d(c19.f455596a));
                        } else if (str4.equals(android.nfc.tech.IsoDep.class.getName())) {
                            android.nfc.tech.IsoDep isoDep = android.nfc.tech.IsoDep.get(c19.f455596a);
                            if (isoDep == null) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.ApduEngineIsoDep", "lo-nfc-getInfoJsonObject: get IsoDep null");
                                jSONObject2 = null;
                            } else {
                                jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("hiLayerResponse", zn3.a.a(isoDep.getHiLayerResponse()));
                                jSONObject2.put("historicalBytes", zn3.a.a(isoDep.getHistoricalBytes()));
                            }
                            jSONObject3.put(android.nfc.tech.IsoDep.class.getSimpleName(), jSONObject2);
                        }
                    } catch (org.json.JSONException e19) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ApduEngine", "lo-nfc-getInfo: exp:+" + e19.getLocalizedMessage());
                        jSONObject = jSONObject3.toString();
                    }
                }
                java.lang.System.currentTimeMillis();
                jSONObject3.toString();
                jSONObject = jSONObject3.toString();
            }
            bundle.putString("info", jSONObject);
        }
        apduEngineFuncEvent2.f53976h.f7588a = bundle;
        return false;
    }
}
