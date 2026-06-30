package dn0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final dn0.b f241825a = new dn0.b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f241826b;

    public final void a() {
        if (f241826b) {
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("live_karaoke");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/live/ap/karaoke/MMKaraoke", "loadKaraokeSo", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/live/ap/karaoke/MMKaraoke", "loadKaraokeSo", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            f241826b = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MMKaraoke", "load error", th6);
        }
    }
}
