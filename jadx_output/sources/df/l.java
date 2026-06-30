package df;

/* loaded from: classes7.dex */
public final class l extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f229506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetRequestParams f229507f;

    public l(com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams) {
        this.f229507f = cronetRequestParams;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "SkylineCronetRequest@" + this.f229507f.taskId;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable;
        java.lang.String str = this.f229506e;
        if (str == null) {
            kotlin.jvm.internal.o.o("resultTaskId");
            throw null;
        }
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(str);
        java.lang.Object obj = df.n.f229523g;
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = this.f229507f;
        synchronized (obj) {
            java.util.HashSet hashSet = df.n.f229522f;
            if (hashSet.contains(cronetRequestParams.taskId)) {
                hashSet.remove(cronetRequestParams.taskId);
                df.n.f229520d--;
                java.util.LinkedList linkedList = df.n.f229521e;
                if ((!linkedList.isEmpty()) && (runnable = (java.lang.Runnable) linkedList.pollFirst()) != null) {
                    runnable.run();
                }
            }
        }
    }
}
