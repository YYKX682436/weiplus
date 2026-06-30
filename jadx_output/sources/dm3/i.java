package dm3;

/* loaded from: classes10.dex */
public final class i extends dm3.o {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f241701w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t tVar, int i17) {
        super(str, container, j0Var, tVar, i17);
        kotlin.jvm.internal.o.g(container, "container");
        this.f241701w = "MicroMsg.MusicCardFeedView#" + hashCode();
    }

    @Override // dm3.o, al5.a0
    public void b() {
        this.f241725r = false;
        i();
        g();
    }

    @Override // dm3.o, al5.a0
    public void c() {
        b();
    }

    @Override // dm3.o
    public java.lang.String m() {
        return this.f241701w;
    }
}
