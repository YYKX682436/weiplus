package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class g1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.i1 f155394d;

    public g1(com.tencent.mm.plugin.record.ui.i1 i1Var) {
        this.f155394d = i1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.record.ui.i1 i1Var = this.f155394d;
        g4Var.f(0, i1Var.f155419d.getString(com.tencent.mm.R.string.ccw));
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = i1Var.f155419d;
        java.lang.String n17 = com.tencent.mm.vfs.w6.n(bt3.g2.t(recordMsgFileUI.f155300v, recordMsgFileUI.f155298t, recordMsgFileUI.f155297s, 1));
        if (((d73.i) i95.n0.c(d73.i.class)).Qg() && recordMsgFileUI.f155303y != null && com.tencent.mm.plugin.handoff.model.AbsHandOffFile.Companion.a(n17)) {
            g4Var.f(1, recordMsgFileUI.getString(com.tencent.mm.R.string.cff));
        }
    }
}
