package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155462d;

    public o1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI) {
        this.f155462d = recordMsgImageUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155462d;
        com.tencent.mm.plugin.fav.ui.gallery.r V6 = recordMsgImageUI.V6();
        if (V6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShowImageUI", "onMMMenuItemSelected: dataItem is null");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                recordMsgImageUI.T6();
                return;
            }
            if (itemId != 2) {
                return;
            }
            java.lang.String j17 = V6.j();
            recordMsgImageUI.getClass();
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(recordMsgImageUI.getContext(), j17, new com.tencent.mm.plugin.record.ui.p1(recordMsgImageUI, j17));
            return;
        }
        java.lang.String w17 = V6.w();
        java.lang.String j18 = V6.j();
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.c cVar = new jd5.c();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (w17 == null) {
            w17 = "";
        }
        cVar.o(w17);
        if (j18 == null) {
            j18 = "";
        }
        cVar.r(j18);
        cVar.q(V6.m());
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        androidx.appcompat.app.AppCompatActivity context = recordMsgImageUI.getContext();
        n13.r a17 = n13.r.a(1);
        a17.f334120d.f334139a = 9;
        ((dk5.b0) b0Var).Bi(context, cVar, a17);
    }
}
