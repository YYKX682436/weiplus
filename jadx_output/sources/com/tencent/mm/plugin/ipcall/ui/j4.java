package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class j4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142883d;

    public j4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f142883d = iPCallShareCouponCardUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f142883d.finish();
    }
}
