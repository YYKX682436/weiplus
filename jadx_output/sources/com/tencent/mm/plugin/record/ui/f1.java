package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155387d;

    public f1(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI) {
        this.f155387d = recordMsgFileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.record.ui.RecordMsgFileUI.H;
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155387d;
        recordMsgFileUI.Y6();
        r45.gp0 gp0Var = recordMsgFileUI.f155300v;
        java.lang.String str = recordMsgFileUI.f155298t;
        long j17 = recordMsgFileUI.f155297s;
        kk.j jVar = bt3.g2.f24278a;
        if (gp0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgLogic", "try pause download data fail, dataitem is null");
        } else {
            zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(bt3.g2.y(gp0Var.T, str, j17, true));
            bt3.p1 p1Var = (bt3.p1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).aj();
            p1Var.getClass();
            if (D0 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RecordMsgCDNService", "cancelJob info null");
            } else {
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(D0.field_mediaId);
                boolean delete = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).delete(D0, dm.i4.COL_LOCALID);
                p1Var.f24308e.remove(D0);
                p1Var.f24307d.remove(D0.getKey());
                p1Var.a();
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgCDNService", "cancelJob result:%s, mediaId:%s", java.lang.Boolean.valueOf(delete), D0.field_mediaId);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
