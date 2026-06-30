package j11;

@j95.b
/* loaded from: classes11.dex */
public class q extends i95.w implements ct.z2 {

    /* renamed from: d, reason: collision with root package name */
    public j11.g f297143d;

    /* renamed from: e, reason: collision with root package name */
    public volatile c01.k7 f297144e;

    public static j11.g Ai() {
        gm0.j1.b().c();
        if (((j11.q) i95.n0.c(j11.q.class)).f297143d == null) {
            ((j11.q) i95.n0.c(j11.q.class)).f297143d = new j11.g(c01.d9.b().s());
        }
        return ((j11.q) i95.n0.c(j11.q.class)).f297143d;
    }

    public c01.p8 wi() {
        if (this.f297144e == null) {
            synchronized (this) {
                if (this.f297144e == null) {
                    this.f297144e = new c01.k7(new j11.h());
                }
            }
        }
        return this.f297144e;
    }
}
