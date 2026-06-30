package gs4;

/* loaded from: classes9.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f275124a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public r45.rl6 f275125b;

    /* renamed from: c, reason: collision with root package name */
    public r45.rl6 f275126c;

    public static gs4.o a(org.json.JSONObject jSONObject) {
        gs4.o oVar = new gs4.o();
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("extra_labels");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    oVar.f275124a.add(b(optJSONArray.getJSONObject(i17)));
                }
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                oVar.f275125b = d(optJSONObject);
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
            if (optJSONObject2 != null) {
                oVar.f275126c = d(optJSONObject2);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayPayManager", " PayManageExtraSectionsData dcreateFromJSONObject Exception:%s", e17.getMessage());
        }
        return oVar;
    }

    public static at4.m1 b(org.json.JSONObject jSONObject) {
        at4.m1 m1Var = new at4.m1();
        if (jSONObject != null) {
            m1Var.field_is_show = jSONObject.optInt("show_label", 0);
            java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            m1Var.field_pref_title = optString;
            m1Var.field_pref_key = optString;
            m1Var.field_pref_desc = jSONObject.optString("desc");
            m1Var.field_logo_url = jSONObject.optString("logo_url");
            m1Var.field_jump_type = jSONObject.optInt("jump_type");
            m1Var.field_pref_url = jSONObject.optString("jump_h5_url");
            m1Var.field_tinyapp_username = jSONObject.optString("tinyapp_username");
            m1Var.field_tinyapp_path = jSONObject.optString("tinyapp_path");
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0(m1Var.field_pref_key);
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().insert(m1Var);
        }
        return m1Var;
    }

    public static r45.hl6 c(org.json.JSONObject jSONObject) {
        r45.hl6 hl6Var = new r45.hl6();
        if (jSONObject != null) {
            hl6Var.f376271d = jSONObject.optLong("color");
            hl6Var.f376272e = jSONObject.optString("font");
            hl6Var.f376273f = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
            hl6Var.f376274g = (float) jSONObject.optLong("size");
            hl6Var.f376276i = jSONObject.optInt("text_attr");
            hl6Var.f376277m = jSONObject.optString("view_id");
            r45.yt5 yt5Var = new r45.yt5();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("route_info");
            if (optJSONObject != null) {
                yt5Var.f391354d = optJSONObject.optInt("type");
                yt5Var.f391355e = optJSONObject.optString("url");
                r45.nm6 nm6Var = new r45.nm6();
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("tiny_app_uri");
                if (optJSONObject2 != null) {
                    nm6Var.f381518d = optJSONObject2.optString(dm.i4.COL_USERNAME);
                    nm6Var.f381519e = optJSONObject2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                    nm6Var.f381520f = optJSONObject2.optInt("version");
                    yt5Var.f391356f = nm6Var;
                }
            }
            hl6Var.f376275h = yt5Var;
            r45.cg0 cg0Var = new r45.cg0();
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("dynamic_color");
            if (optJSONObject3 != null) {
                cg0Var.f371538d = optJSONObject3.optLong("normal_color");
                cg0Var.f371539e = optJSONObject3.optLong("dark_mode_color");
                hl6Var.f376278n = cg0Var;
            }
        }
        return hl6Var;
    }

    public static r45.rl6 d(org.json.JSONObject jSONObject) {
        r45.rl6 rl6Var = new r45.rl6();
        if (jSONObject != null) {
            rl6Var.f384988e = jSONObject.optString("view_id");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    try {
                        rl6Var.f384987d.add(c(optJSONArray.getJSONObject(i17)));
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneTenpayPayManager", "parseTextViewData Exception:%s", e17.getMessage());
                    }
                }
            }
        }
        return rl6Var;
    }
}
