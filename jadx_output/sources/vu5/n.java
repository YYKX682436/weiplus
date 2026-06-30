package vu5;

/* loaded from: classes12.dex */
public class n extends android.os.Handler {
    public n(vu5.p pVar, android.os.Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void dispatchMessage(android.os.Message message) {
        if (message.getCallback() != null && (message.getCallback() instanceof wu5.l) && ((wu5.l) message.getCallback()).isCancelled()) {
            return;
        }
        super.dispatchMessage(message);
    }
}
