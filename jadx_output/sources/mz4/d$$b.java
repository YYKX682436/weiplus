package mz4;

/* loaded from: classes12.dex */
public final /* synthetic */ class d$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f333243d;

    @Override // java.lang.Runnable
    public final void run() {
        mz4.j jVar = mz4.j.f333289a;
        mz4.d dVar = this.f333243d;
        java.util.List oriDataList = dVar.f333229a;
        kotlin.jvm.internal.o.g(oriDataList, "oriDataList");
        if (!oriDataList.isEmpty()) {
            java.util.List c17 = jVar.c(oriDataList);
            oriDataList.clear();
            oriDataList.addAll(c17);
        }
        dVar.f333238j = false;
    }
}
