package z2;

/* loaded from: classes11.dex */
public abstract class t1 {
    public static void a(z2.v1 v1Var, android.content.Intent intent, java.util.Map<java.lang.String, android.net.Uri> map) {
        android.app.RemoteInput.addDataResultToIntent(z2.v1.a(v1Var), intent, map);
    }

    public static java.util.Set<java.lang.String> b(java.lang.Object obj) {
        return ((android.app.RemoteInput) obj).getAllowedDataTypes();
    }

    public static java.util.Map<java.lang.String, android.net.Uri> c(android.content.Intent intent, java.lang.String str) {
        return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static android.app.RemoteInput.Builder d(android.app.RemoteInput.Builder builder, java.lang.String str, boolean z17) {
        return builder.setAllowDataType(str, z17);
    }
}
