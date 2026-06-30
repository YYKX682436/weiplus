package y94;

/* loaded from: classes10.dex */
public final class h0 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public og3.d f460374f;

    /* renamed from: g, reason: collision with root package name */
    public og3.e f460375g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f460376h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f460376h = configProvider;
        og3.a aVar = og3.a.f345155d;
        java.lang.String inputVideoPath = configProvider.A;
        kotlin.jvm.internal.o.f(inputVideoPath, "inputVideoPath");
        this.f460374f = new og3.d(kz5.c0.d(new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo(aVar, inputVideoPath, null, 4, null)), null);
        java.lang.String outputVideoPath = configProvider.B;
        kotlin.jvm.internal.o.f(outputVideoPath, "outputVideoPath");
        com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo = new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo(aVar, outputVideoPath, null, 4, null);
        og3.a aVar2 = og3.a.f345157f;
        java.lang.String thumbPath = configProvider.C;
        kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
        com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo2 = new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo(aVar2, thumbPath, null, 4, null);
        com.tencent.mm.modelcontrol.VideoTransPara videoParam = configProvider.f155676n;
        kotlin.jvm.internal.o.f(videoParam, "videoParam");
        this.f460375g = new og3.e(videoParam, kz5.c0.d(mediaSingleInfo, mediaSingleInfo2), null, 4, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y94.h0.z(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
