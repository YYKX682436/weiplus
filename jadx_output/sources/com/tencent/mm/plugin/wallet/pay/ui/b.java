package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.d f178746d;

    public b(com.tencent.mm.plugin.wallet.pay.ui.d dVar) {
        this.f178746d = dVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f178746d.a();
    }
}
