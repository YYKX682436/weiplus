package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class c2 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.g2 f155364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155365e;

    public c2(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI, com.tencent.mm.plugin.record.ui.g2 g2Var) {
        this.f155365e = recordMsgImageUI;
        this.f155364d = g2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.record.ui.g2 g2Var = this.f155364d;
        if (g2Var != null) {
            g2Var.f155396b = false;
        }
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155365e;
        recordMsgImageUI.f155321r = null;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) recordMsgImageUI.f155326w).n();
    }
}
