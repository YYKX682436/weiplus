package ee4;

/* loaded from: classes4.dex */
public final class c1 implements ud4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ee4.e1 f251695a;

    public c1(ee4.e1 e1Var) {
        this.f251695a = e1Var;
    }

    @Override // ud4.d
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$itemChangePositionCallback$1");
        ee4.e1 e1Var = this.f251695a;
        e1Var.f("moveItem: fromPos: " + i17 + " toPos: " + i18);
        ee4.b1 m17 = e1Var.m();
        m17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        fe4.b bVar = m17.f251678n;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        if (i17 == i18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        } else if (bVar.f261562a.size() <= i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        } else {
            com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) bVar.f261562a.remove(i17);
            java.util.ArrayList arrayList = (java.util.ArrayList) bVar.f261563b;
            arrayList.remove(i17);
            if (i18 < bVar.f261562a.size()) {
                bVar.f261562a.add(i18, snsPublishBaseMultiPicItem);
                java.lang.String b17 = snsPublishBaseMultiPicItem.b();
                kotlin.jvm.internal.o.d(b17);
                arrayList.add(i18, b17);
            } else {
                bVar.f261562a.add(snsPublishBaseMultiPicItem);
                java.lang.String b18 = snsPublishBaseMultiPicItem.b();
                kotlin.jvm.internal.o.d(b18);
                arrayList.add(b18);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("moveItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$itemChangePositionCallback$1");
    }

    @Override // ud4.d
    public void removeItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$itemChangePositionCallback$1");
        ee4.e1 e1Var = this.f251695a;
        e1Var.f("removeItem: pos: " + i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        com.tencent.mm.ui.MMActivity c17 = e1Var.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        ee4.b1 m17 = e1Var.m();
        m17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        m17.w((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) m17.f251678n.e().get(i17), true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        if (c17 instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
            ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) c17).q7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPreviewImage$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        com.tencent.mm.plugin.sns.ui.v4 v4Var = e1Var.f251700n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPreviewImage$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc");
        kotlin.jvm.internal.o.e(v4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        ((ud4.t) v4Var).d(e1Var.m().v().f());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicPreviewViewPc$itemChangePositionCallback$1");
    }
}
