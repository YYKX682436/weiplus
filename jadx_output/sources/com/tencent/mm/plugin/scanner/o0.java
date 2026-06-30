package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class o0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.MultiCodeMaskView f159116d;

    public o0(com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView) {
        this.f159116d = multiCodeMaskView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.scanner.MultiCodeMaskView.f158631v;
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f159116d;
        multiCodeMaskView.getClass();
        multiCodeMaskView.e(1.0f, 0.8f, multiCodeMaskView.f158645t, new com.tencent.mm.plugin.scanner.k0(multiCodeMaskView, new com.tencent.mm.plugin.scanner.n0(1, multiCodeMaskView)));
        return true;
    }
}
