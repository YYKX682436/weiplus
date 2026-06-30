package ee4;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem f251722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem) {
        super(0);
        this.f251722d = snsPublishBaseMultiPicItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc$removePublishItem$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc$removePublishItem$1");
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem = this.f251722d;
        if (snsPublishBaseMultiPicItem.d() == 1) {
            ie4.a aVar = ie4.a.f291002a;
            java.lang.String b17 = snsPublishBaseMultiPicItem.b();
            kotlin.jvm.internal.o.d(b17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeDeleteFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicFileHelper", "safeDeleteFile >> ".concat(b17));
            if (r26.n0.B(b17, "draft", false) && !r26.n0.B(b17, "DCIM", true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiPicFileHelper", "delete file ret >> " + com.tencent.mm.vfs.w6.h(b17));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeDeleteFile", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicFileHelper");
        } else if (snsPublishBaseMultiPicItem.d() == 6) {
            ie4.a.f291002a.a((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem) snsPublishBaseMultiPicItem);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc$removePublishItem$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc$removePublishItem$1");
        return f0Var;
    }
}
