package lr;

/* loaded from: classes15.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f320582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr.u f320583e;

    public t(lr.u uVar) {
        this.f320583e = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        lr.u uVar = this.f320583e;
        lr.s sVar = new lr.s(uVar.f320586f.getContext());
        sVar.f12049a = this.f320582d;
        uVar.f320585e.startSmoothScroll(sVar);
    }
}
