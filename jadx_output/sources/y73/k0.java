package y73;

/* loaded from: classes11.dex */
public class k0 implements x73.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y73.d0 f459732a;

    public k0(y73.d0 d0Var) {
        this.f459732a = d0Var;
    }

    @Override // x73.i
    public void a(x73.a aVar) {
        com.tencent.mm.plugin.hp.mmdiff.MMDiffPatchResultService.f142399f = null;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isSuccess = %s, result = %s", java.lang.Boolean.valueOf(aVar.f452437d), aVar);
        } else {
            com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isnull.");
        }
        y73.d0 d0Var = this.f459732a;
        c83.e.d(d0Var.f459706d, aVar.f452438e);
        c83.e.u();
        c83.e.e();
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk merge finish. auto");
        if (!aVar.f452437d) {
            if (d0Var.f459708f) {
                android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "merge patch fail", 1).show();
                return;
            }
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_show_notifyupdate_ready, 0) == 1;
        com.tencent.mars.xlog.Log.i("Tinker.SyncResponseProcessor", "HdiffApk merge finish. notifyExptKeyChange, isForceAutoMergeNotify = %s.", java.lang.Boolean.valueOf(z17));
        if (z17) {
            w73.a.e("mmdiff_apk_has_ready", 0, 4);
        }
        if (d0Var.f459708f) {
            android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "merge patch success, Switch wechat from background to foreground.", 1).show();
        }
    }
}
