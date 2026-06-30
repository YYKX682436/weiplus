package sd;

/* loaded from: classes8.dex */
public abstract class m0 implements sd.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f406624d;

    /* renamed from: e, reason: collision with root package name */
    public final sd.l0 f406625e;

    public m0(android.content.Context context, java.lang.Class cls) {
        ((h53.j) this).f279058h = h53.i.initing;
        this.f406624d = context;
        this.f406625e = new sd.g(context, cls);
    }

    @Override // sd.a
    public android.content.Context getContext() {
        return this.f406624d;
    }

    @Override // sd.a
    public sd.l0 getRuntime() {
        return this.f406625e;
    }
}
