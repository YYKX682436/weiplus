package xm;

/* loaded from: classes11.dex */
public class k implements xm.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xm.n f455153a;

    public k(xm.n nVar) {
        this.f455153a = nVar;
    }

    @Override // xm.b
    public java.lang.Object getData() {
        boolean b17 = xm.n.b(this.f455153a, 2097152L);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        j45.l.g(ya.a.SEARCH);
        return java.lang.Boolean.valueOf((b17 || isTeenMode) ? false : true);
    }
}
