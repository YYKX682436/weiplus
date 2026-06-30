package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public final class s0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.c1 f203084a;

    public s0(com.tencent.mm.ui.chatting.view.c1 c1Var) {
        this.f203084a = c1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.ui.chatting.view.h0 h0Var = this.f203084a.f202896l;
        if (h0Var != null) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = ((pj5.j) h0Var).f355380b.f202894j;
            if (z2Var != null) {
                z2Var.B();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "hide");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Remind.MMRemindDatePickerRemake", "cancel");
    }
}
