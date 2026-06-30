package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class e0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.h0 f197798a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.ui.base.preference.h0 h0Var, android.os.Looper looper) {
        super(looper);
        this.f197798a = h0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.base.preference.h0 h0Var = this.f197798a;
        h0Var.r();
        h0Var.f197824z = java.lang.System.currentTimeMillis();
    }
}
