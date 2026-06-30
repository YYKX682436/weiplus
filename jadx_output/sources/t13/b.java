package t13;

/* loaded from: classes12.dex */
public abstract class b implements t13.k {

    /* renamed from: d, reason: collision with root package name */
    public final t13.j f414558d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f414559e;

    /* renamed from: f, reason: collision with root package name */
    public final int f414560f;

    /* renamed from: g, reason: collision with root package name */
    public int f414561g = 0;

    public b(android.content.Context context, t13.j jVar, int i17) {
        this.f414559e = context;
        this.f414558d = jVar;
        this.f414560f = i17;
    }

    @Override // t13.k
    public boolean a(android.view.View view, u13.g gVar, boolean z17) {
        return false;
    }

    @Override // t13.k
    public int i() {
        return this.f414561g;
    }

    public boolean k(java.util.List list) {
        return list != null && list.size() > 0;
    }
}
