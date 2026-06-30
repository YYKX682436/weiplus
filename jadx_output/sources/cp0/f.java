package cp0;

/* loaded from: classes15.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final cp0.n f220745a;

    public f(cp0.n weakHolder) {
        kotlin.jvm.internal.o.g(weakHolder, "weakHolder");
        this.f220745a = weakHolder;
    }

    public final void a(java.lang.Object obj, cp0.b waitUI) {
        kotlin.jvm.internal.o.g(waitUI, "waitUI");
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            waitUI.a(b(obj, this.f220745a));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new cp0.e(waitUI, this, obj));
        }
    }

    public abstract boolean b(java.lang.Object obj, cp0.n nVar);

    public abstract int c();

    public abstract void d(cp0.n nVar, vo0.h hVar);
}
