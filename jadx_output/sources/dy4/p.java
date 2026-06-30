package dy4;

/* loaded from: classes8.dex */
public final class p implements com.tencent.mm.plugin.webview.model.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.w f244694a;

    public p(dy4.w wVar) {
        this.f244694a = wVar;
    }

    @Override // com.tencent.mm.plugin.webview.model.k0
    public void a(android.os.Bundle data) {
        kotlin.jvm.internal.o.g(data, "data");
        dy4.w wVar = this.f244694a;
        org.json.JSONObject c17 = wVar.c();
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b bVar = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a;
        c17.put("localFeedId", data.getString("localFeedId", ""));
        c17.put("isFav", data.getBoolean("isFav"));
        c17.put("isLike", data.getBoolean("isLike"));
        c17.put("favCount", data.getInt("favCount"));
        c17.put("likeCount", data.getInt("likeCount"));
        wVar.a("onFinderFeedInfoUpdated", c17);
        com.tencent.mars.xlog.Log.i(wVar.f244715a, "onFinderFeedInfoUpdated data: " + c17);
    }
}
