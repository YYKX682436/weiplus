package ee4;

/* loaded from: classes4.dex */
public final class n0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.r0 f251728d;

    public n0(ee4.r0 r0Var) {
        this.f251728d = r0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1$1");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1$1");
        java.lang.String str = "collect event code: " + ((java.lang.Number) lVar.f302833d).intValue();
        ee4.r0 r0Var = this.f251728d;
        r0Var.f(str);
        java.lang.Number number = (java.lang.Number) lVar.f302833d;
        int intValue = number.intValue();
        if (intValue == 1) {
            ee4.r0.p(r0Var, true);
        } else if (intValue != 2) {
            r0Var.e("invalid code >> " + number.intValue());
        } else {
            ee4.r0.p(r0Var, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1$1");
        return f0Var;
    }
}
