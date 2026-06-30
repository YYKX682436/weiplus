package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class o0 implements com.tencent.mm.modelbase.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgDetailUI f155460d;

    public o0(com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI) {
        this.f155460d = recordMsgDetailUI;
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        if (j17 == j18) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f155460d.F;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f155460d.F = null;
            }
            com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI = this.f155460d;
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(recordMsgDetailUI.f155280y, recordMsgDetailUI.f155279x);
            java.lang.String j19 = Li.j();
            if (com.tencent.mm.storage.z3.R4(Li.Q0())) {
                j19 = c01.w9.u(Li.j());
            }
            ot0.q v17 = ot0.q.v(j19);
            if (v17 != null) {
                com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI2 = this.f155460d;
                java.lang.String str = v17.f348663h0;
                recordMsgDetailUI2.f155281z = str;
                recordMsgDetailUI2.f155277v = bt3.g2.A(str);
                r45.ul5 ul5Var = this.f155460d.f155277v;
                if (ul5Var != null && !ul5Var.f387465f.isEmpty()) {
                    com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI3 = this.f155460d;
                    if (recordMsgDetailUI3.j7(recordMsgDetailUI3.f155277v) != null) {
                        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI4 = this.f155460d;
                        recordMsgDetailUI4.C = recordMsgDetailUI4.j7(recordMsgDetailUI4.f155277v);
                    } else {
                        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI5 = this.f155460d;
                        recordMsgDetailUI5.C = recordMsgDetailUI5.f155277v.f387463d;
                    }
                    com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI6 = this.f155460d;
                    recordMsgDetailUI6.D = ((r45.gp0) recordMsgDetailUI6.f155277v.f387465f.getFirst()).M1;
                    com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI7 = this.f155460d;
                    recordMsgDetailUI7.E = ((r45.gp0) recordMsgDetailUI7.f155277v.f387465f.getLast()).M1;
                }
                com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI8 = this.f155460d;
                com.tencent.mm.plugin.record.ui.w wVar = recordMsgDetailUI8.I;
                r45.ul5 ul5Var2 = recordMsgDetailUI8.f155277v;
                wVar.getClass();
                new com.tencent.mm.plugin.record.ui.v(ul5Var2, false, wVar).invoke();
                if (this.f155460d.isFinishing() || this.f155460d.isDestroyed()) {
                    return;
                }
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.record.ui.o0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.record.ui.o0.this.f155460d.k7();
                    }
                });
            }
        }
    }
}
