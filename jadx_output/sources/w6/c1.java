package w6;

/* loaded from: classes13.dex */
public final class c1 implements android.os.Handler.Callback {
    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return false;
        }
        ((w6.z0) message.obj).recycle();
        return true;
    }
}
