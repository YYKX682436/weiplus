package ny5;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final ny5.d f341478a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f341479b;

    static {
        ny5.d dVar = new ny5.d();
        f341478a = dVar;
        dVar.a();
    }

    public final boolean a() {
        if (!f341479b) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add("singreverb");
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tme/karaoke/lib_singreverb/SingReverbContext", "loadLibrary", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tme/karaoke/lib_singreverb/SingReverbContext", "loadLibrary", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                f341479b = true;
            } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError unused) {
            }
        }
        return f341479b;
    }
}
