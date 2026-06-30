package z6;

/* loaded from: classes13.dex */
public final class b implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f470304d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.d f470305e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f470306f;

    /* renamed from: g, reason: collision with root package name */
    public int f470307g;

    public b(java.lang.String str, z6.d dVar, boolean z17) {
        this.f470304d = str;
        this.f470305e = dVar;
        this.f470306f = z17;
    }

    @Override // java.util.concurrent.ThreadFactory
    public synchronized java.lang.Thread newThread(java.lang.Runnable runnable) {
        z6.a aVar;
        aVar = new z6.a(this, runnable, "glide-" + this.f470304d + "-thread-" + this.f470307g);
        this.f470307g = this.f470307g + 1;
        return aVar;
    }
}
