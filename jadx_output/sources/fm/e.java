package fm;

/* loaded from: classes10.dex */
public final class e implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f263980e;

    public e(java.lang.String str, v65.n nVar) {
        this.f263979d = str;
        this.f263980e = nVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#downloadUrlRes user-direct cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        sb6.append(", progress: ");
        sb6.append(gVar);
        com.tencent.mars.xlog.Log.i("BaseStringResFeatureService", sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.field_retCode;
        v65.n nVar = this.f263980e;
        if (i18 == 0) {
            boolean j17 = com.tencent.mm.vfs.w6.j(this.f263979d);
            com.tencent.mars.xlog.Log.i("BaseStringResFeatureService", "#downloadUrlRes user-direct success, fileExist:" + j17);
            if (j17) {
                nVar.a(new fm.b(true, 0, ""));
            }
        } else {
            com.tencent.mars.xlog.Log.i("BaseStringResFeatureService", "#downloadUrlRes user-direct failed, " + hVar.field_retCode);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("httpCode", hVar.field_httpStatusCode);
            jSONObject.put("responseHeader", hVar.field_httpResponseHeader);
            jSONObject.put("serverIp", hVar.field_serverIP);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            nVar.a(new fm.b(false, hVar.field_retCode, r26.i0.t(jSONObject2, ",", ";", false)));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
