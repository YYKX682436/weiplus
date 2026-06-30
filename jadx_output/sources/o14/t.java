package o14;

/* loaded from: classes12.dex */
public class t implements k14.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI f342300a;

    public t(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI fixToolsUpLogUploadingUI) {
        this.f342300a = fixToolsUpLogUploadingUI;
    }

    @Override // k14.m
    public void a(int i17, long j17, long j18, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FixToolsUpLogUploadingUI", "fixToolsUplogProgressCallback percent:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI fixToolsUpLogUploadingUI = this.f342300a;
        if (i17 < 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(873L, 18L, 1L, false);
            fixToolsUpLogUploadingUI.f160071i.setImageResource(com.tencent.mm.R.raw.fix_tools_failed);
            fixToolsUpLogUploadingUI.f160070h.setText(com.tencent.mm.R.string.fae);
            fixToolsUpLogUploadingUI.f160073n.setVisibility(8);
            fixToolsUpLogUploadingUI.f160074o.setVisibility(8);
            fixToolsUpLogUploadingUI.f160072m.setVisibility(4);
            fixToolsUpLogUploadingUI.f160068f.setVisibility(0);
            fixToolsUpLogUploadingUI.f160069g.setVisibility(8);
            return;
        }
        if (i17 >= 100) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(873L, 17L, 1L, false);
            fixToolsUpLogUploadingUI.f160071i.setImageResource(com.tencent.mm.R.raw.fix_tools_finish);
            fixToolsUpLogUploadingUI.f160070h.setText(com.tencent.mm.R.string.faf);
            fixToolsUpLogUploadingUI.f160073n.setVisibility(8);
            fixToolsUpLogUploadingUI.f160074o.setVisibility(8);
            fixToolsUpLogUploadingUI.f160072m.setVisibility(4);
            fixToolsUpLogUploadingUI.f160068f.setVisibility(0);
            fixToolsUpLogUploadingUI.f160069g.setVisibility(8);
            fixToolsUpLogUploadingUI.f160067e = true;
            return;
        }
        if (!z17) {
            fixToolsUpLogUploadingUI.f160073n.setProgress(i17);
            fixToolsUpLogUploadingUI.f160074o.setText(java.lang.String.format("%s / %s", fixToolsUpLogUploadingUI.Z6(j18), fixToolsUpLogUploadingUI.Z6(j17)));
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(873L, 19L, 1L, false);
        fixToolsUpLogUploadingUI.f160071i.setImageResource(com.tencent.mm.R.raw.fix_tools_failed);
        fixToolsUpLogUploadingUI.f160070h.setText(com.tencent.mm.R.string.faa);
        fixToolsUpLogUploadingUI.f160073n.setVisibility(8);
        fixToolsUpLogUploadingUI.f160074o.setVisibility(8);
        fixToolsUpLogUploadingUI.f160072m.setVisibility(4);
        fixToolsUpLogUploadingUI.f160068f.setVisibility(0);
        fixToolsUpLogUploadingUI.f160069g.setVisibility(8);
    }
}
