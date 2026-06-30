package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/f0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "com/tencent/mm/plugin/lite/jsapi/comms/c0", "com/tencent/mm/plugin/lite/jsapi/comms/d0", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class f0 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.lite.jsapi.comms.c0 f143573g = new com.tencent.mm.plugin.lite.jsapi.comms.c0(null);

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiCompressImage", "fail:data is null");
            this.f143443f.a("fail:data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("src");
        java.lang.String optString2 = jSONObject.optString(dm.i4.COL_LOCALID);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = jSONObject.optString("fileExt");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) && com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiCompressImage", "fail:data localId is null");
            this.f143443f.a("fail:data localId is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str, this.f143442e.f299024a, optString2);
        }
        int optInt = jSONObject.optInt("quality", 80);
        if (optInt < 1 || optInt > 100) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppJsApiCompressImage", "invalid quality %d", java.lang.Integer.valueOf(optInt));
            this.f143443f.a("invalid quality");
            return;
        }
        int optInt2 = jSONObject.optInt("compressedWidth", -1);
        int optInt3 = jSONObject.optInt("compressedHeight", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiCompressImage", "compressImage, quality:%d, src:%s", java.lang.Integer.valueOf(optInt), optString);
        com.tencent.mm.plugin.lite.jsapi.comms.e0 e0Var = new com.tencent.mm.plugin.lite.jsapi.comms.e0(optString, optInt, optInt2, optInt3, h0Var, this);
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "AppBrandJsApiCompressImage[%s#%d]", java.util.Arrays.copyOf(new java.lang.Object[]{optString, java.lang.Integer.valueOf(optInt)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        s75.d.c(e0Var, format, 10);
    }
}
