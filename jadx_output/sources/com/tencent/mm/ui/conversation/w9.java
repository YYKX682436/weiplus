package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class w9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.x9 f208225d;

    public w9(com.tencent.mm.ui.conversation.x9 x9Var) {
        this.f208225d = x9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.x9 x9Var = this.f208225d;
        if (x9Var.f208242d) {
            return;
        }
        int lastVisiblePosition = x9Var.f208239a.getLastVisiblePosition();
        int firstVisiblePosition = x9Var.f208239a.getFirstVisiblePosition();
        int i17 = lastVisiblePosition - firstVisiblePosition;
        if (firstVisiblePosition == x9Var.f208245g) {
            return;
        }
        x9Var.f208245g = firstVisiblePosition;
        int i18 = lastVisiblePosition + 1;
        int i19 = i18;
        while (true) {
            try {
                yf5.j0 j0Var = x9Var.f208240b;
                if (i19 >= ((yf5.w0) j0Var).f461985q.f461844a || i19 >= (i17 * 1) + lastVisiblePosition) {
                    break;
                }
                ((yf5.w0) j0Var).j(i19);
                i19++;
            } catch (java.lang.RuntimeException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreLoadHelper", e17, "Failed to preload MainUI avatars", new java.lang.Object[0]);
                return;
            }
        }
        for (int i27 = firstVisiblePosition - 1; i27 >= 0 && i27 > firstVisiblePosition - (i17 * 1); i27--) {
            ((yf5.w0) x9Var.f208240b).j(i27);
        }
        while (true) {
            yf5.j0 j0Var2 = x9Var.f208240b;
            if (i18 >= ((yf5.w0) j0Var2).f461985q.f461844a || i18 >= (i17 * 10) + lastVisiblePosition || x9Var.f208242d) {
                return;
            }
            ((yf5.w0) j0Var2).getItem(i18);
            j0Var2.getClass();
            i18++;
        }
    }
}
