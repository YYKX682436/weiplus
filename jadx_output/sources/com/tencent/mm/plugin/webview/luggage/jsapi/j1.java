package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public final class j1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.luggage.jsapi.j1 f182353d = new com.tencent.mm.plugin.webview.luggage.jsapi.j1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String k17 = wo.w0.k();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(k17);
        nw4.g gVar = env.f340863d;
        if (K0) {
            gVar.e(msg.f341013c, "getOpenDeviceUUID:fail, deviceId is null!", null);
            return true;
        }
        try {
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
            byte[] bytes = k17.getBytes(UTF_8);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bytes);
            b17.f(16);
            java.lang.String str = "#Tencent#Wechat#" + ot5.e.b(b17.g());
            com.tenpay.ndk.WxSmCryptoUtil wxSmCryptoUtil = com.tenpay.ndk.WxSmCryptoUtil.getInstance();
            java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.o.f(UTF_82, "UTF_8");
            byte[] bytes2 = str.getBytes(UTF_82);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            byte[] sm32 = wxSmCryptoUtil.sm3(bytes2);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_msg", "getOpenDeviceUUID:ok");
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(sm32);
            kotlin.jvm.internal.o.f(l17, "encodeHexString(...)");
            hashMap.put("sm3DeviceUUID", l17);
            gVar.e(msg.f341013c, "getOpenDeviceUUID:ok", hashMap);
            return true;
        } catch (java.lang.Exception unused) {
            gVar.e(msg.f341013c, "getOpenDeviceUUID:fail, JSON error!", null);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 511;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getOpenDeviceUUID";
    }
}
