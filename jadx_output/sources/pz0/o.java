package pz0;

/* loaded from: classes10.dex */
public final class o implements io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pz0.r f359156e;

    public o(yz5.l lVar, pz0.r rVar) {
        this.f359155d = lVar;
        this.f359156e = rVar;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        yz5.l lVar = this.f359155d;
        if (i17 == 1 && i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "square finished");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "square not finished ");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        }
        this.f359156e.f359163g = null;
        return true;
    }
}
