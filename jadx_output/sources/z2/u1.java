package z2;

/* loaded from: classes11.dex */
public abstract class u1 {
    public static int a(java.lang.Object obj) {
        return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static android.app.RemoteInput.Builder b(android.app.RemoteInput.Builder builder, int i17) {
        return builder.setEditChoicesBeforeSending(i17);
    }
}
