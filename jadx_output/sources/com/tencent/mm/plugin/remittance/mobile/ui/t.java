package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.v f156719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.remittance.mobile.ui.v vVar) {
        super(false);
        this.f156719d = vVar;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.mobile.ui.x xVar = this.f156719d.f156730m;
        if (xVar != null) {
            ((com.tencent.mm.plugin.remittance.mobile.ui.l) xVar).onClick(view);
        }
    }
}
