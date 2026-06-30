package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.FavRecordDetailUI f155464e;

    public p(com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI, java.util.List list) {
        this.f155464e = favRecordDetailUI;
        this.f155463d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list = this.f155463d;
        if (list == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavRecordDetailUI", "start calc");
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        long j17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.record.ui.FavRecordDetailUI favRecordDetailUI = this.f155464e;
            if (!hasNext) {
                java.lang.String format = java.lang.String.format("%s:%s:%s:%s:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                int i28 = com.tencent.mm.plugin.record.ui.FavRecordDetailUI.C;
                favRecordDetailUI.f100600g.f343480e = format;
                return;
            }
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var != null && !favRecordDetailUI.f155262z) {
                int i29 = gp0Var.I;
                if (i29 == 1) {
                    i17++;
                    j17 += gp0Var.f375408f != null ? r9.getBytes().length : 0L;
                } else if (i29 == 2) {
                    i18++;
                } else if (i29 == 4 || i29 == 15) {
                    i19++;
                } else {
                    i27++;
                }
            }
        }
    }
}
