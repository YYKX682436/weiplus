package hc3;

/* loaded from: classes9.dex */
public final class b implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f280353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qg0.f0 f280354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qg7 f280355c;

    public b(java.util.Map map, qg0.f0 f0Var, r45.qg7 qg7Var) {
        this.f280353a = map;
        this.f280354b = f0Var;
        this.f280355c = qg7Var;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpAppCancel");
        this.f280353a.put("callback_event", "onJumpAppCancel");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f280353a, 13, false);
        qg0.f0 f0Var = this.f280354b;
        if (f0Var != null) {
            ((v93.c) f0Var).a("user canceled");
        }
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpAppCheckExpose");
        this.f280353a.put("callback_event", "onJumpAppCheckExpose");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f280353a, 13, false);
    }

    @Override // xj.l
    public void onJumpAppFail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpAppFail");
        this.f280353a.put("callback_event", "onJumpAppFail");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f280353a, 13, false);
        qg0.f0 f0Var = this.f280354b;
        if (f0Var != null) {
            ((v93.c) f0Var).a("jump app failed");
        }
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpAppSuccess");
        this.f280353a.put("callback_event", "onJumpAppSuccess");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f280353a, 13, false);
        qg0.f0 f0Var = this.f280354b;
        if (f0Var != null) {
            java.lang.String str = this.f280355c.f383977d;
            v93.c cVar = (v93.c) f0Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsapiOpenYuanbaoGenImage", "open success, token: " + str);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("result", java.lang.Boolean.TRUE);
            hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, "ok");
            if (str == null) {
                str = "";
            }
            hashMap.put("token", str);
            cVar.f434161a.f143443f.b(hashMap);
        }
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        com.tencent.mars.xlog.Log.i("MicroMsg.HongbaoVsYuanBaoLogic", "[goToYuanbaoApp] onJumpDownloadPage");
        this.f280353a.put("callback_event", "onJumpDownloadPage");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("jump_yuanbao_callback", null, this.f280353a, 13, false);
        qg0.f0 f0Var = this.f280354b;
        if (f0Var != null) {
            java.lang.String str = this.f280355c.f383977d;
            v93.c cVar = (v93.c) f0Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsapiOpenYuanbaoGenImage", "open success DownloadPage, token: " + str);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            hashMap.put("result", bool);
            hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_MSG, "ok");
            if (str == null) {
                str = "";
            }
            hashMap.put("token", str);
            hashMap.put("downloadPage", bool);
            cVar.f434161a.f143443f.b(hashMap);
        }
    }
}
