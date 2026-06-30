package zy3;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f477656a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[][] f477657b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f477658c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f477659d;

    /* renamed from: e, reason: collision with root package name */
    public final zy3.m f477660e;

    /* renamed from: f, reason: collision with root package name */
    public final zy3.j f477661f;

    public k(int i17, int i18, java.lang.String session, byte[] image, int i19, java.lang.String certPem, java.lang.String baseRequest, zy3.j callback) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(certPem, "certPem");
        kotlin.jvm.internal.o.g(baseRequest, "baseRequest");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f477656a = "MicroMsg.HttpSceneBizScanImage";
        this.f477658c = new org.json.JSONObject();
        this.f477659d = new org.json.JSONObject();
        this.f477660e = new zy3.m(null, new zy3.a(null, null, null, null, 0), null);
        byte[][] sm2GenKeyPair = com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm2GenKeyPair();
        kotlin.jvm.internal.o.f(sm2GenKeyPair, "sm2GenKeyPair(...)");
        this.f477657b = sm2GenKeyPair;
        this.f477661f = callback;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        zy3.i iVar = new zy3.i(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.HttpSceneBizScanImage", "startHttpOcr");
        if (2 > sm2GenKeyPair.length || sm2GenKeyPair[0] == null || sm2GenKeyPair[1] == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HttpSceneBizScanImage", "Sm2GenKeyPair.operate,keyPair is illegal");
            ((az3.a) callback).a(3, 10007, "Sm2GenKeyPair.operate,KeyPair is illegal");
            return;
        }
        cronetRequestParams.url = "https://pay.wechatpay.cn/userinformation/wechatregv2/ocrgetbankcardinfo";
        cronetRequestParams.method = "POST";
        cronetRequestParams.taskType = 1;
        hashMap.put("img_data", android.util.Base64.encodeToString(com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm2Encrypt(image, com.tencent.mm.sdk.platformtools.t8.h(certPem)), 2));
        hashMap.put("ocr_type", java.lang.Integer.valueOf(i17));
        hashMap.put(ya.b.SOURCE, java.lang.Integer.valueOf(i18));
        hashMap.put("seq_num", java.lang.Integer.valueOf(i19));
        hashMap.put("session_key", session);
        hashMap.put("client_pub_key", com.tencent.mm.sdk.platformtools.t8.l(sm2GenKeyPair[1]));
        hashMap.put("base_request", new org.json.JSONObject(baseRequest));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        byte[] bytes = jSONObject.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        cronetRequestParams.bodyData = bytes;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("Accept-Encoding", "gzip,compress,br,deflate");
        hashMap2.put("charset", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        hashMap2.put("User-Agent", ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, "", (ik1.k0) nd.f.a(ik1.k0.class)));
        hashMap2.put("Content-Length", java.lang.String.valueOf(cronetRequestParams.bodyData.length));
        cronetRequestParams.makeRequestHeader(hashMap2);
        zy3.h hVar = new zy3.h(cronetRequestParams, iVar);
        zy3.g gVar = new zy3.g(hVar, java.lang.System.currentTimeMillis());
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams2 = hVar.f477654c;
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetHttpTask = com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams2, gVar);
        java.lang.String str = hVar.f477652a;
        if (startCronetHttpTask == null) {
            com.tencent.mars.xlog.Log.e(str, "Http Request,CornetHttpsCreateResult is null");
        } else {
            if (startCronetHttpTask.createRet != 0) {
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "sendCronetRequest prepare to send https request success,requestid:%s,url:%s", startCronetHttpTask.taskId, cronetRequestParams2.url);
        }
    }
}
