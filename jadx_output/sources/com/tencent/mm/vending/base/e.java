package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public class e implements com.tencent.mm.vending.base.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vending.base.Vending f212645a;

    public e(com.tencent.mm.vending.base.Vending vending) {
        this.f212645a = vending;
    }

    public void a(int i17, java.lang.Object obj) {
        com.tencent.mm.vending.base.r rVar;
        android.os.Handler handler;
        com.tencent.mm.vending.base.s sVar;
        com.tencent.mm.vending.base.Vending vending = this.f212645a;
        jm5.b.b("Vending", "%s synchronizing", vending);
        vending.mVendingDeferring.clear();
        rVar = vending.mLoader;
        rVar.a();
        handler = vending.mSubscriberHandler;
        handler.removeCallbacksAndMessages(null);
        if (i17 == 2) {
            obj = vending.prepareVendingDataAsynchronous();
        }
        if (i17 == 2 || i17 == 1) {
            vending.applyChangeSynchronized(obj);
        }
        vending.synchronizing(i17, obj);
        sVar = vending.mArray;
        sVar.clear();
    }
}
