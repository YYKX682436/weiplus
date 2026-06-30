package ee3;

/* loaded from: classes7.dex */
public class l implements ee3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc3.x0 f251634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ee3.m f251635c;

    public l(ee3.m mVar, java.lang.String str, jc3.x0 x0Var) {
        this.f251635c = mVar;
        this.f251633a = str;
        this.f251634b = x0Var;
    }

    @Override // ee3.e
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.util.Map map) {
        this.f251635c.e(this.f251633a);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("mimeType", str2);
        hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME, str);
        hashMap.put("dataLength", java.lang.Long.valueOf(j17));
        this.f251634b.a(0, "ok", null, null, hashMap, map, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "download success! filename %s, url %s", str, str3);
    }

    @Override // ee3.e
    public void c(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "download start! filename %s, url %s", str, str2);
    }

    @Override // ee3.e
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicBrushNetworkCDNDownload", "download error! errorMessage:%s, filename %s, url %s", str3, str, str2);
        this.f251635c.e(this.f251633a);
        this.f251634b.c(i17, str3, null, null);
    }

    @Override // ee3.e
    public void e(java.lang.String str) {
        this.f251635c.f251638c.remove(str);
    }

    @Override // ee3.e
    public void f(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
    }

    @Override // ee3.e
    public void g(org.json.JSONObject jSONObject, int i17) {
    }
}
