package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes.dex */
public class c0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.w1 f157654a;

    public c0(com.tencent.mm.plugin.remittance.ui.d0 d0Var, com.tencent.mm.ui.widget.dialog.w1 w1Var) {
        this.f157654a = w1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemindCollectionDialog", "onDialogClick() bOk:%s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.ui.widget.dialog.w1 w1Var = this.f157654a;
        if (w1Var != null) {
            w1Var.a(z17, str);
        }
    }
}
