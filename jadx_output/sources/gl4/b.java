package gl4;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl4.z f272844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f272845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f272846f;

    public b(gl4.z zVar, android.content.Context context, yz5.l lVar) {
        this.f272844d = zVar;
        this.f272845e = context;
        this.f272846f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f272845e;
        yz5.l lVar = this.f272846f;
        gl4.z zVar = this.f272844d;
        jm4.c2 c2Var = (jm4.c2) ((jz5.n) zVar.f272899a).getValue();
        if (c2Var != null) {
            gl4.c cVar = new gl4.c(false, true, zVar, context, lVar);
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f300446i = cVar;
            urgen.ur_0025.UR_B0D8.UR_2A8C(((jm4.d2) c2Var).getCppPointer(), true, x1Var);
        }
    }
}
