package ob0;

/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f343898a;

    /* renamed from: b, reason: collision with root package name */
    public int f343899b;

    public e(ob0.d callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f343898a = this;
    }

    public final int a() {
        int i17;
        synchronized (this.f343898a) {
            i17 = this.f343899b;
        }
        return i17;
    }

    public abstract boolean b(java.util.List list);
}
