package com.tencent.wechat.aff.function_call;

/* loaded from: classes11.dex */
class ZIDL_JdUMnLr0B extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.function_call.l {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.function_call.m f216884a;

    public ZIDL_JdUMnLr0B(java.lang.Object obj) {
        com.tencent.wechat.aff.function_call.m mVar = (com.tencent.wechat.aff.function_call.m) obj;
        this.f216884a = mVar;
        ((ey.j) mVar).f257276a = this;
    }

    private native void ZIDL_AX(long j17, long j18, byte[] bArr);

    public void ZIDL_AV(long j17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ey.j jVar = (ey.j) this.f216884a;
        jVar.getClass();
        try {
            jVar.a(str.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(str), new ey.i(jVar, j17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FunctionCallBaseImpl", "parse json error " + e17);
            java.lang.String errorMessage = "parse json error: " + e17.getMessage();
            kotlin.jvm.internal.o.g(errorMessage, "errorMessage");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.SUCCESS, false);
            jSONObject.put("error_message", errorMessage);
            com.tencent.wechat.aff.function_call.l lVar = jVar.f257276a;
            if (lVar != null) {
                ((com.tencent.wechat.aff.function_call.ZIDL_JdUMnLr0B) lVar).k1(j17, jSONObject.toString());
            }
        }
    }

    @Override // com.tencent.wechat.aff.function_call.l
    public void k1(long j17, java.lang.String str) {
        ZIDL_AX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
