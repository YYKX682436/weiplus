package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.MultiCodeMaskView f158745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.n0 f158746e;

    public j0(com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView, com.tencent.mm.plugin.scanner.n0 n0Var) {
        this.f158745d = multiCodeMaskView;
        this.f158746e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f158745d;
        multiCodeMaskView.e(0.8f, 1.0f, multiCodeMaskView.f158646u, this.f158746e);
    }
}
