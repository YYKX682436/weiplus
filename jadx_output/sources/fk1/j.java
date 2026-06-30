package fk1;

/* loaded from: classes8.dex */
public final class j implements m33.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263276a;

    public j(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263276a = wAGameRecordShareUI;
    }

    @Override // m33.i1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to sns err! " + str);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(this.f263276a, 2, 1, str);
    }

    @Override // m33.i1
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to sns cancel!");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(this.f263276a, 2, 2, "user cancel");
    }

    @Override // m33.i1
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameRecordShareUI", "hy: share to sns done");
        int i17 = com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.f90180p;
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263276a;
        wAGameRecordShareUI.getClass();
        wAGameRecordShareUI.runOnUiThread(new fk1.o(2, wAGameRecordShareUI));
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.U6(wAGameRecordShareUI, 2, 0, "ok");
    }
}
