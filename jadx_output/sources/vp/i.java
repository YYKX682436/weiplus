package vp;

/* loaded from: classes4.dex */
public class i extends android.os.Handler {
    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.lang.Object obj = message.obj;
        if (obj instanceof java.lang.Runnable) {
            ((java.lang.Runnable) obj).run();
        }
        super.handleMessage(message);
    }
}
