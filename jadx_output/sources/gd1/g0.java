package gd1;

/* loaded from: classes7.dex */
public final class g0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 793;
    public static final java.lang.String NAME = "writeNdefMessage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.Iterator<java.lang.String> keys;
        java.util.HashMap hashMap;
        android.nfc.NdefRecord ndefRecord;
        java.lang.String str4 = "MicroMsg.AppBrand.JsApiWriteNdefMessage";
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiWriteNdefMessage", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiWriteNdefMessage", "invoke, data is null");
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.t1 t1Var = (com.tencent.mm.plugin.appbrand.jsapi.t1) nd.f.a(com.tencent.mm.plugin.appbrand.jsapi.t1.class);
        if (t1Var != null && !((com.tencent.mm.plugin.appbrand.utils.k5) t1Var).a()) {
            lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13019, "fail:user is not authorized", kz5.c1.i(new jz5.l("errCode", 13019))));
            return;
        }
        hd1.w a17 = hd1.w.f280435c.a(lVar);
        gd1.e0 e0Var = new gd1.e0(lVar, i17, this);
        lVar.getAppId();
        jSONObject.toString();
        android.nfc.NdefMessage ndefMessage = null;
        if (jSONObject.has("uris")) {
            try {
                java.lang.Object obj = jSONObject.get("uris");
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONArray");
                org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    java.lang.Object obj2 = jSONArray.get(i18);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    arrayList.add(obj2.toString());
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(android.nfc.NdefRecord.createUri((java.lang.String) it.next()));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NdefMessageConverter", "createUri failed since " + e17);
                    }
                }
                try {
                    ndefMessage = new android.nfc.NdefMessage((android.nfc.NdefRecord[]) arrayList2.toArray(new android.nfc.NdefRecord[0]));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NdefMessageConverter", "create NdefMessage failed since " + e18);
                }
                android.nfc.NdefMessage ndefMessage2 = ndefMessage;
                if (ndefMessage2 == null) {
                    lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13012, "fail:parse NdefMessage failed", kz5.c1.i(new jz5.l("errCode", 13012))));
                    return;
                } else {
                    a17.d(ndefMessage2, e0Var);
                    return;
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiWriteNdefMessage", "parse uris failed since " + e19);
                lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
                return;
            }
        }
        java.lang.String str5 = "fail:invalid parameter";
        if (!jSONObject.has("texts")) {
            java.util.Map b17 = jd1.a.b(jSONObject, gd1.f0.f270499d);
            b17.toString();
            java.util.HashMap hashMap2 = (java.util.HashMap) b17;
            java.lang.Object obj3 = hashMap2.get("records");
            java.util.List list = obj3 instanceof java.util.List ? (java.util.List) obj3 : null;
            if (list != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it6 = list.iterator();
                int i19 = 0;
                while (true) {
                    if (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        java.util.Map map = (java.util.Map) next;
                        java.util.Objects.toString(map);
                        java.util.Iterator it7 = it6;
                        java.lang.Object obj4 = hashMap2.get("payload-" + i19);
                        java.nio.ByteBuffer byteBuffer = obj4 instanceof java.nio.ByteBuffer ? (java.nio.ByteBuffer) obj4 : null;
                        if (byteBuffer == null) {
                            break;
                        }
                        byteBuffer.toString();
                        java.util.Objects.toString(new jz5.l(map, byteBuffer));
                        java.util.Map map2 = map;
                        java.lang.Object obj5 = map2.get("tnf");
                        java.lang.Integer num = obj5 instanceof java.lang.Integer ? (java.lang.Integer) obj5 : null;
                        if (num != null) {
                            int intValue = num.intValue();
                            java.lang.Object obj6 = map2.get("type");
                            hashMap = hashMap2;
                            java.lang.String str6 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                            byte[] decode = str6 != null ? android.util.Base64.decode(str6, 2) : null;
                            java.lang.Object obj7 = map2.get(dm.i4.COL_ID);
                            java.lang.String str7 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                            try {
                                ndefRecord = new android.nfc.NdefRecord((short) intValue, decode, str7 != null ? android.util.Base64.decode(str7, 2) : null, ik1.f.a(byteBuffer));
                            } catch (java.lang.Exception e27) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NdefMessageConverter", "recordMap2Record failed since " + e27);
                            }
                            arrayList3.add(ndefRecord);
                            it6 = it7;
                            i19 = i27;
                            hashMap2 = hashMap;
                        } else {
                            hashMap = hashMap2;
                        }
                        ndefRecord = null;
                        arrayList3.add(ndefRecord);
                        it6 = it7;
                        i19 = i27;
                        hashMap2 = hashMap;
                    } else {
                        arrayList3.toString();
                        try {
                            ndefMessage = new android.nfc.NdefMessage((android.nfc.NdefRecord[]) arrayList3.toArray(new android.nfc.NdefRecord[0]));
                            break;
                        } catch (java.lang.Exception e28) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NdefMessageConverter", "create NdefMessage failed since " + e28);
                        }
                    }
                }
            }
            android.nfc.NdefMessage ndefMessage3 = ndefMessage;
            if (ndefMessage3 == null) {
                lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13012, "fail:parse NdefMessage failed", kz5.c1.i(new jz5.l("errCode", 13012))));
                return;
            } else {
                a17.d(ndefMessage3, e0Var);
                return;
            }
        }
        try {
            java.lang.Object obj8 = jSONObject.get("texts");
            kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type org.json.JSONArray");
            org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj8;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(jSONArray2.length());
            int length2 = jSONArray2.length();
            int i28 = 0;
            while (i28 < length2) {
                int i29 = length2;
                java.lang.Object obj9 = jSONArray2.get(i28);
                kotlin.jvm.internal.o.f(obj9, "get(...)");
                org.json.JSONArray jSONArray3 = jSONArray2;
                org.json.JSONObject jSONObject2 = obj9 instanceof org.json.JSONObject ? (org.json.JSONObject) obj9 : null;
                if (jSONObject2 == null) {
                    com.tencent.mars.xlog.Log.w(str4, "parse texts failed since convert jsonObject failed");
                    lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, str5, kz5.c1.i(new jz5.l("errCode", 13011))));
                    return;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap();
                str2 = str5;
                try {
                    keys = jSONObject2.keys();
                    str = str4;
                } catch (java.lang.Exception e29) {
                    e = e29;
                    str = str4;
                }
                try {
                    kotlin.jvm.internal.o.f(keys, "keys(...)");
                    while (keys.hasNext()) {
                        java.lang.String next2 = keys.next();
                        kotlin.jvm.internal.o.d(next2);
                        java.util.Iterator<java.lang.String> it8 = keys;
                        java.lang.Object obj10 = jSONObject2.get(next2);
                        kotlin.jvm.internal.o.f(obj10, "get(...)");
                        hashMap3.put(next2, obj10.toString());
                        keys = it8;
                    }
                    arrayList4.add(hashMap3);
                    i28++;
                    length2 = i29;
                    jSONArray2 = jSONArray3;
                    str5 = str2;
                    str4 = str;
                } catch (java.lang.Exception e37) {
                    e = e37;
                    com.tencent.mars.xlog.Log.w(str, "parse texts failed since " + e);
                    lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13011, str2, kz5.c1.i(new jz5.l("errCode", 13011))));
                    return;
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
            java.util.Iterator it9 = arrayList4.iterator();
            while (true) {
                if (it9.hasNext()) {
                    java.util.Map map3 = (java.util.Map) it9.next();
                    java.lang.String str8 = (java.lang.String) map3.get(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                    if (str8 == null || (str3 = (java.lang.String) map3.get(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) == null) {
                        break;
                    }
                    try {
                        arrayList5.add(android.nfc.NdefRecord.createTextRecord(str3, str8));
                    } catch (java.lang.Exception e38) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NdefMessageConverter", "createTextRecord failed since " + e38);
                    }
                } else {
                    try {
                        ndefMessage = new android.nfc.NdefMessage((android.nfc.NdefRecord[]) arrayList5.toArray(new android.nfc.NdefRecord[0]));
                        break;
                    } catch (java.lang.Exception e39) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.NdefMessageConverter", "create NdefMessage failed since " + e39);
                    }
                }
            }
            android.nfc.NdefMessage ndefMessage4 = ndefMessage;
            if (ndefMessage4 == null) {
                lVar.a(i17, com.tencent.mm.plugin.appbrand.jsapi.nfc.v.a(this, 13012, "fail:parse NdefMessage failed", kz5.c1.i(new jz5.l("errCode", 13012))));
            } else {
                a17.d(ndefMessage4, e0Var);
            }
        } catch (java.lang.Exception e47) {
            e = e47;
            str = str4;
            str2 = str5;
        }
    }
}
