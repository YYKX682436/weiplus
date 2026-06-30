package iz3;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.s f296086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(iz3.s sVar) {
        super(2);
        this.f296086d = sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.lang.String ocrResult = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(ocrResult, "ocrResult");
        iz3.s sVar = this.f296086d;
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageSceneUploader", "onLocalOcrSuccess session: " + longValue + ", localOcrResult: " + ocrResult);
        ry3.q qVar = new ry3.q();
        qVar.f401543a = longValue;
        qVar.f401544b = true;
        qVar.f401545c = 0;
        qVar.f401546d = 0;
        qVar.f401547e = "";
        jz5.g gVar = kz3.d.f313872a;
        java.lang.String reqKey = "local_" + java.lang.System.currentTimeMillis();
        qVar.f401549g = reqKey;
        kotlin.jvm.internal.o.f(reqKey, "reqKey");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("content", ocrResult);
        jSONObject.put("req_key", reqKey);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        qVar.f401552j = jSONObject2;
        qVar.f401553k = ocrResult.length() == 0;
        qVar.f401554l = 1;
        sVar.c(longValue, qVar, new iz3.o(qVar));
        return jz5.f0.f302826a;
    }
}
