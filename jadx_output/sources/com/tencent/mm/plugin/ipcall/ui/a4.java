package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class a4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142752d;

    public a4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f142752d = iPCallShareCouponCardUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        j45.l.j(this.f142752d.getContext(), "account", ".ui.FacebookAuthUI", new android.content.Intent(), null);
    }
}
