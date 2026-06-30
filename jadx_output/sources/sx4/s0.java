package sx4;

/* loaded from: classes8.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f413657a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f413658b;

    /* renamed from: c, reason: collision with root package name */
    public static int f413659c;

    public s0(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("KPublisherId");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f413657a = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("geta8key_username");
        f413658b = stringExtra2 != null ? stringExtra2 : "";
        f413659c = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(intent.getIntExtra("geta8key_scene", 0)));
    }
}
