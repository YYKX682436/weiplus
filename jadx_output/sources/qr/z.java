package qr;

/* loaded from: classes10.dex */
public final class z implements fp0.p {
    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        qr.h task = (qr.h) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadManager", "onLoaderFin: " + task.d() + ", " + status);
    }
}
