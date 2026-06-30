package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public class w extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vending.base.y f212672a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.vending.base.y yVar, android.os.Looper looper) {
        super(looper);
        this.f212672a = yVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        synchronized (this.f212672a.f212677e) {
            com.tencent.mm.vending.base.x xVar = this.f212672a.f212678f;
            if (xVar != null) {
                ((com.tencent.mm.vending.base.e) xVar).a(message.what, message.obj);
            }
            this.f212672a.f212677e.notify();
        }
    }
}
