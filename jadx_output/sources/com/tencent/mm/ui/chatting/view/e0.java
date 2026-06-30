package com.tencent.mm.ui.chatting.view;

/* loaded from: classes11.dex */
public class e0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.g0 f202908d;

    public e0(com.tencent.mm.ui.chatting.view.g0 g0Var) {
        this.f202908d = g0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.chatting.view.g0 g0Var = this.f202908d;
        android.view.ViewTreeObserver viewTreeObserver = g0Var.f202947o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                g0Var.f202947o = g0Var.f202945m.getViewTreeObserver();
            }
            g0Var.f202947o.removeGlobalOnLayoutListener(g0Var);
            g0Var.f202947o = null;
        }
        g0Var.getClass();
        g0Var.f202940e = null;
    }
}
