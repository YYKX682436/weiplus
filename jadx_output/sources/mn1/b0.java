package mn1;

/* loaded from: classes12.dex */
public class b0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mn1.z f329828a;

    public b0(mn1.z zVar) {
        this.f329828a = zVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent != null && java.util.Objects.equals(intent.getAction(), io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION)) {
            mn1.z.a(this.f329828a, true);
        }
    }
}
