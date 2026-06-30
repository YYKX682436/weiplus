package o;

/* loaded from: classes15.dex */
public abstract class d implements o.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f341690d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f341691e;

    /* renamed from: f, reason: collision with root package name */
    public o.r f341692f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.LayoutInflater f341693g;

    /* renamed from: h, reason: collision with root package name */
    public o.f0 f341694h;

    /* renamed from: i, reason: collision with root package name */
    public final int f341695i;

    /* renamed from: m, reason: collision with root package name */
    public final int f341696m;

    /* renamed from: n, reason: collision with root package name */
    public o.i0 f341697n;

    /* renamed from: o, reason: collision with root package name */
    public int f341698o;

    public d(android.content.Context context, int i17, int i18) {
        this.f341690d = context;
        this.f341693g = android.view.LayoutInflater.from(context);
        this.f341695i = i17;
        this.f341696m = i18;
    }

    @Override // o.g0
    public void g(o.f0 f0Var) {
        this.f341694h = f0Var;
    }

    @Override // o.g0
    public int getId() {
        return this.f341698o;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }
}
