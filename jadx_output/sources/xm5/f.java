package xm5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final xm5.f f455400a = new xm5.f();

    public final java.lang.String a(rm5.q outputConfig) {
        kotlin.jvm.internal.o.g(outputConfig, "outputConfig");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("targetSize", outputConfig.f397536a.toString());
        jSONObject.put("videoBitrate", outputConfig.f397537b);
        jSONObject.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, outputConfig.f397538c);
        jSONObject.put("iFrameInterval", outputConfig.f397539d);
        jSONObject.put("audioBitrate", outputConfig.f397540e);
        jSONObject.put("audioSampleRate", outputConfig.f397541f);
        jSONObject.put("audioChannelCount", outputConfig.f397542g);
        jSONObject.put("highProfileEnable", outputConfig.f397543h);
        jSONObject.put("limitProfileLevelEnable", outputConfig.f397544i);
        jSONObject.put("aacEncodeNeedCodecSpecificData", outputConfig.f397545j);
        jSONObject.put("outputHevc", outputConfig.f397546k);
        jSONObject.put("suggestParallelCount", outputConfig.f397547l);
        android.util.Size size = outputConfig.f397548m;
        jSONObject.put("renderSize", size != null ? size.toString() : null);
        jSONObject.put("colorRange", outputConfig.f397549n);
        jSONObject.put("colorStandard", outputConfig.f397550o);
        jSONObject.put("colorTransfer", outputConfig.f397551p);
        jSONObject.put("correctSizeByCodecCapabilities", outputConfig.f397552q);
        jSONObject.put("checkFrameProcessTimeout", outputConfig.f397553r);
        jSONObject.put("timeoutInterruptWork", outputConfig.f397554s);
        jSONObject.put("maxTimeoutMs", outputConfig.f397555t);
        jSONObject.put("optimizedVideoFrameSamplingEnable", outputConfig.f397556u);
        jSONObject.put("newTextureBlittingEnable", outputConfig.f397557v);
        jSONObject.put("minMuxDuration", outputConfig.f397558w);
        jSONObject.put("minMuxFrameCount", outputConfig.f397559x);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
