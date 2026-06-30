package he4;

/* loaded from: classes4.dex */
public abstract class c implements he4.d {

    /* renamed from: a, reason: collision with root package name */
    public he4.d f280915a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f280916b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f280917c = b();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(he4.c r17, com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he4.c.h(he4.c, com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract java.lang.Object a(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem, kotlin.coroutines.Continuation continuation);

    public abstract java.lang.String b();

    public abstract long c();

    public final void d(java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logE", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(this.f280917c, hashCode() + ' ' + msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logE", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
    }

    public final void e(java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(this.f280917c, hashCode() + ' ' + msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
    }

    public he4.d f(he4.d chain) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNextChain", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        kotlin.jvm.internal.o.g(chain, "chain");
        he4.d dVar = this.f280915a;
        if (dVar == null || ((he4.c) dVar).f(chain) == null) {
            this.f280915a = chain;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNextChain", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        return this;
    }

    public java.lang.Object g(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        java.lang.Object h17 = h(this, snsPublishLivePhotoItem, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain");
        return h17;
    }
}
