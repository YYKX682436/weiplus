package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class lj implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.nj f169868d;

    public lj(com.tencent.mm.plugin.sns.ui.nj njVar) {
        this.f169868d = njVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$1");
        g4Var.clear();
        com.tencent.mm.plugin.sns.ui.nj njVar = this.f169868d;
        g4Var.g(1, i65.a.r(njVar.a(), com.tencent.mm.R.string.lwe), com.tencent.mm.R.raw.translate_off_regular);
        g4Var.g(2, i65.a.r(njVar.a(), com.tencent.mm.R.string.lwf), com.tencent.mm.R.raw.language_transfer_regular);
        g4Var.g(3, i65.a.r(njVar.a(), com.tencent.mm.R.string.lwh), com.tencent.mm.R.raw.icons_outlined_feedback_error);
        g4Var.g(4, i65.a.r(njVar.a(), com.tencent.mm.R.string.lwi), com.tencent.mm.R.raw.icons_outlined_download);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$1");
    }
}
