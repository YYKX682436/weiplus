package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class o7 extends com.tencent.mm.plugin.sns.ui.p7 {
    public final java.lang.String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(com.tencent.mm.ui.MMActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.K = "MicroMsg.SnsUpload.PicV2Widget";
    }

    @Override // com.tencent.mm.plugin.sns.ui.p7
    public android.view.View s(android.view.View view, android.view.View view2, com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, android.view.View view3, android.view.View view4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicV2Widget");
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f170165h == null);
        com.tencent.mars.xlog.Log.i(this.K, "initView: previewImage null[%b]", objArr);
        com.tencent.mm.plugin.sns.ui.v4 v4Var = this.f170165h;
        com.tencent.mm.plugin.sns.ui.x7 x7Var = this.f170164g;
        if (v4Var == null) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f169957c;
            java.util.ArrayList d17 = x7Var.d();
            kotlin.jvm.internal.o.f(d17, "getMedias(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = d17.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem((java.lang.String) it.next(), 0, 0, 0, null, 24, null));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            this.f170165h = new ud4.k(view, view2, view3, view4, mMActivity, arrayList, this.f170182y, dynamicGridView, this.H, this.I, !this.f170175r);
        } else {
            java.util.ArrayList d18 = x7Var.d();
            kotlin.jvm.internal.o.f(d18, "getMedias(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = d18.iterator();
            while (it6.hasNext()) {
                arrayList2.add(new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem((java.lang.String) it6.next(), 0, 0, 0, null, 24, null));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pathListToPublishItemList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem$Companion");
            ((ud4.t) v4Var).e(new java.util.ArrayList(arrayList2), this.f170182y);
            com.tencent.mm.plugin.sns.ui.v4 v4Var2 = this.f170165h;
            kotlin.jvm.internal.o.e(v4Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgV2View");
            ((ud4.k) v4Var2).d(x7Var.c());
        }
        ud4.t tVar = (ud4.t) this.f170165h;
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView2 = tVar.f426734c;
        kotlin.jvm.internal.o.f(dynamicGridView2, "getView(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.PicV2Widget");
        return dynamicGridView2;
    }
}
