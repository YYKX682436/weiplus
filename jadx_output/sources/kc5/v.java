package kc5;

/* loaded from: classes9.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc5.x f306585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f306586e;

    public v(kc5.x xVar, com.tencent.mm.storage.f9 f9Var) {
        this.f306585d = xVar;
        this.f306586e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc5.x.wi(this.f306585d, this.f306586e);
    }
}
