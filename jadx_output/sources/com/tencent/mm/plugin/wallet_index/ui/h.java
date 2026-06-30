package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI f181174d;

    public h(com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI orderHandlerUI) {
        this.f181174d = orderHandlerUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f181174d.finish();
    }
}
