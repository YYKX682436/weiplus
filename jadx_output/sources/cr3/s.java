package cr3;

/* loaded from: classes11.dex */
public class s extends np.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221963d;

    public s(cr3.d0 d0Var) {
        this.f221963d = d0Var;
    }

    @Override // c01.g1
    public void a(int i17, int i18, java.lang.String str, c01.g1 g1Var) {
        np.c cVar = (np.c) g1Var;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = cVar != null ? java.lang.Integer.valueOf(cVar.f338780a) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "moveInBlackList errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        vg3.n3 a17 = vg3.n3.f436736n1.a();
        vg3.d dVar = vg3.d.f436683i;
        vg3.b bVar = vg3.b.f436646f;
        vg3.c cVar2 = vg3.c.f436657i;
        int i19 = this.f338780a;
        cr3.d0 d0Var = this.f221963d;
        ((com.tencent.mm.plugin.messenger.foundation.g) a17).wi(new vg3.e(dVar, bVar, cVar2, i19, new java.util.ArrayList(java.util.Collections.singletonList(d0Var.f221932e.d1()))));
        int i27 = this.f338780a;
        com.tencent.mm.ui.MMActivity mMActivity = d0Var.f221931d;
        if (i27 == 0) {
            d0Var.f221932e.E2();
            np.b.a(d0Var.f221932e);
            db5.t7.makeText(mMActivity, com.tencent.mm.R.string.hmn, 1).show();
            return;
        }
        d0Var.f221932e.r3();
        np.b.b(d0Var.f221932e);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(this.f338781b) ? "" : this.f338781b;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f338782c)) {
            str = this.f338782c;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = mMActivity.getString(com.tencent.mm.R.string.hmm);
        }
        db5.e1.y(mMActivity, str, str2, mMActivity.getString(com.tencent.mm.R.string.l_e), new cr3.r(this));
        cr3.d0.a(d0Var);
    }
}
