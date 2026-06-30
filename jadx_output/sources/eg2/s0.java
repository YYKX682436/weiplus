package eg2;

/* loaded from: classes3.dex */
public final class s0 extends eg2.i0 {

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f252628e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f252629f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f252630g;

    /* renamed from: h, reason: collision with root package name */
    public int f252631h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f252632i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f252633j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f252634k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f252635l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f252636m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kotlinx.coroutines.y0 taskScope, android.content.Context taskContext) {
        super(taskScope);
        kotlin.jvm.internal.o.g(taskScope, "taskScope");
        kotlin.jvm.internal.o.g(taskContext, "taskContext");
        this.f252628e = taskScope;
        this.f252629f = taskContext;
        this.f252630g = "";
        this.f252635l = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f252636m = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // eg2.i0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHDTaskChecker", "cancel called for url: " + this.f252632i);
        kotlinx.coroutines.r2 r2Var = this.f252578c;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f252578c = null;
        this.f252632i = null;
        this.f252633j = null;
        this.f252634k = null;
        this.f252635l.set(false);
        this.f252636m.set(false);
        super.a();
    }

    @Override // eg2.i0
    public java.lang.String b() {
        return this.f252630g;
    }

    @Override // eg2.i0
    public int c() {
        return this.f252631h;
    }
}
