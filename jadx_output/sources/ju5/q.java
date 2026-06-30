package ju5;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.z f302141d;

    public q(ju5.z zVar) {
        this.f302141d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f302141d.f302173h;
        if (dVar != null) {
            ((pe4.g) dVar).f353701a.f353708j = true;
        }
    }
}
