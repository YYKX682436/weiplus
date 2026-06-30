package hq5;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.r f283253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hq5.r rVar) {
        super(1);
        this.f283253d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        eq5.h state = (eq5.h) obj;
        kotlin.jvm.internal.o.g(state, "state");
        eq5.i iVar = (eq5.i) state.a(eq5.i.class);
        jq5.l lVar = jq5.n.f301282a;
        hq5.r rVar = this.f283253d;
        if (iVar != null) {
            com.tencent.mm.wedrop.ui.view.PermissionAreaView U6 = rVar.U6();
            if (U6 != null) {
                U6.setVisibility(8);
            }
            rVar.f283262g = false;
            int i17 = iVar.f255922b;
            if (i17 == 14) {
                com.tencent.mm.wedrop.ui.view.PermissionAreaView U62 = rVar.U6();
                if (U62 != null) {
                    U62.setVisibility(0);
                }
                if (rVar.f283261f) {
                    rVar.V6();
                } else {
                    rVar.f283261f = true;
                    com.tencent.mm.wedrop.ui.view.PermissionAreaView U63 = rVar.U6();
                    if (U63 != null) {
                        iq5.a b17 = lVar.b(rVar.getContext());
                        java.lang.String string = rVar.getContext().getString(com.tencent.mm.R.string.nr7);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        b17.f293802d = string;
                        U63.setViewModel(b17);
                    }
                }
            } else if (i17 == 17) {
                rVar.f283262g = true;
            }
        }
        if (((eq5.b) state.a(eq5.b.class)) != null) {
            if (lVar.c()) {
                rVar.T6();
            } else {
                v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) rVar.f283260e).getValue(), null, new hq5.n(rVar, null), 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
