package t00;

/* loaded from: classes7.dex */
public final class n2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414335p;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        org.json.JSONArray optJSONArray;
        org.json.JSONArray optJSONArray2;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        t00.m2 m2Var = new t00.m2();
        m2Var.f414319a = callback;
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        com.tencent.mm.feature.ecs.share.u[] uVarArr = com.tencent.mm.feature.ecs.share.u.f66002d;
        int optInt = optJSONObject != null ? optJSONObject.optInt("showShareType", 0) : 0;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("ShareToContactsEcsActionHandler", "share to contact context is null");
            m2Var.a("share to contact context is null");
            return;
        }
        com.tencent.mm.feature.ecs.share.s sVar = com.tencent.mm.feature.ecs.share.s.f66001a;
        java.util.ArrayList arrayList = null;
        if (optInt == 0) {
            if (optJSONObject != null && (optJSONArray2 = optJSONObject.optJSONArray("encryptUserNames")) != null) {
                e06.k m17 = e06.p.m(0, optJSONArray2.length());
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m17, 10));
                java.util.Iterator it = m17.iterator();
                while (((e06.j) it).hasNext()) {
                    arrayList2.add(optJSONArray2.optString(((kz5.x0) it).b()));
                }
                arrayList = arrayList2;
            }
            sVar.b(context, optJSONObject, jSONObject, arrayList, m2Var, true);
            return;
        }
        if (optInt != 1) {
            com.tencent.mars.xlog.Log.e("ShareToContactsEcsActionHandler", "share to contact use unKnown shareType: " + optInt);
            m2Var.a("unKnown shareType: " + optInt);
            return;
        }
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("encryptUserNames")) != null) {
            e06.k m18 = e06.p.m(0, optJSONArray.length());
            arrayList = new java.util.ArrayList(kz5.d0.q(m18, 10));
            java.util.Iterator it6 = m18.iterator();
            while (((e06.j) it6).hasNext()) {
                arrayList.add(optJSONArray.optString(((kz5.x0) it6).b()));
            }
        }
        if (!(arrayList == null || arrayList.isEmpty())) {
            sVar.b(context, optJSONObject, jSONObject, arrayList, m2Var, false);
        } else {
            com.tencent.mars.xlog.Log.e("ShareToContactsEcsActionHandler", "share to contact encryptUserNames is empty");
            m2Var.a("share direct encryptUserNames is empty");
        }
    }

    @Override // t00.r0
    public org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(envHandler, "envHandler");
        org.json.JSONObject config = envHandler.getConfig();
        if (config == null) {
            config = new org.json.JSONObject();
        }
        org.json.JSONObject optJSONObject = data.optJSONObject("params");
        if ((optJSONObject != null ? optJSONObject.optInt("ecsSharMsgType") : -1) == 4) {
            org.json.JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("imageParams") : null;
            java.lang.String optString = optJSONObject2 != null ? optJSONObject2.optString("imagePath") : null;
            boolean z17 = true;
            if (!(optString == null || optString.length() == 0)) {
                if (r26.i0.A(optString, "http://", false, 2, null) || r26.i0.y(optString, "https://", false)) {
                    com.tencent.mm.vfs.r6 allocTempFile = envHandler.allocTempFile("ecs_share_image_" + java.lang.System.currentTimeMillis());
                    if (allocTempFile != null) {
                        config.put("outputPath", allocTempFile.o());
                        com.tencent.mars.xlog.Log.i("ShareToContactsEcsActionHandler", "prepareEnvData, network image, outputPath: " + allocTempFile.u() + ", url: " + optString);
                    } else {
                        com.tencent.mars.xlog.Log.w("ShareToContactsEcsActionHandler", "prepareEnvData, allocTempFile failed for network image");
                    }
                } else {
                    java.lang.String absoluteFilePath = envHandler.getAbsoluteFilePath(optString);
                    if (absoluteFilePath != null && absoluteFilePath.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.w("ShareToContactsEcsActionHandler", "prepareEnvData, failed to resolve local path: ".concat(optString));
                    } else {
                        config.put("inputPath", absoluteFilePath);
                        com.tencent.mars.xlog.Log.i("ShareToContactsEcsActionHandler", "prepareEnvData, local image path: " + absoluteFilePath);
                    }
                }
            }
        }
        return config;
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
