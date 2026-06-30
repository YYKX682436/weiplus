package ee4;

/* loaded from: classes4.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f251770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee4.b1 f251771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(jz5.l lVar, ee4.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251770d = lVar;
        this.f251771e = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        ee4.y0 y0Var = new ee4.y0(this.f251770d, this.f251771e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        return y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        ee4.y0 y0Var = (ee4.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList<java.lang.String> stringArrayList = ((android.os.Bundle) this.f251770d.f302834e).getStringArrayList("key_work_err_media_ids");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errMediaIds size: ");
        sb6.append(stringArrayList != null ? new java.lang.Integer(stringArrayList.size()) : null);
        java.lang.String sb7 = sb6.toString();
        ee4.b1 b1Var = this.f251771e;
        b1Var.f(sb7);
        if (!(stringArrayList == null || stringArrayList.isEmpty())) {
            for (java.lang.String str : stringArrayList) {
                kotlin.jvm.internal.o.d(str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$changeErrorLivePhotoItemToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                b1Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeErrorLivePhotoItemToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                b1Var.f("changeErrorLivePhotoItemToImage >> mediaKey: ".concat(str));
                java.util.List e17 = b1Var.f251678n.e();
                int size = e17.size();
                for (int i17 = 0; i17 < size; i17++) {
                    com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) e17.get(i17);
                    if (snsPublishBaseMultiPicItem.d() == 6) {
                        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem) snsPublishBaseMultiPicItem;
                        if (kotlin.jvm.internal.o.b(snsPublishLivePhotoItem.h(), str)) {
                            b1Var.f("find it the index is = " + i17);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTierDownToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                            snsPublishLivePhotoItem.f171219s = 1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTierDownToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeErrorLivePhotoItemToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$changeErrorLivePhotoItemToImage", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
            }
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1$1");
        return f0Var;
    }
}
