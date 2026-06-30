package qa3;

/* loaded from: classes15.dex */
public final class o implements com.tencent.mm.plugin.lite.e {

    /* renamed from: b, reason: collision with root package name */
    public static jz5.l f361052b;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f361054d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f361055e;

    /* renamed from: f, reason: collision with root package name */
    public static xp5.f f361056f;

    /* renamed from: g, reason: collision with root package name */
    public static long f361057g;

    /* renamed from: a, reason: collision with root package name */
    public static final qa3.o f361051a = new qa3.o();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.LinkedBlockingQueue f361053c = new java.util.concurrent.LinkedBlockingQueue();

    public static final void a(qa3.o oVar, byte[] bArr) {
        oVar.getClass();
        java.lang.String str = new java.lang.String(bArr, r26.c.f368865a);
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "recv ".concat(str));
        org.json.JSONArray jSONArray = new org.json.JSONArray(str);
        int length = jSONArray.length();
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            if (jSONObject.has("cmd")) {
                java.lang.String string = jSONObject.getString("cmd");
                if (kotlin.jvm.internal.o.b("noop", string)) {
                    oVar.c(jSONObject, true, "");
                } else {
                    kotlin.jvm.internal.o.d(string);
                    if (r26.i0.y(string, "debug.", false)) {
                        com.tencent.mm.plugin.lite.LiteAppCenter.onRecvDebugMsg(jSONObject.toString());
                        oVar.c(jSONObject, true, "");
                    } else {
                        int hashCode = string.hashCode();
                        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = f361053c;
                        switch (hashCode) {
                            case -1335458389:
                                if (string.equals("delete")) {
                                    linkedBlockingQueue.add(new qa3.d(string, jSONObject));
                                    break;
                                }
                                break;
                            case 94756344:
                                if (string.equals("close")) {
                                    linkedBlockingQueue.add(new qa3.b(string, jSONObject));
                                    break;
                                }
                                break;
                            case 109757538:
                                if (string.equals("start")) {
                                    linkedBlockingQueue.add(new qa3.s(string, jSONObject));
                                    break;
                                }
                                break;
                            case 1427818632:
                                if (string.equals("download")) {
                                    linkedBlockingQueue.add(new qa3.h(string, jSONObject));
                                    break;
                                }
                                break;
                        }
                        com.tencent.mars.xlog.Log.w("LiteAppTestService", "unknown cmd %cmd");
                    }
                }
            }
        }
    }

    public static final void b(qa3.o oVar) {
        oVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("cmd", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        java.lang.String hexString = java.lang.Integer.toHexString(o45.wf.f343029g);
        kotlin.jvm.internal.o.f(hexString, "toHexString(...)");
        java.util.Locale ROOT = java.util.Locale.ROOT;
        kotlin.jvm.internal.o.f(ROOT, "ROOT");
        java.lang.String upperCase = hexString.toUpperCase(ROOT);
        kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
        jSONObject.put("clientVersion", "0x".concat(upperCase));
        if (gm0.j1.a()) {
            jSONObject.put("uin", new jz5.u(gm0.j1.b().h()));
        } else {
            com.tencent.mars.xlog.Log.w("LiteAppTestService", "acc not ready");
            jSONObject.put("uin", 0);
        }
        qa3.j jVar = qa3.j.f361048a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String BUILD_TAG = lp0.a.f320252f;
        kotlin.jvm.internal.o.f(BUILD_TAG, "BUILD_TAG");
        jSONObject.put("tag", jVar.a(str, BUILD_TAG));
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193107c;
        java.lang.String TIME = lp0.a.f320251e;
        kotlin.jvm.internal.o.f(TIME, "TIME");
        jSONObject.put("time", jVar.a(str2, TIME));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "send data: ".concat(jSONObject2));
        oVar.d(jSONObject2);
    }

    public final void c(org.json.JSONObject cmd, boolean z17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(cmd, "cmd");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("cmd", "result");
        jSONObject.put("opcmd", cmd);
        jSONObject.put("result", z17);
        jSONObject.put("errMsg", errMsg);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mars.xlog.Log.i("LiteAppTestService", "send data: ".concat(jSONObject2));
        d(jSONObject2);
    }

    public final void d(java.lang.String message) {
        if (f361055e) {
            com.tencent.mars.xlog.Log.i("LiteAppTestService", "websocket sendStr: " + message + ": connectId : " + f361057g);
            xp5.f fVar = f361056f;
            if (fVar != null) {
                long j17 = f361057g;
                kotlin.jvm.internal.o.g(message, "message");
                fVar.f455968b.sendTextMessage(j17, message);
                return;
            }
            return;
        }
        jz5.l lVar = f361052b;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("LiteAppTestService", "no socket");
            return;
        }
        kotlin.jvm.internal.o.d(lVar);
        java.lang.String str = (java.lang.String) lVar.f302833d;
        jz5.l lVar2 = f361052b;
        kotlin.jvm.internal.o.d(lVar2);
        int intValue = ((java.lang.Number) lVar2.f302834e).intValue();
        byte[] bytes = message.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        com.tencent.websocket.WcWss.sendBuffer(str, intValue, bytes, true);
    }
}
