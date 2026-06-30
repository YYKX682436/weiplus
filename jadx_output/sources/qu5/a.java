package qu5;

/* loaded from: classes12.dex */
public interface a {
    void dispatchMessage(android.os.Message message);

    void dump(android.util.Printer printer, java.lang.String str);

    boolean executeOrSendMessage(android.os.Message message);

    android.os.Looper getLooper();

    java.lang.String getMessageName(android.os.Message message);

    android.os.Handler getSelf();

    xu5.b getSerial();

    java.lang.String getSerialTag();

    boolean hasMessages(int i17);

    boolean hasMessages(int i17, java.lang.Object obj);

    boolean isQuit();

    android.os.Message obtainMessage();

    android.os.Message obtainMessage(int i17);

    android.os.Message obtainMessage(int i17, int i18, int i19);

    android.os.Message obtainMessage(int i17, int i18, int i19, java.lang.Object obj);

    android.os.Message obtainMessage(int i17, java.lang.Object obj);

    boolean post(java.lang.Runnable runnable);

    boolean postAtFrontOfQueue(java.lang.Runnable runnable);

    boolean postAtTime(java.lang.Runnable runnable, long j17);

    boolean postAtTime(java.lang.Runnable runnable, java.lang.Object obj, long j17);

    boolean postDelayed(java.lang.Runnable runnable, long j17);

    boolean postDelayed(java.lang.Runnable runnable, java.lang.Object obj, long j17);

    boolean quit();

    void removeCallbacks(java.lang.Runnable runnable);

    void removeCallbacks(java.lang.Runnable runnable, java.lang.Object obj);

    void removeCallbacksAndMessages(java.lang.Object obj);

    void removeMessages(int i17);

    void removeMessages(int i17, java.lang.Object obj);

    boolean sendEmptyMessage(int i17);

    boolean sendEmptyMessageAtTime(int i17, long j17);

    boolean sendEmptyMessageDelayed(int i17, long j17);

    boolean sendMessage(android.os.Message message);

    boolean sendMessageAtFrontOfQueue(android.os.Message message);

    boolean sendMessageAtTime(android.os.Message message, long j17);

    boolean sendMessageDelayed(android.os.Message message, long j17);
}
