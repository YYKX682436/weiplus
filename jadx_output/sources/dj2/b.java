package dj2;

/* loaded from: classes10.dex */
public abstract class b extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f232895b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.v0 f232896c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.x0 f232897d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f232898e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f232899f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f232900g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f232901h;

    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f232895b = context;
        this.f232896c = pluginAbility;
        this.f232897d = service;
        this.f232898e = new java.util.HashMap();
        this.f232899f = new java.util.LinkedList();
        this.f232900g = new android.graphics.Rect();
    }

    @Override // hn5.c
    public int a() {
        return this.f232899f.size();
    }

    @Override // hn5.c
    public android.view.View c(int i17, java.lang.Object obj) {
        xh2.a data = (xh2.a) obj;
        kotlin.jvm.internal.o.g(data, "data");
        int k17 = k(data);
        java.lang.String i18 = i(data);
        java.lang.String l17 = l();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItemView pos: ");
        sb6.append(i17);
        sb6.append(" key: ");
        sb6.append(i18);
        sb6.append(" micType: ");
        sb6.append(k17);
        sb6.append(" viewCache: ");
        java.util.HashMap hashMap = this.f232898e;
        sb6.append(hashMap);
        com.tencent.mars.xlog.Log.i(l17, sb6.toString());
        android.view.View view = (android.view.View) hashMap.get(i18);
        if (view == null) {
            view = h(data, k17);
        }
        kotlin.jvm.internal.o.d(view);
        hashMap.put(i18, view);
        return view;
    }

    @Override // hn5.c
    public hn5.b e(int i17) {
        return ((xh2.a) this.f232899f.get(i17)).f454521b;
    }

    @Override // hn5.c
    public void g(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view instanceof lj2.j) {
            ((lj2.j) view).f318877h = this.f232901h;
        }
    }

    public abstract android.view.View h(xh2.a aVar, int i17);

    public java.lang.String i(xh2.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.b() + '@' + k(data) + '@' + data.f454521b.f454553e;
    }

    @Override // hn5.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public xh2.a b(int i17) {
        java.lang.Object obj = this.f232899f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    public final int k(xh2.a aVar) {
        km2.q qVar = aVar.f454520a;
        java.lang.String str = qVar != null ? qVar.f309170a : null;
        lj2.v0 v0Var = this.f232896c;
        if (kotlin.jvm.internal.o.b(str, v0Var.a0().p())) {
            if (v0Var.a0().g().size() > 0) {
                return 6;
            }
            return v0Var.a0().l().size() > 3 ? 7 : 3;
        }
        km2.q qVar2 = aVar.f454520a;
        if (qVar2 != null) {
            if (qVar2 != null && qVar2.f309177h) {
                return 5;
            }
        }
        if (qVar2 != null) {
            xh2.i iVar = aVar.f454521b;
            if (!iVar.f454556h) {
                return pm0.v.z(iVar.f454557i, 2) ? 1 : 2;
            }
        }
        return (qVar2 == null && aVar.f454521b.f454556h) ? 4 : 0;
    }

    public abstract java.lang.String l();
}
