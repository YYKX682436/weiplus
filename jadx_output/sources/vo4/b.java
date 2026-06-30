package vo4;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f438602a;

    /* renamed from: b, reason: collision with root package name */
    public final int f438603b;

    /* renamed from: c, reason: collision with root package name */
    public final int f438604c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.p0 f438605d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f438606e;

    /* renamed from: f, reason: collision with root package name */
    public int f438607f;

    /* renamed from: g, reason: collision with root package name */
    public int f438608g;

    /* renamed from: h, reason: collision with root package name */
    public int f438609h;

    /* renamed from: i, reason: collision with root package name */
    public int f438610i;

    /* renamed from: j, reason: collision with root package name */
    public int f438611j;

    /* renamed from: k, reason: collision with root package name */
    public int f438612k;

    /* renamed from: l, reason: collision with root package name */
    public int f438613l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f438614m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f438615n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f438616o;

    public b(int i17, int i18, int i19, com.tencent.mm.plugin.vlog.model.p0 material, boolean z17) {
        kotlin.jvm.internal.o.g(material, "material");
        this.f438602a = i17;
        this.f438603b = i18;
        this.f438604c = i19;
        this.f438605d = material;
        this.f438606e = z17;
        this.f438609h = -1;
        this.f438610i = -1;
        this.f438611j = -1;
        this.f438612k = -1;
    }

    public abstract void a(boolean z17);

    public abstract void b(long j17, boolean z17);

    public abstract void c();

    public abstract void d(long j17);

    public abstract void e();

    public abstract void f();

    public /* synthetic */ b(int i17, int i18, int i19, com.tencent.mm.plugin.vlog.model.p0 p0Var, boolean z17, int i27, kotlin.jvm.internal.i iVar) {
        this(i17, i18, i19, p0Var, (i27 & 16) != 0 ? true : z17);
    }
}
