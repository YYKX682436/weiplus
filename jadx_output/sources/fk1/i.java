package fk1;

/* loaded from: classes8.dex */
public final class i implements m33.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263275a;

    public i(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263275a = wAGameRecordShareUI;
    }

    @Override // m33.i1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to friend err! " + str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(this.f263275a, 1, 1, str);
    }

    @Override // m33.i1
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to friend cancel!");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(this.f263275a, 1, 2, "user cancel");
    }

    @Override // m33.i1
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to friend done");
        int i17 = com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.f90180p;
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263275a;
        wAGameRecordShareUI.getClass();
        wAGameRecordShareUI.runOnUiThread(new fk1.o(1, wAGameRecordShareUI));
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(wAGameRecordShareUI, 1, 0, "ok");
    }
}
