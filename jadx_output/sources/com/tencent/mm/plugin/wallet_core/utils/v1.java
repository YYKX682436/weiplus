package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class v1 implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.y1 f180995a;

    public v1(com.tencent.mm.plugin.wallet_core.utils.y1 y1Var) {
        this.f180995a = y1Var;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.wallet_core.utils.y1 y1Var = this.f180995a;
        if (!(y1Var != null) || !(i17 == -1)) {
            return null;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("callbackEventType", 2);
        ((com.tencent.mm.plugin.mall.ui.v2) y1Var).a(bundle2);
        return null;
    }
}
