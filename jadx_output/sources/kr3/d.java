package kr3;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f311348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr3.a f311349e;

    public d(boolean z17, lr3.a aVar) {
        this.f311348d = z17;
        this.f311349e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f311348d) {
            this.f311349e.b();
        }
    }
}
