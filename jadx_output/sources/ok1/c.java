package ok1;

/* loaded from: classes7.dex */
public final class c implements mk1.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f345964a;

    public c(android.os.Handler handler) {
        this.f345964a = handler;
    }

    @Override // mk1.v
    public final ye1.r a(mk1.b0 dataSource) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        ok1.b bVar = new ok1.b(this.f345964a, dataSource);
        if (dataSource instanceof mk1.z) {
            return (ye1.r) bVar.invoke();
        }
        return null;
    }
}
