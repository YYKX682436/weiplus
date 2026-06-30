package r35;

/* loaded from: classes11.dex */
public class m implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.o f369179d;

    public m(r35.o oVar) {
        this.f369179d = oVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r35.o oVar = this.f369179d;
        android.app.ProgressDialog progressDialog = oVar.f369224p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (oVar.f369226r != null) {
            gm0.j1.i();
            gm0.j1.n().f273288b.q(106, oVar.f369226r);
        }
        if (oVar.f369224p == null && !oVar.f369232x) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddContactDialog", "has cancel the loading dialog");
            oVar.b(0);
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddContactDialog", "searchContact onSceneEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            oVar.b(-1);
            return;
        }
        android.content.Context context = oVar.f369215d;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddContactDialog", "searchContact, context is null, msghandler has already been detached!");
            oVar.b(-1);
            return;
        }
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddContactDialog", "searchContact, context isFinishing");
            oVar.b(-1);
            return;
        }
        r45.iw5 H = ((tg3.r1) m1Var).H();
        java.lang.String g17 = x51.j1.g(H.f377356d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddContactDialog", "searchContact, user is null");
            android.content.Context context2 = oVar.f369215d;
            db5.e1.U(context2, context2.getResources().getString(com.tencent.mm.R.string.las), 1);
            oVar.b(-1);
            return;
        }
        java.lang.String str2 = oVar.f369228t;
        if (str2 == null || !str2.equals(g17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AddContactDialog", "user not the same, %s, %s", oVar.f369228t, g17);
        }
        gm0.j1.i();
        oVar.f369227s = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, true);
        com.tencent.mm.storage.z3 z3Var = oVar.f369227s;
        if (z3Var == null || ((int) z3Var.E2) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContactDialog", "searchContact, no contact with username = " + g17 + ", try get by alias");
            gm0.j1.i();
            oVar.f369227s = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(g17);
            com.tencent.mm.storage.z3 z3Var2 = oVar.f369227s;
            if (z3Var2 == null || ((int) z3Var2.E2) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AddContactDialog", "searchContact, no contact with alias, new Contact");
                oVar.f369227s = new com.tencent.mm.storage.z3(g17);
                oVar.f369227s.k1(H.f377369t);
                oVar.f369227s.M1(x51.j1.g(H.f377357e));
                oVar.f369227s.R1(x51.j1.g(H.f377358f));
                oVar.f369227s.S1(x51.j1.g(H.f377359g));
                oVar.f369227s.g3(H.f377360h);
                oVar.f369227s.c3(com.tencent.mm.storage.ha.q(H.A, H.f377362m, H.f377363n));
                oVar.f369227s.h3(H.f377364o);
                oVar.f369227s.Z1(H.f377366q);
                oVar.f369227s.o3(H.f377367r);
                oVar.f369227s.a2(H.f377371v);
                oVar.f369227s.b2(H.f377370u);
                oVar.f369227s.p3(H.f377368s);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AddContactDialog", "searchContact, contact in db, %s", g17);
        }
        oVar.g(oVar.f369227s);
    }
}
