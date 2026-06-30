package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class e0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f159929d;

    public e0(com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        this.f159929d = t0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.plugin.scanner.view.t0 t0Var = this.f159929d;
        t0Var.x(22);
        t0Var.f159994x = false;
        java.lang.String str = t0Var.f159985p;
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArr = t0Var.D;
        if (bArr != null) {
            arrayList.add(bArr);
        }
        byte[] bArr2 = t0Var.H;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        byte[] bArr3 = t0Var.N;
        if (bArr3 != null) {
            arrayList.add(bArr3);
        }
        bundle.putSerializable("param_card_bitmap", arrayList);
        com.tencent.mm.plugin.scanner.view.u uVar = t0Var.f159989s;
        if (uVar == null) {
            return true;
        }
        ((com.tencent.mm.plugin.scanner.ui.p1) uVar).a(0L, bundle);
        return true;
    }
}
