package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class m implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201185d;

    public m(java.lang.String str) {
        this.f201185d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(this.f201185d);
        boolean z17 = false;
        if (h17 != null) {
            pt0.e0 e0Var = pt0.f0.f358209b1;
            com.tencent.mm.storage.f9 k17 = e0Var.k(h17.h(), h17.f415016n);
            if (k17 == null) {
                k17 = e0Var.k(h17.f415020r, h17.f415016n);
            }
            z17 = com.tencent.mm.ui.chatting.gallery.k1.l(com.tencent.mm.sdk.platformtools.x2.f193071a, k17, false);
        }
        return z17 ? "Success" : "Fail";
    }
}
