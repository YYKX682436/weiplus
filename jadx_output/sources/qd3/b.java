package qd3;

/* loaded from: classes.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.tencent.mm.plugin.appbrand.jsapi.z7.NAME;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("phoneNumber");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            s().invoke(h(-1, "no number"));
            return;
        }
        lc3.e eVar = this.f317890a;
        android.app.Activity B0 = eVar != null ? eVar.B0() : null;
        if (B0 == null) {
            s().invoke(h(-2, "ui lost"));
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
            intent.setData(android.net.Uri.parse("tel:" + android.net.Uri.encode(optString)));
            nf.g.a(B0).j(intent, new qd3.a(this));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiMakePhoneCall", "startActivity failed");
            s().invoke(h(-3, "call system ui fail"));
        }
    }
}
