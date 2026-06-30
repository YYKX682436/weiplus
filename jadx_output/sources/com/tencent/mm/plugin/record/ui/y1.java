package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class y1 implements kd0.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155608a;

    public y1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI) {
        this.f155608a = recordMsgImageUI;
    }

    @Override // kd0.n2
    public void a() {
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155608a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = recordMsgImageUI.f155321r;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        recordMsgImageUI.Y6(false);
    }
}
