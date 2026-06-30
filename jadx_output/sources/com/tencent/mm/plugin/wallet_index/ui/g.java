package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI f181173d;

    public g(com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI orderHandlerUI) {
        this.f181173d = orderHandlerUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f181173d.finish();
    }
}
