package os3;

/* loaded from: classes8.dex */
public class e0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348062d;

    public e0(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348062d = composeUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348062d;
        if (!composeUI.F || !com.tencent.mm.plugin.qqmail.ui.ComposeUI.T6(composeUI, false) || composeUI.M != 20) {
            return true;
        }
        ks3.j jVar = new ks3.j();
        jVar.f311690d = composeUI.B;
        jVar.f311691e = composeUI.C;
        jVar.f311692f = composeUI.f154833e.getMailAddrs();
        jVar.f311693g = composeUI.f154837i.getMailAddrs();
        jVar.f311694h = composeUI.f154841o.getMailAddrs();
        jVar.f311696m = composeUI.f154844q.getText().toString();
        jVar.f311695i = composeUI.f154853y.e();
        int i17 = composeUI.M;
        if (i17 != 21 && i17 == 20) {
            jVar.f311697n = composeUI.X6();
            jVar.f311698o = composeUI.M;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mail.ComposeUI", "save draft mail as normal mode");
        }
        ks3.i iVar = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f311707c;
        ks3.s sVar = iVar.f311686a;
        try {
            sVar.a();
            java.lang.String str = sVar.f311746a + iVar.a(jVar.f311691e, jVar.f311690d);
            byte[] byteArray = jVar.toByteArray();
            com.tencent.mm.vfs.w6.S(str, byteArray, 0, byteArray.length);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DraftBoxMgr", e17, "", new java.lang.Object[0]);
        }
        db5.d5 d5Var = composeUI.E;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        composeUI.E = db5.t7.o(composeUI, composeUI.getString(com.tencent.mm.R.string.hjy), 2000L);
        return true;
    }
}
