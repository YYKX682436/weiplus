package ee4;

/* loaded from: classes4.dex */
public final class z0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.b1 f251788d;

    public z0(ee4.b1 b1Var) {
        this.f251788d = b1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1");
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        java.lang.Object obj2 = jz5.f0.f302826a;
        if (intValue == 2) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new ee4.y0(lVar, this.f251788d, null), continuation);
            if (g17 == pz5.a.f359186d) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1");
                obj2 = g17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1");
                return obj2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc$initLivePhotoCollectEventJob$1$1");
        return obj2;
    }
}
