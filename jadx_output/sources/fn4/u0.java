package fn4;

/* loaded from: classes15.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.h f264611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn4.v0 f264612e;

    public u0(fn4.v0 v0Var, sm4.h hVar) {
        this.f264612e = v0Var;
        this.f264611d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sm4.h hVar = this.f264611d;
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(((r45.s97) hVar.f409944e.f70711b.f70700a).f385587f).optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return;
            }
            java.util.List k17 = fn4.z0.k(this.f264612e.f264614d.f264631a.p6(), optJSONArray);
            hVar.f409945f.N.f385872i.addAll(k17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "netSceneTopStoryRelevantVideo add result list %d", java.lang.Integer.valueOf(((java.util.ArrayList) k17).size()));
        } catch (java.lang.Exception unused) {
        }
    }
}
