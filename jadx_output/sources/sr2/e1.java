package sr2;

/* loaded from: classes10.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f411544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(sr2.o1 o1Var) {
        super(0);
        this.f411544d = o1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        zv2.c cVar = zv2.m.f476411t;
        sr2.o1 o1Var = this.f411544d;
        cVar.a(o1Var.getActivity(), true, false);
        java.lang.String username = o1Var.f411659m;
        kotlin.jvm.internal.o.g(username, "username");
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, username, false, 2, null);
        int i17 = j37 != null ? j37.field_extFlag : 0;
        boolean z17 = (4194304 & i17) != 0;
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostChecker", "checkWindowProductSpam extFlag:" + i17 + ", ret " + z17);
        if (z17) {
            r45.za5 za5Var = (r45.za5) bVar.k2().e().getCustom(16);
            if (za5Var == null || (str = za5Var.getString(0)) == null) {
                str = "";
            }
            db5.e1.E(o1Var.getActivity(), str, "", o1Var.getActivity().getString(com.tencent.mm.R.string.f490454vi), true, null);
        } else {
            o1Var.S6(1);
            yz5.a aVar = o1Var.f411658i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
