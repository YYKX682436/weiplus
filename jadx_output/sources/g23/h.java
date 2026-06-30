package g23;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f267917a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f267918b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f267919c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f267920d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f267921e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f267922f;

    public h() {
        this.f267917a = false;
        this.f267918b = false;
        this.f267919c = false;
        this.f267922f = false;
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        org.json.JSONObject d17 = su4.o2.d("globalSearchInput");
        this.f267917a = d17.optInt("AIMergeSearch", 0) > 0;
        this.f267918b = d17.optInt("hideSearchBar", 0) > 0;
        this.f267919c = d17.optInt("hideNavBar", 0) > 0;
        d17.optInt("newBtnMode", 0);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(d17.optString("largeInputOption", ""));
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("checkboxes");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        g23.g gVar = new g23.g();
                        gVar.f267914a = optJSONObject.optString("key", "");
                        gVar.f267915b = optJSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(gVar.f267914a) && !com.tencent.mm.sdk.platformtools.t8.K0(gVar.f267915b)) {
                            this.f267920d.add(gVar);
                        }
                    }
                }
            }
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("actionbuttons");
            if (optJSONArray2 != null) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i18);
                    if (optJSONObject2 != null) {
                        g23.f fVar = new g23.f();
                        java.util.List list = fVar.f267913f;
                        fVar.f267908a = optJSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                        fVar.f267909b = optJSONObject2.optString("type", "");
                        fVar.f267910c = optJSONObject2.optString("iconName", "");
                        fVar.f267911d = optJSONObject2.optLong("timeout", 3L);
                        org.json.JSONArray optJSONArray3 = optJSONObject2.optJSONArray("menus");
                        if (optJSONArray3 != null) {
                            for (int i19 = 0; i19 < optJSONArray3.length(); i19++) {
                                org.json.JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i19);
                                if (optJSONObject3 != null) {
                                    g23.i iVar = new g23.i();
                                    iVar.f267923a = optJSONObject3.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                                    iVar.f267924b = optJSONObject3.optString("type", "");
                                    iVar.f267926d = optJSONObject3.optString("liteAppId", "");
                                    iVar.f267925c = optJSONObject3.optString("liteAppPath", "");
                                    iVar.f267929g = optJSONObject3.optString("minVersion", "");
                                    iVar.f267928f = optJSONObject3.optBoolean("isTransparent", false);
                                    iVar.f267927e = optJSONObject3.optJSONObject("liteAppQuery");
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.f267923a) && !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f267924b) && !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f267926d) && !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f267925c) && !com.tencent.mm.sdk.platformtools.t8.K0(iVar.f267929g)) {
                                        if (fVar.f267912e == null) {
                                            fVar.f267912e = iVar;
                                        }
                                        ((java.util.ArrayList) list).add(iVar);
                                    }
                                }
                            }
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(fVar.f267908a) && !com.tencent.mm.sdk.platformtools.t8.K0(fVar.f267909b) && !com.tencent.mm.sdk.platformtools.t8.K0(fVar.f267910c) && !((java.util.ArrayList) list).isEmpty()) {
                            this.f267921e.add(fVar);
                        }
                    }
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSGlobalSearchInputConfig", e17, "", new java.lang.Object[0]);
        }
        this.f267922f = true;
    }
}
