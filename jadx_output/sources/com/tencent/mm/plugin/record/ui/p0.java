package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class p0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.t0 f155465d;

    public p0(com.tencent.mm.plugin.record.ui.t0 t0Var) {
        this.f155465d = t0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.record.ui.t0 t0Var = this.f155465d;
        if (c01.ia.e(t0Var.f155486e.f155278w)) {
            return;
        }
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI = t0Var.f155486e;
        if (recordMsgDetailUI.A && !c01.ia.C(recordMsgDetailUI.f155278w)) {
            g4Var.f(0, t0Var.f155486e.getString(com.tencent.mm.R.string.ccw));
        }
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI2 = t0Var.f155486e;
        if (recordMsgDetailUI2.A && recordMsgDetailUI2.getIntent().getIntExtra("from_scene", 0) == 0) {
            g4Var.f(2, t0Var.f155486e.getString(com.tencent.mm.R.string.hjg));
        }
        if (t0Var.f155485d) {
            g4Var.f(3, t0Var.f155486e.getString(com.tencent.mm.R.string.b2b));
        }
    }
}
