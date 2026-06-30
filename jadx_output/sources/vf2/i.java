package vf2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf2.q f436340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vf2.q qVar) {
        super(0);
        this.f436340d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(4);
        vf2.q qVar = this.f436340d;
        if (qVar.f436354m == null) {
            r45.xq1 xq1Var = ((mm2.c1) qVar.business(mm2.c1.class)).C2;
            if (xq1Var != null && (string = xq1Var.getString(2)) != null) {
                java.lang.String str = string.length() > 0 ? string : null;
                if (str != null) {
                    ke2.y yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
                    yVar.t(qVar.O6(), qVar.O6().getResources().getString(com.tencent.mm.R.string.f9y), 0L);
                    pq5.g l17 = yVar.l();
                    l17.f((com.tencent.mm.ui.MMActivity) qVar.O6());
                    l17.K(new vf2.k(qVar, str));
                }
            }
        } else {
            com.tencent.mm.plugin.finder.live.util.y.o(qVar, null, null, new vf2.l(qVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
