package u81;

/* loaded from: classes7.dex */
public class i implements android.os.MessageQueue.IdleHandler {
    public i(u81.j jVar) {
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myLooper().quit();
        return false;
    }
}
