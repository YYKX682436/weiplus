package fo2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f264893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f264894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fo2.e f264895f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.ui.widget.dialog.k0 k0Var, db5.g4 g4Var, fo2.e eVar) {
        super(1);
        this.f264893d = k0Var;
        this.f264894e = g4Var;
        this.f264895f = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        if (fVar.b()) {
            r45.xr0 xr0Var = (r45.xr0) fVar.f70618d;
            if (xr0Var.f390355h == 2 && xr0Var.f390356i != 1) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f264893d;
                if (k0Var.i()) {
                    this.f264894e.l(20009, this.f264895f.f434158a.getResources().getString(com.tencent.mm.R.string.f491924m44), com.tencent.mm.R.raw.vip_filled_new, false);
                    k0Var.j();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
