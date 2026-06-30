package ik2;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static long f291853b;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f291857f;

    /* renamed from: a, reason: collision with root package name */
    public static final ik2.b f291852a = new ik2.b();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f291854c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f291855d = jz5.h.b(ik2.a.f291851d);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f291856e = "FinderMagicLiveCardTestConfigKey";

    public final java.lang.String a() {
        java.lang.String str;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_live_game_dynamic_frame_set_data, "", true);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetDataLoader", "exptGameFrameSetData:%s", Zi);
        if (android.text.TextUtils.isEmpty(Zi)) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt(dm.i4.COL_ID, "portrait_game_ai_interpreter");
            jSONObject.putOpt("parentId", "game_player_frame_set_container");
            jSONObject.putOpt("portrait", 1);
            jSONObject.putOpt("bit", 0);
            jSONObject.putOpt("marginRight", 12);
            jSONObject.putOpt("marginBottom", 4);
            jSONObject.putOpt("width", 84);
            jSONObject.putOpt("height", 20);
            jSONObject.putOpt("alignParentRight", 1);
            jSONObject.putOpt("alignParentBottom", 1);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            str = "";
            jSONObject2.putOpt(dm.i4.COL_ID, "landscape_game_bottom_right");
            jSONObject2.putOpt("parentId", "game_player_frame_set_container");
            jSONObject2.putOpt("landscape", 1);
            jSONObject2.putOpt("clearScreen", 1);
            jSONObject2.putOpt("bit", 3);
            jSONObject2.putOpt("marginRight", 24);
            jSONObject2.putOpt("marginBottom", 90);
            jSONObject2.putOpt("width", 136);
            jSONObject2.putOpt("height", 115);
            jSONObject2.putOpt("alignParentRight", 1);
            jSONObject2.putOpt("alignParentBottom", 1);
            jSONArray.put(jSONObject);
            jSONArray.put(jSONObject2);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetDataLoader", "loadDefaultConfig:%s", jSONArray.toString());
            Zi = jSONArray.toString();
            kotlin.jvm.internal.o.f(Zi, "toString(...)");
        } else {
            str = "";
        }
        if (zl2.q4.f473933a.E()) {
            java.lang.String u17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f291855d).getValue()).u(f291856e, str);
            kotlin.jvm.internal.o.d(u17);
            if (u17.length() == 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetDataLoader", "debugMode exptGameFrameSetData null");
            } else {
                f291857f = true;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveFrameSetDataLoader", "debugMode exptGameFrameSetData not null:".concat(u17));
                Zi = u17;
            }
        }
        kotlin.jvm.internal.o.d(Zi);
        return Zi;
    }
}
