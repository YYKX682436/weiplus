package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class j3 extends i95.w implements qk.u8 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f252240d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f252241e = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f252242f;

    public j3() {
        new java.util.concurrent.CopyOnWriteArraySet();
        this.f252242f = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public boolean Ai(rk4.o5 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        return this.f252240d.remove(listener);
    }

    public void wi(rk4.o5 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f252240d.add(listener);
    }
}
