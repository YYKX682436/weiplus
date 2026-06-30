package lx;

/* loaded from: classes4.dex */
public final class c5 implements io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f321714d;

    public c5(lx.m5 m5Var) {
        this.f321714d = m5Var;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 2001) {
            return false;
        }
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c();
        lx.m5 m5Var = this.f321714d;
        lx.m5.a(m5Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "bindPhone onActivityResult: isBound=" + c17);
        yz5.l lVar = m5Var.f321870f;
        if (lVar != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(c17))));
        }
        m5Var.f321870f = null;
        return true;
    }
}
