package s75;

/* loaded from: classes7.dex */
public abstract class a {
    public static android.os.HandlerThread a(java.lang.String str) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("[D]#" + str);
        handlerThread.start();
        return handlerThread;
    }
}
