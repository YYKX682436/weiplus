package kf3;

/* loaded from: classes12.dex */
public class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf3.s0 f307422d;

    public r0(kf3.s0 s0Var) {
        this.f307422d = s0Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            kf3.s0 s0Var = this.f307422d;
            if3.y yVar = (if3.y) s0Var.f307428e.f148528f.getItem(s0Var.f307427d);
            if (yVar == null) {
                return;
            }
            java.lang.String c17 = yVar.c();
            com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = s0Var.f307428e;
            if (c17.equals(massSendHistoryUI.f148528f.f307378q)) {
                massSendHistoryUI.U6();
            }
            if3.z Ai = if3.k0.Ai();
            java.lang.String c18 = yVar.c();
            l75.k0 k0Var = Ai.f291232d;
            android.database.Cursor B = k0Var.B("select * from massendinfo ORDER BY createtime DESC  limit 2", null);
            if (B != null) {
                if (B.getCount() == 0) {
                    B.close();
                } else if (B.getCount() == 1) {
                    B.moveToFirst();
                    if3.y yVar2 = new if3.y();
                    yVar2.b(B);
                    B.close();
                    com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
                    l4Var.b2("masssendapp");
                    l4Var.l1(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.bex));
                    l4Var.n1(yVar2.f291213f);
                    l4Var.M1(0);
                    l4Var.Y1(0);
                    ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(l4Var, "masssendapp");
                } else {
                    B.moveToPosition(1);
                    if3.y yVar3 = new if3.y();
                    yVar3.b(B);
                    B.close();
                    com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4();
                    l4Var2.b2("masssendapp");
                    l4Var2.l1(Ai.y0(yVar3));
                    l4Var2.n1(yVar3.f291213f);
                    l4Var2.M1(0);
                    l4Var2.Y1(0);
                    ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(l4Var2, "masssendapp");
                }
            }
            if (k0Var.delete("massendinfo", "clientid= ?", new java.lang.String[]{"" + c18}) > 0) {
                Ai.doNotify();
            }
            massSendHistoryUI.getClass();
            java.lang.String d17 = yVar.d();
            int i18 = yVar.f291219o;
            if (i18 == 3) {
                java.lang.String str = if3.f0.a() + d17;
                if (str.equals("") || !com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MassSendHistoryUI", "deleteImg : imgPath is null");
                    return;
                } else {
                    com.tencent.mm.vfs.w6.h(str);
                    return;
                }
            }
            if (i18 == 34) {
                java.lang.String vj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).vj(bm5.y.f22757j, d17, false);
                if (!com.tencent.mm.vfs.w6.j(vj6)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", d17, vj6);
                }
                com.tencent.mm.vfs.w6.h(vj6);
                return;
            }
            if (i18 != 43) {
                return;
            }
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, yVar.d(), false);
            if (!com.tencent.mm.vfs.w6.j(rj6)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", yVar.d(), rj6);
            }
            com.tencent.mm.vfs.w6.h(rj6);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, yVar.d(), false);
            if (!com.tencent.mm.vfs.w6.j(tj6)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MassSendHistoryUI", "delete, file %s not exist!, fullPath: %s", yVar.d(), tj6);
            }
            com.tencent.mm.vfs.w6.h(tj6);
        }
    }
}
