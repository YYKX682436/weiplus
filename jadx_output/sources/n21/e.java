package n21;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.f f334250d;

    public e(n21.f fVar) {
        this.f334250d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper.myQueue().addIdleHandler(new n21.d(this));
    }
}
