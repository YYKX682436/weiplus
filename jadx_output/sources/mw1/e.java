package mw1;

/* loaded from: classes14.dex */
public final class e implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f331696d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.ArrayMap f331697e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArrayMap f331698f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f331699g;

    public e(kotlinx.coroutines.y0 glScope) {
        kotlin.jvm.internal.o.g(glScope, "glScope");
        this.f331696d = glScope;
        this.f331697e = new android.util.ArrayMap();
        this.f331698f = new android.util.ArrayMap();
    }

    public final synchronized mw1.b a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return (mw1.b) this.f331697e.get(key);
    }

    public final void b(mw1.b renderTarget) {
        kotlinx.coroutines.y0 y0Var = this.f331696d;
        lw1.l lVar = lw1.m.f321560e;
        kotlin.jvm.internal.o.g(renderTarget, "renderTarget");
        kotlinx.coroutines.l.d(y0Var, new lw1.m(new lw1.h(renderTarget)), null, new mw1.d(renderTarget, null), 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f331699g = true;
        this.f331698f.clear();
        this.f331697e.clear();
    }
}
