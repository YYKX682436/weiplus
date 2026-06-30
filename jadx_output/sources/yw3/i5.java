package yw3;

/* loaded from: classes11.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f466770d;

    public i5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI) {
        this.f466770d = repairerPatchDemoUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f466770d;
        java.lang.String str = repairerPatchDemoUI.d;
        ((wv.a0) ((xv.i0) i95.n0.c(xv.i0.class))).getClass();
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse((r45.j35) null);
        tinkerSyncResponse.f142423v = true;
        tinkerSyncResponse.f142416o = "12354";
        xv.i0 i0Var = (xv.i0) i95.n0.c(xv.i0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((wv.a0) i0Var).getClass();
        ((x73.g) x73.c.a(context).f452441a).a("/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/WebNetFile/tmp_test.patch", tinkerSyncResponse, false);
        com.tencent.mars.xlog.Log.i(repairerPatchDemoUI.d, "newApkMd5 = %s", tinkerSyncResponse.f142416o);
    }
}
