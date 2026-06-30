package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.i1 f155415d;

    public h1(com.tencent.mm.plugin.record.ui.i1 i1Var) {
        this.f155415d = i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ec5.a aVar;
        com.tencent.mm.vfs.x1 m17;
        int itemId = menuItem.getItemId();
        int i18 = 1;
        com.tencent.mm.plugin.record.ui.i1 i1Var = this.f155415d;
        if (itemId != 0) {
            if (itemId == 1 && i1Var.f155419d.f155303y != null) {
                ((d73.i) i95.n0.c(d73.i.class)).f6(i1Var.f155419d.f155303y);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = i1Var.f155419d;
        int i19 = com.tencent.mm.plugin.record.ui.RecordMsgFileUI.H;
        if (recordMsgFileUI.T6() == 8) {
            com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI2 = i1Var.f155419d;
            java.lang.String t17 = bt3.g2.t(recordMsgFileUI2.f155300v, recordMsgFileUI2.f155298t, recordMsgFileUI2.f155297s, 1);
            if (!com.tencent.mm.vfs.w6.j(t17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgFileUI", "share file failed, file not exists");
                com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI3 = i1Var.f155419d;
                dp.a.makeText(recordMsgFileUI3, recordMsgFileUI3.getString(com.tencent.mm.R.string.ccu), 1).show();
                return;
            }
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(t17);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            long j17 = 0;
            if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                j17 = m17.f213233c;
            }
            if (j17 > com.tencent.mm.plugin.record.ui.RecordMsgFileUI.G) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecordMsgFileUI", "share file failed, file too large");
                com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI4 = i1Var.f155419d;
                dp.a.makeText(recordMsgFileUI4, recordMsgFileUI4.getString(com.tencent.mm.R.string.ccv), 1).show();
                return;
            }
        }
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI5 = i1Var.f155419d;
        recordMsgFileUI5.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", true);
        intent.putExtra("mutil_select_is_ret", true);
        if (recordMsgFileUI5.T6() == 15) {
            intent.putExtra("image_path", recordMsgFileUI5.U6());
            jd5.c cVar = new jd5.c();
            cVar.r(bt3.g2.t(recordMsgFileUI5.f155300v, recordMsgFileUI5.f155298t, recordMsgFileUI5.f155297s, 1));
            cVar.q(recordMsgFileUI5.f155300v.f375448y);
            cVar.o(recordMsgFileUI5.U6());
            i18 = 11;
            aVar = cVar;
        } else if (recordMsgFileUI5.T6() == 4) {
            intent.putExtra("image_path", recordMsgFileUI5.U6());
            jd5.c cVar2 = new jd5.c();
            cVar2.r(bt3.g2.t(recordMsgFileUI5.f155300v, recordMsgFileUI5.f155298t, recordMsgFileUI5.f155297s, 1));
            cVar2.q(recordMsgFileUI5.f155300v.f375448y);
            cVar2.o(recordMsgFileUI5.U6());
            aVar = cVar2;
        } else {
            intent.putExtra("desc_title", recordMsgFileUI5.f155300v.f375404d);
            ec5.a aVar2 = new ec5.a();
            e35.g.f247590a.a(recordMsgFileUI5.f155300v.f375404d, 202);
            aVar2.l(bt3.g2.t(recordMsgFileUI5.f155300v, recordMsgFileUI5.f155298t, recordMsgFileUI5.f155297s, 1));
            n13.v vVar = n13.v.f334140a;
            r45.gp0 gp0Var = recordMsgFileUI5.f155300v;
            aVar2.k(vVar.b(gp0Var.f375404d, gp0Var.K, gp0Var.R));
            i18 = 3;
            aVar = aVar2;
        }
        intent.putExtra("Retr_Msg_Type", i18);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(recordMsgFileUI5, aVar, n13.r.a(1001));
    }
}
