package ec1;

/* loaded from: classes7.dex */
public class b implements ae0.f {
    public b(ec1.a aVar) {
    }

    @Override // ae0.f
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15789, java.lang.Integer.valueOf(i17), 0, str);
            com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().edit().putBoolean("key_sendtodesktop_no_more_show_permission_notify_dialog", true).apply();
        }
    }
}
