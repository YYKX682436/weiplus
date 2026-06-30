package k3;

/* loaded from: classes13.dex */
public class g implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k3.f f303787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f303788g;

    public g(java.lang.String str, android.content.Context context, k3.f fVar, int i17) {
        this.f303785d = str;
        this.f303786e = context;
        this.f303787f = fVar;
        this.f303788g = i17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        return k3.l.a(this.f303785d, this.f303786e, this.f303787f, this.f303788g);
    }
}
