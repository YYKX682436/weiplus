package si0;

/* loaded from: classes13.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f408095d;

    public k0(si0.l0 l0Var) {
        this.f408095d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        si0.b bVar = this.f408095d.C;
        if (bVar != null) {
            bVar.f408037a.start();
        }
    }
}
