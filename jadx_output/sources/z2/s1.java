package z2;

/* loaded from: classes11.dex */
public abstract class s1 {
    public static void a(java.lang.Object obj, android.content.Intent intent, android.os.Bundle bundle) {
        android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
    }

    public static android.os.Bundle b(android.content.Intent intent) {
        return android.app.RemoteInput.getResultsFromIntent(intent);
    }
}
