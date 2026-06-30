package dk2;

/* loaded from: classes10.dex */
public final class u9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.ca f234202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234205g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f234206h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dn.h f234207i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f234208m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(dk2.ca caVar, java.lang.String str, int i17, java.lang.String str2, yz5.l lVar, dn.h hVar, yz5.l lVar2) {
        super(0);
        this.f234202d = caVar;
        this.f234203e = str;
        this.f234204f = i17;
        this.f234205g = str2;
        this.f234206h = lVar;
        this.f234207i = hVar;
        this.f234208m = lVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.ca caVar = this.f234202d;
        java.util.Map map = caVar.f233292b;
        java.lang.String str = this.f234203e;
        if (map.containsKey(str)) {
            int i17 = this.f234204f;
            if (i17 == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadSuccess, mediaId: ");
                sb6.append(str);
                sb6.append(", path: ");
                java.lang.String str2 = this.f234205g;
                sb6.append(str2);
                com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", sb6.toString());
                if (str == null) {
                    str = "";
                }
                caVar.a(str);
                this.f234206h.invoke(str2);
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("download failed, mediaId: ");
                sb7.append(str);
                sb7.append(", ret: ");
                sb7.append(i17);
                sb7.append(", sceneResult: ");
                dn.h hVar = this.f234207i;
                sb7.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
                com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayDownloadManager", sb7.toString());
                if (str == null) {
                    str = "";
                }
                caVar.a(str);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Download failed: ret=");
                sb8.append(i17);
                sb8.append(", sceneRetCode=");
                sb8.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
                this.f234208m.invoke(sb8.toString());
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "onFinish, task not exists. mediaId: " + str);
        }
        return jz5.f0.f302826a;
    }
}
