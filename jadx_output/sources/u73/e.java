package u73;

/* loaded from: classes9.dex */
public class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u73.g f425122d;

    public e(u73.g gVar) {
        this.f425122d = gVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        java.util.Iterator it = this.f425122d.f425125e.f374594d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.wk4 wk4Var = (r45.wk4) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wk4Var.f389229d)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(wk4Var.f389230e)) {
                    g4Var.f(i17, wk4Var.f389229d);
                } else {
                    g4Var.d(i17, com.tencent.mm.plugin.wallet_core.utils.z1.b(wk4Var.f389230e, true), wk4Var.f389229d);
                }
                i17++;
            }
        }
    }
}
