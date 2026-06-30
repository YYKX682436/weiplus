package cr3;

/* loaded from: classes11.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f221960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221961e;

    public p(cr3.d0 d0Var, android.widget.CheckBox checkBox) {
        this.f221961e = d0Var;
        this.f221960d = checkBox;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        c01.g8 g8Var;
        cr3.d0 d0Var = this.f221961e;
        com.tencent.mm.storage.z3 z3Var = d0Var.f221932e;
        iz5.a.g(null, z3Var != null);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        n17.E2();
        if (com.tencent.mm.storage.z3.m4(z3Var.d1())) {
            vg3.e4 e4Var = (vg3.e4) i95.n0.c(vg3.e4.class);
            java.lang.String d17 = z3Var.d1();
            ((np.h) e4Var).getClass();
            op.c cVar = new op.c(true);
            cVar.a(new p41.w(d17, 1));
            g8Var = cVar;
        } else {
            g8Var = np.b.c(n17);
        }
        if (g8Var != null) {
            op.a aVar = (op.a) g8Var;
            ((java.util.ArrayList) aVar.f347218c).add(new cr3.s(d0Var));
            com.tencent.mm.ui.MMActivity mMActivity = d0Var.f221931d;
            ((op.c) aVar).b(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490604zq), true, false, null);
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436683i, vg3.b.f436645e, vg3.c.f436657i, 0, new java.util.ArrayList(java.util.Collections.singletonList(d0Var.f221932e.d1()))));
        }
        if (g8Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileMenuManager", "dealSetBlack iContactCallbackFactory is null????");
        } else {
            ((java.util.ArrayList) ((op.a) g8Var).f347216a).add(new cr3.h(this));
        }
        com.tencent.mm.plugin.profile.p2.Bi(d0Var.f221931d.getIntent(), 14, 3, d0Var.f221932e.d1());
    }
}
