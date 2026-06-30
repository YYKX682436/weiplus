package lt3;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final lt3.e f321209a = new lt3.e();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f321210b = new android.util.SparseArray();

    public final void a(int i17, java.lang.String taskId, boolean z17, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.BgMixManager", "notifyFinish, taskId:" + taskId + ", success:" + z17 + ", model:" + captureDataManager$CaptureVideoNormalModel);
        ((ku5.t0) ku5.t0.f312615d).h(new lt3.a(i17, taskId, z17, captureDataManager$CaptureVideoNormalModel), "BgMixManager_notifyFinish");
    }

    public final void b(int i17, java.lang.String taskId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        com.tencent.mars.xlog.Log.i("MicroMsg.mix_background.BgMixManager", "notifyInit, taskId:".concat(taskId));
        ((ku5.t0) ku5.t0.f312615d).h(new lt3.b(i17, taskId), "BgMixManager_notifyInit");
    }

    public final void c(int i17, lt3.f callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.util.SparseArray sparseArray = f321210b;
        java.util.Set set = (java.util.Set) sparseArray.get(i17);
        if (set != null) {
            set.remove(callback);
        }
        boolean z17 = false;
        if (set != null && set.isEmpty()) {
            z17 = true;
        }
        if (z17) {
            sparseArray.remove(i17);
        }
    }
}
