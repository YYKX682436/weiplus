package com.tencent.mm.service;

/* loaded from: classes12.dex */
public abstract class MMIntentService extends com.tencent.mm.service.MMService {

    /* renamed from: i, reason: collision with root package name */
    public volatile l85.o0 f193203i;

    public MMIntentService(java.lang.String str) {
    }

    @Override // com.tencent.mm.service.MMService
    public void d() {
        super.d();
        this.f193203i = new l85.o0(this, xu5.b.a("close-db-while-crash"));
    }

    @Override // com.tencent.mm.service.MMService
    public void e() {
        this.f193203i.getSerial().f457303b.g();
    }

    @Override // com.tencent.mm.service.MMService
    public void f(android.content.Intent intent, int i17) {
        android.os.Message obtainMessage = this.f193203i.obtainMessage();
        obtainMessage.arg1 = i17;
        obtainMessage.obj = intent;
        this.f193203i.sendMessage(obtainMessage);
    }

    @Override // com.tencent.mm.service.MMService
    public int g(android.content.Intent intent, int i17, int i18) {
        f(intent, i18);
        return 2;
    }

    public abstract void i(android.content.Intent intent);
}
