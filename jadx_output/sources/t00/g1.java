package t00;

/* loaded from: classes.dex */
public final class g1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414334o;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.feature.ecs.share.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.LinkedList linkedList3;
        java.lang.String str;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        t00.e1 e1Var = new t00.e1();
        e1Var.f414277b = callback;
        e1Var.f414278c = jSONObject;
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.w("OpenShareDialogEcsActionHandler", "params not set");
            callback.a();
            return;
        }
        e1Var.f414276a = optJSONObject.optString("relayParams");
        ?? r37 = com.tencent.mm.feature.ecs.share.p.f65997d;
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("menuList1");
        if (optJSONArray != null) {
            t00.b1 b1Var = t00.b1.f414267d;
            linkedList = new java.util.LinkedList();
            cf.f.b(optJSONArray, new cf.e(b1Var, linkedList));
        } else {
            linkedList = null;
        }
        ?? r47 = kz5.p0.f313996d;
        if (linkedList == null) {
            linkedList = r47;
        }
        java.util.List a17 = r37.a(linkedList);
        org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("menuList2Custom");
        if (optJSONArray2 != null) {
            t00.c1 c1Var = t00.c1.f414270d;
            linkedList2 = new java.util.LinkedList();
            cf.f.b(optJSONArray2, new cf.e(c1Var, linkedList2));
        } else {
            linkedList2 = null;
        }
        if (linkedList2 == null) {
            linkedList2 = r47;
        }
        org.json.JSONArray optJSONArray3 = optJSONObject.optJSONArray("menuList2");
        if (optJSONArray3 != null) {
            t00.d1 d1Var = t00.d1.f414273d;
            linkedList3 = new java.util.LinkedList();
            cf.f.b(optJSONArray3, new cf.e(d1Var, linkedList3));
        } else {
            linkedList3 = null;
        }
        if (linkedList3 != null) {
            r47 = linkedList3;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) it.next();
            com.tencent.mm.feature.ecs.share.b bVar = com.tencent.mm.feature.ecs.share.b.f65970e;
            if (jSONObject2.optInt("disable") <= 0) {
                z17 = false;
            }
            arrayList2.add(new com.tencent.mm.feature.ecs.share.p(bVar, jSONObject2, z17));
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(r37.a(r47));
        java.util.ArrayList arrayList3 = (java.util.ArrayList) a17;
        if (arrayList3.isEmpty() && arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("OpenShareDialogEcsActionHandler", "menuList is empty");
            callback.a();
            return;
        }
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("sourceReportData");
        if (context == null) {
            callback.a();
            return;
        }
        if (arrayList3.isEmpty() && arrayList.isEmpty()) {
            str = "menuList is Empty";
        } else {
            java.util.Iterator it6 = arrayList3.iterator();
            while (true) {
                if (it6.hasNext()) {
                    com.tencent.mm.feature.ecs.share.b bVar2 = ((com.tencent.mm.feature.ecs.share.p) it6.next()).f65998a;
                    if (bVar2 != com.tencent.mm.feature.ecs.share.b.f65971f && bVar2 != com.tencent.mm.feature.ecs.share.b.f65972g && bVar2 != com.tencent.mm.feature.ecs.share.b.f65975m) {
                        str = "menuList1 parameter is invalid";
                        break;
                    }
                } else {
                    java.util.Iterator it7 = arrayList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            str = null;
                            break;
                        }
                        com.tencent.mm.feature.ecs.share.p pVar = (com.tencent.mm.feature.ecs.share.p) it7.next();
                        com.tencent.mm.feature.ecs.share.b bVar3 = pVar.f65998a;
                        if (bVar3 != com.tencent.mm.feature.ecs.share.b.f65970e) {
                            if (bVar3 != com.tencent.mm.feature.ecs.share.b.f65973h && bVar3 != com.tencent.mm.feature.ecs.share.b.f65974i) {
                                str = "menuList2 parameter is invalid";
                                break;
                            }
                        } else {
                            org.json.JSONObject jSONObject3 = pVar.f65999b;
                            if (jSONObject3 == null || jSONObject3.optInt(dm.i4.COL_ID) == 0) {
                                break;
                            }
                            java.lang.String optString = jSONObject3.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                            if (optString == null || optString.length() == 0) {
                                break;
                            }
                            java.lang.String optString2 = jSONObject3.optString("icon");
                            if (optString2 == null || optString2.length() == 0) {
                                break;
                            }
                            java.lang.String optString3 = jSONObject3.optString("darkIcon");
                            if (optString3 == null || optString3.length() == 0) {
                                break;
                            }
                        }
                    }
                    str = "menuList2Custom parameter is invalid";
                }
            }
        }
        if (str == null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.feature.ecs.share.n(context, a17, arrayList, e1Var, optJSONObject2));
            return;
        }
        com.tencent.mars.xlog.Log.w("OpenShareDialogEcsActionHandler", "didCancel: ".concat(str));
        c00.n3 n3Var = e1Var.f414277b;
        if (n3Var != null) {
            n3Var.a();
        }
    }

    @Override // t00.r0
    public org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(envHandler, "envHandler");
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        org.json.JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("menuList2Custom") : null;
        if (optJSONArray == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        t00.f1 f1Var = t00.f1.f414279d;
        java.util.LinkedList<org.json.JSONObject> linkedList = new java.util.LinkedList();
        cf.f.b(optJSONArray, new cf.e(f1Var, linkedList));
        for (org.json.JSONObject jSONObject2 : linkedList) {
            java.lang.String optString = jSONObject2.optString("icon");
            kotlin.jvm.internal.o.d(optString);
            java.lang.String absoluteFilePath = envHandler.getAbsoluteFilePath(optString);
            boolean z17 = true;
            if (!(optString.length() == 0)) {
                if (!(absoluteFilePath == null || absoluteFilePath.length() == 0)) {
                    jSONObject.put(optString, absoluteFilePath);
                    java.lang.String optString2 = jSONObject2.optString("darkIcon");
                    kotlin.jvm.internal.o.d(optString2);
                    java.lang.String absoluteFilePath2 = envHandler.getAbsoluteFilePath(optString2);
                    if (!(optString2.length() == 0)) {
                        if (absoluteFilePath2 != null && absoluteFilePath2.length() != 0) {
                            z17 = false;
                        }
                        if (!z17) {
                            jSONObject.put(optString2, absoluteFilePath2);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
