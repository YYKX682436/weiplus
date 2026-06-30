package uh5;

/* loaded from: classes12.dex */
public final class f implements sf3.c {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f428007a = new jt0.i(400, new uh5.e(), uh5.f.class);

    /* renamed from: b, reason: collision with root package name */
    public final kk.j f428008b = new jt0.i(10, uh5.f.class);

    @Override // sf3.c
    public android.graphics.Bitmap a(sf3.g param) {
        kotlin.jvm.internal.o.g(param, "param");
        return (android.graphics.Bitmap) ((jt0.i) (param.f407391e == sf3.m.f407406h ? this.f428007a : this.f428008b)).get(param.c());
    }

    @Override // sf3.c
    public void b(sf3.g param, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(param, "param");
        if (bitmap == null) {
            return;
        }
        ((jt0.i) (param.f407391e == sf3.m.f407406h ? this.f428007a : this.f428008b)).put(param.c(), bitmap);
    }
}
