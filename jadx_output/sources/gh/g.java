package gh;

/* loaded from: classes7.dex */
public final class g extends gh.c {

    /* renamed from: i, reason: collision with root package name */
    public final gh.i f271819i;

    /* renamed from: m, reason: collision with root package name */
    public final gh.b f271820m;

    /* renamed from: n, reason: collision with root package name */
    public volatile android.view.Choreographer f271821n;

    /* renamed from: o, reason: collision with root package name */
    public final gh.e f271822o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.magicbrush.MBRuntime runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(jsThreadHandler, "jsThreadHandler");
        this.f271819i = new gh.i();
        this.f271820m = gh.b.ChoreographerInMainThread;
        this.f271822o = new gh.e(this);
    }

    @Override // gh.c
    public gh.b b() {
        return this.f271820m;
    }

    @Override // gh.c
    public void d() {
        android.os.Handler handler = hh.i.f281443a;
        hh.i.b(new hh.i$$b(new gh.f(this)));
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        if (this.f271821n != null) {
            android.view.Choreographer choreographer = this.f271821n;
            kotlin.jvm.internal.o.d(choreographer);
            choreographer.removeFrameCallback(this.f271822o);
        }
    }

    @Override // gh.c
    public void g() {
        if (this.f271821n != null) {
            android.view.Choreographer choreographer = this.f271821n;
            kotlin.jvm.internal.o.d(choreographer);
            choreographer.removeFrameCallback(this.f271822o);
            android.view.Choreographer choreographer2 = this.f271821n;
            kotlin.jvm.internal.o.d(choreographer2);
            choreographer2.postFrameCallback(this.f271822o);
        }
    }
}
