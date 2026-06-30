package ss4;

/* loaded from: classes9.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f412096a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f412097b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f412098c;

    /* renamed from: d, reason: collision with root package name */
    public ss4.l0 f412099d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f412100e;

    public static ss4.m0 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ss4.m0 m0Var = new ss4.m0();
        m0Var.f412096a = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        m0Var.f412097b = jSONObject.optString("sub_title");
        m0Var.f412098c = jSONObject.optBoolean("is_lqt_user");
        m0Var.f412100e = jSONObject.optString("lqt_operate_id");
        com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(jSONObject.optString("lqt_trace_info"));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("open_lqt_info");
        if (optJSONObject != null) {
            ss4.l0 l0Var = new ss4.l0();
            m0Var.f412099d = l0Var;
            l0Var.f412088a = optJSONObject.optString("open_info");
            m0Var.f412099d.f412089b = optJSONObject.optString("open_url");
            m0Var.f412099d.f412090c = optJSONObject.optInt("route_type");
            m0Var.f412099d.f412091d = optJSONObject.optString("appname");
        }
        return m0Var;
    }
}
