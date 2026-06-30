package ee3;

/* loaded from: classes7.dex */
public class o implements ee3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc3.x0 f251644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ee3.p f251645c;

    public o(ee3.p pVar, java.lang.String str, jc3.x0 x0Var) {
        this.f251645c = pVar;
        this.f251643a = str;
        this.f251644b = x0Var;
    }

    @Override // ee3.e
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.util.Map map) {
        this.f251645c.e(this.f251643a);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("mimeType", str2 == null ? com.eclipsesource.mmv8.Platform.UNKNOWN : str2);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME, str);
        hashMap.put("statusCode", java.lang.Integer.valueOf(i17));
        hashMap.put("dataLength", java.lang.Long.valueOf(j17));
        this.f251644b.a(0, "ok", null, null, hashMap, map, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkDownload", "download success! filename %s, url %s", str, str3);
    }

    @Override // ee3.e
    public void c(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkDownload", "download start! filename %s, url %s", str, str2);
    }

    @Override // ee3.e
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushNetworkDownload", "download error! errorMessage:%s, filename %s, url %s", str3, str, str2);
        this.f251645c.e(this.f251643a);
        this.f251644b.c(i17, str3, null, null);
    }

    @Override // ee3.e
    public void e(java.lang.String str) {
        this.f251645c.f251650e.remove(str);
    }

    @Override // ee3.e
    public void f(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
        this.f251644b.d(i17, j17, j18);
    }

    @Override // ee3.e
    public void g(org.json.JSONObject jSONObject, int i17) {
        this.f251644b.b(jSONObject, i17);
    }
}
