package xt1;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f456423a;

    /* renamed from: b, reason: collision with root package name */
    public int f456424b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f456425c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456426d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456427e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456428f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456429g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456430h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456431i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f456432j;

    /* renamed from: k, reason: collision with root package name */
    public int f456433k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f456434l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456435m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456436n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f456437o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f456438p;

    public static java.util.LinkedList a(org.json.JSONArray jSONArray, boolean z17) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
            xt1.a aVar = new xt1.a();
            aVar.f456423a = jSONObject.optString("card_tp_id");
            aVar.f456424b = jSONObject.optInt("card_type");
            jSONObject.optString("color");
            aVar.f456425c = jSONObject.optString("logo_url");
            aVar.f456426d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            aVar.f456427e = jSONObject.optString("sub_title");
            aVar.f456428f = jSONObject.optString("aux_title");
            aVar.f456429g = jSONObject.optString("encrypt_code");
            aVar.f456430h = jSONObject.optString("from_user_name");
            aVar.f456431i = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
            jSONObject.optInt("end_time");
            aVar.f456432j = jSONObject.optString("card_user_id");
            aVar.f456433k = jSONObject.optInt("choose_optional");
            aVar.f456435m = jSONObject.optString("invoice_item");
            aVar.f456436n = jSONObject.optString("invoice_status");
            aVar.f456434l = jSONObject.optString("invoice_title");
            aVar.f456437o = z17;
            linkedList.add(aVar);
        }
        return linkedList;
    }
}
