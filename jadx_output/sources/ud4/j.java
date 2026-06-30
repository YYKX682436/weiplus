package ud4;

/* loaded from: classes4.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public final int a(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicSizeStatic", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View$Companion");
        kotlin.jvm.internal.o.g(context, "context");
        int z17 = ((com.tencent.mm.plugin.sns.model.l4.Hj().z1() - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480609ab1) * 4)) - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479870hj) * 2)) / 3;
        int i17 = com.tencent.mm.plugin.sns.model.l4.f164406y0;
        if (z17 > i17) {
            z17 = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicSizeStatic", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View$Companion");
        return z17;
    }
}
