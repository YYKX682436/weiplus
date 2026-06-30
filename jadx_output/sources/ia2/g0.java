package ia2;

/* loaded from: classes2.dex */
public final class g0 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ia2.n0 f289924a;

    public g0(ia2.n0 n0Var) {
        this.f289924a = n0Var;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        ia2.g0 g0Var;
        org.json.JSONObject jSONObject2;
        java.lang.String str;
        long j17;
        long j18;
        long j19;
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        if (!z17) {
            com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "openBizPublishWithImage failed, err_msg: %s, extraInfo: %s", err_msg, jSONObject);
            return;
        }
        if (kotlin.jvm.internal.o.b(jSONObject != null ? java.lang.Boolean.valueOf(jSONObject.optBoolean(ya.b.SUCCESS, false)) : null, java.lang.Boolean.FALSE)) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("coverInfo") : null;
        com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "openBizPublishWithImage success extraInfo: %s", jSONObject);
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject("poiInfo");
            g0Var = this;
        } else {
            g0Var = this;
            jSONObject2 = null;
        }
        ia2.n0 n0Var = g0Var.f289924a;
        if (!kotlin.jvm.internal.o.b(n0Var.f289966t, jSONObject2 != null ? jSONObject2.optString("poiid") : null)) {
            com.tencent.mars.xlog.Log.w("FinderPOIPlugin", "openBizPublishWithImage ret: poiId not match");
            return;
        }
        long j27 = 0;
        java.lang.String str2 = "";
        if (optJSONArray != null) {
            if (optJSONArray.length() > 0) {
                str2 = optJSONArray.optJSONObject(0).optString("cdn_url");
                kotlin.jvm.internal.o.f(str2, "optString(...)");
                j27 = optJSONArray.optJSONObject(0).optLong("width");
                j19 = optJSONArray.optJSONObject(0).optLong("height");
            } else {
                j19 = 0;
            }
            str = str2;
            j18 = j19;
            j17 = j27;
        } else {
            str = "";
            j17 = 0;
            j18 = 0;
        }
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = jSONObject.optString("nickname");
        java.lang.String optString3 = jSONObject.optString("avatar");
        java.lang.String optString4 = jSONObject.optString("url");
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString2);
        kotlin.jvm.internal.o.d(optString3);
        com.tencent.pigeon.finder.PublishedMpPoiProfileData publishedMpPoiProfileData = new com.tencent.pigeon.finder.PublishedMpPoiProfileData(str, j17, j18, optString, optString2, optString3);
        bw5.li0 li0Var = new bw5.li0();
        li0Var.f29795d = optString4;
        boolean[] zArr = li0Var.f29797f;
        zArr[1] = true;
        li0Var.f29796e = bw5.dr.FinderMpFeedTypeNewPublished;
        zArr[2] = true;
        java.util.Map map = n0Var.f289967u;
        if (map.size() >= 2) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(bw5.sf.FinderFeedTabTypeRecommend);
            if (list != null) {
                list.add(li0Var);
            }
            java.util.List list2 = (java.util.List) ((java.util.LinkedHashMap) map).get(bw5.sf.FinderFeedTabTypeLatest);
            if (list2 != null) {
                list2.add(li0Var);
            }
        }
        com.tencent.pigeon.finder.POIFlutterAPI pOIFlutterAPI = n0Var.f289955f;
        if (pOIFlutterAPI != null) {
            pOIFlutterAPI.insertMpPoiStream(publishedMpPoiProfileData, ia2.q0.a("insertMpPoiStream"));
        }
    }
}
