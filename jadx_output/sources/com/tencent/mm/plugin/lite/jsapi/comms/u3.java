package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public final class u3 implements l41.j2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f143796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.v3 f143797b;

    public u3(com.tencent.mm.plugin.lite.jsapi.comms.v3 v3Var) {
        this.f143797b = v3Var;
    }

    @Override // l41.j2
    public void a(android.os.Bundle bundle) {
        int i17;
        if (bundle != null && (i17 = bundle.getInt("result_key_action", -1)) >= 0) {
            int i18 = bundle.getInt("result_key_err_code", -1);
            java.lang.String string = bundle.getString("result_key_err_msg", "");
            com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "openCustomerServiceChat onReceiveResult action: " + i17 + ", errCode: " + i18 + ", errMsg: " + string);
            if (i17 != 3) {
                if (i17 != 5) {
                    this.f143797b.f143443f.a(string);
                    return;
                } else {
                    this.f143796a = true;
                    return;
                }
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.lite.jsapi.comms.t3 t3Var = new com.tencent.mm.plugin.lite.jsapi.comms.t3(this.f143797b);
            long j17 = this.f143796a ? 0L : 1000L;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(t3Var, j17, false);
        }
    }
}
