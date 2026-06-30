package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public class g extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vending.base.Vending f212647a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.vending.base.Vending vending, android.os.Looper looper) {
        super(looper);
        this.f212647a = vending;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.vending.base.Vending vending = this.f212647a;
        if (i17 == 1) {
            vending.callPrepareVendingData();
        } else {
            if (i17 != 2) {
                return;
            }
            vending.destroyAsynchronous();
        }
    }
}
