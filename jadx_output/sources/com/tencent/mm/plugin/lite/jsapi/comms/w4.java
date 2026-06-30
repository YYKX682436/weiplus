package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.x4 f143819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.tencent.mm.plugin.lite.jsapi.comms.x4 x4Var) {
        super(1);
        this.f143819d = x4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiPlatformViewTapEvent", "tapEvent ret: " + map);
        jd.c cVar = this.f143819d.f143442e;
        java.util.Map t17 = map != null ? kz5.c1.t(map) : null;
        kotlin.jvm.internal.o.e(t17, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
        java.util.Map c17 = kotlin.jvm.internal.m0.c(t17);
        if (c17 == null) {
            c17 = new java.util.LinkedHashMap();
        }
        cVar.e(c17);
        return jz5.f0.f302826a;
    }
}
