package p02;

/* loaded from: classes8.dex */
public class j implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI f350400a;

    public j(com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI downloadSearchUI) {
        this.f350400a = downloadSearchUI;
    }

    @Override // vl1.n
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI downloadSearchUI = this.f350400a;
        java.util.ArrayList arrayList = downloadSearchUI.f97345d.f97341g2.f350398f;
        p02.l lVar = (arrayList == null || i17 < 0 || i17 >= arrayList.size()) ? null : (p02.l) arrayList.get(i17);
        if (lVar == null) {
            return;
        }
        int i18 = lVar.f350403a;
        if (i18 != 2) {
            if (i18 == 3) {
                downloadSearchUI.f97345d.l1(downloadSearchUI.f97348g.g());
                if (!com.tencent.mm.sdk.platformtools.t8.K0(lVar.f350411i)) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("rawUrl", lVar.f350411i);
                    ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(downloadSearchUI.getContext(), bundle);
                }
                o02.a.b(13, 1303, lVar.f350412j, 40, lVar.f350406d, "", "");
                return;
            }
            return;
        }
        downloadSearchUI.f97345d.l1(lVar.f350404b);
        downloadSearchUI.f97348g.r(lVar.f350404b);
        int i19 = lVar.f350412j;
        java.lang.String str2 = lVar.f350404b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("search_key_word", str2);
        } catch (org.json.JSONException unused) {
        }
        try {
            str = java.net.URLEncoder.encode(jSONObject.toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.io.UnsupportedEncodingException unused2) {
            str = "";
        }
        o02.a.b(13, com.tencent.mm.plugin.appbrand.jsapi.finder.v.CTRL_INDEX, i19, 2, "", "", str);
    }
}
