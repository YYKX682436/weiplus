package tn4;

/* loaded from: classes11.dex */
public class h implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.util.TinkerSyncResponse f420830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f420831b;

    public h(tn4.o oVar, com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse, boolean z17) {
        this.f420830a = tinkerSyncResponse;
        this.f420831b = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.PluginUpdater", "onDialogClick HdiffApk %s", java.lang.Boolean.valueOf(z17));
        boolean z18 = this.f420831b;
        if (!z17) {
            w73.f.k(z18 ? 109 : com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, z18 ? 109L : 309L, 1L, false);
        } else {
            wn4.x.f447571a.g(this.f420830a);
            w73.f.k(z18 ? 110 : 310);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, z18 ? 110L : 310L, 1L, false);
        }
    }
}
