package ge5;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ge5.d f271007a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f271008b = new com.tencent.mm.sdk.platformtools.n3("AAChattingHelper");

    public d() {
        f271008b.setLogging(false);
    }

    public static ge5.d a() {
        ge5.d dVar;
        if (f271007a != null) {
            return f271007a;
        }
        synchronized (ge5.d.class) {
            if (f271007a == null) {
                f271007a = new ge5.d();
            }
            dVar = f271007a;
        }
        return dVar;
    }

    public static void b(java.lang.CharSequence charSequence, com.tencent.mm.storage.f9 f9Var, int i17) {
        if (charSequence instanceof android.text.Spannable) {
            f271008b.postToWorker(new ge5.c(charSequence, f9Var, i17));
        }
    }
}
