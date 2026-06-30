package cw1;

/* loaded from: classes11.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f223173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.e8 f223174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223175f;

    public n(com.tencent.wcdb.support.CancellationSignal cancellationSignal, c01.e8 e8Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI) {
        this.f223173d = cancellationSignal;
        this.f223174e = e8Var;
        this.f223175f = cleanAllMessagesUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f223173d;
        yv1.h1.f(1, cancellationSignal);
        java.util.List q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().q(null);
        java.util.ArrayList arrayList = (java.util.ArrayList) q17;
        if (arrayList.size() > 0) {
            java.util.List e17 = c01.t1.e(q17);
            if (e17 != null) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) e17;
                int size = arrayList2.size();
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.Object obj = arrayList2.get(i17);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        o25.s1 a17 = f14.g.a();
                        java.lang.String str = (java.lang.String) arrayList.get(i17);
                        ((com.tencent.mm.app.o7) a17).getClass();
                        com.tencent.mm.modelgetchatroommsg.f.d().b(str);
                    }
                }
            }
            int size2 = arrayList.size();
            for (int i18 = 0; i18 < size2; i18++) {
                qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
                java.lang.Object obj2 = arrayList.get(i18);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                ((c61.ec) x7Var).Ai((java.lang.String) obj2);
            }
        }
        ((hn.k0) ((vg3.i4) i95.n0.c(vg3.i4.class))).Ai();
        c01.e8 e8Var = this.f223174e;
        java.util.Map map = c01.w9.f37539b;
        ((ku5.t0) ku5.t0.f312615d).a(new c01.w9$$a(e8Var, c01.id.c(), cancellationSignal));
        if (cancellationSignal.isCanceled()) {
            return;
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        int i19 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI.f95646n;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f223175f;
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(cleanAllMessagesUI.T6() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(cleanAllMessagesUI.f95652i));
        lVarArr[2] = new jz5.l("removed_size_byte", java.lang.Long.valueOf(cleanAllMessagesUI.f95653m));
        lVarArr[3] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(cleanAllMessagesUI.f95653m));
        ((cy1.a) rVar).Ej("chat_history_clean_all_complete", kz5.c1.k(lVarArr), 32903);
    }
}
