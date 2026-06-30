package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f158754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.MultiCodeMaskView f158755e;

    public m0(int i17, com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView) {
        this.f158754d = i17;
        this.f158755e = multiCodeMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f158754d;
        if (i17 < 2) {
            int i18 = com.tencent.mm.plugin.scanner.MultiCodeMaskView.f158631v;
            com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f158755e;
            multiCodeMaskView.getClass();
            multiCodeMaskView.e(1.0f, 0.8f, multiCodeMaskView.f158645t, new com.tencent.mm.plugin.scanner.k0(multiCodeMaskView, new com.tencent.mm.plugin.scanner.n0(i17 + 1, multiCodeMaskView)));
        }
    }
}
