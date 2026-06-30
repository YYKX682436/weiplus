package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI f181176d;

    public i(com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI orderHandlerUI) {
        this.f181176d = orderHandlerUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f181176d.finish();
    }
}
