package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class p5 extends com.tencent.mm.plugin.webview.ui.tools.jsapi.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.z0 f185337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f185339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185342h;

    public p5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, com.tencent.mm.plugin.webview.stub.z0 z0Var, java.lang.String str2, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, java.lang.String str3, nw4.y2 y2Var) {
        this.f185342h = c1Var;
        this.f185336b = str;
        this.f185337c = z0Var;
        this.f185338d = str2;
        this.f185339e = jsapiPermissionWrapper;
        this.f185340f = str3;
        this.f185341g = y2Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.p, com.tencent.mm.plugin.webview.ui.tools.jsapi.n
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.webview.stub.z0 z0Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (z0Var = this.f185337c) == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_bag_icon", str);
        try {
            z0Var.callback(72, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "withExtInfo remote ex, %s", e17.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    @Override // com.tencent.mm.plugin.webview.ui.tools.jsapi.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.tencent.mm.plugin.webview.ui.tools.jsapi.m r20, java.lang.String r21, java.util.LinkedList r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.jsapi.p5.b(com.tencent.mm.plugin.webview.ui.tools.jsapi.m, java.lang.String, java.util.LinkedList, int, int):void");
    }
}
