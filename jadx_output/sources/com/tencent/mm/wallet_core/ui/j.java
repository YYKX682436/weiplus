package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.EditHintView f214192d;

    public j(com.tencent.mm.wallet_core.ui.EditHintView editHintView) {
        this.f214192d = editHintView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f214192d.D.dismiss();
    }
}
