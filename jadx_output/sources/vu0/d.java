package vu0;

/* loaded from: classes5.dex */
public final class d implements com.tencent.maas.speech.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0.k f440063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ru0.g f440065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f440066d;

    public d(vu0.k kVar, java.lang.String str, ru0.g gVar, boolean z17) {
        this.f440063a = kVar;
        this.f440064b = str;
        this.f440065c = gVar;
        this.f440066d = z17;
    }

    @Override // com.tencent.maas.speech.d
    public final void a(java.nio.ByteBuffer byteBuffer, com.tencent.maas.instamovie.base.MJError mJError, int i17, int i18) {
        org.json.JSONObject a17 = vu0.k.a(this.f440063a, this.f440064b, byteBuffer, mJError, i17, i18);
        if (a17 != null) {
            java.lang.String str = this.f440065c.f399670a;
            vu0.k kVar = this.f440063a;
            kVar.getClass();
            int optInt = a17.optInt("ack_seq");
            java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) kVar.f440112g).get(str);
            vu0.h hVar = kVar.f440110e;
            if (num != null && optInt == num.intValue()) {
                hVar.c(str, vu0.u.f440163h);
            }
            org.json.JSONArray optJSONArray = a17.optJSONArray("results");
            org.json.JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(0) : null;
            org.json.JSONArray optJSONArray2 = a17.optJSONArray("vad_speak_ts");
            boolean optBoolean = a17.optBoolean("is_final");
            if (!optBoolean && (optJSONObject == null || optJSONArray2 == null)) {
                com.tencent.mars.xlog.Log.e("AudioRecognitionService", "parseStreamResponseData: results == null isFinal false");
                return;
            }
            java.util.List a18 = optJSONObject != null ? ru0.a.a(optJSONObject, true) : kz5.p0.f313996d;
            a18.toString();
            hVar.b(str, a18, optBoolean, this.f440066d);
        }
    }
}
