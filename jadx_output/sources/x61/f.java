package x61;

/* loaded from: classes.dex */
public class f extends com.tencent.mm.sdk.event.n {
    public f() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0);
        int i17 = sharedPreferences.getInt("new_launch_image_sub_type", 0);
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        if (r2Var.f7759a == 43 && i17 > 0 && i17 == r2Var.f7760b) {
            java.lang.String str = r2Var.f7761c;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(723L, 6L, 1L, false);
            sharedPreferences.edit().putInt("new_launch_image_res_version", checkResUpdateCacheFileEvent.f54053g.f7762d).commit();
            com.tencent.mars.xlog.Log.i("MicroMsg.CheckResUpdateListener", "filePath: %s", str);
            x61.a.b(str);
        }
        return false;
    }
}
