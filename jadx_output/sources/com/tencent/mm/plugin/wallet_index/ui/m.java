package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.l f181185d;

    public m(com.tencent.mm.plugin.wallet_index.ui.l lVar) {
        this.f181185d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_index.ui.l lVar = this.f181185d;
        lVar.f181183c.setResult(0);
        lVar.f181183c.finish();
    }
}
