package lt3;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f321274d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f321275e;

    public r(java.lang.String taskId, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        this.f321274d = taskId;
        this.f321275e = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // java.lang.Runnable
    public void run() {
        lt3.v.f321280d.remove(this);
        lt3.v.f321277a.c(lt3.n.f321260a.b(this.f321274d), this.f321275e);
    }
}
