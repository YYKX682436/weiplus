package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes15.dex */
public class y1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185550g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185551h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f185552i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185553m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185554n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185555o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185556p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185557q;

    public y1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, boolean z17, nw4.y2 y2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Bundle bundle, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f185557q = c1Var;
        this.f185547d = z17;
        this.f185548e = y2Var;
        this.f185549f = str;
        this.f185550g = str2;
        this.f185551h = str3;
        this.f185552i = bundle;
        this.f185553m = str4;
        this.f185554n = str5;
        this.f185555o = str6;
        this.f185556p = str7;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "launchApplication check result errType:%d errCode:%d msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        p95.a.a(new com.tencent.mm.plugin.webview.ui.tools.jsapi.x1(this, i17, i18, oVar));
        return 0;
    }
}
