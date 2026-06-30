package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes9.dex */
public class l7 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.m7 f143666a;

    public l7(com.tencent.mm.plugin.lite.jsapi.comms.m7 m7Var) {
        this.f143666a = m7Var;
    }

    @Override // q80.x
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.lite.jsapi.comms.m7 m7Var = this.f143666a;
        if (i17 != 64506) {
            m7Var.getClass();
            com.tencent.mars.xlog.Log.i("LiteAppJsApiSendAppMessage", "onSnsActivityResult receive other code(not $REQ_SNS_SHARE_CODE): $resultCode");
            m7Var.f143442e.b("unknown requestcode");
        } else if (i18 == -1) {
            m7Var.f143442e.d();
        } else if (i18 == 0) {
            m7Var.f143442e.b("cancel");
        } else {
            m7Var.f143442e.b("activity result is invalid, result code: $resultCode");
        }
    }
}
