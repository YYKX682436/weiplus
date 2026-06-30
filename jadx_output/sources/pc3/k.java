package pc3;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.m f353380d;

    public k(pc3.m mVar) {
        this.f353380d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3.m mVar = this.f353380d;
        if (mVar.f353383b.isEmpty()) {
            pc3.m.a(mVar, false);
        }
    }
}
