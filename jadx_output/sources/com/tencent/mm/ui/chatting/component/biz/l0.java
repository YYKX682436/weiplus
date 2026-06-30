package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class l0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.m0 f198797d;

    public l0(com.tencent.mm.ui.chatting.component.biz.m0 m0Var) {
        this.f198797d = m0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.chatting.component.biz.m0 m0Var = this.f198797d;
        android.view.ViewTreeObserver viewTreeObserver = m0Var.f198805m;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                m0Var.f198805m = m0Var.f198804i.getViewTreeObserver();
            }
            m0Var.f198805m.removeGlobalOnLayoutListener(m0Var);
            m0Var.f198805m = null;
        }
        m0Var.getClass();
        m0Var.f198799d = null;
        m0Var.getClass();
    }
}
