package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public interface w0 {
    static /* synthetic */ void a(com.tencent.mm.plugin.scanner.view.w0 w0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSuccessAnimationEnd");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        w0Var.b(z17);
    }

    void b(boolean z17);

    void c();
}
