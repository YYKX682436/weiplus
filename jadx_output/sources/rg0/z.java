package rg0;

/* loaded from: classes9.dex */
public final class z extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f395203d;

    public z() {
        super(0);
        this.f395203d = "{}";
    }

    public final void b(boolean z17, boolean z18, java.lang.String str) {
        try {
            if (kotlin.jvm.internal.o.b(str, "FinishUUID") && z18 && z17) {
                ((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Ui();
            }
            java.lang.String valueOf = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.M("pay_usecase").getString("currentstate", ""));
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_exec_secliteapp, true)) {
                rg0.t tVar = rg0.t.f395191a;
                if (tVar.g() && tVar.h() && rg0.d0.f395168a.b(valueOf)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    pg0.l3 l3Var = (pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class));
                    float Ni = l3Var.Ni();
                    java.lang.String valueOf2 = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.M("pay_keyboard_security_setting").getString("kv_pwd_keyboard_click_btn_pressure", ""));
                    java.lang.String valueOf3 = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.M("pay_keyboard_security_setting").getString("kv_pwd_keyboard_click_btn_clicktime", ""));
                    java.lang.String valueOf4 = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.M("pay_keyboard_security_setting").getString("kv_pwd_keyboard_click_btn_size", ""));
                    boolean wi6 = l3Var.wi();
                    java.lang.String valueOf5 = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.M("pay_usecase").getString("pristate", ""));
                    boolean Bi = l3Var.Bi();
                    boolean Ai = l3Var.Ai();
                    jSONObject.put("PriState", valueOf5);
                    jSONObject.put("CurrentState", valueOf);
                    jSONObject.put("ScreenBrightness", java.lang.Float.valueOf(Ni));
                    jSONObject.put("PayPwdKeyboardPressure", valueOf2);
                    jSONObject.put("PayPwdKeyboardTime", valueOf3);
                    jSONObject.put("PayPwdKeyboardSize", valueOf4);
                    jSONObject.put("VoipStatus", Bi);
                    jSONObject.put("VpnStatus", Ai);
                    jSONObject.put("ScreenShareStatus", wi6);
                    jSONObject.put("DeviceID", wo.w0.k());
                    jSONObject.put("DeviceUUID", c());
                    jSONObject.put("IsHonor", z17);
                    if (z18 && z17) {
                        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new rg0.y(this, null), 2, null);
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(this.f395203d);
                        jSONObject2.put("HonorTouchResult", java.lang.Float.valueOf(((pg0.l3) ((qg0.e0) i95.n0.c(qg0.e0.class))).Di()));
                        jSONObject.put("HonorSecInfo", jSONObject2);
                    }
                    tVar.e(0, valueOf, jSONObject);
                    new vs4.a(valueOf, jSONObject.toString()).l().K(rg0.w.f395199a);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SecinfoOnKindaNotifyEventListener", e17, "doReportClientInfo error", new java.lang.Object[0]);
        }
    }

    public final java.lang.String c() {
        boolean z17 = true;
        if (rg0.a0.f395160b.length() == 0) {
            try {
                java.lang.String k17 = wo.w0.k();
                if (k17.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.w("SecinfoOnKindaNotifyEventListener", "getMMDeviceId is null or empty");
                    return "";
                }
                java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                byte[] bytes = k17.getBytes(UTF_8);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bytes);
                b17.f(16);
                java.lang.String b18 = ot5.e.b(b17.g());
                if (b18 == null) {
                    b18 = "";
                }
                rg0.a0.f395160b = b18;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("SecinfoOnKindaNotifyEventListener", e17, "getDeviceUUID error", new java.lang.Object[0]);
                rg0.a0.f395160b = "";
            }
        }
        return rg0.a0.f395160b;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00c6 A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:90:0x004b, B:94:0x0069, B:95:0x0074, B:99:0x0099, B:101:0x009d, B:102:0x00aa, B:104:0x00ba, B:109:0x00c6, B:110:0x00e6, B:112:0x00ec, B:117:0x00fe, B:123:0x0102, B:125:0x0108, B:127:0x0110, B:129:0x0116, B:131:0x011b, B:134:0x008f), top: B:89:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0116 A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:90:0x004b, B:94:0x0069, B:95:0x0074, B:99:0x0099, B:101:0x009d, B:102:0x00aa, B:104:0x00ba, B:109:0x00c6, B:110:0x00e6, B:112:0x00ec, B:117:0x00fe, B:123:0x0102, B:125:0x0108, B:127:0x0110, B:129:0x0116, B:131:0x011b, B:134:0x008f), top: B:89:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x011b A[Catch: Exception -> 0x0123, TRY_LEAVE, TryCatch #0 {Exception -> 0x0123, blocks: (B:90:0x004b, B:94:0x0069, B:95:0x0074, B:99:0x0099, B:101:0x009d, B:102:0x00aa, B:104:0x00ba, B:109:0x00c6, B:110:0x00e6, B:112:0x00ec, B:117:0x00fe, B:123:0x0102, B:125:0x0108, B:127:0x0110, B:129:0x0116, B:131:0x011b, B:134:0x008f), top: B:89:0x004b }] */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r22) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rg0.z.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    public final void f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String valueOf = java.lang.String.valueOf(com.tencent.mm.sdk.platformtools.o4.M("pay_usecase").getString("currentstate", ""));
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("pay_usecase");
        if (M != null) {
            M.D("pristate", valueOf);
        }
        com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("pay_usecase");
        if (M2 != null) {
            M2.D("currentstate", url);
        }
    }
}
