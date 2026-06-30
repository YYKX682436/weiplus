package n7;

/* loaded from: classes13.dex */
public abstract class c implements n7.h {

    /* renamed from: d, reason: collision with root package name */
    public final int f335227d;

    /* renamed from: e, reason: collision with root package name */
    public final int f335228e;

    /* renamed from: f, reason: collision with root package name */
    public m7.b f335229f;

    public c() {
        if (!q7.p.f(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new java.lang.IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f335227d = Integer.MIN_VALUE;
        this.f335228e = Integer.MIN_VALUE;
    }

    @Override // n7.h
    public final m7.b a() {
        return this.f335229f;
    }

    @Override // n7.h
    public final void d(m7.b bVar) {
        this.f335229f = bVar;
    }

    @Override // n7.h
    public final void e(n7.g gVar) {
    }

    @Override // n7.h
    public final void f(n7.g gVar) {
        ((m7.h) gVar).l(this.f335227d, this.f335228e);
    }

    @Override // n7.h
    public void g(android.graphics.drawable.Drawable drawable) {
    }

    @Override // n7.h
    public void h(android.graphics.drawable.Drawable drawable) {
    }

    @Override // j7.k
    public void onDestroy() {
    }

    @Override // j7.k
    public void onStart() {
    }

    @Override // j7.k
    public void onStop() {
    }
}
