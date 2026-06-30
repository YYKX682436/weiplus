package n21;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.o f334274d;

    public m(n21.o oVar) {
        this.f334274d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper.myQueue().addIdleHandler(new n21.l(this));
    }
}
