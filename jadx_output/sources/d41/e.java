package d41;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d41.e f226382d = new d41.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        java.util.Iterator it = ((kz5.h) d41.i.f226386f).iterator();
        while (it.hasNext()) {
            ((d41.i) it.next()).getClass();
            uriMatcher.addURI("com.tencent.mm.open_voice_control.info", "check_version", 1);
        }
        return uriMatcher;
    }
}
