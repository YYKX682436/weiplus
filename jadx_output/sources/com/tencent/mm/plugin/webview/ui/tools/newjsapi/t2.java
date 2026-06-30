package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class t2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186536b;

    public t2(nw4.k kVar, nw4.y2 y2Var) {
        this.f186535a = kVar;
        this.f186536b = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.stubs.logger.Log.i("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "onGYNetEnd errType :" + i17 + " errCode: " + i18 + " errMsg :" + str);
        nw4.k kVar = this.f186535a;
        nw4.y2 y2Var = this.f186536b;
        if (i17 != 0 || i18 != 0 || oVar.f70711b.f70700a == null) {
            com.tencent.stubs.logger.Log.e("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi failed");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_desc", "server system error");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", hashMap);
            return;
        }
        com.tencent.stubs.logger.Log.i("MicroMsg.JsApiH5NativeWXPayCgiTunnel", "nativeWXPayCgiTunnel cgi success");
        og0.m mVar = (og0.m) i95.n0.c(og0.m.class);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        ((ng0.m) mVar).getClass();
        java.lang.String str2 = ((r45.hy5) fVar).f376556d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        kotlin.jvm.internal.o.d(str2);
        hashMap2.put("respbuf", str2);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap2);
    }
}
