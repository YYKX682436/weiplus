package j0;

/* loaded from: classes14.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g2.g0 f296613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f296614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g2.l f296615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f296616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f296617i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g0.f f296618m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g2.v f296619n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j0.c5 c5Var, g2.g0 g0Var, g2.e0 e0Var, g2.l lVar, k0.y0 y0Var, kotlinx.coroutines.y0 y0Var2, g0.f fVar, g2.v vVar) {
        super(1);
        this.f296612d = c5Var;
        this.f296613e = g0Var;
        this.f296614f = e0Var;
        this.f296615g = lVar;
        this.f296616h = y0Var;
        this.f296617i = y0Var2;
        this.f296618m = fVar;
        this.f296619n = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j0.d5 d5Var;
        c1.i0 it = (c1.i0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        j0.c5 c5Var = this.f296612d;
        c1.j0 j0Var = (c1.j0) it;
        if (c5Var.b() != j0Var.i()) {
            ((n0.q4) c5Var.f296237e).setValue(java.lang.Boolean.valueOf(j0Var.i()));
            g2.g0 g0Var = this.f296613e;
            if (g0Var != null) {
                if (c5Var.b()) {
                    j0.s3 s3Var = j0.t3.f296570a;
                    yz5.l onValueChange = c5Var.f296247o;
                    yz5.l onImeActionPerformed = c5Var.f296248p;
                    g2.e0 value = this.f296614f;
                    kotlin.jvm.internal.o.g(value, "value");
                    g2.e editProcessor = c5Var.f296235c;
                    kotlin.jvm.internal.o.g(editProcessor, "editProcessor");
                    g2.l imeOptions = this.f296615g;
                    kotlin.jvm.internal.o.g(imeOptions, "imeOptions");
                    kotlin.jvm.internal.o.g(onValueChange, "onValueChange");
                    kotlin.jvm.internal.o.g(onImeActionPerformed, "onImeActionPerformed");
                    c5Var.f296236d = s3Var.a(g0Var, value, editProcessor, imeOptions, onValueChange, onImeActionPerformed);
                } else {
                    j0.p1.f(c5Var);
                }
                if (j0Var.i() && (d5Var = c5Var.f296239g) != null) {
                    kotlinx.coroutines.l.d(this.f296617i, null, null, new j0.v0(this.f296618m, this.f296614f, c5Var, d5Var, this.f296619n, null), 3, null);
                }
            }
            if (!j0Var.i()) {
                this.f296616h.g(null);
            }
        }
        return jz5.f0.f302826a;
    }
}
