package ws0;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws0.g f448963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f448964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ws0.g gVar, yz5.q qVar) {
        super(0);
        this.f448963d = gVar;
        this.f448964e = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [android.util.Range] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.util.ArrayList arrayList2;
        int i17;
        java.util.Iterator<java.lang.String> it;
        java.lang.Object obj;
        ws0.g gVar = this.f448963d;
        com.tencent.mars.xlog.Log.i(gVar.f448965a, "available request: tag value : " + gVar.f448967c + ' ');
        java.lang.String str2 = "available result: tag value : " + gVar.f448968d + ' ';
        java.lang.String str3 = gVar.f448965a;
        com.tencent.mars.xlog.Log.i(str3, str2);
        com.tencent.mars.xlog.Log.i(str3, "available sessionType: tag value : " + gVar.f448969e + ' ');
        org.json.JSONArray jSONArray = gVar.f448967c;
        int length = jSONArray != null ? jSONArray.length() : 0;
        int i18 = 0;
        while (true) {
            arrayList = gVar.f448970f;
            str = "stream";
            if (i18 >= length) {
                break;
            }
            xs0.a aVar = new xs0.a();
            org.json.JSONArray jSONArray2 = gVar.f448967c;
            kotlin.jvm.internal.o.d(jSONArray2);
            org.json.JSONObject optJSONObject = jSONArray2.optJSONObject(i18);
            if (optJSONObject != null) {
                java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                kotlin.jvm.internal.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (kotlin.jvm.internal.o.b(next, "cameraId")) {
                        aVar.f456286b = java.lang.Integer.valueOf(optJSONObject.optInt(next));
                    } else if (kotlin.jvm.internal.o.b(next, "parentKey")) {
                        aVar.f456285a = optJSONObject.optString(next);
                    } else {
                        int i19 = length;
                        if (kotlin.jvm.internal.o.b(next, "childKey")) {
                            aVar.f456288d = optJSONObject.optString(next);
                        } else if (kotlin.jvm.internal.o.b(next, "vendorTag")) {
                            aVar.f456290f = optJSONObject.optString(next);
                        } else {
                            if (kotlin.jvm.internal.o.b(next, "supportValue")) {
                                java.lang.String optString = optJSONObject.optString(next);
                                kotlin.jvm.internal.o.f(optString, "optString(...)");
                                java.util.List f07 = r26.n0.f0(optString, new java.lang.String[]{","}, false, 0, 6, null);
                                java.lang.String str4 = (java.lang.String) f07.get(0);
                                it = keys;
                                if (kotlin.jvm.internal.o.b(str4, "range")) {
                                    obj = new android.util.Range(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f07.get(1))), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f07.get(2))));
                                } else {
                                    if (kotlin.jvm.internal.o.b(str4, "array")) {
                                        java.lang.Object obj2 = aVar.f456287c;
                                        if (obj2 instanceof java.lang.Boolean) {
                                            obj = new java.util.ArrayList();
                                            java.util.Iterator it6 = f07.subList(1, f07.size()).iterator();
                                            while (it6.hasNext()) {
                                                obj.add(java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean((java.lang.String) it6.next())));
                                            }
                                        } else if (obj2 instanceof java.lang.String) {
                                            obj = new java.util.ArrayList();
                                            java.util.Iterator it7 = f07.subList(1, f07.size()).iterator();
                                            while (it7.hasNext()) {
                                                obj.add((java.lang.String) it7.next());
                                            }
                                        } else if (obj2 instanceof java.lang.Integer) {
                                            obj = new java.util.ArrayList();
                                            java.util.Iterator it8 = f07.subList(1, f07.size()).iterator();
                                            while (it8.hasNext()) {
                                                obj.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it8.next())));
                                            }
                                        }
                                    }
                                    obj = 0;
                                }
                                aVar.f456289e = obj;
                            } else {
                                it = keys;
                                if (kotlin.jvm.internal.o.b(next, "defaultValue")) {
                                    aVar.f456287c = optJSONObject.opt(next);
                                } else if (kotlin.jvm.internal.o.b(next, "stream")) {
                                    aVar.f456291g = java.lang.Integer.valueOf(optJSONObject.optInt(next));
                                }
                            }
                            length = i19;
                            keys = it;
                        }
                        length = i19;
                    }
                }
            }
            int i27 = length;
            java.util.Objects.toString(aVar.f456287c);
            java.lang.Object obj3 = aVar.f456289e;
            if (obj3 instanceof android.util.Range) {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
                java.util.Objects.toString(((android.util.Range) obj3).getLower());
                java.lang.Object obj4 = aVar.f456289e;
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
                java.util.Objects.toString(((android.util.Range) obj4).getUpper());
            } else if (obj3 instanceof java.util.ArrayList) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                java.lang.Object obj5 = aVar.f456289e;
                kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                for (java.lang.Object obj6 : (java.util.ArrayList) obj5) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(obj6);
                    sb6.append((char) 12289);
                    stringBuffer.append(sb6.toString());
                }
            }
            arrayList.add(aVar);
            i18++;
            length = i27;
        }
        org.json.JSONArray jSONArray3 = gVar.f448968d;
        int length2 = jSONArray3 != null ? jSONArray3.length() : 0;
        int i28 = 0;
        while (true) {
            arrayList2 = gVar.f448971g;
            if (i28 >= length2) {
                break;
            }
            ys0.a aVar2 = new ys0.a();
            org.json.JSONArray jSONArray4 = gVar.f448968d;
            kotlin.jvm.internal.o.d(jSONArray4);
            org.json.JSONObject optJSONObject2 = jSONArray4.optJSONObject(i28);
            if (optJSONObject2 != null) {
                java.util.Iterator<java.lang.String> keys2 = optJSONObject2.keys();
                kotlin.jvm.internal.o.f(keys2, "keys(...)");
                while (keys2.hasNext()) {
                    int i29 = length2;
                    java.lang.String next2 = keys2.next();
                    if (kotlin.jvm.internal.o.b(next2, "cameraId")) {
                        aVar2.f465118b = java.lang.Integer.valueOf(optJSONObject2.optInt(next2));
                    } else if (kotlin.jvm.internal.o.b(next2, "parentKey")) {
                        aVar2.f465117a = optJSONObject2.optString(next2);
                    } else if (kotlin.jvm.internal.o.b(next2, "vendorTag")) {
                        aVar2.f465119c = optJSONObject2.optString(next2);
                    } else if (kotlin.jvm.internal.o.b(next2, str)) {
                        aVar2.f465120d = java.lang.Integer.valueOf(optJSONObject2.optInt(next2));
                    } else {
                        java.lang.String str5 = str;
                        if (kotlin.jvm.internal.o.b(next2, "valueType")) {
                            aVar2.f465121e = optJSONObject2.optString(next2);
                        }
                        str = str5;
                    }
                    length2 = i29;
                }
            }
            int i37 = length2;
            java.lang.String str6 = str;
            arrayList2.add(aVar2);
            i28++;
            str = str6;
            length2 = i37;
        }
        org.json.JSONArray jSONArray5 = gVar.f448969e;
        int length3 = jSONArray5 != null ? jSONArray5.length() : 0;
        int i38 = 0;
        while (true) {
            java.util.ArrayList arrayList3 = gVar.f448972h;
            if (i38 >= length3) {
                this.f448964e.invoke(arrayList, arrayList2, arrayList3);
                return jz5.f0.f302826a;
            }
            zs0.a aVar3 = new zs0.a();
            org.json.JSONArray jSONArray6 = gVar.f448969e;
            kotlin.jvm.internal.o.d(jSONArray6);
            org.json.JSONObject optJSONObject3 = jSONArray6.optJSONObject(i38);
            if (optJSONObject3 != null) {
                java.util.Iterator<java.lang.String> keys3 = optJSONObject3.keys();
                kotlin.jvm.internal.o.f(keys3, "keys(...)");
                while (keys3.hasNext()) {
                    java.lang.String next3 = keys3.next();
                    if (kotlin.jvm.internal.o.b(next3, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)) {
                        optJSONObject3.optString(next3);
                    } else if (kotlin.jvm.internal.o.b(next3, "value")) {
                        aVar3.f475230a = optJSONObject3.optInt(next3);
                    } else if (kotlin.jvm.internal.o.b(next3, "supportTag")) {
                        java.lang.String optString2 = optJSONObject3.optString(next3);
                        kotlin.jvm.internal.o.f(optString2, "optString(...)");
                        java.util.List f08 = r26.n0.f0(optString2, new java.lang.String[]{","}, false, 0, 6, null);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        if (kotlin.jvm.internal.o.b((java.lang.String) f08.get(0), "array")) {
                            i17 = length3;
                            java.util.Iterator it9 = f08.subList(1, f08.size()).iterator();
                            while (it9.hasNext()) {
                                arrayList4.add((java.lang.String) it9.next());
                            }
                        } else {
                            i17 = length3;
                        }
                        aVar3.f475231b = arrayList4;
                        length3 = i17;
                    }
                }
            }
            int i39 = length3;
            arrayList3.add(aVar3);
            i38++;
            length3 = i39;
        }
    }
}
