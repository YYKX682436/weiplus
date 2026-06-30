package kc5;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc5.x f306583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f306584e;

    public u(kc5.x xVar, com.tencent.mm.storage.f9 f9Var) {
        this.f306583d = xVar;
        this.f306584e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc5.x.wi(this.f306583d, this.f306584e);
    }
}
