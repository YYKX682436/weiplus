package j3;

/* loaded from: classes11.dex */
public abstract class e {
    public static android.os.IBinder a(android.os.Bundle bundle, java.lang.String str) {
        return bundle.getBinder(str);
    }

    public static void b(android.os.Bundle bundle, java.lang.String str, android.os.IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
