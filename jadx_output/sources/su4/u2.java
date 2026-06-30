package su4;

/* loaded from: classes8.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f413111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su4.v2 f413112g;

    public u2(su4.v2 v2Var, java.lang.String str, int i17, boolean z17) {
        this.f413112g = v2Var;
        this.f413109d = str;
        this.f413110e = i17;
        this.f413111f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadExport", "sending broadcast");
        this.f413112g.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        intent.putExtra("tools_param_preload_url", this.f413109d);
        intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_PRELOAD_SEARCH");
        intent.putExtra("tools_param_preload_search_biz", this.f413110e);
        intent.putExtra("tools_param_preload_search_biz_need_reset", this.f413111f);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
    }
}
