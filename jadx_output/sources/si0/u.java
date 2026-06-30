package si0;

/* loaded from: classes13.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.v f408176d;

    public u(si0.v vVar) {
        this.f408176d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        si0.b bVar = this.f408176d.C;
        if (bVar != null) {
            bVar.f408037a.start();
        }
    }
}
