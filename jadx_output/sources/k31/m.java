package k31;

/* loaded from: classes9.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.b f303847d;

    public m(l31.b bVar) {
        this.f303847d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l31.b bVar = this.f303847d;
        if (bVar.f315316d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgStorageTaskManager", "task %s has cancelled", bVar.b());
        } else {
            bVar.run();
        }
    }
}
