package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public class f extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vending.base.Vending f212646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.vending.base.Vending vending, android.os.Looper looper) {
        super(looper);
        this.f212646a = vending;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.tencent.mm.vending.base.u uVar = (com.tencent.mm.vending.base.u) message.obj;
        this.f212646a.onDataResolved(uVar.f212663a, uVar.f212664b);
    }
}
