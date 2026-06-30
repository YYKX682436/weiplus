package sl0;

/* loaded from: classes11.dex */
public class l implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl0.o f409171a;

    public l(sl0.o oVar) {
        this.f409171a = oVar;
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        boolean b17 = sl0.o.b(this.f409171a, 2097152L);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        j45.l.g(ya.a.SEARCH);
        return java.lang.Boolean.valueOf((b17 || isTeenMode) ? false : true);
    }
}
