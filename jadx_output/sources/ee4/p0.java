package ee4;

/* loaded from: classes4.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.r0 f251733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ee4.r0 r0Var) {
        super(1);
        this.f251733d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$onCreate$1");
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem item = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$onCreate$1");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = "deleteItemFileFun is call mediaId: " + item.g();
        ee4.r0 r0Var = this.f251733d;
        r0Var.f(str);
        r0Var.k().q(item);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$onCreate$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$onCreate$1");
        return f0Var;
    }
}
