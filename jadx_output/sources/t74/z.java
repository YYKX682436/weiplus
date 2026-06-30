package t74;

/* loaded from: classes4.dex */
public final class z implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416315d;

    public z(t74.w1 w1Var) {
        this.f416315d = w1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$handleExpandAnim$1$2");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$handleExpandAnim$1$2");
        float floatValue = ((java.lang.Number) lVar.f302833d).floatValue();
        float floatValue2 = ((java.lang.Number) lVar.f302834e).floatValue();
        if (floatValue > 0.0f && floatValue2 > 0.0f) {
            t74.w1 w1Var = this.f416315d;
            w1Var.j();
            w1Var.hashCode();
            t74.w1.A(w1Var, floatValue, floatValue2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$handleExpandAnim$1$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$handleExpandAnim$1$2");
        return f0Var;
    }
}
