package ee4;

/* loaded from: classes4.dex */
public final class v0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.x0 f251761d;

    public v0(ee4.x0 x0Var) {
        this.f251761d = x0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1");
        java.lang.String str = "collect >> code: " + ((java.lang.Number) lVar.f302833d).intValue();
        ee4.x0 x0Var = this.f251761d;
        x0Var.f(str);
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        java.lang.Object obj2 = jz5.f0.f302826a;
        if (intValue == 2) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new ee4.u0(lVar, x0Var, null), continuation);
            if (g17 == pz5.a.f359186d) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1");
                obj2 = g17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1");
                return obj2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1$1");
        return obj2;
    }
}
