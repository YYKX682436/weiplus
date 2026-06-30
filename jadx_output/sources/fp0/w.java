package fp0;

/* loaded from: classes10.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final fp0.d f265295d;

    /* renamed from: e, reason: collision with root package name */
    public final fp0.v f265296e;

    /* renamed from: f, reason: collision with root package name */
    public final fp0.c f265297f;

    public w(fp0.d dVar, fp0.c cVar, fp0.v vVar) {
        this.f265295d = dVar;
        this.f265297f = cVar;
        this.f265296e = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fp0.d dVar = this.f265295d;
        dVar.getClass();
        fp0.c loader = this.f265297f;
        kotlin.jvm.internal.o.g(loader, "loader");
        fp0.v watch = this.f265296e;
        kotlin.jvm.internal.o.g(watch, "watch");
        dVar.f265246d = loader;
        dVar.f265247e = watch;
        dVar.a();
    }
}
