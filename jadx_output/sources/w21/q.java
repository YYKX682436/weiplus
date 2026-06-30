package w21;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w21.o f442456d;

    public q(w21.o oVar) {
        this.f442456d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w21.o oVar = this.f442456d;
        oVar.doScene(oVar.dispatcher(), oVar.f442430d);
    }
}
