package fk1;

/* loaded from: classes8.dex */
public final class u implements m33.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263292a;

    public u(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263292a = wAGameRecordShareUI;
    }

    @Override // m33.i1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WAGameRecordShareUI", "stash error");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263292a;
        wAGameRecordShareUI.runOnUiThread(new fk1.s(wAGameRecordShareUI, str));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(wAGameRecordShareUI, 3, 1, str);
    }

    @Override // m33.i1
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "stash cancel");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(this.f263292a, 3, 2, "user cancel");
    }

    @Override // m33.i1
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "stash success");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263292a;
        wAGameRecordShareUI.runOnUiThread(new fk1.t(wAGameRecordShareUI));
        int i17 = com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.f90180p;
        wAGameRecordShareUI.runOnUiThread(new fk1.o(3, wAGameRecordShareUI));
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(wAGameRecordShareUI, 3, 0, "ok");
    }
}
