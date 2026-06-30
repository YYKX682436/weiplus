package com.tencent.mm.wallet_core.ui;

/* loaded from: classes5.dex */
public class s extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.w f214224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.wallet_core.ui.w wVar) {
        super(false);
        this.f214224d = wVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.w wVar = this.f214224d;
        db5.d5 d5Var = wVar.f214252h;
        if (d5Var == null || !d5Var.isShowing()) {
            return;
        }
        wVar.f214252h.dismiss();
    }
}
