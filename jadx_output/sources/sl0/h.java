package sl0;

/* loaded from: classes11.dex */
public class h implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl0.o f409126a;

    public h(sl0.o oVar) {
        this.f409126a = oVar;
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        boolean z17;
        m33.b1 a17 = m33.a1.a();
        boolean z18 = false;
        if (a17 != null) {
            z17 = ((com.tencent.mm.plugin.game.h0) a17).Vi(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } else {
            z17 = false;
        }
        boolean b17 = sl0.o.b(this.f409126a, 8388608L);
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        if (z17 && !b17 && !isTeenMode) {
            z18 = true;
        }
        return java.lang.Boolean.valueOf(z18);
    }
}
