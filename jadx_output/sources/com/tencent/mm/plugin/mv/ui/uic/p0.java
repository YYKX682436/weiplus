package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes.dex */
public final class p0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.t0 f151351d;

    public p0(com.tencent.mm.plugin.mv.ui.uic.t0 t0Var) {
        this.f151351d = t0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.mv.ui.uic.t0 t0Var = this.f151351d;
        g4Var.j(com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY, t0Var.getContext().getString(com.tencent.mm.R.string.bnp), com.tencent.mm.R.raw.bottomsheet_icon_star, t0Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
        g4Var.j(com.tencent.liteav.TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, t0Var.getContext().getString(com.tencent.mm.R.string.bnq), com.tencent.mm.R.raw.bottomsheet_icon_star, t0Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
    }
}
