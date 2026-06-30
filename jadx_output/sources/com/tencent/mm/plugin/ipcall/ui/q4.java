package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class q4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142990d;

    public q4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f142990d = iPCallShareCouponCardUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f142990d;
        iPCallShareCouponCardUI.f142679p = db5.e1.Q(iPCallShareCouponCardUI.getContext(), iPCallShareCouponCardUI.getContext().getString(com.tencent.mm.R.string.f490573yv), iPCallShareCouponCardUI.getContext().getString(com.tencent.mm.R.string.f493409k23), true, true, new com.tencent.mm.plugin.ipcall.ui.p4(this));
        iPCallShareCouponCardUI.f142677n.b(iPCallShareCouponCardUI, iPCallShareCouponCardUI.getContext());
    }
}
