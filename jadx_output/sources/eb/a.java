package eb;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static eb.a f250689b;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.iid.FirebaseInstanceId f250690a;

    static {
        java.util.regex.Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }

    public a(com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId) {
        this.f250690a = firebaseInstanceId;
    }

    public void a(boolean z17) {
        com.google.firebase.iid.FirebaseInstanceId firebaseInstanceId = this.f250690a;
        synchronized (firebaseInstanceId) {
            xa.b bVar = firebaseInstanceId.f44649a;
            bVar.d();
            android.content.SharedPreferences.Editor edit = bVar.f452752a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z17);
            edit.apply();
            if (!firebaseInstanceId.f44654f && z17) {
                firebaseInstanceId.i();
            }
            firebaseInstanceId.f44654f = z17;
        }
    }
}
