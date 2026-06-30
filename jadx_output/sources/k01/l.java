package k01;

/* loaded from: classes7.dex */
public final class l implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f303044d;

    /* renamed from: e, reason: collision with root package name */
    public final org.json.JSONObject f303045e;

    public l(java.util.List personalCreatorExtraDataList, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(personalCreatorExtraDataList, "personalCreatorExtraDataList");
        this.f303044d = personalCreatorExtraDataList;
        this.f303045e = jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandProfileNativeExtraData", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // l81.p0
    public java.lang.String a() {
        java.lang.String str;
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (k01.c1 c1Var : this.f303044d) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("mimeType", c1Var.f303010a);
                jSONObject.put("imagePath", c1Var.f303011b);
                jSONObject.put("originImagePath", c1Var.f303012c);
                jSONObject.put("imageWidth", c1Var.f303013d);
                jSONObject.put("imageHeight", c1Var.f303014e);
                jSONObject.put("isLivePhoto", c1Var.f303015f);
                jSONObject.put("livePhotoVideoPath", c1Var.f303016g);
                jSONObject.put("originLivePhotoVideoPath", c1Var.f303017h);
                jSONObject.put("imageName", c1Var.f303018i);
                jSONObject.put("imageSize", c1Var.f303019j);
                jSONObject.put("livePhotoFileName", c1Var.f303020k);
                jSONObject.put("livePhotoFileSize", c1Var.f303021l);
                jSONObject.put("latitude", c1Var.f303022m);
                jSONObject.put("longitude", c1Var.f303023n);
                jSONObject.put("aiPicId", c1Var.f303024o);
                jSONObject.put("aiPicPrompt", c1Var.f303025p);
                jSONObject.put("aiPicSource", c1Var.f303026q);
                jSONObject.put("aiPicTemplateId", c1Var.f303027r);
                jSONObject.put("aiPicDataBuf", c1Var.f303028s);
                jSONObject.put("aiPicStyle", c1Var.f303029t);
                jSONArray.put(jSONObject);
            }
            org.json.JSONObject jSONObject2 = this.f303045e;
            if (jSONObject2 == null) {
                jSONObject2 = new org.json.JSONObject();
            }
            jSONObject2.put("personalCenterPublishPic", jSONArray);
            str = jSONObject2.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandProfileNativeExtraData", "toJsonString fail since " + e17);
            str = "{}";
        }
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    @Override // l81.p0
    public l81.o0 creator() {
        return new k01.m();
    }
}
