package du5;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du5.c f243788d;

    public a(du5.c cVar) {
        this.f243788d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zt5.h.c("Soter.SoterBiometricCanceller", "soter: cancellation signal 2", new java.lang.Object[0]);
        this.f243788d.f243790a.cancel();
    }
}
