package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public interface b0 {
    static /* synthetic */ com.tencent.mm.plugin.multitalk.model.a0 a(com.tencent.mm.plugin.multitalk.model.b0 b0Var, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLargeRenderTarget");
        }
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        return b0Var.d(i17);
    }

    com.tencent.mm.plugin.multitalk.model.a0 b(java.lang.String str);

    void c();

    com.tencent.mm.plugin.multitalk.model.a0 d(int i17);
}
