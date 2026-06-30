package com.tencent.mm.plugin.lite.nfc.hce;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0012\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007J\u0012\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007J\u0012\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0012\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/tencent/mm/plugin/lite/nfc/hce/LiteAppNFCModule;", "Lbd/d;", "Lbd/e;", "callback", "", "checkHceRegister", "", "output", "Lorg/json/JSONObject;", "jsonObject", "Ljz5/f0;", "readByteArrayFromJsonObject", "option", "registerHCE", "unregisterHCE", "forceUnregisterHCE", "getHCERegistration", com.tencent.mm.plugin.appbrand.jsapi.nfc.j.NAME, "getSystemInfo", com.tencent.mm.plugin.appbrand.jsapi.nfc.m.NAME, "requestPermission", "onStoreReady", "setTaskLabel", "loadElf", "Lka3/g;", "registManager", "Lka3/g;", "<init>", "()V", "Companion", "ka3/h", "ka3/i", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class LiteAppNFCModule extends bd.d {
    public static final ka3.h Companion = new ka3.h(null);
    private static final java.lang.String TAG = "LiteAppNFCModule";
    private ka3.g registManager;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean checkHceRegister(bd.e r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule.checkHceRegister(bd.e):boolean");
    }

    public static /* synthetic */ void forceUnregisterHCE$default(com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule liteAppNFCModule, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            jSONObject = new org.json.JSONObject();
        }
        liteAppNFCModule.forceUnregisterHCE(jSONObject);
    }

    public static /* synthetic */ void getHCEState$default(com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule liteAppNFCModule, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            jSONObject = new org.json.JSONObject();
        }
        liteAppNFCModule.getHCEState(jSONObject);
    }

    public static /* synthetic */ void getSystemInfo$default(com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule liteAppNFCModule, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            jSONObject = new org.json.JSONObject();
        }
        liteAppNFCModule.getSystemInfo(jSONObject);
    }

    private final void readByteArrayFromJsonObject(byte[] bArr, org.json.JSONObject jSONObject) {
        int length = jSONObject.length();
        for (int i17 = 0; i17 < length; i17++) {
            int optInt = jSONObject.optInt(java.lang.String.valueOf(i17), -1);
            if (!(optInt >= 0 && optInt <= 255)) {
                throw new java.lang.IllegalArgumentException(("Invalid byte value at index " + i17).toString());
            }
            bArr[i17] = (byte) optInt;
        }
    }

    public static /* synthetic */ void requestPermission$default(com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule liteAppNFCModule, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            jSONObject = new org.json.JSONObject();
        }
        liteAppNFCModule.requestPermission(jSONObject);
    }

    public static /* synthetic */ void unregisterHCE$default(com.tencent.mm.plugin.lite.nfc.hce.LiteAppNFCModule liteAppNFCModule, org.json.JSONObject jSONObject, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            jSONObject = new org.json.JSONObject();
        }
        liteAppNFCModule.unregisterHCE(jSONObject);
    }

    @bd.c(uiThread = true)
    public final void forceUnregisterHCE(org.json.JSONObject option) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i(TAG, "forceUnregisterHCE, data=" + option);
        try {
            java.util.Iterator it = kz5.c0.d("aidList", "appId").iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (kotlin.jvm.internal.o.b(option.optString(str, ""), "")) {
                    com.tencent.mars.xlog.Log.e(TAG, "forceUnregisterHCE required the parameter {" + str + '}');
                    getCallback().a(ka3.b.c(15003, null, 2, null), true, false);
                    return;
                }
            }
            java.lang.String j17 = gm0.j1.b().j();
            java.lang.String optString = option.optString("appId");
            ka3.e eVar = ka3.g.f306067g;
            kotlin.jvm.internal.o.d(j17);
            kotlin.jvm.internal.o.d(optString);
            ka3.f d17 = eVar.d(j17, optString);
            java.lang.String b17 = eVar.b(j17, optString);
            java.util.List a17 = eVar.a();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = ((java.util.ArrayList) a17).iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (!kotlin.jvm.internal.o.b(((ka3.f) next).f306065h, b17)) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                linkedHashSet.addAll(((ka3.f) it7.next()).f306058a);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("unregisterAids, currentAids=");
            java.util.List list = d17.f306058a;
            sb6.append(list);
            sb6.append(", allRestAid=");
            sb6.append(linkedHashSet);
            com.tencent.mars.xlog.Log.i(TAG, sb6.toString());
            java.util.Set W0 = kz5.n0.W0(list);
            W0.removeAll(linkedHashSet);
            com.tencent.mars.xlog.Log.i(TAG, "allRestAid=" + linkedHashSet + ", removeAidSet=" + W0);
            jSONObject = new org.json.JSONObject();
            java.util.Iterator<java.lang.String> keys = option.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next2 = keys.next();
                java.lang.Object opt = option.opt(next2);
                boolean z17 = opt instanceof org.json.JSONObject;
                c75.c cVar = c75.c.f39637a;
                if (z17) {
                    opt = cVar.c((org.json.JSONObject) opt);
                } else if (opt instanceof org.json.JSONArray) {
                    opt = cVar.b((org.json.JSONArray) opt);
                }
                jSONObject.put(next2, opt);
            }
            jSONObject.put("aidList", new org.json.JSONArray((java.util.Collection) linkedHashSet));
            jSONObject.put("removeAidList", new org.json.JSONArray((java.util.Collection) W0));
            ka3.e eVar2 = ka3.g.f306067g;
            com.tencent.mm.sdk.platformtools.o4 o4Var = ra3.q.f393527a;
            java.lang.String key = eVar2.b(j17, optString);
            kotlin.jvm.internal.o.g(key, "key");
            ra3.q.f393527a.remove(key);
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            ka3.u.f306087r.a().j(jSONObject, new ka3.j(this));
        } catch (java.lang.Exception e18) {
            e = e18;
            com.tencent.mars.xlog.Log.e(TAG, "forceUnregisterHCE error: " + e);
            getCallback().a(ka3.b.c(12000, null, 2, null), true, false);
        }
    }

    @bd.c(uiThread = true)
    public final void getHCERegistration(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i(TAG, "getHCERegistration, data=" + option);
        try {
            java.lang.String optString = option.optString("storeAppId");
            if (kotlin.jvm.internal.o.b(optString, "")) {
                getCallback().a(ka3.b.b(15003, "params storeAppId is required"), true, false);
                return;
            }
            java.lang.String j17 = gm0.j1.b().j();
            ka3.e eVar = ka3.g.f306067g;
            kotlin.jvm.internal.o.d(j17);
            kotlin.jvm.internal.o.d(optString);
            ka3.f d17 = eVar.d(j17, optString);
            java.util.List list = d17.f306058a;
            boolean isEmpty = ((java.util.ArrayList) list).isEmpty();
            org.json.JSONObject jSONObject = d17.f306066i;
            if (isEmpty) {
                getCallback().a(jSONObject, false, false);
                return;
            }
            ka3.u a17 = ka3.u.f306087r.a();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("aidList", new org.json.JSONArray((java.util.Collection) list));
            a17.g(jSONObject2);
            getCallback().a(jSONObject, false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "getHCERegistration error: " + e17);
            getCallback().a(ka3.b.b(12000, "getHCERegistration error " + e17.getMessage()), true, false);
        }
    }

    @bd.c(uiThread = true)
    public final void getHCEState(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i(TAG, "LiteAppNFCModule.getHCEState, data=" + option);
        try {
            ka3.u a17 = ka3.u.f306087r.a();
            bd.e callback = getCallback();
            kotlin.jvm.internal.o.f(callback, "getCallback(...)");
            dd1.b bVar = a17.f306101m;
            android.content.Context e17 = a17.e();
            kotlin.jvm.internal.o.d(e17);
            ((dd1.c) bVar).a(e17, option, new ka3.p(callback));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e(TAG, "checkHCESupport error, error=" + e18);
            getCallback().a(ka3.b.b(12000, "checkHCESupport error, error= " + e18.getMessage()), true, false);
        }
    }

    @bd.c(uiThread = true)
    public final void getSystemInfo(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i(TAG, "LiteAppNFCModule.getSystemInfo, data=" + option);
        try {
            ka3.u a17 = ka3.u.f306087r.a();
            bd.e callback = getCallback();
            kotlin.jvm.internal.o.f(callback, "getCallback(...)");
            dd1.b bVar = a17.f306101m;
            android.content.Context e17 = a17.e();
            kotlin.jvm.internal.o.d(e17);
            ((dd1.c) bVar).a(e17, option, new ka3.o(callback));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e(TAG, "getSystemInfo error, error=" + e18);
            getCallback().a(ka3.b.b(12000, "getSystemInfo error, error=" + e18.getMessage()), true, false);
        }
    }

    @bd.c(uiThread = true)
    public final void loadElf(org.json.JSONObject option) {
        java.lang.String sb6;
        java.lang.String str;
        kotlin.jvm.internal.o.g(option, "option");
        try {
            option.toString();
            java.util.Iterator it = kz5.c0.d("vmp", "input", "iv", "returnHex", "deviceId", "size").iterator();
            do {
                if (!it.hasNext()) {
                    org.json.JSONObject jSONObject = option.getJSONObject("vmp");
                    org.json.JSONObject jSONObject2 = option.getJSONObject("input");
                    org.json.JSONObject jSONObject3 = option.getJSONObject("iv");
                    boolean optBoolean = option.optBoolean("returnHex", false);
                    int optInt = option.optInt("size", 0);
                    java.lang.String optString = option.optString("deviceId", "");
                    int length = jSONObject.length();
                    byte[] bArr = new byte[length];
                    readByteArrayFromJsonObject(bArr, jSONObject);
                    byte[] bArr2 = new byte[jSONObject2.length()];
                    readByteArrayFromJsonObject(bArr2, jSONObject2);
                    byte[] bArr3 = new byte[jSONObject3.length()];
                    readByteArrayFromJsonObject(bArr3, jSONObject3);
                    kotlin.jvm.internal.o.d(optString);
                    jz5.x d17 = r26.q0.d(optString, 16);
                    if (d17 == null) {
                        getCallback().a(ka3.b.b(-1, "invalid parameter [deviceId], needs max length of hexString"), false, false);
                        return;
                    }
                    byte[] bArr4 = new byte[2048];
                    new com.tencent.mm.plugin.lite.LiteAppLibPack().randomBuffer(bArr, length, bArr2, bArr4, jSONObject2.length(), bArr3, d17.f302852d);
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr4, 0, optInt);
                    if (optBoolean) {
                        kotlin.jvm.internal.o.d(copyOfRange);
                        sb6 = r26.f.d(copyOfRange, null, 1, null);
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        kotlin.jvm.internal.o.d(copyOfRange);
                        for (byte b17 : copyOfRange) {
                            sb7.append((char) b17);
                        }
                        sb6 = sb7.toString();
                        kotlin.jvm.internal.o.f(sb6, "toString(...)");
                    }
                    bd.e callback = getCallback();
                    org.json.JSONObject d18 = ka3.b.d(null, null, 3, null);
                    d18.put("output", sb6);
                    callback.a(d18, false, false);
                    return;
                }
                str = (java.lang.String) it.next();
            } while (!option.optString(str, "").equals(""));
            com.tencent.mars.xlog.Log.e(TAG, "The parameter {" + str + "} is required");
            getCallback().a(ka3.b.c(15003, null, 2, null), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "loadElf error: ", e17);
            getCallback().a(ka3.b.b(-1, "loadElf failed"), false, true);
        }
    }

    @bd.c(uiThread = true)
    public final void onStoreReady(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i(TAG, "onStoreReady, data=" + option);
        try {
            ka3.u.f306087r.a().f(option);
            getCallback().a(ka3.b.d(null, null, 3, null), true, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "onStoreReady error, error=" + e17);
            getCallback().a(ka3.b.b(12000, "onStoreReady error, error=" + e17.getMessage()), true, true);
        }
    }

    @bd.c(uiThread = true)
    public final void registerHCE(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i(TAG, "LiteAppNFCModule.registerHCE, data=" + option);
        java.util.Iterator it = kz5.c0.d("aidList", "storeAppId", "storeActionName", "wallet").iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (option.optString(str, "").equals("")) {
                com.tencent.mars.xlog.Log.e(TAG, "startHCE required the parameter {" + str + '}');
                getCallback().a(ka3.b.c(15003, null, 2, null), true, false);
                return;
            }
        }
        ka3.v vVar = ka3.w.f306106e;
        java.lang.String optString = option.optString("wallet");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        ka3.w a17 = vVar.a(optString);
        if (a17 == null) {
            getCallback().a(ka3.b.c(15008, null, 2, null), false, false);
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i(TAG, "start register");
            if (!gm0.j1.a()) {
                getCallback().a(ka3.b.c(15006, null, 2, null), false, false);
            }
            java.lang.String j17 = gm0.j1.b().j();
            kotlin.jvm.internal.o.d(j17);
            this.registManager = new ka3.g(option, j17, a17);
            bd.e callback = getCallback();
            kotlin.jvm.internal.o.f(callback, "getCallback(...)");
            if (checkHceRegister(callback)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Iterator<java.lang.String> keys = option.keys();
                kotlin.jvm.internal.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.Object opt = option.opt(next);
                    boolean z17 = opt instanceof org.json.JSONObject;
                    c75.c cVar = c75.c.f39637a;
                    if (z17) {
                        opt = cVar.c((org.json.JSONObject) opt);
                    } else if (opt instanceof org.json.JSONArray) {
                        opt = cVar.b((org.json.JSONArray) opt);
                    }
                    jSONObject.put(next, opt);
                }
                ka3.g gVar = this.registManager;
                kotlin.jvm.internal.o.d(gVar);
                jSONObject.put("aidList", gVar.a());
                ka3.u.f306087r.a().h(jSONObject, true, new ka3.k(this));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "registerHCE error: " + e17);
            getCallback().a(ka3.b.c(12000, null, 2, null), true, false);
        }
    }

    @bd.c(uiThread = true)
    public final void requestPermission(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i(TAG, "requestPermission, data=" + option);
        try {
            ka3.u a17 = ka3.u.f306087r.a();
            bd.e callback = getCallback();
            kotlin.jvm.internal.o.f(callback, "getCallback(...)");
            a17.i(option, callback);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "requestPermission error, error=" + e17);
            getCallback().a(ka3.b.b(12000, "requestPermission error, error=" + e17.getMessage()), true, true);
        }
    }

    @bd.c(uiThread = true)
    public final void sendHCEMessage(org.json.JSONObject option) {
        android.nfc.cardemulation.HostApduService hostApduService;
        kotlin.jvm.internal.o.g(option, "option");
        try {
            org.json.JSONObject jSONObject = option.getJSONObject(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            int length = jSONObject.length();
            byte[] bArr = new byte[length];
            for (int i17 = 0; i17 < length; i17++) {
                int optInt = jSONObject.optInt(java.lang.String.valueOf(i17), -1);
                if (!(optInt >= 0 && optInt <= 255)) {
                    throw new java.lang.IllegalArgumentException(("Invalid byte value at index " + i17).toString());
                }
                bArr[i17] = (byte) optInt;
            }
            if (ed1.f.f251242d == null) {
                ed1.f.f251242d = new ed1.f();
            }
            ed1.f fVar = ed1.f.f251242d;
            if (fVar != null && (hostApduService = fVar.f251243b) != null) {
                hostApduService.sendResponseApdu(bArr);
            }
            getCallback().a(new org.json.JSONObject(), true, false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(TAG, "send resp error=" + e17);
            getCallback().a(ka3.b.b(12000, "send resp error=" + e17.getMessage()), true, false);
        }
    }

    @bd.c(uiThread = true)
    public final void setTaskLabel(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        try {
            java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
            android.app.Activity activity = k17 != null ? (android.app.Activity) k17.get() : null;
            if (activity == null) {
                com.tencent.mars.xlog.Log.e(TAG, "getTopActivity failed");
                getCallback().a(ka3.b.b(-1, "no available activity"), false, false);
                return;
            }
            if (activity instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppIsolateTaskUI) {
                java.lang.String optString = option.optString("taskLabel", "");
                if (!optString.equals("")) {
                    ((com.tencent.mm.plugin.lite.ui.WxaLiteAppIsolateTaskUI) activity).setTaskDescription(new android.app.ActivityManager.TaskDescription(optString));
                    com.tencent.mars.xlog.Log.i(TAG, "finish setTaskDescription");
                }
            }
            getCallback().a(ka3.b.d(null, null, 3, null), false, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "setTaskLabel error", e17);
            getCallback().a(ka3.b.c(-1, null, 2, null), false, false);
        }
    }

    @bd.c(uiThread = true)
    public final void unregisterHCE(org.json.JSONObject option) {
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mars.xlog.Log.i(TAG, "unregisterHCE, data=" + option);
        try {
            java.util.Iterator it = kz5.c0.d("aidList", "appId", "wallet").iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (kotlin.jvm.internal.o.b(option.optString(str, ""), "")) {
                    com.tencent.mars.xlog.Log.e(TAG, "unregisterHCE required the parameter {" + str + '}');
                    getCallback().a(ka3.b.c(15003, null, 2, null), true, false);
                    return;
                }
            }
            ka3.v vVar = ka3.w.f306106e;
            java.lang.String optString = option.optString("wallet");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            ka3.w a17 = vVar.a(optString);
            if (a17 == null) {
                getCallback().a(ka3.b.c(15008, null, 2, null), false, false);
                return;
            }
            java.lang.String j17 = gm0.j1.b().j();
            java.lang.String optString2 = option.optString("appId");
            ka3.e eVar = ka3.g.f306067g;
            kotlin.jvm.internal.o.d(j17);
            kotlin.jvm.internal.o.d(optString2);
            if (!eVar.e(j17, optString2, a17)) {
                com.tencent.mars.xlog.Log.e(TAG, "the user has no registeration with current appId");
                getCallback().a(ka3.b.c(15005, null, 2, null), false, false);
                return;
            }
            ka3.f d17 = eVar.d(j17, optString2);
            java.lang.String b17 = eVar.b(j17, optString2);
            java.util.List a18 = eVar.a();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : a18) {
                if (!kotlin.jvm.internal.o.b(((ka3.f) obj).f306065h, b17)) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                linkedHashSet.addAll(((ka3.f) it6.next()).f306058a);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("unregisterAids, currentAids=");
            java.util.List list = d17.f306058a;
            sb6.append(list);
            sb6.append(", allRestAid=");
            sb6.append(linkedHashSet);
            com.tencent.mars.xlog.Log.i(TAG, sb6.toString());
            java.util.Set W0 = kz5.n0.W0(list);
            W0.removeAll(linkedHashSet);
            com.tencent.mars.xlog.Log.i(TAG, "allRestAid=" + linkedHashSet + ", removeAidSet=" + W0);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.util.Iterator<java.lang.String> keys = option.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object opt = option.opt(next);
                boolean z17 = opt instanceof org.json.JSONObject;
                c75.c cVar = c75.c.f39637a;
                if (z17) {
                    opt = cVar.c((org.json.JSONObject) opt);
                } else if (opt instanceof org.json.JSONArray) {
                    opt = cVar.b((org.json.JSONArray) opt);
                }
                jSONObject.put(next, opt);
            }
            jSONObject.put("aidList", new org.json.JSONArray((java.util.Collection) linkedHashSet));
            jSONObject.put("removeAidList", new org.json.JSONArray((java.util.Collection) W0));
            try {
                ka3.u.f306087r.a().j(jSONObject, new ka3.l(j17, optString2, this));
            } catch (java.lang.Exception e17) {
                e = e17;
                com.tencent.mars.xlog.Log.e(TAG, "unregisterHCE error: " + e);
                getCallback().a(ka3.b.c(12000, null, 2, null), true, false);
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }
}
