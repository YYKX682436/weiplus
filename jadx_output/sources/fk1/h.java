package fk1;

/* loaded from: classes8.dex */
public final class h implements m33.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263274a;

    public h(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263274a = wAGameRecordShareUI;
    }

    @Override // m33.i1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WAGameRecordShareUI", "share to wegame error");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263274a;
        wAGameRecordShareUI.runOnUiThread(new fk1.f(wAGameRecordShareUI, str));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(wAGameRecordShareUI, 0, 1, str);
    }

    @Override // m33.i1
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "share to wegame center cancel");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(this.f263274a, 0, 2, "user cancel");
    }

    @Override // m33.i1
    public void onSuccess() {
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263274a;
        wAGameRecordShareUI.runOnUiThread(new fk1.g(wAGameRecordShareUI));
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(wAGameRecordShareUI, 0, 0, "ok");
    }
}
