package jj3;

/* loaded from: classes14.dex */
public final class j implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f300019d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.ArrayMap f300020e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArrayMap f300021f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f300022g;

    public j(kotlinx.coroutines.y0 glScope) {
        kotlin.jvm.internal.o.g(glScope, "glScope");
        this.f300019d = glScope;
        this.f300020e = new android.util.ArrayMap();
        this.f300021f = new android.util.ArrayMap();
    }

    public final void a(jj3.c renderTarget) {
        kotlinx.coroutines.y0 y0Var = this.f300019d;
        ij3.l lVar = ij3.m.f291712e;
        kotlin.jvm.internal.o.g(renderTarget, "renderTarget");
        kotlinx.coroutines.l.d(y0Var, new ij3.m(new ij3.h(renderTarget)), null, new jj3.i(renderTarget, null), 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f300022g = true;
        this.f300021f.clear();
        this.f300020e.clear();
    }
}
