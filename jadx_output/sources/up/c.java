package up;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final up.c f429756d = new up.c();

    public c() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sc.c type = (sc.c) obj;
        java.lang.String name = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(name, "name");
        jz5.g gVar = up.g.f429760a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (type == sc.c.f405611d) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(name);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj3, arrayList.toArray(), "com/tencent/mm/cso/CsoStartup", "originLoadByName", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj3, "com/tencent/mm/cso/CsoStartup", "originLoadByName", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
        return java.lang.Boolean.FALSE;
    }
}
