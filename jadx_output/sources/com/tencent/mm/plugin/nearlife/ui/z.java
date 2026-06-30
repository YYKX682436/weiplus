package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI f152353d;

    public z(com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI) {
        this.f152353d = nearLifeCreatePoiUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI nearLifeCreatePoiUI = this.f152353d;
        g0Var.d(11138, "3", "0", nearLifeCreatePoiUI.f152277r);
        nearLifeCreatePoiUI.setResult(0, new android.content.Intent());
        nearLifeCreatePoiUI.finish();
    }
}
