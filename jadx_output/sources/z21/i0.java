package z21;

/* loaded from: classes12.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f469601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f469602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z21.j0 f469603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f469605h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, int i18, z21.j0 j0Var, java.lang.String str, int i19) {
        super(0);
        this.f469601d = i17;
        this.f469602e = i18;
        this.f469603f = j0Var;
        this.f469604g = str;
        this.f469605h = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f469602e;
        z21.j0 j0Var = this.f469603f;
        int i18 = this.f469601d;
        if (i18 == 0 && i17 == 0) {
            z21.b bVar = j0Var.f469622e;
            if (bVar != null) {
                java.lang.String[] strArr = {j0Var.f469630m};
                z21.a0 a0Var = j0Var.f469620c;
                bVar.a(strArr, a0Var != null ? a0Var.e() : null);
            }
            if (j0Var.d()) {
                j0Var.h();
                z21.b bVar2 = j0Var.f469622e;
                if (bVar2 != null) {
                    bVar2.d(j0Var.f469631n);
                }
                j0Var.g();
            }
        } else {
            j0Var.h();
            if (i18 == 3 && i17 == -1) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputController", "getStack([ %s ]), ThreadID: %s", new com.tencent.mm.sdk.platformtools.z3(), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            }
            z21.b bVar3 = j0Var.f469622e;
            java.lang.String str = this.f469604g;
            if (str == null || !r26.i0.p(str, "SecurityCheckError", true)) {
                if (str == null || !r26.i0.p(str, "ReadFileLengthError", true)) {
                    int i19 = this.f469605h;
                    if (i19 != 0) {
                        if (bVar3 != null) {
                            bVar3.e(20, this.f469601d, i19, -1L);
                        }
                    } else if (bVar3 != null) {
                        bVar3.e(11, this.f469601d, this.f469602e, i19);
                    }
                } else if (bVar3 != null) {
                    bVar3.e(13, 133, -1, -1L);
                }
            } else if (bVar3 != null) {
                bVar3.e(13, 132, -1, -1L);
            }
        }
        return jz5.f0.f302826a;
    }
}
