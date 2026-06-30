package i81;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i81.q f289594d;

    public k(i81.q qVar) {
        this.f289594d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        i81.q qVar = this.f289594d;
        qVar.setVisibility(0);
        qVar.bringToFront();
    }
}
