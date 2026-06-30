package ga3;

/* loaded from: classes15.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga3.v f269867d;

    public t(ga3.v vVar) {
        this.f269867d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f269867d.f269877c) {
            this.f269867d.b();
        }
    }
}
