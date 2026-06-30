package zh1;

/* loaded from: classes3.dex */
public class b1 implements zh1.c1 {
    @Override // zh1.c1
    public void a(java.lang.Runnable runnable) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(runnable);
        }
    }
}
