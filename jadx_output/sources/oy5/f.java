package oy5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final oy5.f f350093a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f350094b;

    static {
        oy5.f fVar = new oy5.f();
        f350093a = fVar;
        fVar.a();
    }

    public final boolean a() {
        if (!f350094b) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("singscore");
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tme/karaoke/lib_singscore/SingScoreContext", "loadLibrary", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tme/karaoke/lib_singscore/SingScoreContext", "loadLibrary", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                f350094b = true;
            } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError unused) {
            }
        }
        return f350094b;
    }
}
