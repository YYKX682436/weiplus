package sz0;

/* loaded from: classes14.dex */
public final class c extends h1.c implements n0.e4 {

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f413914i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f413915m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f413916n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f413917o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f413918p;

    public c(java.lang.String key, android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f413914i = drawable;
        this.f413915m = n0.s4.c(0, null, 2, null);
        this.f413916n = n0.s4.c(new d1.k(sz0.e.a(drawable)), null, 2, null);
        this.f413918p = jz5.h.b(new sz0.b(this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f413914i.setAlpha(e06.p.f(a06.d.b(f17 * 255), 0, 255));
        return true;
    }

    @Override // n0.e4
    public void b() {
        android.graphics.drawable.Drawable.Callback callback = (android.graphics.drawable.Drawable.Callback) ((jz5.n) this.f413918p).getValue();
        android.graphics.drawable.Drawable drawable = this.f413914i;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (this.f413917o) {
            return;
        }
        if (drawable instanceof com.tencent.mm.plugin.gif.u) {
            ((com.tencent.mm.plugin.gif.u) drawable).d();
        }
        if (drawable instanceof com.tencent.mm.plugin.gif.k) {
            ((com.tencent.mm.plugin.gif.k) drawable).d();
        }
    }

    @Override // n0.e4
    public void c() {
        android.graphics.drawable.Drawable drawable = this.f413914i;
        if (drawable instanceof com.tencent.mm.plugin.gif.u) {
            ((com.tencent.mm.plugin.gif.u) drawable).b();
        }
        if (drawable instanceof com.tencent.mm.plugin.gif.k) {
            ((com.tencent.mm.plugin.gif.k) drawable).b();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // n0.e4
    public void d() {
        android.graphics.drawable.Drawable drawable = this.f413914i;
        if (drawable instanceof com.tencent.mm.plugin.gif.u) {
            ((com.tencent.mm.plugin.gif.u) drawable).b();
        }
        if (drawable instanceof com.tencent.mm.plugin.gif.k) {
            ((com.tencent.mm.plugin.gif.k) drawable).b();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f413914i.setColorFilter(zVar != null ? zVar.f246325a : null);
        return true;
    }

    @Override // h1.c
    public boolean f(p2.s layoutDirection) {
        int i17;
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i17 = 1;
            if (ordinal != 1) {
                throw new jz5.j();
            }
        } else {
            i17 = 0;
        }
        return this.f413914i.setLayoutDirection(i17);
    }

    @Override // h1.c
    public long h() {
        return ((d1.k) ((n0.q4) this.f413916n).getValue()).f225644a;
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        e1.u a17 = ((g1.b) iVar.p()).a();
        ((java.lang.Number) ((n0.q4) this.f413915m).getValue()).intValue();
        int b17 = a06.d.b(d1.k.d(iVar.a()));
        int b18 = a06.d.b(d1.k.b(iVar.a()));
        android.graphics.drawable.Drawable drawable = this.f413914i;
        drawable.setBounds(0, 0, b17, b18);
        try {
            a17.c();
            android.graphics.Canvas canvas = e1.c.f246229a;
            drawable.draw(((e1.b) a17).f246225a);
        } finally {
            a17.b();
        }
    }
}
