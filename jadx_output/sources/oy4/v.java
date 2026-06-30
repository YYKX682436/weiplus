package oy4;

@j95.b
/* loaded from: classes5.dex */
public final class v extends i95.w implements dk0.i, qk.u7 {

    /* renamed from: d, reason: collision with root package name */
    public static ny4.f f350081d;

    public float[] wi(float[] data, java.lang.String path) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(path, "path");
        long nInit = com.tencent.mm.xeffect.WeAudioCls.nInit(path, 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FeatureApiImpl", "getMusicRecResult init ret " + nInit);
        if (nInit != 0) {
            float[] nApply = com.tencent.mm.xeffect.WeAudioCls.nApply(nInit, data);
            com.tencent.mm.xeffect.WeAudioCls.nRelease(nInit);
            return nApply;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ret", nInit);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(31890, "MusicRec", 8, jSONObject2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return new float[0];
    }
}
