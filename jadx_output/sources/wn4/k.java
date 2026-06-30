package wn4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.util.TinkerSyncResponse f447551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f447552e;

    public k(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse, com.tencent.mm.vfs.r6 r6Var) {
        this.f447551d = tinkerSyncResponse;
        this.f447552e = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = this.f447551d;
        tinkerSyncResponse.f142423v = false;
        c83.e.b(tinkerSyncResponse);
        ((x73.g) x73.c.a(com.tencent.mm.sdk.platformtools.x2.f193071a).f452441a).a(this.f447552e.o(), tinkerSyncResponse, false);
        java.lang.String str = tinkerSyncResponse.f142416o;
        wn4.x xVar = wn4.x.f447571a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "newApkMd5 = %s", str);
        com.tencent.mm.plugin.hp.mmdiff.MMDiffPatchResultService.f142398e = new wn4.j(tinkerSyncResponse, str);
    }
}
