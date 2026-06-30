package p5;

/* loaded from: classes13.dex */
public class e implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ThreadLocal f351970d = new java.lang.ThreadLocal();

    public e(p5.d dVar) {
    }

    public final int a() {
        java.lang.ThreadLocal threadLocal = this.f351970d;
        java.lang.Integer num = (java.lang.Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() - 1;
        if (intValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(java.lang.Integer.valueOf(intValue));
        }
        return intValue;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        java.lang.ThreadLocal threadLocal = this.f351970d;
        java.lang.Integer num = (java.lang.Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() + 1;
        threadLocal.set(java.lang.Integer.valueOf(intValue));
        try {
            if (intValue <= 15) {
                runnable.run();
            } else {
                p5.f.f351971c.f351972a.execute(runnable);
            }
            a();
        } catch (java.lang.Throwable th6) {
            a();
            throw th6;
        }
    }
}
