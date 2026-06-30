package pk2;

/* loaded from: classes3.dex */
public final class l4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f355952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.n4 f355953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f355954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(pk2.o9 o9Var, boolean z17, pk2.n4 n4Var, v65.n nVar) {
        super(2);
        this.f355951d = o9Var;
        this.f355952e = z17;
        this.f355953f = n4Var;
        this.f355954g = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        pk2.o9 o9Var = this.f355951d;
        mm2.o4 o4Var = (mm2.o4) o9Var.c(mm2.o4.class);
        boolean z17 = this.f355952e;
        o4Var.G = z17;
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        if (booleanValue) {
            java.lang.String string = z17 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.jnq) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493301jo0);
            kotlin.jvm.internal.o.d(string);
            if (this.f355953f.n()) {
                if (z17) {
                    qf2.z3 z3Var = (qf2.z3) o9Var.e(qf2.z3.class);
                    if (z3Var != null) {
                        if (z3Var.f362679m == null) {
                            z3Var.f362679m = new com.tencent.mm.plugin.finder.live.widget.k8(z3Var.O6(), z3Var);
                        }
                        com.tencent.mm.plugin.finder.live.widget.k8 k8Var = z3Var.f362679m;
                        if (k8Var != null) {
                            k8Var.h0(false);
                        }
                    }
                } else {
                    qf2.z3 z3Var2 = (qf2.z3) o9Var.e(qf2.z3.class);
                    if (z3Var2 != null) {
                        z3Var2.b7("", "SwitchClose");
                    }
                }
            }
            db5.t7.h(mMActivity, string);
        } else {
            db5.t7.b(mMActivity, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491440d36));
        }
        this.f355954g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
