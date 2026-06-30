package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o5 f207477d;

    public b5(com.tencent.mm.ui.conversation.o5 o5Var) {
        this.f207477d = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf5.m c17;
        com.tencent.mm.ui.conversation.o5 o5Var = this.f207477d;
        if (o5Var.B) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FolderHelper", "performAllExpand, animation not executed, reset state");
            o5Var.B = false;
            if (o5Var.K.getAndSet(false)) {
                yf5.j0 j0Var = o5Var.f207924d;
                if (j0Var != null && (c17 = ((yf5.w0) j0Var).c()) != null) {
                    c17.b();
                }
                o5Var.f207939v = false;
            }
        }
    }
}
