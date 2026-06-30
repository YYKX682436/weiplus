package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes15.dex */
public final class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI f181209d;

    public t0(com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI wecoinIapUI) {
        this.f181209d = wecoinIapUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI wecoinIapUI = this.f181209d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WecoinIapUI", "showLoadingDialog onCancel currentScene: %d", java.lang.Integer.valueOf(wecoinIapUI.f181128h));
        nt4.f a17 = wecoinIapUI.f181128h == wecoinIapUI.f181127g ? nt4.f.a(7) : nt4.f.a(1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", a17.f339823a);
        intent.putExtra("key_err_msg", a17.f339824b);
        wecoinIapUI.setResult(-1, intent);
        wecoinIapUI.finish();
    }
}
