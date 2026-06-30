package dm3;

/* loaded from: classes11.dex */
public final class x extends dm3.e0 {

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f241749z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t tVar) {
        super(str, container, j0Var, tVar);
        kotlin.jvm.internal.o.g(container, "container");
        this.f241749z = "MicroMsg.TingCardFeedView#" + hashCode();
    }

    @Override // dm3.e0, al5.a0
    public void b() {
        i();
        g();
    }

    @Override // dm3.e0, al5.a0
    public void c() {
        b();
    }

    @Override // al5.a0
    public boolean e() {
        return true;
    }

    @Override // dm3.e0
    public java.lang.String o() {
        return this.f241749z;
    }

    @Override // al5.a0, pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // dm3.e0
    public void r() {
    }
}
