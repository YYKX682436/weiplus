package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.a1 f200145d;

    public w0(com.tencent.mm.ui.chatting.component.a1 a1Var) {
        this.f200145d = a1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.a1 a1Var = this.f200145d;
        java.lang.Object p17 = a1Var.f198580d.p();
        a1Var.B0(p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null);
        if (a1Var.m0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatItemQuickSelectComponent", "show DownQuickSelectView when first select");
            a1Var.x0();
        }
    }
}
