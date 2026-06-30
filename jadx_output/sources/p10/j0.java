package p10;

/* loaded from: classes7.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI f350963d;

    public j0(com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI magicEcsNirvanaUI) {
        this.f350963d = magicEcsNirvanaUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initBizEnv, container post, current activity state, isFinishing: ");
        com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI magicEcsNirvanaUI = this.f350963d;
        sb6.append(magicEcsNirvanaUI.isFinishing());
        sb6.append(", isDestroyed: ");
        sb6.append(magicEcsNirvanaUI.isDestroyed());
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", sb6.toString());
        if (magicEcsNirvanaUI.isFinishing() || magicEcsNirvanaUI.isDestroyed()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "initBizEnv, container post, start send create canvas event");
        magicEcsNirvanaUI.f65837f = true;
        iq0.c cVar = magicEcsNirvanaUI.f65839h;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "initBizEnv, container post, start send create canvas event, bizHandle not null");
            float width = magicEcsNirvanaUI.V6().getWidth();
            bf3.p0 p0Var = bf3.p0.f19645a;
            float a17 = width / p0Var.a();
            float height = r6.getHeight() / p0Var.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaUI", "show, width: " + a17 + ", height: " + height);
            try {
                str2 = magicEcsNirvanaUI.f65845q;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicEcsNirvanaUI", "Failed to parse nativeExtraData as JSON, using original: " + e17);
                str = magicEcsNirvanaUI.f65845q;
                if (str == null) {
                    kotlin.jvm.internal.o.o("nativeExtraData");
                    throw null;
                }
            }
            if (str2 == null) {
                kotlin.jvm.internal.o.o("nativeExtraData");
                throw null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (!jSONObject.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
                jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, java.util.UUID.randomUUID().toString());
            }
            jSONObject.put("isPreloadBiz", cVar.f293646c);
            str = jSONObject.toString();
            java.lang.String str3 = str;
            kotlin.jvm.internal.o.d(str3);
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            java.lang.String str4 = magicEcsNirvanaUI.f65844p;
            if (str4 == null) {
                kotlin.jvm.internal.o.o("initParams");
                throw null;
            }
            ((nq0.p) tVar).Ui(cVar, new com.tencent.mm.feature.ecs.nirvana.mb.jsapi.MBJsEventCreateCanvas(a17, height, 0, 0, str4, str3));
        }
    }
}
