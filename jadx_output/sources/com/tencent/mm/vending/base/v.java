package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public class v extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vending.base.y f212671a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.vending.base.y yVar, android.os.Looper looper) {
        super(looper);
        this.f212671a = yVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f212671a.a(message.what, message.obj);
    }
}
