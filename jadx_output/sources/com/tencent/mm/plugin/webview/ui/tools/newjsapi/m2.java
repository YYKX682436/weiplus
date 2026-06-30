package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class m2 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186353a;

    public m2(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186353a = rVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWCCoinBalance", "[WeCoin] getWeCoinBalance onFailed,errorType:" + i17 + ",errorCode:" + i18 + ",msg:" + str);
        com.tencent.mm.ipcinvoker.r rVar = this.f186353a;
        if (rVar != null) {
            rVar.a(null);
        }
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetWCCoinBalance", "[WeCoin] getWeCoinBalance onSuccess,data:" + data.f374585d);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("responseKey", data.toByteArray());
        com.tencent.mm.ipcinvoker.r rVar = this.f186353a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
