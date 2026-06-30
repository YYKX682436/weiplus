package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes14.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.x2 f143805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f143806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.lite.jsapi.comms.x2 x2Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        super(1);
        this.f143805d = x2Var;
        this.f143806e = h0Var;
        this.f143807f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.kp0 result = (bw5.kp0) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String str = this.f143807f;
        boolean b17 = kotlin.jvm.internal.o.b(str, "cover");
        boolean[] zArr = result.f29467n;
        com.tencent.mm.plugin.lite.jsapi.comms.x2 x2Var = this.f143805d;
        kotlin.jvm.internal.h0 h0Var = this.f143806e;
        if (b17) {
            bw5.rq0 rq0Var = zArr[3] ? result.f29462f : new bw5.rq0();
            kotlin.jvm.internal.o.f(rq0Var, "getCoverColor(...)");
            h0Var.f310123d = com.tencent.mm.plugin.lite.jsapi.comms.x2.A(x2Var, rq0Var);
        } else if (kotlin.jvm.internal.o.b(str, "playerbg")) {
            bw5.rq0 rq0Var2 = zArr[4] ? result.f29463g : new bw5.rq0();
            kotlin.jvm.internal.o.f(rq0Var2, "getPlayerBackgroundColor(...)");
            h0Var.f310123d = com.tencent.mm.plugin.lite.jsapi.comms.x2.A(x2Var, rq0Var2);
        } else if (kotlin.jvm.internal.o.b(str, "minibar")) {
            bw5.rq0 rq0Var3 = zArr[5] ? result.f29464h : new bw5.rq0();
            kotlin.jvm.internal.o.f(rq0Var3, "getMinibarColor(...)");
            h0Var.f310123d = com.tencent.mm.plugin.lite.jsapi.comms.x2.A(x2Var, rq0Var3);
        } else if (kotlin.jvm.internal.o.b(str, "link")) {
            bw5.rq0 rq0Var4 = zArr[6] ? result.f29465i : new bw5.rq0();
            kotlin.jvm.internal.o.f(rq0Var4, "getLinkColor(...)");
            h0Var.f310123d = com.tencent.mm.plugin.lite.jsapi.comms.x2.A(x2Var, rq0Var4);
        } else {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiGetThemeColorForImage", "do not support this scene now! scene: %s", str);
        }
        java.lang.String str2 = com.tencent.mm.plugin.lite.jsapi.comms.x2.f143823g;
        x2Var.f143443f.b(kz5.b1.e(new jz5.l("color", h0Var.f310123d)));
        return jz5.f0.f302826a;
    }
}
