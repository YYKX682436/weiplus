package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class u1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.w1 f159072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f159073e;

    public u1(com.tencent.mm.plugin.scanner.model.w1 w1Var, long j17) {
        this.f159072d = w1Var;
        this.f159073e = j17;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductForGalleryHelper", "processGoodsImage onCancel and resumeScan");
        com.tencent.mm.plugin.scanner.model.w1 w1Var = this.f159072d;
        if (w1Var.f159087c == this.f159073e) {
            com.tencent.mm.plugin.scanner.model.t1 t1Var = w1Var.f159086b;
        }
        ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) w1Var.f159085a).n7();
        sz3.w wVar = w1Var.f159089e;
    }
}
