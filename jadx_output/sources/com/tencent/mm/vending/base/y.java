package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Looper f212673a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Looper f212674b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f212675c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f212676d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f212677e = new byte[0];

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.vending.base.x f212678f;

    public y(android.os.Looper looper, android.os.Looper looper2) {
        this.f212673a = looper;
        this.f212674b = looper2;
        this.f212675c = new com.tencent.mm.vending.base.v(this, looper);
        this.f212676d = new com.tencent.mm.vending.base.w(this, looper2);
    }

    public final void a(int i17, java.lang.Object obj) {
        com.tencent.mm.vending.base.r rVar;
        fm5.d dVar;
        fm5.d dVar2;
        if (android.os.Looper.myLooper() != this.f212673a) {
            if (android.os.Looper.myLooper() == this.f212674b) {
                android.os.Handler handler = this.f212675c;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(i17, obj));
                return;
            }
            return;
        }
        com.tencent.mm.vending.base.x xVar = this.f212678f;
        if (xVar == null) {
            jm5.b.c("Vending.VendingSync", "This call is pointless.", new java.lang.Object[0]);
            return;
        }
        com.tencent.mm.vending.base.Vending vending = ((com.tencent.mm.vending.base.e) xVar).f212645a;
        jm5.b.b("Vending", "%s beforeSynchronize", vending);
        rVar = vending.mLoader;
        rVar.a();
        synchronized (this.f212677e) {
            android.os.Handler handler2 = this.f212676d;
            handler2.sendMessageAtFrontOfQueue(handler2.obtainMessage(i17, obj));
            try {
                this.f212677e.wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
        com.tencent.mm.vending.base.e eVar = (com.tencent.mm.vending.base.e) this.f212678f;
        jm5.b.b("Vending", "%s afterSynchronize", eVar.f212645a);
        dVar = eVar.f212645a.mDataChangedCallback;
        if (dVar != null) {
            dVar2 = eVar.f212645a.mDataChangedCallback;
            synchronized (dVar2) {
                dVar2.v(null);
            }
        }
    }
}
