package tn4;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn4.m f420834d;

    public l(tn4.m mVar) {
        this.f420834d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "checkMMDiffBoostInstall, have tinker update.");
        tn4.m mVar = this.f420834d;
        com.tencent.mm.pluginsdk.model.app.n1.d(mVar.f420836e, mVar.f420835d.f380669e, null, false);
        w73.f.k(mVar.f420835d.f380681t == 4 ? 129 : 130);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, mVar.f420835d.f380681t != 4 ? 130 : 129, 1L, false);
    }
}
