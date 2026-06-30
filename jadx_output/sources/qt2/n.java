package qt2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.u f366604d;

    public n(qt2.u uVar) {
        this.f366604d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qt2.u uVar = this.f366604d;
        if (uVar.f366620p) {
            return;
        }
        uVar.f366620p = true;
        uVar.R6("photo");
    }
}
