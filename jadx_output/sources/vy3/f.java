package vy3;

/* loaded from: classes.dex */
public final class f extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.f f441469e = new vy3.f();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("requestId");
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str4 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        if (str4 == null) {
            str4 = "";
        }
        jz5.g gVar = kz3.d.f313872a;
        kz3.a aVar = (kz3.a) kz3.d.f313873b.get(str4);
        if (aVar != null && (str = aVar.f313865b) != null) {
            str3 = str;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str4;
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = aVar != null ? java.lang.Integer.valueOf(aVar.f313866c) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetImageTransData", "ScanJsApi-Call:getImageTransData sessionId: %s, requestId: %s, result: %s, ocrResultType: %s", objArr);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("requestId", str2);
        hashMap.put("json", str3);
        hashMap.put("ocrResultType", java.lang.Integer.valueOf(aVar != null ? aVar.f313866c : -1));
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", hashMap);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getImageTransData";
    }
}
