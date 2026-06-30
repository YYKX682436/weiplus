package uv4;

/* loaded from: classes15.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv4.y f431423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431424e;

    public b0(uv4.y yVar, java.lang.String str) {
        this.f431423d = yVar;
        this.f431424e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f431424e;
        uv4.z zVar = (uv4.z) this.f431423d;
        android.content.Context context = zVar.f431467a;
        try {
            ((com.tencent.mm.plugin.websearch.w1$$a) zVar.f431468b).a(context, str);
            dp.a.makeText(context, "模板已更新，打开搜一搜", 0).show();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchTemplateScanHandler", "DefaultCallback.onSuccess: launch failed: %s", e17.getMessage());
            dp.a.makeText(context, "打开搜一搜失败: " + e17.getMessage(), 1).show();
        }
    }
}
