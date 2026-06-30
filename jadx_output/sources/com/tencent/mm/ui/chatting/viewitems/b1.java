package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f203448d;

    public b1(com.tencent.mm.ui.chatting.viewitems.i1 i1Var) {
        this.f203448d = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f203448d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = i1Var.C;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        i1Var.C.dismiss();
    }
}
