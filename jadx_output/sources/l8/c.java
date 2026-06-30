package l8;

/* loaded from: classes14.dex */
public final class c extends h1.c implements n0.e4 {

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f316984i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f316985m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f316986n;

    public c(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f316984i = drawable;
        this.f316985m = n0.s4.c(0, null, 2, null);
        this.f316986n = jz5.h.b(new l8.b(this));
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f316984i.setAlpha(e06.p.f(a06.d.b(f17 * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n0.e4
    public void b() {
        android.graphics.drawable.Drawable.Callback callback = (android.graphics.drawable.Drawable.Callback) ((jz5.n) this.f316986n).getValue();
        android.graphics.drawable.Drawable drawable = this.f316984i;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) drawable).start();
        }
    }

    @Override // n0.e4
    public void c() {
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n0.e4
    public void d() {
        android.graphics.drawable.Drawable drawable = this.f316984i;
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f316984i.setColorFilter(zVar == null ? null : zVar.f246325a);
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
        return this.f316984i.setLayoutDirection(i17);
    }

    @Override // h1.c
    public long h() {
        android.graphics.drawable.Drawable drawable = this.f316984i;
        return d1.l.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        e1.u a17 = ((g1.b) iVar.p()).a();
        ((java.lang.Number) ((n0.q4) this.f316985m).getValue()).intValue();
        int b17 = a06.d.b(d1.k.d(iVar.a()));
        int b18 = a06.d.b(d1.k.b(iVar.a()));
        android.graphics.drawable.Drawable drawable = this.f316984i;
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
