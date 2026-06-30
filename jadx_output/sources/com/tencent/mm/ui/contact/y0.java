package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ChatroomContactUI f207254d;

    public y0(com.tencent.mm.ui.contact.ChatroomContactUI chatroomContactUI) {
        this.f207254d = chatroomContactUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 1) {
            return;
        }
        java.lang.String str = this.f207254d.f206348p;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomContactUI", "userName=%s get Contact is null", str);
            return;
        }
        if (!com.tencent.mm.storage.z3.q4(str)) {
            n17.s3();
            c01.e2.g0(n17, true);
            if (!com.tencent.mm.storage.z3.R4(str)) {
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(str, n17);
                return;
            } else {
                ((com.tencent.mm.storage.k4) c01.d9.b().q()).k(str);
                ((com.tencent.mm.storage.b3) c01.d9.b().l()).y0(str);
                return;
            }
        }
        n17.s3();
        vg3.e4 e4Var = (vg3.e4) i95.n0.c(vg3.e4.class);
        java.lang.String d17 = n17.d1();
        ((np.h) e4Var).getClass();
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new p41.u(d17, 2));
        ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(str, n17);
    }
}
