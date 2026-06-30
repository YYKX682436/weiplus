package pa4;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f353062a = jz5.h.b(pa4.n.f353061d);

    public final void a(java.lang.String func, java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("executeWork", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadWorkHelper");
        kotlin.jvm.internal.o.g(func, "func");
        kotlin.jvm.internal.o.g(runnable, "runnable");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoUploadWorkHelper", "executeWork >> " + func + " time: " + java.lang.System.currentTimeMillis() + " threadName:" + java.lang.Thread.currentThread());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoUploadWorker", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadWorkHelper");
        ku5.f fVar = (ku5.f) ((jz5.n) this.f353062a).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoUploadWorker", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadWorkHelper");
        fVar.execute(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("executeWork", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadWorkHelper");
    }
}
