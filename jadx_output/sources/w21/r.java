package w21;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w21.o f442458d;

    public r(w21.o oVar) {
        this.f442458d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w21.o oVar = this.f442458d;
        oVar.doScene(oVar.dispatcher(), oVar.f442430d);
    }
}
