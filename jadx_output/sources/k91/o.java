package k91;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305697a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f305698b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f305699c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f305700d;

    public o(org.json.JSONObject jSONObject) {
        this.f305697a = jSONObject.optString("pagePath");
        this.f305698b = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        this.f305699c = jSONObject.optString("iconData");
        this.f305700d = jSONObject.optString("selectedIconData");
    }
}
