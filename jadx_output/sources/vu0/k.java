package vu0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.s0 f440106a;

    /* renamed from: b, reason: collision with root package name */
    public final vu0.c f440107b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.speech.MJILinkAppRequest f440108c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f440109d;

    /* renamed from: e, reason: collision with root package name */
    public final vu0.h f440110e;

    /* renamed from: f, reason: collision with root package name */
    public ru0.g f440111f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f440112g;

    public k(pp0.s0 s0Var, vu0.c requestListener) {
        kotlin.jvm.internal.o.g(requestListener, "requestListener");
        this.f440106a = s0Var;
        this.f440107b = requestListener;
        com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest = new com.tencent.maas.speech.MJILinkAppRequest();
        java.util.HashSet hashSet = mJILinkAppRequest.f48559h;
        hashSet.add("commandID");
        mJILinkAppRequest.f48552a = 4502;
        hashSet.add("URL");
        mJILinkAppRequest.f48554c = "/ilink/ilinkapp/maas/materials/list";
        hashSet.add("timeoutMillis");
        mJILinkAppRequest.f48553b = 10000;
        hashSet.add("retryCount");
        mJILinkAppRequest.f48555d = 0;
        hashSet.add("limitFlow");
        mJILinkAppRequest.f48556e = false;
        hashSet.add("limitFrequency");
        mJILinkAppRequest.f48557f = false;
        this.f440108c = mJILinkAppRequest;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result_type", "1");
        hashMap.put("max_result_count", "1");
        hashMap.put("interim_results", "1");
        hashMap.put("stable_results", "1");
        hashMap.put("voice_file_type", "1");
        hashMap.put("voice_encode_type", "1");
        this.f440109d = hashMap;
        this.f440110e = new vu0.h(this);
        this.f440112g = new java.util.LinkedHashMap();
    }

    public static final org.json.JSONObject a(vu0.k kVar, java.lang.String str, java.nio.ByteBuffer byteBuffer, com.tencent.maas.instamovie.base.MJError mJError, int i17, int i18) {
        java.lang.Object m521constructorimpl;
        vu0.h hVar = kVar.f440110e;
        if (byteBuffer == null) {
            com.tencent.mars.xlog.Log.e("AudioRecognitionService", "parseResponse2Json: responseData == null");
            hVar.c(str, vu0.u.f440164i);
            return null;
        }
        x36.o oVar = x36.o.f451695g;
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        x36.o oVar2 = new x36.o(bArr);
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
        kotlin.jvm.internal.o.f(forName, "forName(...)");
        java.lang.String str2 = new java.lang.String(oVar2.f451699f, forName);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(new org.json.JSONObject(str2));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("AudioRecognitionService", "parseResponse2Json: utf8 " + str2 + ' ' + m524exceptionOrNullimpl + " requestId " + str);
            hVar.c(str, vu0.u.f440164i);
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) m521constructorimpl;
        if (jSONObject == null) {
            return null;
        }
        jSONObject.toString();
        int optInt = jSONObject.optInt("ret", -1);
        com.tencent.mars.xlog.Log.i("AudioRecognitionService", "parseResponse2Json: response ret = " + optInt);
        if (optInt == 0 || optInt == 30604) {
            return jSONObject;
        }
        hVar.c(str, vu0.u.f440164i);
        return null;
    }
}
