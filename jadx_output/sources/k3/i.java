package k3;

/* loaded from: classes13.dex */
public class i implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k3.f f303792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f303793g;

    public i(java.lang.String str, android.content.Context context, k3.f fVar, int i17) {
        this.f303790d = str;
        this.f303791e = context;
        this.f303792f = fVar;
        this.f303793g = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        try {
            return k3.l.a(this.f303790d, this.f303791e, this.f303792f, this.f303793g);
        } catch (java.lang.Throwable unused) {
            return new k3.k(-3);
        }
    }
}
