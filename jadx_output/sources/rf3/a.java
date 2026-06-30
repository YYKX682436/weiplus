package rf3;

/* loaded from: classes12.dex */
public final class a implements sf3.c {

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f394979a = new jt0.i(10, rf3.a.class);

    @Override // sf3.c
    public android.graphics.Bitmap a(sf3.g param) {
        kotlin.jvm.internal.o.g(param, "param");
        return (android.graphics.Bitmap) ((jt0.i) this.f394979a).get(param.c());
    }

    @Override // sf3.c
    public void b(sf3.g param, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(param, "param");
        if (bitmap == null) {
            return;
        }
        ((jt0.i) this.f394979a).put(param.c(), bitmap);
    }
}
