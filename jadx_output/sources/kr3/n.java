package kr3;

/* loaded from: classes4.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f311415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr3.a f311416e;

    public n(boolean z17, lr3.a aVar) {
        this.f311415d = z17;
        this.f311416e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f311415d) {
            this.f311416e.b();
        }
    }
}
