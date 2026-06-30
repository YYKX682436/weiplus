package zo1;

/* loaded from: classes5.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474596e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f474597f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI f474598g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f474599h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f474600i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.tencent.mm.ui.widget.dialog.u3 u3Var, int i17, com.tencent.wechat.aff.affroam.g gVar, com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectPackageUI selectPackageUI, int i18, long j17) {
        super(0);
        this.f474595d = u3Var;
        this.f474596e = i17;
        this.f474597f = gVar;
        this.f474598g = selectPackageUI;
        this.f474599h = i18;
        this.f474600i = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.wechat.aff.affroam.g gVar;
        this.f474595d.hide();
        if (this.f474596e == 0 && (gVar = this.f474597f) != null) {
            zo1.k4 k4Var = this.f474598g.f92869h;
            k4Var.getClass();
            java.util.Iterator it = k4Var.f474674e.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((com.tencent.wechat.aff.affroam.g) it.next()).f215829d == gVar.f215829d) {
                    break;
                }
                i17++;
            }
            if (i17 >= 0) {
                k4Var.f474674e.set(i17, gVar);
                k4Var.notifyItemChanged(i17);
            }
            if ((this.f474599h & 1) == 0) {
                ((ku5.t0) ku5.t0.f312615d).q(new zo1.c5(this.f474600i));
            } else {
                ku5.u0 u0Var = ku5.t0.f312615d;
                zo1.d5 d5Var = new zo1.d5(this.f474600i, this.f474599h, this.f474597f);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.t(d5Var, 3000L, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
