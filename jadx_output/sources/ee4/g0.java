package ee4;

/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.i0 f251709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ee4.i0 i0Var) {
        super(0);
        this.f251709d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc$draftMMKV$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc$draftMMKV$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUin", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc");
        ee4.i0 i0Var = this.f251709d;
        i0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc");
        int intValue = ((java.lang.Number) ((jz5.n) i0Var.f251717n).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUin", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc");
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("sns_draft_mmkv", intValue, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc$draftMMKV$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDraftPc$draftMMKV$2");
        return J2;
    }
}
